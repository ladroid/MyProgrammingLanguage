import mathlib
import math
import timeit

def math_my(x):
    return mathlib.sqrt_(x)

def not_my_math(x):
    return math.sqrt(x)

print(timeit.repeat("for x in range(100): math_my(x)", "from __main__ import math_my",number=100000))
print(timeit.repeat("for x in range(100): not_my_math(x)", "from __main__ import not_my_math",number=100000))