#include <iostream>
#include <string>
#include "Fraction.h"

using namespace std;

Fraction::Fraction() {}

Fraction::Fraction(int num, int den) {
    this->num = num;
    this->den = den;
}

int Fraction::getNumerator() {
    return num;
}

int Fraction::getDenominator() {
    return den;
}

Fraction Fraction::operator+(Fraction otherFrac) {
    int newNum = num * otherFrac.den + den * otherFrac.num;
    int newDen = den * otherFrac.den;
    return Fraction(newNum, newDen);
}

Fraction Fraction::operator-(Fraction otherFrac) {
    int newNum = num * otherFrac.den - den * otherFrac.num;
    int newDen = den * otherFrac.den;
    return Fraction(newNum, newDen);
}

Fraction Fraction::operator*(Fraction otherFrac) {
    int newNum = num * otherFrac.num;
    int newDen = den * otherFrac.den;
    return Fraction(newNum, newDen);
}

Fraction Fraction::operator/(Fraction otherFrac) {
    int newNum = num * otherFrac.den;
    int newDen = den * otherFrac.num;
    return Fraction(newNum, newDen);
}

string Fraction::toString() {
    return to_string(num) + "/" + to_string(den);
}