#include <string>
#include <fstream>
#include <iostream>

using namespace std;

class Logger {
    public:
        enum Priority { DEBUG, CONFIG, INFO, WARNING, ERROR };
        static void start(Priority minPriority, const string& logFile);
        static void stop();
        static void write(Priority priority, const string& message);
    private:
        // Logger adheres to the singleton design pattern, hence the private
        // constructor, copy constructor and assignment operator.
        Logger();
        Logger(const Logger& logger) {}
        //Logger& operator = (const Logger& logger) {}
        // private instance data
        bool active;
        ofstream fileStream;
        Priority minPriority;
        // names describing the items in enum Priority
        static const string PRIORITY_NAMES[];
        // the sole Logger instance (singleton)
        static Logger instance;
};