#include<vector>
//#include"sortinglib.h"

std::vector<double> get_arrz(int length) {
    std::vector<double> arr(length);
    for(int i = 0; i < length; i++) {
        arr.push_back(rand());
    }
    return arr;
}