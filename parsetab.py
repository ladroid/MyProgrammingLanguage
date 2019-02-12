
# parsetab.py
# This file is automatically generated. Do not edit.
# pylint: disable=W,C,R
_tabversion = '3.10'

_lr_method = 'LALR'

_lr_signature = 'ANDLOGIC ARROW ASYNC CALLBACK CASE COLON COMMA COPYRIGHT COS DECIMAL DEFAULT DIVIDE ELSE EQUAL EQUALS EXIT EXP FLOAT FOR FUNC HELP ID IF IN INT LARGE LBRACES LET LOG LOG10 LOG1P LPAREN LRGEQ LSQRBRACK MINUS MOD NOTEQ NUMBER OPEN ORLOGIC PLUS POW PRINT RBRACES RETURN RPAREN RSQRBRACK SEMICOLON SHL SHR SIN SMALL SMLEQ SQRT STRING SWITCH TAN TIMES TYPINT TYPSTRING VAR WHILE XORLOGICexpression : expression PLUS termexpression : expression MINUS termexpression : MINUS termexpression : termterm : FUNC LPAREN RPAREN LBRACES expression RBRACESterm : SWITCH expression LBRACES CASE expression COLON expression DEFAULT COLON expression RBRACESterm : IF LPAREN comparison RPAREN term\n                    | IF LPAREN comparison RPAREN term ELSE termcomparison : expression EQUAL term\n                          | expression NOTEQ term\n                          | expression LARGE term\n                          | expression SMALL term\n                          | expression LRGEQ term\n                          | expression SMLEQ termcomparison : term EQUAL termcomparison : term NOTEQ termcomparison : term LARGE termcomparison : term SMALL termterm : WHILE LPAREN comparison RPAREN termterm : FOR LPAREN ID IN factor RPAREN termterm : term TIMES factorterm : term DIVIDE factorterm : ID EQUALS factorterm : term SHL factorterm : term SHR factorterm : term MOD factorterm : term ANDLOGIC factorterm : term ORLOGIC factorterm : term XORLOGIC factorterm : OPEN LPAREN factor RPARENterm : POW LPAREN factor COMMA factor RPARENterm : LOG LPAREN factor RPAREN\n                            | LOG LPAREN factor COMMA factor RPARENterm : LOG10 LPAREN factor RPARENterm : LOG1P LPAREN factor RPARENterm : EXP LPAREN factor RPARENterm : SQRT LPAREN factor RPARENterm : COS LPAREN factor RPARENterm : SIN LPAREN factor RPARENterm : TAN LPAREN factor RPARENterm : VAR COLON TYPINT ID EQUALS factorterm : VAR COLON TYPSTRING ID EQUALS factorterm : LET ID EQUALS factorterm : PRINT termterm : factorfactor : NUMBERfactor : DECIMALfactor : STRINGfactor : EXITfactor : HELPfactor : COPYRIGHTfactor : LPAREN expression RPAREN'
    
