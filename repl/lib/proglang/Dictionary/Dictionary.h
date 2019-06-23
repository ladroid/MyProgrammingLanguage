#include <iostream>
#include <algorithm>
#include <iterator>
#include <map>

#define SIZE 16

using namespace std;

template<typename K, typename V>
void print_map(map<K,V> const &m)
{
    for (auto const& pair: m) {
        cout << "{" << pair.first << ": " << pair.second << "}\n";
    }
}

template<typename K, typename V>
class Dictionary {
    private:
        int size;
        K *array;
        map<K, V> arr;
        void ensureCapacity();
    public:
        Dictionary(int s);
        void set(K elem, V val);
        void get();
        ~Dictionary();
};

template<typename K, typename V>
Dictionary<K, V>::Dictionary(int s) {
    this->size = s;
    //this->array = new T[s];
}

template<typename K, typename V>
void Dictionary<K, V>::ensureCapacity() {
    // if(SIZE == (sizeof(array) / sizeof(*array))) {
    //     int newsize = (sizeof(array) / sizeof(*array)) * 2;
    //     T *dest = new T[newsize];
    //     copy(array, array, dest);
    // }
}

template<typename K, typename V>
void Dictionary<K, V>::set(K elem, V val) {
    // for(int i=0; i<size; i++) {
    //     array[i] = val;
    // }
    for(int i=0; i<size; i++) {
        arr[elem] = val;
    }
}

template<typename K, typename V>
void Dictionary<K, V>::get() {
    // for(int i=0; i<this->size; i++) {
    //     cout << i << " " << array[i] << " " << typeid(array[i]).name() << endl;
    // }
     print_map(arr);
}

template<typename K, typename V>
Dictionary<K, V>::~Dictionary() { }
