#include<vector>
#include<algorithm>
//#include"sortinglib.h"

std::vector<double> rand_arr(int length) {
    std::vector<double> arr;
    for(int i = 1; i <= length; i++) {
        arr.push_back(rand() % 100);
    }
    return arr;
}