_lr_action_items = {'MINUS':([0,1,2,5,6,11,25,26,27,28,29,30,41,43,44,45,46,61,62,63,64,65,66,67,68,69,70,71,73,76,77,80,94,95,109,111,113,114,115,116,117,118,119,122,123,124,125,136,142,143,146,147,148,149,150,151,152,154,155,156,],[3,32,-4,3,3,-45,-46,-47,-48,-49,-50,-51,-3,32,32,3,3,-44,-1,-2,-21,-22,-24,-25,-26,-27,-28,-29,-52,-4,32,-23,3,3,-30,-32,-34,-35,-36,-37,-38,-39,-40,-43,32,32,-7,-19,-5,3,-31,-33,-41,-42,32,-8,-20,3,32,-6,]),'FUNC':([0,3,5,6,24,31,32,45,46,94,95,96,97,98,99,100,101,102,103,104,105,106,107,143,144,145,154,],[4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,]),'SWITCH':([0,3,5,6,24,31,32,45,46,94,95,96,97,98,99,100,101,102,103,104,105,106,107,143,144,145,154,],[6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,]),'IF':([0,3,5,6,24,31,32,45,46,94,95,96,97,98,99,100,101,102,103,104,105,106,107,143,144,145,154,],[7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,]),'WHILE':([0,3,5,6,24,31,32,45,46,94,95,96,97,98,99,100,101,102,103,104,105,106,107,143,144,145,154,],[8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,]),'FOR':([0,3,5,6,24,31,32,45,46,94,95,96,97,98,99,100,101,102,103,104,105,106,107,143,144,145,154,],[9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,]),'ID':([0,3,5,6,23,24,31,32,45,46,47,91,92,94,95,96,97,98,99,100,101,102,103,104,105,106,107,143,144,145,154,],[10,10,10,10,60,10,10,10,10,10,79,120,121,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,]),'OPEN':([0,3,5,6,24,31,32,45,46,94,95,96,97,98,99,100,101,102,103,104,105,106,107,143,144,145,154,],[12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,]),'POW':([0,3,5,6,24,31,32,45,46,94,95,96,97,98,99,100,101,102,103,104,105,106,107,143,144,145,154,],[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,]),'LOG':([0,3,5,6,24,31,32,45,46,94,95,96,97,98,99,100,101,102,103,104,105,106,107,143,144,145,154,],[14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,]),'LOG10':([0,3,5,6,24,31,32,45,46,94,95,96,97,98,99,100,101,102,103,104,105,106,107,143,144,145,154,],[15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,]),'LOG1P':([0,3,5,6,24,31,32,45,46,94,95,96,97,98,99,100,101,102,103,104,105,106,107,143,144,145,154,],[16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,]),'EXP':([0,3,5,6,24,31,32,45,46,94,95,96,97,98,99,100,101,102,103,104,105,106,107,143,144,145,154,],[17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,]),'SQRT':([0,3,5,6,24,31,32,45,46,94,95,96,97,98,99,100,101,102,103,104,105,106,107,143,144,145,154,],[18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,]),'COS':([0,3,5,6,24,31,32,45,46,94,95,96,97,98,99,100,101,102,103,104,105,106,107,143,144,145,154,],[19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,]),'SIN':([0,3,5,6,24,31,32,45,46,94,95,96,97,98,99,100,101,102,103,104,105,106,107,143,144,145,154,],[20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,]),'TAN':([0,3,5,6,24,31,32,45,46,94,95,96,97,98,99,100,101,102,103,104,105,106,107,143,144,145,154,],[21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,]),'VAR':([0,3,5,6,24,31,32,45,46,94,95,96,97,98,99,100,101,102,103,104,105,106,107,143,144,145,154,],[22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,]),'LET':([0,3,5,6,24,31,32,45,46,94,95,96,97,98,99,100,101,102,103,104,105,106,107,143,144,145,154,],[23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,]),'PRINT':([0,3,5,6,24,31,32,45,46,94,95,96,97,98,99,100,101,102,103,104,105,106,107,143,144,145,154,],[24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,]),'NUMBER':([0,3,5,6,24,31,32,33,34,35,36,37,38,39,40,45,46,48,49,50,51,52,53,54,55,56,57,58,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,110,112,140,141,143,144,145,154,],[25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,]),'DECIMAL':([0,3,5,6,24,31,32,33,34,35,36,37,38,39,40,45,46,48,49,50,51,52,53,54,55,56,57,58,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,110,112,140,141,143,144,145,154,],[26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,]),'STRING':([0,3,5,6,24,31,32,33,34,35,36,37,38,39,40,45,46,48,49,50,51,52,53,54,55,56,57,58,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,110,112,140,141,143,144,145,154,],[27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,]),'EXIT':([0,3,5,6,24,31,32,33,34,35,36,37,38,39,40,45,46,48,49,50,51,52,53,54,55,56,57,58,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,110,112,140,141,143,144,145,154,],[28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,]),'HELP':([0,3,5,6,24,31,32,33,34,35,36,37,38,39,40,45,46,48,49,50,51,52,53,54,55,56,57,58,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,110,112,140,141,143,144,145,154,],[29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,]),'COPYRIGHT':([0,3,5,6,24,31,32,33,34,35,36,37,38,39,40,45,46,48,49,50,51,52,53,54,55,56,57,58,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,110,112,140,141,143,144,145,154,],[30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,]),'LPAREN':([0,3,4,5,6,7,8,9,12,13,14,15,16,17,18,19,20,21,24,31,32,33,34,35,36,37,38,39,40,45,46,48,49,50,51,52,53,54,55,56,57,58,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,110,112,140,141,143,144,145,154,],[5,5,42,5,5,45,46,47,49,50,51,52,53,54,55,56,57,58,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,]),'$end':([1,2,11,25,26,27,28,29,30,41,61,62,63,64,65,66,67,68,69,70,71,73,80,109,111,113,114,115,116,117,118,119,122,125,136,142,146,147,148,149,151,152,156,],[0,-4,-45,-46,-47,-48,-49,-50,-51,-3,-44,-1,-2,-21,-22,-24,-25,-26,-27,-28,-29,-52,-23,-30,-32,-34,-35,-36,-37,-38,-39,-40,-43,-7,-19,-5,-31,-33,-41,-42,-8,-20,-6,]),'PLUS':([1,2,11,25,26,27,28,29,30,41,43,44,61,62,63,64,65,66,67,68,69,70,71,73,76,77,80,109,111,113,114,115,116,117,118,119,122,123,124,125,136,142,146,147,148,149,150,151,152,155,156,],[31,-4,-45,-46,-47,-48,-49,-50,-51,-3,31,31,-44,-1,-2,-21,-22,-24,-25,-26,-27,-28,-29,-52,-4,31,-23,-30,-32,-34,-35,-36,-37,-38,-39,-40,-43,31,31,-7,-19,-5,-31,-33,-41,-42,31,-8,-20,31,-6,]),'RPAREN':([2,11,25,26,27,28,29,30,41,42,43,61,62,63,64,65,66,67,68,69,70,71,73,75,78,80,81,83,84,85,86,87,88,89,90,109,111,113,114,115,116,117,118,119,122,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,142,146,147,148,149,151,152,156,],[-4,-45,-46,-47,-48,-49,-50,-51,-3,72,73,-44,-1,-2,-21,-22,-24,-25,-26,-27,-28,-29,-52,96,107,-23,109,111,113,114,115,116,117,118,119,-30,-32,-34,-35,-36,-37,-38,-39,-40,-43,-7,-15,-16,-17,-18,-9,-10,-11,-12,-13,-14,-19,145,146,147,-5,-31,-33,-41,-42,-8,-20,-6,]),'LBRACES':([2,11,25,26,27,28,29,30,41,44,61,62,63,64,65,66,67,68,69,70,71,72,73,80,109,111,113,114,115,116,117,118,119,122,125,136,142,146,147,148,149,151,152,156,],[-4,-45,-46,-47,-48,-49,-50,-51,-3,74,-44,-1,-2,-21,-22,-24,-25,-26,-27,-28,-29,94,-52,-23,-30,-32,-34,-35,-36,-37,-38,-39,-40,-43,-7,-19,-5,-31,-33,-41,-42,-8,-20,-6,]),'RBRACES':([2,11,25,26,27,28,29,30,41,61,62,63,64,65,66,67,68,69,70,71,73,80,109,111,113,114,115,116,117,118,119,122,123,125,136,142,146,147,148,149,151,152,155,156,],[-4,-45,-46,-47,-48,-49,-50,-51,-3,-44,-1,-2,-21,-22,-24,-25,-26,-27,-28,-29,-52,-23,-30,-32,-34,-35,-36,-37,-38,-39,-40,-43,142,-7,-19,-5,-31,-33,-41,-42,-8,-20,156,-6,]),'COLON':([2,11,22,25,26,27,28,29,30,41,61,62,63,64,65,66,67,68,69,70,71,73,80,109,111,113,114,115,116,117,118,119,122,124,125,136,142,146,147,148,149,151,152,153,156,],[-4,-45,59,-46,-47,-48,-49,-50,-51,-3,-44,-1,-2,-21,-22,-24,-25,-26,-27,-28,-29,-52,-23,-30,-32,-34,-35,-36,-37,-38,-39,-40,-43,143,-7,-19,-5,-31,-33,-41,-42,-8,-20,154,-6,]),'DEFAULT':([2,11,25,26,27,28,29,30,41,61,62,63,64,65,66,67,68,69,70,71,73,80,109,111,113,114,115,116,117,118,119,122,125,136,142,146,147,148,149,150,151,152,156,],[-4,-45,-46,-47,-48,-49,-50,-51,-3,-44,-1,-2,-21,-22,-24,-25,-26,-27,-28,-29,-52,-23,-30,-32,-34,-35,-36,-37,-38,-39,-40,-43,-7,-19,-5,-31,-33,-41,-42,153,-8,-20,-6,]),'TIMES':([2,11,25,26,27,28,29,30,41,61,62,63,64,65,66,67,68,69,70,71,73,76,80,109,111,113,114,115,116,117,118,119,122,125,126,127,128,129,130,131,132,133,134,135,136,142,146,147,148,149,151,152,156,],[33,-45,-46,-47,-48,-49,-50,-51,33,33,33,33,-21,-22,-24,-25,-26,-27,-28,-29,-52,33,-23,-30,-32,-34,-35,-36,-37,-38,-39,-40,-43,33,33,33,33,33,33,33,33,33,33,33,33,-5,-31,-33,-41,-42,33,33,-6,]),'DIVIDE':([2,11,25,26,27,28,29,30,41,61,62,63,64,65,66,67,68,69,70,71,73,76,80,109,111,113,114,115,116,117,118,119,122,125,126,127,128,129,130,131,132,133,134,135,136,142,146,147,148,149,151,152,156,],[34,-45,-46,-47,-48,-49,-50,-51,34,34,34,34,-21,-22,-24,-25,-26,-27,-28,-29,-52,34,-23,-30,-32,-34,-35,-36,-37,-38,-39,-40,-43,34,34,34,34,34,34,34,34,34,34,34,34,-5,-31,-33,-41,-42,34,34,-6,]),'SHL':([2,11,25,26,27,28,29,30,41,61,62,63,64,65,66,67,68,69,70,71,73,76,80,109,111,113,114,115,116,117,118,119,122,125,126,127,128,129,130,131,132,133,134,135,136,142,146,147,148,149,151,152,156,],[35,-45,-46,-47,-48,-49,-50,-51,35,35,35,35,-21,-22,-24,-25,-26,-27,-28,-29,-52,35,-23,-30,-32,-34,-35,-36,-37,-38,-39,-40,-43,35,35,35,35,35,35,35,35,35,35,35,35,-5,-31,-33,-41,-42,35,35,-6,]),'SHR':([2,11,25,26,27,28,29,30,41,61,62,63,64,65,66,67,68,69,70,71,73,76,80,109,111,113,114,115,116,117,118,119,122,125,126,127,128,129,130,131,132,133,134,135,136,142,146,147,148,149,151,152,156,],[36,-45,-46,-47,-48,-49,-50,-51,36,36,36,36,-21,-22,-24,-25,-26,-27,-28,-29,-52,36,-23,-30,-32,-34,-35,-36,-37,-38,-39,-40,-43,36,36,36,36,36,36,36,36,36,36,36,36,-5,-31,-33,-41,-42,36,36,-6,]),'MOD':([2,11,25,26,27,28,29,30,41,61,62,63,64,65,66,67,68,69,70,71,73,76,80,109,111,113,114,115,116,117,118,119,122,125,126,127,128,129,130,131,132,133,134,135,136,142,146,147,148,149,151,152,156,],[37,-45,-46,-47,-48,-49,-50,-51,37,37,37,37,-21,-22,-24,-25,-26,-27,-28,-29,-52,37,-23,-30,-32,-34,-35,-36,-37,-38,-39,-40,-43,37,37,37,37,37,37,37,37,37,37,37,37,-5,-31,-33,-41,-42,37,37,-6,]),'ANDLOGIC':([2,11,25,26,27,28,29,30,41,61,62,63,64,65,66,67,68,69,70,71,73,76,80,109,111,113,114,115,116,117,118,119,122,125,126,127,128,129,130,131,132,133,134,135,136,142,146,147,148,149,151,152,156,],[38,-45,-46,-47,-48,-49,-50,-51,38,38,38,38,-21,-22,-24,-25,-26,-27,-28,-29,-52,38,-23,-30,-32,-34,-35,-36,-37,-38,-39,-40,-43,38,38,38,38,38,38,38,38,38,38,38,38,-5,-31,-33,-41,-42,38,38,-6,]),'ORLOGIC':([2,11,25,26,27,28,29,30,41,61,62,63,64,65,66,67,68,69,70,71,73,76,80,109,111,113,114,115,116,117,118,119,122,125,126,127,128,129,130,131,132,133,134,135,136,142,146,147,148,149,151,152,156,],[39,-45,-46,-47,-48,-49,-50,-51,39,39,39,39,-21,-22,-24,-25,-26,-27,-28,-29,-52,39,-23,-30,-32,-34,-35,-36,-37,-38,-39,-40,-43,39,39,39,39,39,39,39,39,39,39,39,39,-5,-31,-33,-41,-42,39,39,-6,]),'XORLOGIC':([2,11,25,26,27,28,29,30,41,61,62,63,64,65,66,67,68,69,70,71,73,76,80,109,111,113,114,115,116,117,118,119,122,125,126,127,128,129,130,131,132,133,134,135,136,142,146,147,148,149,151,152,156,],[40,-45,-46,-47,-48,-49,-50,-51,40,40,40,40,-21,-22,-24,-25,-26,-27,-28,-29,-52,40,-23,-30,-32,-34,-35,-36,-37,-38,-39,-40,-43,40,40,40,40,40,40,40,40,40,40,40,40,-5,-31,-33,-41,-42,40,40,-6,]),'EQUALS':([10,60,120,121,],[48,93,140,141,]),'EQUAL':([11,25,26,27,28,29,30,41,61,62,63,64,65,66,67,68,69,70,71,73,76,77,80,109,111,113,114,115,116,117,118,119,122,125,136,142,146,147,148,149,151,152,156,],[-45,-46,-47,-48,-49,-50,-51,-3,-44,-1,-2,-21,-22,-24,-25,-26,-27,-28,-29,-52,97,101,-23,-30,-32,-34,-35,-36,-37,-38,-39,-40,-43,-7,-19,-5,-31,-33,-41,-42,-8,-20,-6,]),'NOTEQ':([11,25,26,27,28,29,30,41,61,62,63,64,65,66,67,68,69,70,71,73,76,77,80,109,111,113,114,115,116,117,118,119,122,125,136,142,146,147,148,149,151,152,156,],[-45,-46,-47,-48,-49,-50,-51,-3,-44,-1,-2,-21,-22,-24,-25,-26,-27,-28,-29,-52,98,102,-23,-30,-32,-34,-35,-36,-37,-38,-39,-40,-43,-7,-19,-5,-31,-33,-41,-42,-8,-20,-6,]),'LARGE':([11,25,26,27,28,29,30,41,61,62,63,64,65,66,67,68,69,70,71,73,76,77,80,109,111,113,114,115,116,117,118,119,122,125,136,142,146,147,148,149,151,152,156,],[-45,-46,-47,-48,-49,-50,-51,-3,-44,-1,-2,-21,-22,-24,-25,-26,-27,-28,-29,-52,99,103,-23,-30,-32,-34,-35,-36,-37,-38,-39,-40,-43,-7,-19,-5,-31,-33,-41,-42,-8,-20,-6,]),'SMALL':([11,25,26,27,28,29,30,41,61,62,63,64,65,66,67,68,69,70,71,73,76,77,80,109,111,113,114,115,116,117,118,119,122,125,136,142,146,147,148,149,151,152,156,],[-45,-46,-47,-48,-49,-50,-51,-3,-44,-1,-2,-21,-22,-24,-25,-26,-27,-28,-29,-52,100,104,-23,-30,-32,-34,-35,-36,-37,-38,-39,-40,-43,-7,-19,-5,-31,-33,-41,-42,-8,-20,-6,]),'LRGEQ':([11,25,26,27,28,29,30,41,61,62,63,64,65,66,67,68,69,70,71,73,76,77,80,109,111,113,114,115,116,117,118,119,122,125,136,142,146,147,148,149,151,152,156,],[-45,-46,-47,-48,-49,-50,-51,-3,-44,-1,-2,-21,-22,-24,-25,-26,-27,-28,-29,-52,-4,105,-23,-30,-32,-34,-35,-36,-37,-38,-39,-40,-43,-7,-19,-5,-31,-33,-41,-42,-8,-20,-6,]),'SMLEQ':([11,25,26,27,28,29,30,41,61,62,63,64,65,66,67,68,69,70,71,73,76,77,80,109,111,113,114,115,116,117,118,119,122,125,136,142,146,147,148,149,151,152,156,],[-45,-46,-47,-48,-49,-50,-51,-3,-44,-1,-2,-21,-22,-24,-25,-26,-27,-28,-29,-52,-4,106,-23,-30,-32,-34,-35,-36,-37,-38,-39,-40,-43,-7,-19,-5,-31,-33,-41,-42,-8,-20,-6,]),'ELSE':([11,25,26,27,28,29,30,61,64,65,66,67,68,69,70,71,73,80,109,111,113,114,115,116,117,118,119,122,125,136,142,146,147,148,149,151,152,156,],[-45,-46,-47,-48,-49,-50,-51,-44,-21,-22,-24,-25,-26,-27,-28,-29,-52,-23,-30,-32,-34,-35,-36,-37,-38,-39,-40,-43,144,-19,-5,-31,-33,-41,-42,-8,-20,-6,]),'COMMA':([25,26,27,28,29,30,73,82,83,],[-46,-47,-48,-49,-50,-51,-52,110,112,]),'TYPINT':([59,],[91,]),'TYPSTRING':([59,],[92,]),'CASE':([74,],[95,]),'IN':([79,],[108,]),}

