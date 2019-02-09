
# parsetab.py
# This file is automatically generated. Do not edit.
# pylint: disable=W,C,R
_tabversion = '3.10'

_lr_method = 'LALR'

_lr_signature = 'ANDLOGIC ARROW ASYNC CALLBACK CASE COLON COMMA COPYRIGHT DECIMAL DEFAULT DIVIDE ELSE EQUAL EQUALS EXIT FLOAT FOR FUNC HELP ID IF IN INT LARGE LBRACES LET LPAREN LRGEQ LSQRBRACK MINUS MOD NOTEQ NUMBER OPEN ORLOGIC PLUS POW PRINT RBRACES RETURN RPAREN RSQRBRACK SEMICOLON SHL SHR SMALL SMLEQ STRING SWITCH TIMES TYPINT TYPSTRING VAR WHILE XORLOGICexpression : expression PLUS termexpression : expression MINUS termexpression : MINUS termexpression : termterm : FUNC LPAREN RPAREN LBRACES expression RBRACESterm : SWITCH expression LBRACES CASE expression COLON expression DEFAULT COLON expression RBRACESterm : IF LPAREN comparison RPAREN term\n                    | IF LPAREN comparison RPAREN term ELSE termcomparison : expression EQUAL term\n                          | expression NOTEQ term\n                          | expression LARGE term\n                          | expression SMALL term\n                          | expression LRGEQ term\n                          | expression SMLEQ termcomparison : term EQUAL termcomparison : term NOTEQ termcomparison : term LARGE termcomparison : term SMALL termterm : WHILE LPAREN comparison RPAREN termterm : FOR LPAREN ID IN factor RPAREN termterm : term TIMES factorterm : term DIVIDE factorterm : ID EQUALS factorterm : term SHL factorterm : term SHR factorterm : term MOD factorterm : term ANDLOGIC factorterm : term ORLOGIC factorterm : term XORLOGIC factorterm : OPEN LPAREN factor RPARENterm : VAR COLON TYPINT ID EQUALS factorterm : VAR COLON TYPSTRING ID EQUALS factorterm : LET ID EQUALS factorterm : PRINT termterm : factorfactor : NUMBERfactor : DECIMALfactor : STRINGfactor : EXITfactor : HELPfactor : COPYRIGHTfactor : LPAREN expression RPAREN'
    
