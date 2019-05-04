import sortinglib
import timeit

print(sortinglib.rand_arr(4))

def sort(x):
    return sortinglib.arr(x)

def sortt(x):
    return sorted(x)
#print(sortinglib.arr(a))
print(timeit.timeit("sort((4, 6, 9, 3, 1, 5, 2, 8, 7))", "from __main__ import sort",number=1000))
print(timeit.timeit("sortt((4, 6, 9, 3, 1, 5, 2, 8, 7))", "from __main__ import sortt",number=1000))