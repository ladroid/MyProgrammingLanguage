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
        Logger& operator = (const Logger& logger) {}
        // private instance data
        bool active;
        ofstream fileStream;
        Priority minPriority;
        // names describing the items in enum Priority
        static const string PRIORITY_NAMES[];
        // the sole Logger instance (singleton)
        static Logger instance;
};

const string Logger::PRIORITY_NAMES[] = { "DEBUG", "CONFIG", "INFO", "WARNING", "ERROR" };
Logger Logger::instance;
// --------------------------------------
// function implementations
// --------------------------------------
 
Logger::Logger() : active(false) {}
 
void Logger::start(Priority priority, const string& logFile)
{
    instance.active = true;
    instance.minPriority = priority;
    if (logFile != "")
    {
        instance.fileStream.open(logFile.c_str());
    }
}
 
void Logger::stop()
{
    instance.active = false;
    if (instance.fileStream.is_open())
    {
        instance.fileStream.close();
    }
}
 
void Logger::write(Priority priority, const string& message)
{
    if (instance.active && priority >= instance.minPriority)
    {
        // identify current output stream
        ostream& stream = instance.fileStream.is_open() ? instance.fileStream : std::cout;
        stream  << PRIORITY_NAMES[priority] << ": " << message << endl;
    }
}
