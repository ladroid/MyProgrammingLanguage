#include <iostream>
#include "logger.h"

using namespace std;

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
