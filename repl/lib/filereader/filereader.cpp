#include <iostream>
#include <fstream>
#include <string>

std::string read_file(std::string file) {
    std::ifstream inFile;
    inFile.open(file);
    std::string line;
    std::string result;

    if(!inFile) {
        return "Unable to open file";
    } else {
        while(std::getline(inFile, line)) {
            result = line;
        }
        inFile.close();
    }
    return result;
}