from lark import Lark, Transformer, Visitor, Tree, v_args, UnexpectedInput, Token
from lib.proglang.List import List
from lib.proglang.Dictionary import Dictionary
from lib.proglang.Set import Set
from lib.mathlib import mathlib
from lib.sortinglib import sortinglib
from lib.bioinfo import bioinfo
from lib.filereader import filereader
from lib.filewriter import filewriter
from lib.proglang.bigint import bigint
import sys
import importlib
import importfile
import re
import ast
grammar = '''
?start: main 

?main: calc | NAME "=" calc -> assign | value | printval | functype | funcnontype | pow_ | ceil_ | acos_ | asin_ | atan_ | cos_ | exp_ | fabs_ | floor_ | sin_ | tan_ | sqrt_ | log_ | log10_ | importingfile | NEWLINE | condition | diction | writeio | bignumsum | bignumsub | bignummul | bignumpow | bioinfo | forloop | returning

?codetype: calc | NAME "=" calc -> assign | value | printval | functype | funcnontype | pow_ | ceil_ | acos_ | asin_ | atan_ | cos_ | exp_ | fabs_ | floor_ | sin_ | tan_ | sqrt_ | log_ | log10_ | importingfile | NEWLINE | condition | diction | writeio | bignumsum | bignumsub | bignummul | bignumpow | bioinfo | forloop | returning

?calc: prod | calc "+" prod -> add | calc "-" prod -> sub
?prod: atom | prod "*" atom -> mul | prod "/" atom -> div

?atom: NUMBER -> number | "-" atom -> neg | NAME -> var | "("calc")"

?value: array | SIGNED_NUMBER -> number | string | sorting | sets

?printval: "print" codetype | "print" NAME_VAL

?functype: "func" NAME "(" ")" "{" [codetype (";" codetype)*] ";" returning codetype "}" -> functypeassign | functypeatom
?type: "Int" | "String" | "Float" | "Decimal"
?functypeatom: "typed" NAME "(" ")" -> functypevar
?returning: "return"

?funcnontype: "void" NAME "(" ")" "{" [codetype (";" codetype)*] "}" -> funcassign | funcatom
?funcatom: NAME "(" ")" -> funcvar

?array: "[" [value ("," value)*] "]"

?sets: "{" [value ("," value)*] "}"

?diction: "dict" "." "dictint" "(" value ")" "." ["set" "(" value "," value ")"*] "." "get" "(" ")"

?writeio: "writeio" "." "open" "(" value "," value ")"

?readio: "readio" "." "open" "(" value ")"

?bignumsum: "bigint" "." "sum" "(" value "," value ")" 
?bignumsub: "bigint" "." "sub" "(" value "," value ")" 
?bignummul: "bigint" "." "mul" "(" value "," value ")"
?bignumpow: "bigint" "." "pow" "(" value "," value ")"

?bioinfo: count_dna | generate_dna_sequence | dna_frequency_map | read_dnafile | translate_to_protein | mutate | reverse_complement | count_non_dna_bases_seq | dna_concat | sequence_alignment | motif | protein_mass | dna_to_rna | count_mut
?count_dna: "count_dna" "(" value "," value ")"
?generate_dna_sequence: "generate_dna_sequence" "(" value ")"
?dna_frequency_map: "dna_frequency_map" "(" value "," value ")"
?read_dnafile: "read_dnafile" "(" value ")"
?translate_to_protein: "translate_to_protein" "(" value ")"
?mutate: "mutate" "(" value "," value "," value ")"
?reverse_complement: "reverse_complement" "(" value ")"
?count_non_dna_bases_seq: "count_non_dna_bases_seq" "(" value "," value ")"
?dna_concat: "dna_concat" "(" value "," value ")"
?sequence_alignment: "sequence_alignment" "(" value "," value "," value ")"
?motif: "motif" "(" value "," value ")"
?protein_mass: "protein_mass" "(" value ")"
?dna_to_rna: "dna_to_rna" "(" value ")"
?count_mut: "count_mut" "(" value "," value ")"

condition: "if" [statement "then" result ("elseif" statement ":" result)*] | "if" [statement "then" result ("elseif" statement ":" result)*] "else" result
if: "if"
then: "then"
elseif: "elseif"
else: "else"
statement: expression
result: printval | condition
expression: (VARIABLE | SIGNED_NUMBER) action_operator (VARIABLE | SIGNED_NUMBER)
VARIABLE: /[a-zA-Zа-яА-Я0-9_.-]+/
?action_operator: ACTION_OPERATOR
ACTION_OPERATOR: "<"|">"|"="|"is"|">="|"<="|"!="|"in"|"equals"

?forloop: "for" NAME "in" value ".." value ":"  [codetype (";" codetype)*]

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

NAME_VAL: NAME

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
        self.funcvars = {}
        self.functypevars = {}
    def assign(self, name, args):
        self.vars[name] = args
        return args
    def functypeassign(self, name, *args):
        for i in args:
            self.functypevars[name] = args
        return args
    def functypevar(self, name):
        return self.functypevars[name]
    def funcassign(self, name, *args):
        for i in args:
            self.funcvars[name] = args
        return args
    def funcvar(self, name):
        return self.funcvars[name]
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
            if expr_val.children[0].type == 'VARIABLE':
                num1 = int(self.var(str(expr_val.children[0].value)))
            else:
                num1 = int(expr_val.children[0].value)
            sign = expr_val.children[1].value
            if expr_val.children[2].type == 'VARIABLE':
                num2 = int(self.var(str(expr_val.children[2].value)))
            else:
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
    def diction(self, *elements):
        d = Dictionary.dictint(int(elements[0]))
        for arg in elements:
            d.set(int(arg), int(arg))
        d.get()
    def writeio(self, *ele,elements):
        filewriter.write_file(elements[0], elements[1])
    def readio(self, elem):
        print("->",elem)
        a = None
        for a in elem:
            a = elem
        print("bn", a)
        filereader.read_file(a)
    def bignumsum(self, *elem):
        num1 = None
        num2 = None
        for i in elem[0].children:
            num1 = i.value
        for i in elem[1].children:
            num2 = i.value
        num1 = num1.replace('"', '')
        num2 = num2.replace('"', '')
        print("->", bigint.BigInt().addition(num1, num2))
    def bignumsub(self, *elem):
        num1 = None
        num2 = None
        for i in elem[0].children:
            num1 = i.value
        for i in elem[1].children:
            num2 = i.value
        num1 = num1.replace('"', '')
        num2 = num2.replace('"', '')
        print("-_->", bigint.BigInt().substraction(num1, num2))
    def bignummul(self, *elem):
        num1 = None
        num2 = None
        for i in elem[0].children:
            num1 = i.value
        for i in elem[1].children:
            num2 = i.value
        num1 = num1.replace('"', '')
        num2 = num2.replace('"', '')
        print('-->', bigint.BigInt().multiply(num1, num2))
    def bignumpow(self, *elem):
        num1 = None
        num2 = None
        for i in elem[0].children:
            num1 = i.value
        for i in elem[1].children:
            num2 = i.value
        num1 = num1.replace('"', '')
        num2 = num2.replace('"', '')
        bigint.BigInt().pow(int(num1), int(num2))
    def count_dna(self, *elem):
        dna = None
        base = None
        for i in elem[0].children:
            dna = i.value
        for i in elem[1].children:
            base = i.value
        dna = dna.replace('"', '')
        base = base.replace('"', '')
        bioinfo.count_dna(dna, base)
    def generate_dna_sequence(self, *elem):
        length = None
        for i in elem[0].children:
            length = i.value
        length = length.replace('"', '')
        bioinfo.generate_dna_sequence(int(length))
    def dna_frequency_map(self, *elem):
        dna = None
        k = None
        for i in elem[0].children:
            dna = i.value
        for i in elem[1].children:
            k = i.value
        dna = dna.replace('"', '')
        k = k.replace('"', '')
        bioinfo.dna_frequency_map(dna, int(k))
    def read_dnafile(self, *elem):
        filename = None
        for i in elem[0].children:
            filename = i.value
        filename = filename.replace('"', '')
        bioinfo.read_dnafile(filename)
    def translate_to_protein(self, *elem):
        filename = None
        for i in elem[0].children:
            filename = i.value
        filename = filename.replace('"', '')
        bioinfo.translate_to_protein(filename)
    def mutate(self, *elem):
        dna = None
        mutation = None
        threshold = None
        for i in elem[0].children:
            dna = i.value
        for i in elem[1].children:
            mutation = i.value
        for i in elem[2].children:
            threshold = i.value
        dna = dna.replace('"', '')
        mutation = mutation.replace('"', '')
        threshold = threshold.replace('"', '')
        mutation = ast.literal_eval(mutation)
        bioinfo.mutate(dna, mutation, threshold)
    def reverse_complement(self, *elem):
        seq = None
        for i in elem[0].children:
            seq = i.value
        seq = seq.replace('"', '')
        bioinfo.reverse_complement(seq)
    def count_non_dna_bases_seq(self, *elem):
        seq = None
        allowed_bases = None
        for i in elem[0].children:
            seq = i.value
        for i in elem[1].children:
            allowed_bases = i.value
        seq = seq.replace('"', '')
        allowed_bases = list(allowed_bases.replace('"', ''))
        bioinfo.count_non_dna_bases_seq(seq, allowed_bases=allowed_bases)
    def dna_concat(self, *elem):
        dna1 = None
        dna2 = None
        for i in elem[0].children:
            dna1 = i.value
        for i in elem[1].children:
            dna2 = i.value
        dna1 = dna1.replace('"', '')
        dna2 = dna2.replace('"', '')
        bioinfo.dna_concat(dna1, dna2)
    def sequence_alignment(self, *elem):
        pass
    def motif(self, *elem):
        s = None
        t = None
        for i in elem[0].children:
            s = i.value
        for i in elem[1].children:
            t = i.value
        s = s.replace('"', '')
        t = t.replace('"', '')
        bioinfo.motif(s, t)
    def protein_mass(self, *elem):
        pass
    def dna_to_rna(self, *elem):
        dna = None
        for i in elem[0].children:
            dna = i.value
        dna = dna.replace('"', '')
        bioinfo.dna_to_rna(dna)
    def count_mut(self, *elem):
        s = None
        t = None
        for i in elem[0].children:
            s = i.value
        for i in elem[1].children:
            t = i.value
        s = s.replace('"', '')
        t = t.replace('"', '')
        bioinfo.count_mut(s, t)
    def forloop(self, *elem): 
        obj1 = int(elem[1])
        obj2 = int(elem[2])
        obj3 = None
        lis = []
        #id_obj = {}
        #print(elem)
        if elem[0].type == 'NAME' and type(elem[3]) == Tree:
            for i in elem[3].children:
                obj3 = i.value
            obj3 = obj3.replace('"', '')
            for i in range(obj1, obj2):
                lis.append(obj3)
        else:
            #obj3 = int(elem[3])
            # print(elem[3])
            # print(elem[3].data)
            # print(elem[3].children)
            # for i in elem[3].children:
            #     print(i)
            #     obj3 = i.value
            # obj3 = obj3.replace('"', '')
            for i in range(obj1, obj2):
                lis.append(i)
        return lis

l = Lark(grammar, parser='lalr', transformer=LanguageTransformer())
#print(l.parse('''sum = 2+2'''))
#print(l.parse('''a = 5'''))
#print(l.parse('''if sum equals a then print "true" else print "false"'''))

#print(l.parse('''a = 5'''))
#print(l.parse('''if a > 12 then print "true" else print "false"'''))

#print(l.parse('''if 12 equals 12 then print "true" else print "false"'''))

#print(l.parse('''bigint.sum("2", "2")'''))

#print(l.parse('''sum = 2+2'''))
#print(l.parse('''void ex() { print "Hello"; c=2+2 }'''))
#print(l.parse('''ex()'''))

#print(l.parse('''sum = 2+2'''))
#print(l.parse('''print sum'''))

#print(l.parse('''i = 0'''))
#print(l.parse('''for i in 1 .. 5: print i'''))

#print(l.parse('''func ex() { print "Hello"; c=2+2; return c }'''))
#print(l.parse('''typed ex()'''))

#print(l.parse('''i = 0'''))
#print(l.parse('''void ex() { for i in 1 .. 5: print i }'''))
#print(l.parse('''ex()'''))


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

class KujiraMissingScope(KujiraSyntaxError):
    label = 'Missing Scope'

class KujiraMissingPaws(KujiraSyntaxError):
    label = 'Missing Paws'

class KujiraWrongCalculation(KujiraSyntaxError):
    label = 'Wrong Calculation'

class KujiraObjNotDefined(KujiraSyntaxError):
    label = 'Object Not Defined'

class KujiraInnerFunctonError(KujiraSyntaxError):
    label = 'Inner Functon Error'

def parss(text):
    try:
        j = l.parse(text)
        print(j)
    except UnexpectedInput as i:
        xc_class = i.match_examples(l.parse, {
            KujiraMissingClosing : ['[1,2,3,4', '[1,2,3,4,'],
            KujiraMissingOpening : ['1,2,3,4]', '1,2,3,4,]'],
            KujiraMissingComma   : ['[1 2 3 4]'],
            KujiraMissingValue   : ['a = ', 'a= '],
            KujiraMissingScope   : ['func (', 'sort(', 'func )'],
            KujiraMissingPaws    : ["print 'Hello'"],
            KujiraWrongCalculation : ["'2' + 2", "cd = '2' + 34"],
            KujiraObjNotDefined  : ['acd'],
            KujiraInnerFunctonError : ['void a() { void printH() { print "Hello" } } printH()']
        })
        if not xc_class:
            raise
        raise xc_class(i.get_context(text), i.line, i.column)

def test():
    try:
        parss("afg=")
        #parss('''print "Hello world"''')
    except KujiraMissingClosing as e:
        print(e)
    except KujiraMissingOpening as e:
        print(e)
    except KujiraMissingComma as e:
        print(e)
    except KujiraMissingValue as e:
        print(e)
    except KujiraMissingScope as e:
        print(e)
    except KujiraMissingPaws as e:
        print(e)
    except KujiraWrongCalculation as e:
        print(e)
    except KujiraInnerFunctonError as e:
        print(e)
    except KujiraObjNotDefined as e:
        print(e)
    
test()    
