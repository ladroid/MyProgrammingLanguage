from lark import Lark, Transformer, Visitor, Tree, v_args, UnexpectedInput
import os, sys
sys.path.append(os.path.dirname(os.path.dirname(os.path.realpath(__file__))))
from repl.lib.proglang.List import List
from repl.lib.proglang.Dictionary import Dictionary
from repl.lib.proglang.Set import Set
from repl.lib.mathlib import mathlib
from repl.lib.sortinglib import sortinglib
import importlib
import importfile
grammar = '''
?start: calc | NAME "=" calc -> assign | value | printval | func | pow_ | ceil_ | acos_ | asin_ | atan_ | cos_ | exp_ | fabs_ | floor_ | sin_ | tan_ | sqrt_ | log_ | log10_ | importingfile | NEWLINE | condition

?calc: prod | calc "+" prod -> add | calc "-" prod -> sub
?prod: atom | prod "*" atom -> mul | prod "/" atom -> div

?atom: NUMBER -> number | "-" atom -> neg | NAME -> var | "("calc")"

?value: array | SIGNED_NUMBER -> number | string | sorting | sets

?printval: "print" value

?func: "func" "(" [NAME ":" value ("," NAME ":" value)*] ")" "{" printval "}"

?array: "[" [value ("," value)*] "]"

?sets: "{" [value ("," value)*] "}"

condition: "if" [statement "then" result ("elseif" statement ":" result)*] | "if" [statement "then" result ("elseif" statement ":" result)*] "else" result
if: "if"
then: "then"
elseif: "elseif"
else: "else"
statement: expression
result: printval | condition
expression: VARIABLE action_operator (VARIABLE | SIGNED_NUMBER)
VARIABLE: /[a-zA-Zа-яА-Я0-9_.-]+/
?action_operator: ACTION_OPERATOR
ACTION_OPERATOR: "<"|">"|"="|"=="|">="|"<="|"!="|"in"

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

importingfile: "import" NAME NAME  NUMBER "," NUMBER 

string : ESCAPED_STRING

COMMENT: "//" /(.|\\n|\\r)*/

%import common.NUMBER
%import common.SIGNED_NUMBER
%import common.ESCAPED_STRING
%import common.CNAME -> NAME
%import common.WS_INLINE
%import common.NEWLINE
%ignore " "
%ignore WS_INLINE
%ignore COMMENT
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
    def importingfile(self, arg, arg2, arg3, arg4):
        importfile.imports(str(arg), str(arg2), str(arg3), str(arg4))
    def condition(self, *expr):
        num1 = None
        num2 = None
        true_ = ""
        false_ = ""
        sign = ""
        for expp in expr[1].children:
            true_ = expp.children[0].value
        for expp in expr[2].children:
            false_ = expp.children[0].value
        for expr_val in expr[0].children:
            num1 = int(expr_val.children[0].value)
            sign = expr_val.children[1].value
            num2 = int(expr_val.children[2].value)
        if sign == '<':
            if num1 < num2:
                return true_
            else:
                return false_
        elif sign == '>':
            if num1 > num2:
                return true_
            else:
                return false_
        elif sign == 'is':
            if num1 is num2:
                return true_
            else:
                return false_
        elif sign == 'equals':
            if num1 == num2:
                return true_
            else:
                return false_
        elif sign == '!=':
            if num1 != num2:
                return true_
            else:
                return false_
        elif sign == '>=':
            if num1 >= num2:
                return true_
            else:
                return false_
        elif sign == '<=':
            if num1 <= num2:
                return true_
            else:
                return false_
        else:
            return false_

l = Lark(grammar, parser='lalr', transformer=LanguageTransformer())
print(l.parse('''if 12 < 3 then print "true" else print "false"'''))

class KujiraSyntaxError(SyntaxError):
    def __init__(self, label, line, column):
        self.label = label
        self.line = line
        self.column = column
    def __str__(self):
        #context, line, column = self.args
        return '%s at line %s, column %s.' % (self.label, self.line, self.column)

class KujiraMissingValue(KujiraSyntaxError):
    label = 'Missing Value'

class KujiraMissingOpening(KujiraSyntaxError):
    label = 'Missing Opening'

class KujiraMissingClosing(KujiraSyntaxError):
    label = 'Missing Closing'

class KujiraMissingComma(KujiraSyntaxError):
    label = 'Missing Comma'

class KujiraTrailingComma(KujiraSyntaxError):
    label = 'Trailing Comma'

def parss(text):
    try:
        j = l.parse(text)
    except UnexpectedInput as i:
        xc_class = i.match_examples(l.parse, {
            KujiraMissingClosing : ['[1,2,3,4', '[1,2,3,4,'],
            KujiraMissingOpening : ['1,2,3,4]', '1,2,3,4,]'],
            KujiraMissingComma   : ['[1 2 3 4]'],
        })
        if not xc_class:
            raise
        raise xc_class(i.get_context(text), i.line, i.column)

def test():
    try:
        parss('[1, 2, 3, 4,')
    except KujiraMissingClosing as e:
        print(e)
    except KujiraMissingOpening as e:
        print(e)
    except KujiraMissingComma as e:
        print(e)
test()    
