# readme
## commands

### C
1) write .c file and for this file write .i file. .i - is interface
2) after this write this command: swig -python -py3 mathlib.i
3) then this command: gcc -c -I/usr/local/Cellar/python/3.7.0/Frameworks/Python.framework/Versions/3.7/include/python3.7m mathlib.c mathlib_wrap.c
4) after ld -shared example.o example_wrap.o -o _example.so
   or this one -> gcc -dynamiclib -o _mathlib.so *.o -L/usr/local/Cellar/python/3.7.0/Frameworks/Python.framework/Versions/3.7/lib/ -lpython3.7 -flat_namespace
5) and then you can run it -> python3 test.py

### C++
1) write .cpp file and for this file write .i file. .i - is interface
2) after this write this command: swig -c++ -python -py3 sortinglib.i
3) then this command: g++ -g -ggdb -c -std=c++0x -I/usr/local/Cellar/python/3.7.0/Frameworks/Python.framework/Versions/3.7/include/python3.7m sortinglib.cpp sortinglib_wrap.cxx
4) after gcc -dynamiclib -o _sortinglib.so *.o -L/usr/local/Cellar/python/3.7.0/Frameworks/Python.framework/Versions/3.7/lib/ -lpython3.7 -flat_namespace
5) and then you can run it -> python3 test.py