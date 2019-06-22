#include <iostream>
#include <unordered_map>
#include <string>
#include <functional>

using namespace std;

class Float {
    private:
        float number;
    public:
        Float(float number);
        friend Float operator+(Float &number, Float &number2);
        friend Float operator-(Float &number, Float &number2);
        friend Float operator*(Float &number, Float &number2);
        friend Float operator/(Float &number, Float &number2);
        friend ostream &operator<<(ostream &out, Float &num);
        void value();
        size_t __hash__(const Float &number) const;
        ~Float();
};