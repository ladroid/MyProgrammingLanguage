#include <iostream>
#include <string>
#include <stdlib.h>
#include "Decimal.h"

using namespace std;

Decimal::Decimal(string number) {
    this->number = number;
}

Decimal operator+(Decimal &number, Decimal &number2) {
    return Decimal(to_string(atof(number.number.c_str()) + atof(number2.number.c_str())));
}

Decimal operator-(Decimal &number, Decimal &number2) {
    return Decimal(to_string(atof(number.number.c_str()) - atof(number2.number.c_str())));
}

Decimal operator*(Decimal &number, Decimal &number2) {
    return Decimal(to_string(atof(number.number.c_str()) * atof(number2.number.c_str())));
}

Decimal operator/(Decimal &number, Decimal &number2) {
    return Decimal(to_string(atof(number.number.c_str()) / atof(number2.number.c_str())));
}

void Decimal::value() {
    cout << this->number << endl;
}

Decimal::~Decimal() { }