_lr_action = {}
for _k, _v in _lr_action_items.items():
   for _x,_y in zip(_v[0],_v[1]):
      if not _x in _lr_action:  _lr_action[_x] = {}
      _lr_action[_x][_k] = _y
del _lr_action_items

_lr_goto_items = {'expression':([0,5,6,45,46,94,95,143,154,],[1,43,44,77,77,123,124,150,155,]),'term':([0,3,5,6,24,31,32,45,46,94,95,96,97,98,99,100,101,102,103,104,105,106,107,143,144,145,154,],[2,41,2,2,61,62,63,76,76,2,2,125,126,127,128,129,130,131,132,133,134,135,136,2,151,152,2,]),'factor':([0,3,5,6,24,31,32,33,34,35,36,37,38,39,40,45,46,48,49,50,51,52,53,54,55,56,57,58,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,110,112,140,141,143,144,145,154,],[11,11,11,11,11,11,11,64,65,66,67,68,69,70,71,11,11,80,81,82,83,84,85,86,87,88,89,90,122,11,11,11,11,11,11,11,11,11,11,11,11,11,11,137,138,139,148,149,11,11,11,11,]),'comparison':([45,46,],[75,78,]),}

_lr_goto = {}
for _k, _v in _lr_goto_items.items():
   for _x, _y in zip(_v[0], _v[1]):
       if not _x in _lr_goto: _lr_goto[_x] = {}
       _lr_goto[_x][_k] = _y
