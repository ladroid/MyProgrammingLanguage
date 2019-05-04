#include <iostream>
#include <unordered_map>
#include <string>
#include <functional>
#include "Int.h"

using namespace std;

Int::Int(long number) {
    this->number = number;
}

Int::~Int() {  }

Int operator+(Int &number, Int &number2) {
    return Int(number.number + number2.number);
}

Int operator-(Int &number, Int &number2) {
    return Int(number.number - number2.number);
}

Int operator*(Int &number, Int &number2) {
    return Int(number.number * number2.number);
}

Int operator/(Int &number, Int &number2) {
    return Int(number.number / number2.number);
}

ostream &operator<<(ostream &out, Int &num) {
    out << num.number;
    return out;
}

size_t Int::__hash__(const Int &number) const {
    return ((hash<float>()(number.number) << 1) >> 1);
}

void Int::value() {
    cout << this->number << endl;
}