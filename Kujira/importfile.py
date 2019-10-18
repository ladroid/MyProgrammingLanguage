import sys
import importlib
def imports(arg1, arg2, arg3, arg4):
    file = '/Users/lado/Documents/MyProgrammingLanguage/JulesVerneLLVM/repl/lib/' + arg1
    sys.path.insert(0, file)
    if arg4 is 0:
        args = [arg1, arg2, arg3]
        print(args)
        mod = importlib.import_module(args[0])
        print(mod)
        print(getattr(mod, args[1])(args[2]))
    else:
        args = [arg1, arg2, arg3, arg4]
        print(args)
        mod = importlib.import_module(args[0])
        print(mod)
        print(getattr(mod, args[1])(args[2], args[3]))