del _lr_goto_items
_lr_productions = [
  ("S' -> expression","S'",1,None,None,None),
  ('expression -> expression PLUS term','expression',3,'p_expression_plus','JulesVerneLLVM',176),
  ('expression -> expression MINUS term','expression',3,'p_expression_minus','JulesVerneLLVM',189),
  ('expression -> MINUS term','expression',2,'p_expression_uminus','JulesVerneLLVM',201),
  ('expression -> term','expression',1,'p_expression_term','JulesVerneLLVM',205),
  ('term -> FUNC LPAREN RPAREN LBRACES expression RBRACES','term',6,'p_statement_funcWithoutParam','JulesVerneLLVM',210),
  ('term -> SWITCH expression LBRACES CASE expression COLON expression DEFAULT COLON expression RBRACES','term',11,'p_statement_switchcase','JulesVerneLLVM',218),
  ('term -> IF LPAREN comparison RPAREN term','term',5,'p_statement_if','JulesVerneLLVM',226),
  ('term -> IF LPAREN comparison RPAREN term ELSE term','term',7,'p_statement_if','JulesVerneLLVM',227),
  ('comparison -> expression EQUAL term','comparison',3,'p_comparison_binop','JulesVerneLLVM',236),
  ('comparison -> expression NOTEQ term','comparison',3,'p_comparison_binop','JulesVerneLLVM',237),
  ('comparison -> expression LARGE term','comparison',3,'p_comparison_binop','JulesVerneLLVM',238),
  ('comparison -> expression SMALL term','comparison',3,'p_comparison_binop','JulesVerneLLVM',239),
  ('comparison -> expression LRGEQ term','comparison',3,'p_comparison_binop','JulesVerneLLVM',240),
  ('comparison -> expression SMLEQ term','comparison',3,'p_comparison_binop','JulesVerneLLVM',241),
  ('comparison -> term EQUAL term','comparison',3,'p_comparison_equal','JulesVerneLLVM',256),
  ('comparison -> term NOTEQ term','comparison',3,'p_comparison_noteq','JulesVerneLLVM',260),
  ('comparison -> term LARGE term','comparison',3,'p_comparison_large','JulesVerneLLVM',264),
  ('comparison -> term SMALL term','comparison',3,'p_comparison_small','JulesVerneLLVM',268),
  ('term -> WHILE LPAREN comparison RPAREN term','term',5,'p_statement_while','JulesVerneLLVM',273),
  ('term -> FOR LPAREN ID IN factor RPAREN term','term',7,'p_statement_for','JulesVerneLLVM',279),
  ('term -> term TIMES factor','term',3,'p_term_times','JulesVerneLLVM',285),
  ('term -> term DIVIDE factor','term',3,'p_term_div','JulesVerneLLVM',290),
  ('term -> ID EQUALS factor','term',3,'p_term_equal','JulesVerneLLVM',295),
  ('term -> term SHL factor','term',3,'p_term_shl','JulesVerneLLVM',300),
  ('term -> term SHR factor','term',3,'p_term_shr','JulesVerneLLVM',305),
  ('term -> term MOD factor','term',3,'p_term_mod','JulesVerneLLVM',310),
  ('term -> term ANDLOGIC factor','term',3,'p_term_andlog','JulesVerneLLVM',315),
  ('term -> term ORLOGIC factor','term',3,'p_term_orlog','JulesVerneLLVM',320),
  ('term -> term XORLOGIC factor','term',3,'p_term_xorlog','JulesVerneLLVM',325),
  ('term -> OPEN LPAREN factor RPAREN','term',4,'p_term_openFile','JulesVerneLLVM',330),
  ('term -> POW LPAREN factor COMMA factor RPAREN','term',6,'p_term_pow','JulesVerneLLVM',337),
  ('term -> LOG LPAREN factor RPAREN','term',4,'p_term_log','JulesVerneLLVM',345),
  ('term -> LOG LPAREN factor COMMA factor RPAREN','term',6,'p_term_log','JulesVerneLLVM',346),
  ('term -> LOG10 LPAREN factor RPAREN','term',4,'p_term_log10','JulesVerneLLVM',356),
  ('term -> LOG1P LPAREN factor RPAREN','term',4,'p_term_log1p','JulesVerneLLVM',364),
  ('term -> EXP LPAREN factor RPAREN','term',4,'p_term_exp','JulesVerneLLVM',372),
  ('term -> SQRT LPAREN factor RPAREN','term',4,'p_term_sqrt','JulesVerneLLVM',380),
  ('term -> COS LPAREN factor RPAREN','term',4,'p_term_cos','JulesVerneLLVM',388),
  ('term -> SIN LPAREN factor RPAREN','term',4,'p_term_sin','JulesVerneLLVM',396),
  ('term -> TAN LPAREN factor RPAREN','term',4,'p_term_tan','JulesVerneLLVM',404),
  ('term -> VAR COLON TYPINT ID EQUALS factor','term',6,'p_term_Int','JulesVerneLLVM',412),
  ('term -> VAR COLON TYPSTRING ID EQUALS factor','term',6,'p_term_String','JulesVerneLLVM',420),
  ('term -> LET ID EQUALS factor','term',4,'p_term_Let','JulesVerneLLVM',428),
  ('term -> PRINT term','term',2,'p_term_print','JulesVerneLLVM',433),
  ('term -> factor','term',1,'p_term_factor','JulesVerneLLVM',438),
  ('factor -> NUMBER','factor',1,'p_factor_num','JulesVerneLLVM',443),
  ('factor -> DECIMAL','factor',1,'p_factor_dec','JulesVerneLLVM',448),
  ('factor -> STRING','factor',1,'p_factor_str','JulesVerneLLVM',453),
  ('factor -> EXIT','factor',1,'p_term_exit','JulesVerneLLVM',458),
  ('factor -> HELP','factor',1,'p_term_help','JulesVerneLLVM',463),
  ('factor -> COPYRIGHT','factor',1,'p_term_copyright','JulesVerneLLVM',468),
  ('factor -> LPAREN expression RPAREN','factor',3,'p_factor_expr','JulesVerneLLVM',473),
]
