#include <iostream>
#include <string>

using namespace std;

class Fraction {
    private:
        int num, den;
    public:
        Fraction();
        Fraction(int num, int den);
        int getNumerator();
        int getDenominator();
        Fraction operator+(Fraction otherFrac);
        Fraction operator-(Fraction otherFrac);
        Fraction operator*(Fraction otherFrac);
        Fraction operator/(Fraction otherFrac);
        string toString();
};