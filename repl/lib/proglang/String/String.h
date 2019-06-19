#include <iostream>
#include <string>

using namespace std;

class String
{
    private:
        string str;
    public:
        String(string str);
        ~String();
        friend String operator+(String& str1, String& str2);
        int size();
        string value();
};