_lr_action_items = {'MINUS':([0,1,2,5,6,11,16,17,18,19,20,21,32,34,35,36,37,43,44,45,46,47,48,49,50,51,52,53,55,58,59,62,67,68,82,85,86,87,88,99,103,104,107,108,109,110,111,113,114,115,],[3,23,-4,3,3,-35,-36,-37,-38,-39,-40,-41,-3,23,23,3,3,-34,-1,-2,-21,-22,-24,-25,-26,-27,-28,-29,-42,-4,23,-23,3,3,-30,-33,23,23,-7,-19,-5,3,-31,-32,23,-8,-20,3,23,-6,]),'FUNC':([0,3,5,6,15,22,23,36,37,67,68,69,70,71,72,73,74,75,76,77,78,79,80,104,105,106,113,],[4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,]),'SWITCH':([0,3,5,6,15,22,23,36,37,67,68,69,70,71,72,73,74,75,76,77,78,79,80,104,105,106,113,],[6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,]),'IF':([0,3,5,6,15,22,23,36,37,67,68,69,70,71,72,73,74,75,76,77,78,79,80,104,105,106,113,],[7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,]),'WHILE':([0,3,5,6,15,22,23,36,37,67,68,69,70,71,72,73,74,75,76,77,78,79,80,104,105,106,113,],[8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,]),'FOR':([0,3,5,6,15,22,23,36,37,67,68,69,70,71,72,73,74,75,76,77,78,79,80,104,105,106,113,],[9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,]),'ID':([0,3,5,6,14,15,22,23,36,37,38,64,65,67,68,69,70,71,72,73,74,75,76,77,78,79,80,104,105,106,113,],[10,10,10,10,42,10,10,10,10,10,61,83,84,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,]),'OPEN':([0,3,5,6,15,22,23,36,37,67,68,69,70,71,72,73,74,75,76,77,78,79,80,104,105,106,113,],[12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,]),'VAR':([0,3,5,6,15,22,23,36,37,67,68,69,70,71,72,73,74,75,76,77,78,79,80,104,105,106,113,],[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,]),'LET':([0,3,5,6,15,22,23,36,37,67,68,69,70,71,72,73,74,75,76,77,78,79,80,104,105,106,113,],[14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,]),'PRINT':([0,3,5,6,15,22,23,36,37,67,68,69,70,71,72,73,74,75,76,77,78,79,80,104,105,106,113,],[15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,]),'NUMBER':([0,3,5,6,15,22,23,24,25,26,27,28,29,30,31,36,37,39,40,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,101,102,104,105,106,113,],[16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,]),'DECIMAL':([0,3,5,6,15,22,23,24,25,26,27,28,29,30,31,36,37,39,40,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,101,102,104,105,106,113,],[17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,]),'STRING':([0,3,5,6,15,22,23,24,25,26,27,28,29,30,31,36,37,39,40,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,101,102,104,105,106,113,],[18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,]),'EXIT':([0,3,5,6,15,22,23,24,25,26,27,28,29,30,31,36,37,39,40,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,101,102,104,105,106,113,],[19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,]),'HELP':([0,3,5,6,15,22,23,24,25,26,27,28,29,30,31,36,37,39,40,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,101,102,104,105,106,113,],[20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,]),'COPYRIGHT':([0,3,5,6,15,22,23,24,25,26,27,28,29,30,31,36,37,39,40,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,101,102,104,105,106,113,],[21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,]),'LPAREN':([0,3,4,5,6,7,8,9,12,15,22,23,24,25,26,27,28,29,30,31,36,37,39,40,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,101,102,104,105,106,113,],[5,5,33,5,5,36,37,38,40,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,]),'$end':([1,2,11,16,17,18,19,20,21,32,43,44,45,46,47,48,49,50,51,52,53,55,62,82,85,88,99,103,107,108,110,111,115,],[0,-4,-35,-36,-37,-38,-39,-40,-41,-3,-34,-1,-2,-21,-22,-24,-25,-26,-27,-28,-29,-42,-23,-30,-33,-7,-19,-5,-31,-32,-8,-20,-6,]),'PLUS':([1,2,11,16,17,18,19,20,21,32,34,35,43,44,45,46,47,48,49,50,51,52,53,55,58,59,62,82,85,86,87,88,99,103,107,108,109,110,111,114,115,],[22,-4,-35,-36,-37,-38,-39,-40,-41,-3,22,22,-34,-1,-2,-21,-22,-24,-25,-26,-27,-28,-29,-42,-4,22,-23,-30,-33,22,22,-7,-19,-5,-31,-32,22,-8,-20,22,-6,]),'RPAREN':([2,11,16,17,18,19,20,21,32,33,34,43,44,45,46,47,48,49,50,51,52,53,55,57,60,62,63,82,85,88,89,90,91,92,93,94,95,96,97,98,99,100,103,107,108,110,111,115,],[-4,-35,-36,-37,-38,-39,-40,-41,-3,54,55,-34,-1,-2,-21,-22,-24,-25,-26,-27,-28,-29,-42,69,80,-23,82,-30,-33,-7,-15,-16,-17,-18,-9,-10,-11,-12,-13,-14,-19,106,-5,-31,-32,-8,-20,-6,]),'LBRACES':([2,11,16,17,18,19,20,21,32,35,43,44,45,46,47,48,49,50,51,52,53,54,55,62,82,85,88,99,103,107,108,110,111,115,],[-4,-35,-36,-37,-38,-39,-40,-41,-3,56,-34,-1,-2,-21,-22,-24,-25,-26,-27,-28,-29,67,-42,-23,-30,-33,-7,-19,-5,-31,-32,-8,-20,-6,]),'RBRACES':([2,11,16,17,18,19,20,21,32,43,44,45,46,47,48,49,50,51,52,53,55,62,82,85,86,88,99,103,107,108,110,111,114,115,],[-4,-35,-36,-37,-38,-39,-40,-41,-3,-34,-1,-2,-21,-22,-24,-25,-26,-27,-28,-29,-42,-23,-30,-33,103,-7,-19,-5,-31,-32,-8,-20,115,-6,]),'COLON':([2,11,13,16,17,18,19,20,21,32,43,44,45,46,47,48,49,50,51,52,53,55,62,82,85,87,88,99,103,107,108,110,111,112,115,],[-4,-35,41,-36,-37,-38,-39,-40,-41,-3,-34,-1,-2,-21,-22,-24,-25,-26,-27,-28,-29,-42,-23,-30,-33,104,-7,-19,-5,-31,-32,-8,-20,113,-6,]),'DEFAULT':([2,11,16,17,18,19,20,21,32,43,44,45,46,47,48,49,50,51,52,53,55,62,82,85,88,99,103,107,108,109,110,111,115,],[-4,-35,-36,-37,-38,-39,-40,-41,-3,-34,-1,-2,-21,-22,-24,-25,-26,-27,-28,-29,-42,-23,-30,-33,-7,-19,-5,-31,-32,112,-8,-20,-6,]),'TIMES':([2,11,16,17,18,19,20,21,32,43,44,45,46,47,48,49,50,51,52,53,55,58,62,82,85,88,89,90,91,92,93,94,95,96,97,98,99,103,107,108,110,111,115,],[24,-35,-36,-37,-38,-39,-40,-41,24,24,24,24,-21,-22,-24,-25,-26,-27,-28,-29,-42,24,-23,-30,-33,24,24,24,24,24,24,24,24,24,24,24,24,-5,-31,-32,24,24,-6,]),'DIVIDE':([2,11,16,17,18,19,20,21,32,43,44,45,46,47,48,49,50,51,52,53,55,58,62,82,85,88,89,90,91,92,93,94,95,96,97,98,99,103,107,108,110,111,115,],[25,-35,-36,-37,-38,-39,-40,-41,25,25,25,25,-21,-22,-24,-25,-26,-27,-28,-29,-42,25,-23,-30,-33,25,25,25,25,25,25,25,25,25,25,25,25,-5,-31,-32,25,25,-6,]),'SHL':([2,11,16,17,18,19,20,21,32,43,44,45,46,47,48,49,50,51,52,53,55,58,62,82,85,88,89,90,91,92,93,94,95,96,97,98,99,103,107,108,110,111,115,],[26,-35,-36,-37,-38,-39,-40,-41,26,26,26,26,-21,-22,-24,-25,-26,-27,-28,-29,-42,26,-23,-30,-33,26,26,26,26,26,26,26,26,26,26,26,26,-5,-31,-32,26,26,-6,]),'SHR':([2,11,16,17,18,19,20,21,32,43,44,45,46,47,48,49,50,51,52,53,55,58,62,82,85,88,89,90,91,92,93,94,95,96,97,98,99,103,107,108,110,111,115,],[27,-35,-36,-37,-38,-39,-40,-41,27,27,27,27,-21,-22,-24,-25,-26,-27,-28,-29,-42,27,-23,-30,-33,27,27,27,27,27,27,27,27,27,27,27,27,-5,-31,-32,27,27,-6,]),'MOD':([2,11,16,17,18,19,20,21,32,43,44,45,46,47,48,49,50,51,52,53,55,58,62,82,85,88,89,90,91,92,93,94,95,96,97,98,99,103,107,108,110,111,115,],[28,-35,-36,-37,-38,-39,-40,-41,28,28,28,28,-21,-22,-24,-25,-26,-27,-28,-29,-42,28,-23,-30,-33,28,28,28,28,28,28,28,28,28,28,28,28,-5,-31,-32,28,28,-6,]),'ANDLOGIC':([2,11,16,17,18,19,20,21,32,43,44,45,46,47,48,49,50,51,52,53,55,58,62,82,85,88,89,90,91,92,93,94,95,96,97,98,99,103,107,108,110,111,115,],[29,-35,-36,-37,-38,-39,-40,-41,29,29,29,29,-21,-22,-24,-25,-26,-27,-28,-29,-42,29,-23,-30,-33,29,29,29,29,29,29,29,29,29,29,29,29,-5,-31,-32,29,29,-6,]),'ORLOGIC':([2,11,16,17,18,19,20,21,32,43,44,45,46,47,48,49,50,51,52,53,55,58,62,82,85,88,89,90,91,92,93,94,95,96,97,98,99,103,107,108,110,111,115,],[30,-35,-36,-37,-38,-39,-40,-41,30,30,30,30,-21,-22,-24,-25,-26,-27,-28,-29,-42,30,-23,-30,-33,30,30,30,30,30,30,30,30,30,30,30,30,-5,-31,-32,30,30,-6,]),'XORLOGIC':([2,11,16,17,18,19,20,21,32,43,44,45,46,47,48,49,50,51,52,53,55,58,62,82,85,88,89,90,91,92,93,94,95,96,97,98,99,103,107,108,110,111,115,],[31,-35,-36,-37,-38,-39,-40,-41,31,31,31,31,-21,-22,-24,-25,-26,-27,-28,-29,-42,31,-23,-30,-33,31,31,31,31,31,31,31,31,31,31,31,31,-5,-31,-32,31,31,-6,]),'EQUALS':([10,42,83,84,],[39,66,101,102,]),'EQUAL':([11,16,17,18,19,20,21,32,43,44,45,46,47,48,49,50,51,52,53,55,58,59,62,82,85,88,99,103,107,108,110,111,115,],[-35,-36,-37,-38,-39,-40,-41,-3,-34,-1,-2,-21,-22,-24,-25,-26,-27,-28,-29,-42,70,74,-23,-30,-33,-7,-19,-5,-31,-32,-8,-20,-6,]),'NOTEQ':([11,16,17,18,19,20,21,32,43,44,45,46,47,48,49,50,51,52,53,55,58,59,62,82,85,88,99,103,107,108,110,111,115,],[-35,-36,-37,-38,-39,-40,-41,-3,-34,-1,-2,-21,-22,-24,-25,-26,-27,-28,-29,-42,71,75,-23,-30,-33,-7,-19,-5,-31,-32,-8,-20,-6,]),'LARGE':([11,16,17,18,19,20,21,32,43,44,45,46,47,48,49,50,51,52,53,55,58,59,62,82,85,88,99,103,107,108,110,111,115,],[-35,-36,-37,-38,-39,-40,-41,-3,-34,-1,-2,-21,-22,-24,-25,-26,-27,-28,-29,-42,72,76,-23,-30,-33,-7,-19,-5,-31,-32,-8,-20,-6,]),'SMALL':([11,16,17,18,19,20,21,32,43,44,45,46,47,48,49,50,51,52,53,55,58,59,62,82,85,88,99,103,107,108,110,111,115,],[-35,-36,-37,-38,-39,-40,-41,-3,-34,-1,-2,-21,-22,-24,-25,-26,-27,-28,-29,-42,73,77,-23,-30,-33,-7,-19,-5,-31,-32,-8,-20,-6,]),'LRGEQ':([11,16,17,18,19,20,21,32,43,44,45,46,47,48,49,50,51,52,53,55,58,59,62,82,85,88,99,103,107,108,110,111,115,],[-35,-36,-37,-38,-39,-40,-41,-3,-34,-1,-2,-21,-22,-24,-25,-26,-27,-28,-29,-42,-4,78,-23,-30,-33,-7,-19,-5,-31,-32,-8,-20,-6,]),'SMLEQ':([11,16,17,18,19,20,21,32,43,44,45,46,47,48,49,50,51,52,53,55,58,59,62,82,85,88,99,103,107,108,110,111,115,],[-35,-36,-37,-38,-39,-40,-41,-3,-34,-1,-2,-21,-22,-24,-25,-26,-27,-28,-29,-42,-4,79,-23,-30,-33,-7,-19,-5,-31,-32,-8,-20,-6,]),'ELSE':([11,16,17,18,19,20,21,43,46,47,48,49,50,51,52,53,55,62,82,85,88,99,103,107,108,110,111,115,],[-35,-36,-37,-38,-39,-40,-41,-34,-21,-22,-24,-25,-26,-27,-28,-29,-42,-23,-30,-33,105,-19,-5,-31,-32,-8,-20,-6,]),'TYPINT':([41,],[64,]),'TYPSTRING':([41,],[65,]),'CASE':([56,],[68,]),'IN':([61,],[81,]),}

