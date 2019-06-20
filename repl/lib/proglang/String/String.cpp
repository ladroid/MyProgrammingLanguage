#include <iostream>
#include <string>
#include <algorithm>
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

string String::upper() {
    for_each(this->str.begin(), this->str.end(), [](char &ch) {ch = ::toupper(static_cast<unsigned char>(ch));});
    return this->str;
}

string String::lower() {
    for_each(this->str.begin(), this->str.end(), [](char &ch) {ch = ::tolower(static_cast<unsigned char>(ch));});
    return this->str;
}

string String::capitalize() {
    for(auto& x: this->str) {
        x = toupper(x);
    }
    return this->str;
}

string String::value() {
    return this->str;
}

String::~String() { }