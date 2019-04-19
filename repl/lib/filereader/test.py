import filereader
import timeit

def my_read(x):
    return filereader.read_file(x)

def py_read(x):
    with open(x, 'r') as file:
        return file.readline

print(timeit.timeit("my_read('/Users/lado/Documents/MyProgrammingLanguage/JulesVerneLLVM/repl/lib/README.md')", "from __main__ import my_read",number=100))
print(timeit.timeit("py_read('/Users/lado/Documents/MyProgrammingLanguage/JulesVerneLLVM/repl/lib/README.md')", "from __main__ import py_read",number=100))


#print(filereader.read_file("/Users/lado/Documents/MyProgrammingLanguage/JulesVerneLLVM/repl/lib/README.md"))
#print(filereader.reading("/Users/lado/Documents/MyProgrammingLanguage/JulesVerneLLVM/repl/lib/README.md"))