#include <iostream>
#include <string>
#include <vector>
using namespace std;

class BigInt {
    private:
        string num1;
        string num2;
    public:
        BigInt();
        BigInt(string num1, string num2);
        string multiply(string num1, string num2);
        string addition(string num1, string num2);
        string substraction(string num1, string num2);
        //string division(string num1, string num2);
        ~BigInt() {}
};