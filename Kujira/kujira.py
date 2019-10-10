from lark import Lark, Transformer, Visitor, Tree, v_args, UnexpectedInput
from lib.proglang import List
from lib.proglang import mathlib
grammar = '''
?start: calc | NAME "=" calc -> assign | value | printval | func | pow_ | ceil_ | acos_ | asin_ | atan_ | cos_ | exp_ | fabs_ | floor_ | sin_ | tan_ | sqrt_ | log_ | log10_

?calc: prod | calc "+" prod -> add | calc "-" prod -> sub
?prod: atom | prod "*" atom -> mul | prod "/" atom -> div

?atom: NUMBER -> number | "-" atom -> neg | NAME -> var | "("calc")"

?value: array | SIGNED_NUMBER -> number | string

?printval: "print" value

?func: "func" "(" [NAME ":" value ("," NAME ":" value)*] ")" "{" printval "}"

?array: "[" [value ("," value)*] "]"

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


l = Lark(grammar, parser='lalr', transformer=LanguageTransformer())
print(l.parse("pow(2,3)"))