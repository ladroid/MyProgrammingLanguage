#include <fstream>
#include <iterator>
#include <string>
#include <vector>

void write_file(std::string file, std::string str) {
    std::vector<std::string> example;
    example.push_back(str);
    std::ofstream output_file(file);
    std::ostream_iterator<std::string> output_iterator(output_file, "\n");
    std::copy(example.begin(), example.end(), output_iterator);
}