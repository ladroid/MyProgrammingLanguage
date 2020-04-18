#include <string>
#include <iostream>

using namespace std;

class Object {
    public:
        Object() {}
        string getClass();
        bool equals(Object& obj);
        Object clone();
        string toString();
};

string Object::getClass() {
    return "";
}

bool Object::equals(Object& obj) {
    if (this == &obj) {
        return true;
    } else {
        return false;
    }
}

Object Object::clone() {
    return *this;
}

string Object::toString() {
    return typeid(Object).name();
}