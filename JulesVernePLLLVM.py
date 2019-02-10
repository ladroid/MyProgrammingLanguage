#!/usr/bin/env python3
import ply.lex as lex
import ply.yacc as yacc
import sys
from datetime import datetime
import os
import subprocess
import click
import decimal
from termcolor import colored
import math

reserved = {
    'if' : 'IF',
    'else' : 'ELSE',
    'for' : 'FOR',
    'while' : 'WHILE',
    'print' : 'PRINT',
    'var' : 'VAR',
    'Float' : 'FLOAT',
    'let' : 'LET',
    'pow' : 'POW',
    'log' : 'LOG',
    'sqrt' : 'SQRT',
    'cos' : 'COS',
    'sin' : 'SIN',
    '<<' : 'SHL',
    '>>' : 'SHR',
    '%' : 'MOD',
    '&' : 'ANDLOGIC',
    '|' : 'ORLOGIC',
    '^' : 'XORLOGIC',
    '.exit' : 'EXIT',
    'copyright' : 'COPYRIGHT',
    '==' : 'EQUAL',
    '!=' : 'NOTEQ',
    '>' : 'LARGE',
    '<' : 'SMALL',
    '>=' : 'LRGEQ',
    '<=' : 'SMLEQ',
    'help' : 'HELP',
    'in' : 'IN',
    #'int' : 'INTARR',
    'open' : 'OPEN',
    'func' : 'FUNC',
    '->' : 'ARROW',
    'int' : 'INT',
    'switch' : 'SWITCH',
    'case' : 'CASE',
    'default' : 'DEFAULT',
    'return' : 'RETURN',
    'callback' : 'CALLBACK',
    'async' : 'ASYNC',
    'Int' : 'TYPINT',
    'String' : 'TYPSTRING'
}

tokens = ['NUMBER', 'DECIMAL', 'STRING', 'COMMA', 'LBRACES', 'RBRACES', 'LSQRBRACK', 'RSQRBRACK', 'COLON', 'SEMICOLON', 'EQUALS', 'PLUS', 'MINUS', 'TIMES', 'DIVIDE', 'LPAREN', 'RPAREN', 'ID'] + list(reserved.values())

t_EQUALS = r'\='
t_PLUS = r'\+'
t_MINUS = r'-'
t_TIMES = r'\*'
t_DIVIDE = r'/'
t_LPAREN = r'\('
t_RPAREN = r'\)'
t_IF = r'if'
t_ELSE = r'else'
t_FOR = r'for'
t_WHILE = r'while'
t_PRINT = r'print'
t_VAR = r'var'
t_FLOAT = r'Float'
t_LET = r'let'
t_POW = r'pow'
t_LOG = r'log'
t_SQRT = r'sqrt'
t_COS = r'cos'
t_SIN = r'sin'
t_SHL = r'<<'
t_SHR = r'>>'
t_MOD = r'%'
t_ANDLOGIC = r'&'
t_ORLOGIC = r'\|'
t_XORLOGIC = r'\^'
t_EXIT = r'.exit'
t_HELP = r'help'
t_COPYRIGHT = r'copyright'
t_COMMA = r','
t_COLON = r':'
t_SEMICOLON = r';'
t_EQUAL   = r'\=\='
t_NOTEQ   = r'\!\='
t_LARGE   = r'\>'
t_SMALL   = r'\<'
t_LRGEQ   = r'\>\='
t_SMLEQ   = r'\<\='
t_IN = r'in'
#t_INTARR = r'int'
t_LSQRBRACK = r'\['
t_RSQRBRACK = r'\]'
t_OPEN = r'open'
t_LBRACES = r'{'
t_RBRACES = r'}'
t_FUNC = r'func'
t_ARROW = r'->'
t_INT = r'int'
t_SWITCH = r'switch'
t_CASE = r'case'
t_DEFAULT = r'default'
t_RETURN = r'return'
t_CALLBACK = r'callback'
t_ASYNC = r'async'
t_TYPINT = r'Int'
t_TYPSTRING = r'String'

def t_NUMBER(t):
    r'\d+'
    t.value = int(t.value)
    return t

def t_DECIMAL(t):
    r'[-+]?[0-9]+(\.([0-9]+)?([eE][-+]?[0-9]+)?|[eE][-+]?[0-9]+)'
    t.value = decimal.Decimal(t.value)
    return t

def t_STRING(t):
    r'\"([^\\\n]|(\\.))*?\"'
    return t

def t_newline(t):
    r'\n+'
    t.lexer.lineno += len(t.value)

