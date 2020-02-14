# pragma once

#include <vector>
#include <thread>
#include <memory>
#include <functional>
#include <type_traits>
#include <cassert>
#include <queue>
#include <future>
#include <mutex>
#include <condition_variable>
#include <stdexcept>

using namespace std;

class thread_pool {
    public:
        thread_pool(size_t);
        template<class F, class... Args>auto enque(F&& f, Args&&... args) -> future<typename std::result_of<F(Args...)>::type>;
        ~thread_pool();
    private:
        vector<thread> process;
        queue<function<void()>> tasks;
        mutex queue_mutex;
        condition_variable condition;
        bool stop;
};

//launch some amount of process
inline thread_pool::thread_pool(size_t threads) : stop(false) {
    for (size_t i=0; i < threads; i++) {
        process.emplace_back([this]{
            for(;;) {
                function<void()> task;
                {
                    unique_lock<std::mutex> lock(this->queue_mutex);
                    this->condition.wait(lock, [this]{ return this->stop || !this->tasks.empty(); });
                    if(this->stop && this->tasks.empty())
                        return;
                    task = std::move(this->tasks.front());
                    this->tasks.pop();
                }
                task();
            }
        });
    }
}

// add new process item to the pool
template<class F, class... Args>auto thread_pool::enque(F&& f, Args&&... args) -> future<typename std::result_of<F(Args...)>::type> {
    using return_type = typename std::result_of<F(Args...)>::type;
    auto task = make_shared<packaged_task<return_type()>>(bind(forward<F>(f), forward<Args>(args)...));
    future<return_type> res = task->get_future();
    {
        std::unique_lock<std::mutex> lock(queue_mutex);
        // don't allow enqueueing after stopping the pool
        if(stop)
            throw std::runtime_error("enqueue on stopped thread_pool");
        tasks.emplace([task](){ (*task)(); });
    }
    condition.notify_one();
    return res;
}

// the destructor joins all threads
inline thread_pool::~thread_pool()
{
    {
        unique_lock<mutex> lock(queue_mutex);
        stop = true;
    }
    condition.notify_all();
    for(thread &processor: process)
        processor.join();
}