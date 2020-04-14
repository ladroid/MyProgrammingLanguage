#include <string>

using namespace std;

class Object {
    public:
        Object() {}
        string getClass();
        bool equals(Object& obj);
        Object clone();
        string toString();
};