t_ignore = ' \t'
t_ignore_COMMENT = r'\#.*'

def t_error(t):
    print("Illegal charachter")
    t.lexer.skip(1)

def t_ID(t):
    r'[a-zA-Z_][a-zA-Z_0-9]*'
    t.type = reserved.get(t.value, 'ID')
    return t

lexer = lex.lex()

# data = '''
# 2.3
# 3 + 4 * 10
#     + -20 * 2
# '''

# lexer.input(data)
# print(tokens)
# while True:
#     tok = lexer.token()
#     if not tok:
#         break
#     print(tok)

###########################################
################YACC######################
#########################################
# plus
def p_expression_plus(p):
    'expression : expression PLUS term'
    if isinstance(p[1], int) and isinstance(p[3], int):
        p[0] = p[1] + p[3]
    elif isinstance(p[3], int):
        asci_num = chr(p[3])
        p[0] = p[1] + asci_num
    elif isinstance(p[1], int):
        asci_num = chr(p[1])
        p[0] = asci_num + p[3]
    elif isinstance(p[1], str) and isinstance(p[3], str):
        p[0] = p[1] + p[3]
# minus    
def p_expression_minus(p):
    'expression : expression MINUS term'
    if isinstance(p[1], int) and isinstance(p[3], int):
        p[0] = p[1] - p[3]
    elif isinstance(p[3], int):
        asci_num = chr(p[3])
        p[0] = p[1] + asci_num
    elif isinstance(p[1], int):
        asci_num = chr(p[1])
        p[0] = asci_num + p[3]    

# unary minus operator
def p_expression_uminus(p):
    'expression : MINUS term'
    p[0] = -p[2]

def p_expression_term(p):
    'expression : term'
    p[0] = p[1]

# func without param
def p_statement_funcWithoutParam(p):
    'term : FUNC LPAREN RPAREN LBRACES expression RBRACES'
    p[0] = p[5]

# TODO: func with param


# TODO: switch 
def p_statement_switchcase(p):
    'term : SWITCH expression LBRACES CASE expression COLON expression DEFAULT COLON expression RBRACES'
    if p[2] == p[5]:
        p[0] = p[7]
    else:
        p[0] = p[10]

# if-else statement
def p_statement_if(p):
    '''term : IF LPAREN comparison RPAREN term
                    | IF LPAREN comparison RPAREN term ELSE term'''
    if p[3]:
        p[0] = p[5]
    else:
        if p[7] is not None:
            p[0] = p[7]

# comparison
def p_comparison_binop(p):
    '''comparison : expression EQUAL term
                          | expression NOTEQ term
                          | expression LARGE term
                          | expression SMALL term
                          | expression LRGEQ term
                          | expression SMLEQ term'''
    if p[2] == '==':
        p[0] = p[1] == p[3]
    elif p[2] == '!=':
        p[0] = p[1] != p[3]
    elif p[2] == '>':
        p[0] = p[1] > p[3]
    elif p[2] == '<':
        p[0] = p[1] < p[3]
    elif p[2] == '>=':
        p[0] = p[1] >= p[3]
    elif p[2] == '<=':
        p[0] = p[1] <= p[3]

def p_comparison_equal(p):
    'comparison : term EQUAL term'
    p[0] = (p[1] == p[3])

def p_comparison_noteq(p):
    'comparison : term NOTEQ term'
    p[0] = (p[1] != p[3])

def p_comparison_large(p):
    'comparison : term LARGE term'
    p[0] = (p[1] > p[3])

def p_comparison_small(p):
    'comparison : term SMALL term'
    p[0] = (p[1] < p[3])

# while
def p_statement_while(p):
    'term : WHILE LPAREN comparison RPAREN term'
    while(p[3]):
        p[0] = p[5]

# for
def p_statement_for(p):
    'term : FOR LPAREN ID IN factor RPAREN term'
    for i in range(p[5]):
        print(colored(i, 'green'))

# time
def p_term_times(p):
    'term : term TIMES factor'
    p[0] = p[1] * p[3]

# divide
def p_term_div(p):
    'term : term DIVIDE factor'
    p[0] = p[1] / p[3]

# equal value
def p_term_equal(p):
    'term : ID EQUALS factor'
    p[0] = p[3]

# shift left
def p_term_shl(p):
    'term : term SHL factor'
    p[0] = p[1] << p[3]

# shift right
def p_term_shr(p):
    'term : term SHR factor'
    p[0] = p[1] >> p[3]

# mof
def p_term_mod(p):
    'term : term MOD factor'
    p[0] = p[1] % p[3]

