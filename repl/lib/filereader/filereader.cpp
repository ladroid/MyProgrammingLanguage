#include <iostream>
#include <fstream>
#include <string>
#include <vector>
#include <numeric>

std::string read_file(std::string file) {
    std::ifstream inFile;
    inFile.open(file, std::ios::in);
    std::string line;
    std::string result;
    std::vector<std::string> text;

    if(!inFile) {
       
    }else {
        while(std::getline(inFile, line)) {
            text.push_back(line);
        }
    }
    result = std::accumulate(std::begin(text), std::end(text), result);
    inFile.close();
    return result;
}