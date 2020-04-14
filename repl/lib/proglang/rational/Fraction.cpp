#include <iostream>
#include <string>

using namespace std;

class Fraction {
    private:
        int num, den;
    public:
        Fraction(){}
        Fraction(int num=0, int den=1) {
            this->num = num;
            this->den = den;
        }
        int getNumerator();
        int getDenominator();
        Fraction operator+(Fraction otherFrac);
        Fraction operator-(Fraction otherFrac);
        Fraction operator*(Fraction otherFrac);
        Fraction operator/(Fraction otherFrac);
        string toString();
};

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
    return num + "/" + den;
}