_lr_action = {}
for _k, _v in _lr_action_items.items():
   for _x,_y in zip(_v[0],_v[1]):
      if not _x in _lr_action:  _lr_action[_x] = {}
      _lr_action[_x][_k] = _y
del _lr_action_items

_lr_goto_items = {'expression':([0,5,6,36,37,67,68,104,113,],[1,34,35,59,59,86,87,109,114,]),'term':([0,3,5,6,15,22,23,36,37,67,68,69,70,71,72,73,74,75,76,77,78,79,80,104,105,106,113,],[2,32,2,2,43,44,45,58,58,2,2,88,89,90,91,92,93,94,95,96,97,98,99,2,110,111,2,]),'factor':([0,3,5,6,15,22,23,24,25,26,27,28,29,30,31,36,37,39,40,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,101,102,104,105,106,113,],[11,11,11,11,11,11,11,46,47,48,49,50,51,52,53,11,11,62,63,85,11,11,11,11,11,11,11,11,11,11,11,11,11,11,100,107,108,11,11,11,11,]),'comparison':([36,37,],[57,60,]),}

_lr_goto = {}
for _k, _v in _lr_goto_items.items():
   for _x, _y in zip(_v[0], _v[1]):
       if not _x in _lr_goto: _lr_goto[_x] = {}
       _lr_goto[_x][_k] = _y
