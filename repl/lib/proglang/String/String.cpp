#include <iostream>
#include <string>
#include "String.h"

using namespace std;

String::String(string str) {
    this->str = str;
    cout << "A" << this->str;
}

String operator+(String& str1, String& str2) {
    string result = str1.str + " " + str2.str;
    return(String(result));
}

int String::size() {
    return this->str.size();
}

string String::value() {
    return this->str;
}

String::~String() { }