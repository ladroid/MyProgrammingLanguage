#include <iostream>
#include <algorithm>
#include <iterator>
#include "Dictionary.h"

#define SIZE 16

using namespace std;

// template<typename T>
// Dictionary<T>::Dictionary(int s) {
//     this->size = s;
//     this->array = new T[s];
// }

// template<typename T>
// void Dictionary<T>::ensureCapacity() {
//     if(SIZE == (sizeof(array) / sizeof(*array))) {
//         int newsize = (sizeof(array) / sizeof(*array)) * 2;
//         T *dest = new T[newsize];
//         copy(begin(array), end(array), begin(dest));
//     }
// }

// template<typename T>
// void Dictionary<T>::set(int elem, T val) {
//     //ensureCapacity();
//     array[elem] = val;
// }

// template<typename T>
// void Dictionary<T>::get() {
//     for(int i=0; i<this->size; i++) {
//         cout << i << array[i] << typeid(array[i]).name() << endl;
//     }
// }

// template<typename T>
// Dictionary<T>::~Dictionary() { }