del _lr_goto_items
_lr_productions = [
  ("S' -> expression","S'",1,None,None,None),
  ('expression -> expression PLUS term','expression',3,'p_expression_plus','JulesVerneLLVM',159),
  ('expression -> expression MINUS term','expression',3,'p_expression_minus','JulesVerneLLVM',172),
  ('expression -> MINUS term','expression',2,'p_expression_uminus','JulesVerneLLVM',184),
  ('expression -> term','expression',1,'p_expression_term','JulesVerneLLVM',188),
  ('term -> FUNC LPAREN RPAREN LBRACES expression RBRACES','term',6,'p_statement_funcWithoutParam','JulesVerneLLVM',193),
  ('term -> SWITCH expression LBRACES CASE expression COLON expression DEFAULT COLON expression RBRACES','term',11,'p_statement_switchcase','JulesVerneLLVM',201),
  ('term -> IF LPAREN comparison RPAREN term','term',5,'p_statement_if','JulesVerneLLVM',209),
  ('term -> IF LPAREN comparison RPAREN term ELSE term','term',7,'p_statement_if','JulesVerneLLVM',210),
  ('comparison -> expression EQUAL term','comparison',3,'p_comparison_binop','JulesVerneLLVM',219),
  ('comparison -> expression NOTEQ term','comparison',3,'p_comparison_binop','JulesVerneLLVM',220),
  ('comparison -> expression LARGE term','comparison',3,'p_comparison_binop','JulesVerneLLVM',221),
  ('comparison -> expression SMALL term','comparison',3,'p_comparison_binop','JulesVerneLLVM',222),
  ('comparison -> expression LRGEQ term','comparison',3,'p_comparison_binop','JulesVerneLLVM',223),
  ('comparison -> expression SMLEQ term','comparison',3,'p_comparison_binop','JulesVerneLLVM',224),
  ('comparison -> term EQUAL term','comparison',3,'p_comparison_equal','JulesVerneLLVM',239),
  ('comparison -> term NOTEQ term','comparison',3,'p_comparison_noteq','JulesVerneLLVM',243),
  ('comparison -> term LARGE term','comparison',3,'p_comparison_large','JulesVerneLLVM',247),
  ('comparison -> term SMALL term','comparison',3,'p_comparison_small','JulesVerneLLVM',251),
  ('term -> WHILE LPAREN comparison RPAREN term','term',5,'p_statement_while','JulesVerneLLVM',256),
  ('term -> FOR LPAREN ID IN factor RPAREN term','term',7,'p_statement_for','JulesVerneLLVM',262),
  ('term -> term TIMES factor','term',3,'p_term_times','JulesVerneLLVM',268),
  ('term -> term DIVIDE factor','term',3,'p_term_div','JulesVerneLLVM',273),
  ('term -> ID EQUALS factor','term',3,'p_term_equal','JulesVerneLLVM',278),
  ('term -> term SHL factor','term',3,'p_term_shl','JulesVerneLLVM',283),
  ('term -> term SHR factor','term',3,'p_term_shr','JulesVerneLLVM',288),
  ('term -> term MOD factor','term',3,'p_term_mod','JulesVerneLLVM',293),
  ('term -> term ANDLOGIC factor','term',3,'p_term_andlog','JulesVerneLLVM',298),
  ('term -> term ORLOGIC factor','term',3,'p_term_orlog','JulesVerneLLVM',303),
  ('term -> term XORLOGIC factor','term',3,'p_term_xorlog','JulesVerneLLVM',308),
  ('term -> OPEN LPAREN factor RPAREN','term',4,'p_term_openFile','JulesVerneLLVM',313),
  ('term -> VAR COLON TYPINT ID EQUALS factor','term',6,'p_term_Int','JulesVerneLLVM',320),
  ('term -> VAR COLON TYPSTRING ID EQUALS factor','term',6,'p_term_String','JulesVerneLLVM',328),
  ('term -> LET ID EQUALS factor','term',4,'p_term_Let','JulesVerneLLVM',336),
  ('term -> PRINT term','term',2,'p_term_print','JulesVerneLLVM',341),
  ('term -> factor','term',1,'p_term_factor','JulesVerneLLVM',346),
  ('factor -> NUMBER','factor',1,'p_factor_num','JulesVerneLLVM',351),
  ('factor -> DECIMAL','factor',1,'p_factor_dec','JulesVerneLLVM',356),
  ('factor -> STRING','factor',1,'p_factor_str','JulesVerneLLVM',361),
  ('factor -> EXIT','factor',1,'p_term_exit','JulesVerneLLVM',366),
  ('factor -> HELP','factor',1,'p_term_help','JulesVerneLLVM',371),
  ('factor -> COPYRIGHT','factor',1,'p_term_copyright','JulesVerneLLVM',376),
  ('factor -> LPAREN expression RPAREN','factor',3,'p_factor_expr','JulesVerneLLVM',381),
]
