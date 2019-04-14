#include<vector>
#include<algorithm>
#include "timsort.hpp"
//#include"sortinglib.h"

std::vector<double> rand_arr(int length) {
    std::vector<double> arr;
    for(int i = 1; i <= length; i++) {
        arr.push_back(rand() % 100);
    }
    return arr;
}

std::vector<int> arr(std::vector<int> a) {
    gfx::timsort(a.begin(), a.end());
    return a;
}