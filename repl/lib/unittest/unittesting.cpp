#include <cstdlib>
#include <cstdio>
#include <string>
#include <stdio.h>

#define ANSI_COLOR_RED   "\x1b[31m"
#define ANSI_COLOR_RESET "\x1b[0m"
#define STR(x) #x
#define MY_ASSERT(x) if (!(x)) { printf(ANSI_COLOR_RED "assertion failed: (%s), function %s, file %s, line %d.\n" ANSI_COLOR_RESET, STR(x), __PRETTY_FUNCTION__, __FILE__, __LINE__); abort(); } else { printf("assertion true\n"); }

using namespace std;

void test_equal(int obj1, int obj2) {
    MY_ASSERT(obj1 == obj2);
}

void test_equal(float obj1, float obj2) {
    MY_ASSERT(obj1 == obj2);
}

void test_equal(string obj1, string obj2) {
    MY_ASSERT(obj1 == obj2);
}