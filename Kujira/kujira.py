from lark import Lark, Transformer, Visitor, Tree, v_args, UnexpectedInput
import os, sys
sys.path.append(os.path.dirname(os.path.dirname(os.path.realpath(__file__))))
from repl.lib.proglang.List import List
from repl.lib.proglang.Dictionary import Dictionary
from repl.lib.proglang.Set import Set
from repl.lib.mathlib import mathlib
from repl.lib.sortinglib import sortinglib
import importlib
grammar = '''
?start: calc | NAME "=" calc -> assign | value | printval | func | pow_ | ceil_ | acos_ | asin_ | atan_ | cos_ | exp_ | fabs_ | floor_ | sin_ | tan_ | sqrt_ | log_ | log10_ | importingfile

?calc: prod | calc "+" prod -> add | calc "-" prod -> sub
?prod: atom | prod "*" atom -> mul | prod "/" atom -> div

?atom: NUMBER -> number | "-" atom -> neg | NAME -> var | "("calc")"

?value: array | SIGNED_NUMBER -> number | string | sorting | sets

?printval: "print" value

?func: "func" "(" [NAME ":" value ("," NAME ":" value)*] ")" "{" printval "}"

?array: "[" [value ("," value)*] "]"

?sets: "{" [value ("," value)*] "}"

?pow_ : "pow" "(" NUMBER "," NUMBER ")"
?ceil_ : "ceil" "(" NUMBER ")"
?acos_ : "acos" "(" NUMBER ")"
?asin_ : "asin" "(" NUMBER ")"
?atan_ : "atan" "(" NUMBER ")"
?cos_ : "cos" "(" NUMBER ")"
?exp_ : "exp" "(" NUMBER ")"
?fabs_ : "fabs" "(" NUMBER ")"
?floor_ : "floor" "(" NUMBER ")"
?sin_ : "sin" "(" NUMBER ")"
?tan_ : "tan" "(" NUMBER ")"
?sqrt_ : "sqrt" "(" NUMBER ")"
?log_ : "log" "(" NUMBER ")"
?log10_ : "log10" "(" NUMBER ")"

?sorting : "sort" "(" "[" [value ("," value)*] "]" ")"

importingfile: "import" NAME

string : ESCAPED_STRING

%import common.NUMBER
%import common.SIGNED_NUMBER
%import common.ESCAPED_STRING
%import common.CNAME -> NAME
%import common.WS_INLINE
%ignore " "
%ignore WS_INLINE
'''

@v_args(inline=True)
class LanguageTransformer(Transformer):
    from operator import add, sub, mul, truediv as div, neg
    number = float
    def __init__(self):
        self.vars = {}
    def assign(self, name, args):
        self.vars[name] = args
        return args
    def var(self, name):
        return self.vars[name]
    def array(self, *elements):
        l = List.List()
        l.createnode(int(elements[0]))
        for arg in elements:
            l.insert_start(int(arg))
        l.display()
    def sets(self, *elements):
        s = Set.Set()
        for arg in elements:
            s.put(int(arg))
        s.display()
    def pow_(self, elem, elem2):
        return mathlib.pow_(int(elem), int(elem2))
    def ceil_(self, elem):
        return mathlib.ceil_(int(elem))
    def acos_(self, elem):
        return mathlib.acos_(int(elem))
    def asin_(self, elem):
        return mathlib.asin_(int(elem))
    def atan_(self, elem):
        return mathlib.atan_(int(elem))
    def cos_(self, elem):
        return mathlib.cos_(int(elem))
    def exp_(self, elem):
        return mathlib.exp_(int(elem))
    def fabs_(self, elem):
        return mathlib.fabs_(int(elem))
    def floor_(self, elem):
        return mathlib.floor_(int(elem))
    def sin_(self, elem):
        return mathlib.sin_(int(elem))
    def tan_(self, elem):
        return mathlib.tan_(int(elem))
    def sqrt_(self, elem):
        return mathlib.sqrt_(int(elem))
    def log_(self, elem):
        return mathlib.log_(int(elem))
    def log10_(self, elem):
        return mathlib.log_10(int(elem))
    def sorting(self, *elem):
        a = []
        for arg in elem:
            a.append(int(arg))
        a = tuple(a)
        return sortinglib.arr(a)
    def importingfile(self, args):
        sys.path.insert(0, '/Users/lado/Documents/MyProgrammingLanguage/ProgLanguageBetaTest/MyLanguageLark/module1.py')
        with open(args, 'r') as file:
            for line in file:
                line = line.strip()
                if not line or line[0] == '#':
                    continue
                parts = line.split()
                print(parts)
                mod = importlib.import_module(parts[0])
                print(mod)
                getattr(mod, parts[1])(parts[2], parts[3])


l = Lark(grammar, parser='lalr', transformer=LanguageTransformer())
print(l.parse('''import src'''))