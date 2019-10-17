import sys
import importlib
def imports(arg1:str, arg2:str, arg3:str, arg4:str):
    file = '/Users/lado/Documents/MyProgrammingLanguage/ProgLanguageBetaTest/MyLanguageLark/' + arg1
    sys.path.insert(0, file)
    args = [arg1, arg2, arg3, arg4]
    print(args)
    mod = importlib.import_module(args[0])
    print(mod)
    getattr(mod, args[1])(args[2], args[3])