# and
def p_term_andlog(p):
    'term : term ANDLOGIC factor'
    p[0] = p[1] & p[3]

# or
def p_term_orlog(p):
    'term : term ORLOGIC factor'
    p[0] = p[1] | p[3]

# xor
def p_term_xorlog(p):
    'term : term XORLOGIC factor'
    p[0] = p[1] ^ p[3]

# open file
def p_term_openFile(p):
    'term : OPEN LPAREN factor RPAREN'
    file = p[3].replace('"', '')
    f = open(file, "r")
    p[0] = f.read()

# pow function
def p_term_pow(p):
    'term : POW LPAREN factor COMMA factor RPAREN'
    if isinstance(p[3], int) and isinstance(p[5], int):
        p[0] = pow(p[3], p[5])
    else:
        print(colored("Error: Type does not fit", 'red'))

# log function
def p_term_log(p):
    '''term : LOG LPAREN factor RPAREN
                            | LOG LPAREN factor COMMA factor RPAREN'''
    if isinstance(p[3], int):
        p[0] = math.log(p[3])
    elif isinstance(p[3], int) and isinstance(p[5], int):
        p[0] = math.log(p[3], p[5])
    else:
        print(colored("Error: Type does not fit", 'red'))

# sqrt function
def p_term_sqrt(p):
    'term : SQRT LPAREN factor RPAREN'
    if isinstance(p[3], int):
        p[0] = math.sqrt(p[3])
    else:
        print(colored("Error: Type does not fit", 'red'))

# cos function
def p_term_cos(p):
    'term : COS LPAREN factor RPAREN'
    if isinstance(p[3], int):
        p[0] = math.sqrt(p[3])
    else:
        print(colored("Error: Type does not fit", 'red'))

# sin function
def p_term_sin(p):
    'term : SIN LPAREN factor RPAREN'
    if isinstance(p[3], int):
        p[0] = math.sqrt(p[3])
    else:
        print(colored("Error: Type does not fit", 'red'))

# var: Int value
def p_term_Int(p):
    'term : VAR COLON TYPINT ID EQUALS factor'
    if isinstance(p[6], int):
        p[0] = p[6]
    else:
        print(colored("Error: Type does not fit", 'red'))

# var: String value
def p_term_String(p):
    'term : VAR COLON TYPSTRING ID EQUALS factor'
    if isinstance(p[6], str):
        p[0] = p[6]
    else:
        print(colored("Error: Type does not fit", 'red'))

# let value
def p_term_Let(p):
    'term : LET ID EQUALS factor'
    p[0] = p[4]   

# print function
def p_term_print(p):
    'term : PRINT term'
    p[0] = p[2]

# output smth
def p_term_factor(p):
     'term : factor'
     p[0] = p[1]
 
# output number 
def p_factor_num(p):
    'factor : NUMBER'
    p[0] = p[1]

# output decimal
def p_factor_dec(p):
    'factor : DECIMAL'
    p[0] = p[1]

# output string
def p_factor_str(p):
    'factor : STRING'
    p[0] = p[1]

# exit function
def p_term_exit(p):
    'factor : EXIT'
    sys.exit()

# help function
def p_term_help(p):
    'factor : HELP'
    help_manual()

# copyright function
def p_term_copyright(p):
    'factor : COPYRIGHT'
    print("Copyright © 2018 by Lado Kadjaia")

# expression with brackets ()
def p_factor_expr(p):
    'factor : LPAREN expression RPAREN'
    p[0] = p[2]

def p_error(p):
    print(colored("Syntax error in input!", 'red'))

## help manual
def help_manual():
    greet()

@click.group()
def greet():
    pass

@greet.command()
def help(**kwargs):
    pass

@greet.command()
def exit(**kwargs):
    pass

@greet.command()
def copyright(**kwargs):
    pass


# Build the parser
parser = yacc.yacc()
#print(sys.argv, len(sys.argv))
if len(sys.argv) < 2:
    print("Whale 0.0.1 (created in 2018) " + str(datetime.now()))
    print("Type 'help' to now how to use it 'copyright' or '.exit' just for quit from REPL")
    while True:
        try:
            s = input('whale> ')
        except EOFError:
            break
        if not s: continue
        result = parser.parse(s)
        print(colored(result, 'green'))
if sys.argv[1] == "compile":
    subprocess.call(['java', '-jar', '/Users/lado/Documents/MyProgrammingLanguage/JulesVernePL/target/JulesVernePL-1.0-SNAPSHOT-jar-with-dependencies.jar'])
    
