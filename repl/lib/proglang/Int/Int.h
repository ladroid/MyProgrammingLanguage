#include <iostream>
#include <unordered_map>
#include <string>
#include <functional>

using namespace std;

class Int {
private:
    long number;
public:
    Int(long number);
    ~Int();
    friend Int operator+(Int &number, Int &number2);
    friend Int operator-(Int &number, Int &number2);
    friend Int operator*(Int &number, Int &number2);
    friend Int operator/(Int &number, Int &number2);
    friend ostream &operator<<(ostream &out, Int &num);
    void value();
    size_t __hash__(const Int &number) const;
};