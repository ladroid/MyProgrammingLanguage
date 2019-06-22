#include <iostream>
#include <unordered_map>
#include <string>
#include <functional>
#include "Float.h"

using namespace std;

Float::Float(float number) {
    this->number = number;
}

Float::~Float() {  }

Float operator+(Float &number, Float &number2) {
    return Float(number.number + number2.number);
}

Float operator-(Float &number, Float &number2) {
    return Float(number.number - number2.number);
}

Float operator*(Float &number, Float &number2) {
    return Float(number.number * number2.number);
}

Float operator/(Float &number, Float &number2) {
    return Float(number.number / number2.number);
}

ostream &operator<<(ostream &out, Float &num) {
    out << num.number;
    return out;
}

size_t Float::__hash__(const Float &number) const {
    return ((hash<float>()(number.number) << 1) >> 1);
}

void Float::value() {
    cout << this->number << endl;
}