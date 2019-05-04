#include <iostream>
#include <string>

using namespace std;

class Decimal
{
private:
    string number;
public:
    Decimal(string number);
    ~Decimal();
    friend Decimal operator+(Decimal &number, Decimal &number2);
    friend Decimal operator-(Decimal &number, Decimal &number2);
    friend Decimal operator*(Decimal &number, Decimal &number2);
    friend Decimal operator/(Decimal &number, Decimal &number2);
    void value();
};
