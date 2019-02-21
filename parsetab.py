
# parsetab.py
# This file is automatically generated. Do not edit.
# pylint: disable=W,C,R
_tabversion = '3.10'

_lr_method = 'LALR'

_lr_signature = 'ANDLOGIC ARROW ASK ASYNC CALLBACK CASE COLON COMMA COPYRIGHT COS DECIMAL DEFAULT DIVIDE E ELSE EQUAL EQUALS EXIT EXP FLOAT FOR FUNC HELP ID IF IN INT LARGE LBRACES LET LOG LOG10 LOG1P LPAREN LRGEQ LSQRBRACK MINUS MOD NOTEQ NUMBER OPEN ORLOGIC PI PLUS POW PRINT RBRACES RETURN RPAREN RSQRBRACK SEMICOLON SHL SHR SIN SMALL SMLEQ SQRT STRING SWITCH TAN TIMES TYPINT TYPSTRING VAR WHILE XORLOGICexpression : expression PLUS term\n                            | PI PLUS term\n                            | ID PLUS expressionexpression : expression MINUS term\n                            | PI MINUS term\n                            | ID MINUS expressionexpression : MINUS termexpression : termterm : FUNC LPAREN RPAREN LBRACES expression RBRACESterm : FUNC LPAREN ID COMMA ID RPARENterm : SWITCH expression LBRACES CASE expression COLON expression DEFAULT COLON expression RBRACESterm : comparison ASK expression COLON expressionterm : IF LPAREN comparison RPAREN term\n                    | IF LPAREN comparison RPAREN term ELSE termcomparison : expression EQUAL term\n                          | expression NOTEQ term\n                          | expression LARGE term\n                          | expression SMALL term\n                          | expression LRGEQ term\n                          | expression SMLEQ termcomparison : term EQUAL termcomparison : term NOTEQ termcomparison : term LARGE termcomparison : term SMALL termterm : WHILE LPAREN comparison RPAREN termterm : FOR LPAREN ID IN factor RPAREN termterm : term TIMES factor\n                            | PI TIMES factor\n                            | ID TIMES expressionterm : term DIVIDE factor\n                            | PI DIVIDE factor\n                            | ID DIVIDE expressionterm : ID EQUALS factorterm : ID EQUALS LPAREN term COMMA term RPARENterm : term SHL factor\n                        | ID SHL expressionterm : term SHR factor\n                        | ID SHR expressionterm : term MOD factor\n                        | ID MOD expressionterm : term ANDLOGIC factor\n                        | ID ANDLOGIC expressionterm : term ORLOGIC factor\n                        | ID ORLOGIC expressionterm : term XORLOGIC factor\n                        | ID XORLOGIC expressionterm : OPEN LPAREN factor RPARENterm : POW LPAREN factor COMMA factor RPARENterm : LOG LPAREN factor RPAREN\n                            | LOG LPAREN factor COMMA factor RPARENterm : LOG10 LPAREN factor RPARENterm : LOG1P LPAREN factor RPARENterm : EXP LPAREN factor RPARENterm : SQRT LPAREN factor RPARENterm : COS LPAREN factor RPARENterm : SIN LPAREN factor RPARENterm : TAN LPAREN factor RPARENterm : PIterm : Eterm : VAR COLON TYPINT ID EQUALS factorterm : VAR COLON TYPSTRING ID EQUALS factorterm : LET ID EQUALS factorterm : PRINT term\n                | PRINT ID\n                | PRINT LPAREN term COMMA term RPARENterm : factorterm : IDfactor : NUMBERfactor : DECIMALfactor : STRINGfactor : EXITfactor : HELPfactor : COPYRIGHTfactor : LPAREN expression RPAREN'
    
_lr_action_items = {'PI':([0,5,7,8,27,34,35,36,37,38,39,40,41,50,51,52,53,54,55,58,59,60,61,63,64,65,66,67,68,76,77,78,94,124,155,157,158,159,160,176,177,193,194,195,206,],[3,72,3,3,72,72,72,72,72,72,72,72,72,72,72,72,72,72,72,3,3,3,3,3,3,3,3,3,3,3,3,3,72,72,3,3,3,72,72,72,72,3,72,72,3,]),'ID':([0,5,7,8,26,27,34,35,36,37,38,39,40,41,50,51,52,53,54,55,58,59,60,61,63,64,65,66,67,68,73,76,77,78,79,94,124,150,151,155,156,157,158,159,160,176,177,193,194,195,206,],[4,71,4,4,91,93,71,71,71,71,71,71,71,71,71,71,71,71,71,71,4,4,4,4,4,4,4,4,4,4,132,4,4,4,139,71,71,173,174,4,179,4,4,71,71,71,71,4,71,71,4,]),'MINUS':([0,1,2,3,4,5,7,8,13,24,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,50,51,52,53,54,55,58,59,60,61,63,64,65,66,67,68,69,70,71,72,74,75,76,77,78,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,133,135,137,153,154,155,157,158,159,160,162,164,166,167,168,169,170,171,172,175,176,177,178,180,181,182,183,189,190,191,192,193,194,195,196,197,198,199,200,201,202,203,204,206,207,208,],[5,35,-8,55,59,5,5,5,-66,-59,5,-68,-69,-70,-71,-72,-73,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,-7,35,59,55,35,35,5,5,5,-8,59,5,-1,-4,-8,-8,-8,-8,-8,-8,-27,-30,-35,-37,-39,-41,-43,-45,-8,-8,-8,-8,-2,-5,-28,-31,35,35,35,35,-33,5,35,35,35,35,35,35,-74,35,-8,-8,-8,5,5,5,5,5,-47,-49,-51,-52,-53,-54,-55,-56,-57,-62,5,5,35,35,35,-8,-8,-8,-8,-9,-10,5,5,5,-48,-50,-60,-61,-65,-34,35,-8,-8,5,35,-11,]),'FUNC':([0,5,7,8,27,34,35,36,37,38,39,40,41,50,51,52,53,54,55,58,59,60,61,63,64,65,66,67,68,76,77,78,94,124,155,157,158,159,160,176,177,193,194,195,206,],[6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,]),'SWITCH':([0,5,7,8,27,34,35,36,37,38,39,40,41,50,51,52,53,54,55,58,59,60,61,63,64,65,66,67,68,76,77,78,94,124,155,157,158,159,160,176,177,193,194,195,206,],[8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,]),'IF':([0,5,7,8,27,34,35,36,37,38,39,40,41,50,51,52,53,54,55,58,59,60,61,63,64,65,66,67,68,76,77,78,94,124,155,157,158,159,160,176,177,193,194,195,206,],[10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,]),'WHILE':([0,5,7,8,27,34,35,36,37,38,39,40,41,50,51,52,53,54,55,58,59,60,61,63,64,65,66,67,68,76,77,78,94,124,155,157,158,159,160,176,177,193,194,195,206,],[11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,]),'FOR':([0,5,7,8,27,34,35,36,37,38,39,40,41,50,51,52,53,54,55,58,59,60,61,63,64,65,66,67,68,76,77,78,94,124,155,157,158,159,160,176,177,193,194,195,206,],[12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,]),'OPEN':([0,5,7,8,27,34,35,36,37,38,39,40,41,50,51,52,53,54,55,58,59,60,61,63,64,65,66,67,68,76,77,78,94,124,155,157,158,159,160,176,177,193,194,195,206,],[14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,]),'POW':([0,5,7,8,27,34,35,36,37,38,39,40,41,50,51,52,53,54,55,58,59,60,61,63,64,65,66,67,68,76,77,78,94,124,155,157,158,159,160,176,177,193,194,195,206,],[15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,]),'LOG':([0,5,7,8,27,34,35,36,37,38,39,40,41,50,51,52,53,54,55,58,59,60,61,63,64,65,66,67,68,76,77,78,94,124,155,157,158,159,160,176,177,193,194,195,206,],[16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,]),'LOG10':([0,5,7,8,27,34,35,36,37,38,39,40,41,50,51,52,53,54,55,58,59,60,61,63,64,65,66,67,68,76,77,78,94,124,155,157,158,159,160,176,177,193,194,195,206,],[17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,]),'LOG1P':([0,5,7,8,27,34,35,36,37,38,39,40,41,50,51,52,53,54,55,58,59,60,61,63,64,65,66,67,68,76,77,78,94,124,155,157,158,159,160,176,177,193,194,195,206,],[18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,]),'EXP':([0,5,7,8,27,34,35,36,37,38,39,40,41,50,51,52,53,54,55,58,59,60,61,63,64,65,66,67,68,76,77,78,94,124,155,157,158,159,160,176,177,193,194,195,206,],[19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,]),'SQRT':([0,5,7,8,27,34,35,36,37,38,39,40,41,50,51,52,53,54,55,58,59,60,61,63,64,65,66,67,68,76,77,78,94,124,155,157,158,159,160,176,177,193,194,195,206,],[20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,]),'COS':([0,5,7,8,27,34,35,36,37,38,39,40,41,50,51,52,53,54,55,58,59,60,61,63,64,65,66,67,68,76,77,78,94,124,155,157,158,159,160,176,177,193,194,195,206,],[21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,]),'SIN':([0,5,7,8,27,34,35,36,37,38,39,40,41,50,51,52,53,54,55,58,59,60,61,63,64,65,66,67,68,76,77,78,94,124,155,157,158,159,160,176,177,193,194,195,206,],[22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,]),'TAN':([0,5,7,8,27,34,35,36,37,38,39,40,41,50,51,52,53,54,55,58,59,60,61,63,64,65,66,67,68,76,77,78,94,124,155,157,158,159,160,176,177,193,194,195,206,],[23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,]),'E':([0,5,7,8,27,34,35,36,37,38,39,40,41,50,51,52,53,54,55,58,59,60,61,63,64,65,66,67,68,76,77,78,94,124,155,157,158,159,160,176,177,193,194,195,206,],[24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,]),'VAR':([0,5,7,8,27,34,35,36,37,38,39,40,41,50,51,52,53,54,55,58,59,60,61,63,64,65,66,67,68,76,77,78,94,124,155,157,158,159,160,176,177,193,194,195,206,],[25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,]),'LET':([0,5,7,8,27,34,35,36,37,38,39,40,41,50,51,52,53,54,55,58,59,60,61,63,64,65,66,67,68,76,77,78,94,124,155,157,158,159,160,176,177,193,194,195,206,],[26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,]),'PRINT':([0,5,7,8,27,34,35,36,37,38,39,40,41,50,51,52,53,54,55,58,59,60,61,63,64,65,66,67,68,76,77,78,94,124,155,157,158,159,160,176,177,193,194,195,206,],[27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,]),'NUMBER':([0,5,7,8,27,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,76,77,78,80,81,82,83,84,85,86,87,88,89,94,124,152,155,157,158,159,160,161,163,165,176,177,187,188,193,194,195,206,],[28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,]),'DECIMAL':([0,5,7,8,27,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,76,77,78,80,81,82,83,84,85,86,87,88,89,94,124,152,155,157,158,159,160,161,163,165,176,177,187,188,193,194,195,206,],[29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,]),'STRING':([0,5,7,8,27,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,76,77,78,80,81,82,83,84,85,86,87,88,89,94,124,152,155,157,158,159,160,161,163,165,176,177,187,188,193,194,195,206,],[30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,]),'EXIT':([0,5,7,8,27,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,76,77,78,80,81,82,83,84,85,86,87,88,89,94,124,152,155,157,158,159,160,161,163,165,176,177,187,188,193,194,195,206,],[31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,31,]),'HELP':([0,5,7,8,27,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,76,77,78,80,81,82,83,84,85,86,87,88,89,94,124,152,155,157,158,159,160,161,163,165,176,177,187,188,193,194,195,206,],[32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,]),'COPYRIGHT':([0,5,7,8,27,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,76,77,78,80,81,82,83,84,85,86,87,88,89,94,124,152,155,157,158,159,160,161,163,165,176,177,187,188,193,194,195,206,],[33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,]),'LPAREN':([0,5,6,7,8,10,11,12,14,15,16,17,18,19,20,21,22,23,27,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,76,77,78,80,81,82,83,84,85,86,87,88,89,94,124,152,155,157,158,159,160,161,163,165,176,177,187,188,193,194,195,206,],[7,7,73,7,7,77,78,79,80,81,82,83,84,85,86,87,88,89,94,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,124,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,]),'$end':([1,2,3,4,13,24,28,29,30,31,32,33,69,71,72,92,93,95,96,103,104,105,106,107,108,109,110,115,116,117,118,119,120,121,122,123,125,126,127,128,129,130,133,162,164,166,167,168,169,170,171,172,175,181,182,183,191,192,196,197,198,199,200,201,203,204,208,],[0,-8,-58,-67,-66,-59,-68,-69,-70,-71,-72,-73,-7,-67,-58,-63,-64,-1,-4,-27,-30,-35,-37,-39,-41,-43,-45,-2,-5,-28,-31,-3,-6,-29,-32,-33,-36,-38,-40,-42,-44,-46,-74,-47,-49,-51,-52,-53,-54,-55,-56,-57,-62,-12,-13,-25,-9,-10,-48,-50,-60,-61,-65,-34,-14,-26,-11,]),'PLUS':([1,2,3,4,13,24,28,29,30,31,32,33,69,70,71,72,74,75,92,93,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,125,126,127,128,129,130,133,135,137,153,154,162,164,166,167,168,169,170,171,172,175,178,180,181,182,183,189,190,191,192,196,197,198,199,200,201,202,203,204,207,208,],[34,-8,54,58,-66,-59,-68,-69,-70,-71,-72,-73,-7,34,58,54,34,34,-8,58,-1,-4,-8,-8,-8,-8,-8,-8,-27,-30,-35,-37,-39,-41,-43,-45,-8,-8,-8,-8,-2,-5,-28,-31,34,34,34,34,-33,34,34,34,34,34,34,-74,34,-8,-8,-8,-47,-49,-51,-52,-53,-54,-55,-56,-57,-62,34,34,34,-8,-8,-8,-8,-9,-10,-48,-50,-60,-61,-65,-34,34,-8,-8,34,-11,]),'EQUAL':([1,2,3,4,13,24,28,29,30,31,32,33,69,70,71,72,74,75,92,93,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,125,126,127,128,129,130,133,135,137,153,154,162,164,166,167,168,169,170,171,172,175,178,180,181,182,183,189,190,191,192,196,197,198,199,200,201,202,203,204,207,208,],[36,50,-58,-67,-66,-59,-68,-69,-70,-71,-72,-73,50,36,-67,-58,36,36,50,-64,50,50,50,50,50,50,50,50,-27,-30,-35,-37,-39,-41,-43,-45,50,50,50,50,50,50,-28,-31,36,36,36,36,-33,36,36,36,36,36,36,-74,36,50,50,50,-47,-49,-51,-52,-53,-54,-55,-56,-57,-62,36,36,36,50,50,50,50,-9,-10,-48,-50,-60,-61,-65,-34,36,50,50,36,-11,]),'NOTEQ':([1,2,3,4,13,24,28,29,30,31,32,33,69,70,71,72,74,75,92,93,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,125,126,127,128,129,130,133,135,137,153,154,162,164,166,167,168,169,170,171,172,175,178,180,181,182,183,189,190,191,192,196,197,198,199,200,201,202,203,204,207,208,],[37,51,-58,-67,-66,-59,-68,-69,-70,-71,-72,-73,51,37,-67,-58,37,37,51,-64,51,51,51,51,51,51,51,51,-27,-30,-35,-37,-39,-41,-43,-45,51,51,51,51,51,51,-28,-31,37,37,37,37,-33,37,37,37,37,37,37,-74,37,51,51,51,-47,-49,-51,-52,-53,-54,-55,-56,-57,-62,37,37,37,51,51,51,51,-9,-10,-48,-50,-60,-61,-65,-34,37,51,51,37,-11,]),'LARGE':([1,2,3,4,13,24,28,29,30,31,32,33,69,70,71,72,74,75,92,93,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,125,126,127,128,129,130,133,135,137,153,154,162,164,166,167,168,169,170,171,172,175,178,180,181,182,183,189,190,191,192,196,197,198,199,200,201,202,203,204,207,208,],[38,52,-58,-67,-66,-59,-68,-69,-70,-71,-72,-73,52,38,-67,-58,38,38,52,-64,52,52,52,52,52,52,52,52,-27,-30,-35,-37,-39,-41,-43,-45,52,52,52,52,52,52,-28,-31,38,38,38,38,-33,38,38,38,38,38,38,-74,38,52,52,52,-47,-49,-51,-52,-53,-54,-55,-56,-57,-62,38,38,38,52,52,52,52,-9,-10,-48,-50,-60,-61,-65,-34,38,52,52,38,-11,]),'SMALL':([1,2,3,4,13,24,28,29,30,31,32,33,69,70,71,72,74,75,92,93,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,125,126,127,128,129,130,133,135,137,153,154,162,164,166,167,168,169,170,171,172,175,178,180,181,182,183,189,190,191,192,196,197,198,199,200,201,202,203,204,207,208,],[39,53,-58,-67,-66,-59,-68,-69,-70,-71,-72,-73,53,39,-67,-58,39,39,53,-64,53,53,53,53,53,53,53,53,-27,-30,-35,-37,-39,-41,-43,-45,53,53,53,53,53,53,-28,-31,39,39,39,39,-33,39,39,39,39,39,39,-74,39,53,53,53,-47,-49,-51,-52,-53,-54,-55,-56,-57,-62,39,39,39,53,53,53,53,-9,-10,-48,-50,-60,-61,-65,-34,39,53,53,39,-11,]),'LRGEQ':([1,2,3,4,13,24,28,29,30,31,32,33,69,70,71,72,74,75,92,93,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,125,126,127,128,129,130,133,135,137,153,154,162,164,166,167,168,169,170,171,172,175,178,180,181,182,183,189,190,191,192,196,197,198,199,200,201,202,203,204,207,208,],[40,-8,-58,-67,-66,-59,-68,-69,-70,-71,-72,-73,-7,40,-67,-58,40,40,-8,-64,-1,-4,-8,-8,-8,-8,-8,-8,-27,-30,-35,-37,-39,-41,-43,-45,-8,-8,-8,-8,-2,-5,-28,-31,40,40,40,40,-33,40,40,40,40,40,40,-74,40,-8,-8,-8,-47,-49,-51,-52,-53,-54,-55,-56,-57,-62,40,40,40,-8,-8,-8,-8,-9,-10,-48,-50,-60,-61,-65,-34,40,-8,-8,40,-11,]),'SMLEQ':([1,2,3,4,13,24,28,29,30,31,32,33,69,70,71,72,74,75,92,93,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,125,126,127,128,129,130,133,135,137,153,154,162,164,166,167,168,169,170,171,172,175,178,180,181,182,183,189,190,191,192,196,197,198,199,200,201,202,203,204,207,208,],[41,-8,-58,-67,-66,-59,-68,-69,-70,-71,-72,-73,-7,41,-67,-58,41,41,-8,-64,-1,-4,-8,-8,-8,-8,-8,-8,-27,-30,-35,-37,-39,-41,-43,-45,-8,-8,-8,-8,-2,-5,-28,-31,41,41,41,41,-33,41,41,41,41,41,41,-74,41,-8,-8,-8,-47,-49,-51,-52,-53,-54,-55,-56,-57,-62,41,41,41,-8,-8,-8,-8,-9,-10,-48,-50,-60,-61,-65,-34,41,-8,-8,41,-11,]),'RPAREN':([2,3,4,13,24,28,29,30,31,32,33,69,71,72,73,74,92,93,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,125,126,127,128,129,130,133,136,138,140,142,143,144,145,146,147,148,149,153,154,162,164,166,167,168,169,170,171,172,175,179,181,182,183,184,185,186,189,190,191,192,196,197,198,199,200,201,203,204,208,],[-8,-58,-67,-66,-59,-68,-69,-70,-71,-72,-73,-7,-67,-58,131,133,-63,-64,-1,-4,-15,-16,-17,-18,-19,-20,-27,-30,-35,-37,-39,-41,-43,-45,-21,-22,-23,-24,-2,-5,-28,-31,-3,-6,-29,-32,-33,-36,-38,-40,-42,-44,-46,-74,159,160,162,164,166,167,168,169,170,171,172,-8,-8,-47,-49,-51,-52,-53,-54,-55,-56,-57,-62,192,-12,-13,-25,195,196,197,200,201,-9,-10,-48,-50,-60,-61,-65,-34,-14,-26,-11,]),'LBRACES':([2,3,4,13,24,28,29,30,31,32,33,69,71,72,75,92,93,95,96,103,104,105,106,107,108,109,110,115,116,117,118,119,120,121,122,123,125,126,127,128,129,130,131,133,162,164,166,167,168,169,170,171,172,175,181,182,183,191,192,196,197,198,199,200,201,203,204,208,],[-8,-58,-67,-66,-59,-68,-69,-70,-71,-72,-73,-7,-67,-58,134,-63,-64,-1,-4,-27,-30,-35,-37,-39,-41,-43,-45,-2,-5,-28,-31,-3,-6,-29,-32,-33,-36,-38,-40,-42,-44,-46,155,-74,-47,-49,-51,-52,-53,-54,-55,-56,-57,-62,-12,-13,-25,-9,-10,-48,-50,-60,-61,-65,-34,-14,-26,-11,]),'TIMES':([2,3,4,13,24,28,29,30,31,32,33,69,71,72,92,93,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,125,126,127,128,129,130,133,137,153,154,162,164,166,167,168,169,170,171,172,175,181,182,183,189,190,191,192,196,197,198,199,200,201,203,204,208,],[42,56,60,-66,-59,-68,-69,-70,-71,-72,-73,42,60,56,42,60,42,42,42,42,42,42,42,42,-27,-30,-35,-37,-39,-41,-43,-45,42,42,42,42,42,42,-28,-31,-3,-6,-29,-32,-33,-36,-38,-40,-42,-44,-46,-74,42,42,42,-47,-49,-51,-52,-53,-54,-55,-56,-57,-62,-12,42,42,42,42,-9,-10,-48,-50,-60,-61,-65,-34,42,42,-11,]),'DIVIDE':([2,3,4,13,24,28,29,30,31,32,33,69,71,72,92,93,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,125,126,127,128,129,130,133,137,153,154,162,164,166,167,168,169,170,171,172,175,181,182,183,189,190,191,192,196,197,198,199,200,201,203,204,208,],[43,57,61,-66,-59,-68,-69,-70,-71,-72,-73,43,61,57,43,61,43,43,43,43,43,43,43,43,-27,-30,-35,-37,-39,-41,-43,-45,43,43,43,43,43,43,-28,-31,-3,-6,-29,-32,-33,-36,-38,-40,-42,-44,-46,-74,43,43,43,-47,-49,-51,-52,-53,-54,-55,-56,-57,-62,-12,43,43,43,43,-9,-10,-48,-50,-60,-61,-65,-34,43,43,-11,]),'SHL':([2,3,4,13,24,28,29,30,31,32,33,69,71,72,92,93,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,125,126,127,128,129,130,133,137,153,154,162,164,166,167,168,169,170,171,172,175,181,182,183,189,190,191,192,196,197,198,199,200,201,203,204,208,],[44,-58,63,-66,-59,-68,-69,-70,-71,-72,-73,44,63,-58,44,63,44,44,44,44,44,44,44,44,-27,-30,-35,-37,-39,-41,-43,-45,44,44,44,44,44,44,-28,-31,-3,-6,-29,-32,-33,-36,-38,-40,-42,-44,-46,-74,44,44,44,-47,-49,-51,-52,-53,-54,-55,-56,-57,-62,-12,44,44,44,44,-9,-10,-48,-50,-60,-61,-65,-34,44,44,-11,]),'SHR':([2,3,4,13,24,28,29,30,31,32,33,69,71,72,92,93,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,125,126,127,128,129,130,133,137,153,154,162,164,166,167,168,169,170,171,172,175,181,182,183,189,190,191,192,196,197,198,199,200,201,203,204,208,],[45,-58,64,-66,-59,-68,-69,-70,-71,-72,-73,45,64,-58,45,64,45,45,45,45,45,45,45,45,-27,-30,-35,-37,-39,-41,-43,-45,45,45,45,45,45,45,-28,-31,-3,-6,-29,-32,-33,-36,-38,-40,-42,-44,-46,-74,45,45,45,-47,-49,-51,-52,-53,-54,-55,-56,-57,-62,-12,45,45,45,45,-9,-10,-48,-50,-60,-61,-65,-34,45,45,-11,]),'MOD':([2,3,4,13,24,28,29,30,31,32,33,69,71,72,92,93,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,125,126,127,128,129,130,133,137,153,154,162,164,166,167,168,169,170,171,172,175,181,182,183,189,190,191,192,196,197,198,199,200,201,203,204,208,],[46,-58,65,-66,-59,-68,-69,-70,-71,-72,-73,46,65,-58,46,65,46,46,46,46,46,46,46,46,-27,-30,-35,-37,-39,-41,-43,-45,46,46,46,46,46,46,-28,-31,-3,-6,-29,-32,-33,-36,-38,-40,-42,-44,-46,-74,46,46,46,-47,-49,-51,-52,-53,-54,-55,-56,-57,-62,-12,46,46,46,46,-9,-10,-48,-50,-60,-61,-65,-34,46,46,-11,]),'ANDLOGIC':([2,3,4,13,24,28,29,30,31,32,33,69,71,72,92,93,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,125,126,127,128,129,130,133,137,153,154,162,164,166,167,168,169,170,171,172,175,181,182,183,189,190,191,192,196,197,198,199,200,201,203,204,208,],[47,-58,66,-66,-59,-68,-69,-70,-71,-72,-73,47,66,-58,47,66,47,47,47,47,47,47,47,47,-27,-30,-35,-37,-39,-41,-43,-45,47,47,47,47,47,47,-28,-31,-3,-6,-29,-32,-33,-36,-38,-40,-42,-44,-46,-74,47,47,47,-47,-49,-51,-52,-53,-54,-55,-56,-57,-62,-12,47,47,47,47,-9,-10,-48,-50,-60,-61,-65,-34,47,47,-11,]),'ORLOGIC':([2,3,4,13,24,28,29,30,31,32,33,69,71,72,92,93,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,125,126,127,128,129,130,133,137,153,154,162,164,166,167,168,169,170,171,172,175,181,182,183,189,190,191,192,196,197,198,199,200,201,203,204,208,],[48,-58,67,-66,-59,-68,-69,-70,-71,-72,-73,48,67,-58,48,67,48,48,48,48,48,48,48,48,-27,-30,-35,-37,-39,-41,-43,-45,48,48,48,48,48,48,-28,-31,-3,-6,-29,-32,-33,-36,-38,-40,-42,-44,-46,-74,48,48,48,-47,-49,-51,-52,-53,-54,-55,-56,-57,-62,-12,48,48,48,48,-9,-10,-48,-50,-60,-61,-65,-34,48,48,-11,]),'XORLOGIC':([2,3,4,13,24,28,29,30,31,32,33,69,71,72,92,93,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,125,126,127,128,129,130,133,137,153,154,162,164,166,167,168,169,170,171,172,175,181,182,183,189,190,191,192,196,197,198,199,200,201,203,204,208,],[49,-58,68,-66,-59,-68,-69,-70,-71,-72,-73,49,68,-58,49,68,49,49,49,49,49,49,49,49,-27,-30,-35,-37,-39,-41,-43,-45,49,49,49,49,49,49,-28,-31,-3,-6,-29,-32,-33,-36,-38,-40,-42,-44,-46,-74,49,49,49,-47,-49,-51,-52,-53,-54,-55,-56,-57,-62,-12,49,49,49,49,-9,-10,-48,-50,-60,-61,-65,-34,49,49,-11,]),'ASK':([2,3,4,9,13,24,28,29,30,31,32,33,69,71,72,92,93,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,125,126,127,128,129,130,133,136,138,162,164,166,167,168,169,170,171,172,175,181,182,183,191,192,196,197,198,199,200,201,203,204,208,],[-8,-58,-67,76,-66,-59,-68,-69,-70,-71,-72,-73,-7,-67,-58,-63,-64,-1,-4,-15,-16,-17,-18,-19,-20,-27,-30,-35,-37,-39,-41,-43,-45,-21,-22,-23,-24,-2,-5,-28,-31,-3,-6,-29,-32,-33,-36,-38,-40,-42,-44,-46,-74,76,76,-47,-49,-51,-52,-53,-54,-55,-56,-57,-62,-12,-13,-25,-9,-10,-48,-50,-60,-61,-65,-34,-14,-26,-11,]),'COLON':([2,3,4,13,24,25,28,29,30,31,32,33,69,71,72,92,93,95,96,103,104,105,106,107,108,109,110,115,116,117,118,119,120,121,122,123,125,126,127,128,129,130,133,135,162,164,166,167,168,169,170,171,172,175,180,181,182,183,191,192,196,197,198,199,200,201,203,204,205,208,],[-8,-58,-67,-66,-59,90,-68,-69,-70,-71,-72,-73,-7,-67,-58,-63,-64,-1,-4,-27,-30,-35,-37,-39,-41,-43,-45,-2,-5,-28,-31,-3,-6,-29,-32,-33,-36,-38,-40,-42,-44,-46,-74,158,-47,-49,-51,-52,-53,-54,-55,-56,-57,-62,193,-12,-13,-25,-9,-10,-48,-50,-60,-61,-65,-34,-14,-26,206,-11,]),'COMMA':([2,3,4,13,24,28,29,30,31,32,33,69,71,72,92,93,95,96,103,104,105,106,107,108,109,110,115,116,117,118,119,120,121,122,123,125,126,127,128,129,130,132,133,141,142,153,154,162,164,166,167,168,169,170,171,172,175,181,182,183,191,192,196,197,198,199,200,201,203,204,208,],[-8,-58,-67,-66,-59,-68,-69,-70,-71,-72,-73,-7,-67,-58,-63,-64,-1,-4,-27,-30,-35,-37,-39,-41,-43,-45,-2,-5,-28,-31,-3,-6,-29,-32,-33,-36,-38,-40,-42,-44,-46,156,-74,163,165,176,177,-47,-49,-51,-52,-53,-54,-55,-56,-57,-62,-12,-13,-25,-9,-10,-48,-50,-60,-61,-65,-34,-14,-26,-11,]),'RBRACES':([2,3,4,13,24,28,29,30,31,32,33,69,71,72,92,93,95,96,103,104,105,106,107,108,109,110,115,116,117,118,119,120,121,122,123,125,126,127,128,129,130,133,162,164,166,167,168,169,170,171,172,175,178,181,182,183,191,192,196,197,198,199,200,201,203,204,207,208,],[-8,-58,-67,-66,-59,-68,-69,-70,-71,-72,-73,-7,-67,-58,-63,-64,-1,-4,-27,-30,-35,-37,-39,-41,-43,-45,-2,-5,-28,-31,-3,-6,-29,-32,-33,-36,-38,-40,-42,-44,-46,-74,-47,-49,-51,-52,-53,-54,-55,-56,-57,-62,191,-12,-13,-25,-9,-10,-48,-50,-60,-61,-65,-34,-14,-26,208,-11,]),'ELSE':([2,3,4,13,24,28,29,30,31,32,33,69,71,72,92,93,95,96,103,104,105,106,107,108,109,110,115,116,117,118,119,120,121,122,123,125,126,127,128,129,130,133,162,164,166,167,168,169,170,171,172,175,181,182,183,191,192,196,197,198,199,200,201,203,204,208,],[-8,-58,-67,-66,-59,-68,-69,-70,-71,-72,-73,-7,-67,-58,-63,-64,-1,-4,-27,-30,-35,-37,-39,-41,-43,-45,-2,-5,-28,-31,-3,-6,-29,-32,-33,-36,-38,-40,-42,-44,-46,-74,-47,-49,-51,-52,-53,-54,-55,-56,-57,-62,-12,194,-25,-9,-10,-48,-50,-60,-61,-65,-34,-14,-26,-11,]),'DEFAULT':([2,3,4,13,24,28,29,30,31,32,33,69,71,72,92,93,95,96,103,104,105,106,107,108,109,110,115,116,117,118,119,120,121,122,123,125,126,127,128,129,130,133,162,164,166,167,168,169,170,171,172,175,181,182,183,191,192,196,197,198,199,200,201,202,203,204,208,],[-8,-58,-67,-66,-59,-68,-69,-70,-71,-72,-73,-7,-67,-58,-63,-64,-1,-4,-27,-30,-35,-37,-39,-41,-43,-45,-2,-5,-28,-31,-3,-6,-29,-32,-33,-36,-38,-40,-42,-44,-46,-74,-47,-49,-51,-52,-53,-54,-55,-56,-57,-62,-12,-13,-25,-9,-10,-48,-50,-60,-61,-65,-34,205,-14,-26,-11,]),'EQUALS':([4,71,91,93,173,174,],[62,62,152,62,187,188,]),'TYPINT':([90,],[150,]),'TYPSTRING':([90,],[151,]),'CASE':([134,],[157,]),'IN':([139,],[161,]),}

_lr_action = {}
for _k, _v in _lr_action_items.items():
   for _x,_y in zip(_v[0],_v[1]):
      if not _x in _lr_action:  _lr_action[_x] = {}
      _lr_action[_x][_k] = _y
del _lr_action_items

_lr_goto_items = {'expression':([0,5,7,8,27,34,35,36,37,38,39,40,41,50,51,52,53,54,55,58,59,60,61,63,64,65,66,67,68,76,77,78,94,124,155,157,158,159,160,176,177,193,194,195,206,],[1,70,74,75,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,119,120,121,122,125,126,127,128,129,130,135,70,70,74,74,178,180,181,70,70,70,70,202,70,70,207,]),'term':([0,5,7,8,27,34,35,36,37,38,39,40,41,50,51,52,53,54,55,58,59,60,61,63,64,65,66,67,68,76,77,78,94,124,155,157,158,159,160,176,177,193,194,195,206,],[2,69,2,2,92,95,96,97,98,99,100,101,102,111,112,113,114,115,116,2,2,2,2,2,2,2,2,2,2,2,137,137,153,154,2,2,2,182,183,189,190,2,203,204,2,]),'comparison':([0,5,7,8,27,34,35,36,37,38,39,40,41,50,51,52,53,54,55,58,59,60,61,63,64,65,66,67,68,76,77,78,94,124,155,157,158,159,160,176,177,193,194,195,206,],[9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,136,138,9,9,9,9,9,9,9,9,9,9,9,9,9,]),'factor':([0,5,7,8,27,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,76,77,78,80,81,82,83,84,85,86,87,88,89,94,124,152,155,157,158,159,160,161,163,165,176,177,187,188,193,194,195,206,],[13,13,13,13,13,13,13,13,13,13,13,13,13,103,104,105,106,107,108,109,110,13,13,13,13,13,13,117,118,13,13,13,13,123,13,13,13,13,13,13,13,13,13,140,141,142,143,144,145,146,147,148,149,13,13,175,13,13,13,13,13,184,185,186,13,13,198,199,13,13,13,13,]),}

_lr_goto = {}
for _k, _v in _lr_goto_items.items():
   for _x, _y in zip(_v[0], _v[1]):
       if not _x in _lr_goto: _lr_goto[_x] = {}
       _lr_goto[_x][_k] = _y
del _lr_goto_items
_lr_productions = [
  ("S' -> expression","S'",1,None,None,None),
  ('expression -> expression PLUS term','expression',3,'p_expression_plus','JulesVerneLLVM',185),
  ('expression -> PI PLUS term','expression',3,'p_expression_plus','JulesVerneLLVM',186),
  ('expression -> ID PLUS expression','expression',3,'p_expression_plus','JulesVerneLLVM',187),
  ('expression -> expression MINUS term','expression',3,'p_expression_minus','JulesVerneLLVM',206),
  ('expression -> PI MINUS term','expression',3,'p_expression_minus','JulesVerneLLVM',207),
  ('expression -> ID MINUS expression','expression',3,'p_expression_minus','JulesVerneLLVM',208),
  ('expression -> MINUS term','expression',2,'p_expression_uminus','JulesVerneLLVM',225),
  ('expression -> term','expression',1,'p_expression_term','JulesVerneLLVM',229),
  ('term -> FUNC LPAREN RPAREN LBRACES expression RBRACES','term',6,'p_statement_funcWithoutParam','JulesVerneLLVM',234),
  ('term -> FUNC LPAREN ID COMMA ID RPAREN','term',6,'p_statement_funcWithParam','JulesVerneLLVM',239),
  ('term -> SWITCH expression LBRACES CASE expression COLON expression DEFAULT COLON expression RBRACES','term',11,'p_statement_switchcase','JulesVerneLLVM',247),
  ('term -> comparison ASK expression COLON expression','term',5,'p_statement_ternar','JulesVerneLLVM',255),
  ('term -> IF LPAREN comparison RPAREN term','term',5,'p_statement_if','JulesVerneLLVM',263),
  ('term -> IF LPAREN comparison RPAREN term ELSE term','term',7,'p_statement_if','JulesVerneLLVM',264),
  ('comparison -> expression EQUAL term','comparison',3,'p_comparison_binop','JulesVerneLLVM',273),
  ('comparison -> expression NOTEQ term','comparison',3,'p_comparison_binop','JulesVerneLLVM',274),
  ('comparison -> expression LARGE term','comparison',3,'p_comparison_binop','JulesVerneLLVM',275),
  ('comparison -> expression SMALL term','comparison',3,'p_comparison_binop','JulesVerneLLVM',276),
  ('comparison -> expression LRGEQ term','comparison',3,'p_comparison_binop','JulesVerneLLVM',277),
  ('comparison -> expression SMLEQ term','comparison',3,'p_comparison_binop','JulesVerneLLVM',278),
  ('comparison -> term EQUAL term','comparison',3,'p_comparison_equal','JulesVerneLLVM',293),
  ('comparison -> term NOTEQ term','comparison',3,'p_comparison_noteq','JulesVerneLLVM',297),
  ('comparison -> term LARGE term','comparison',3,'p_comparison_large','JulesVerneLLVM',301),
  ('comparison -> term SMALL term','comparison',3,'p_comparison_small','JulesVerneLLVM',305),
  ('term -> WHILE LPAREN comparison RPAREN term','term',5,'p_statement_while','JulesVerneLLVM',310),
  ('term -> FOR LPAREN ID IN factor RPAREN term','term',7,'p_statement_for','JulesVerneLLVM',316),
  ('term -> term TIMES factor','term',3,'p_term_times','JulesVerneLLVM',322),
  ('term -> PI TIMES factor','term',3,'p_term_times','JulesVerneLLVM',323),
  ('term -> ID TIMES expression','term',3,'p_term_times','JulesVerneLLVM',324),
  ('term -> term DIVIDE factor','term',3,'p_term_div','JulesVerneLLVM',334),
  ('term -> PI DIVIDE factor','term',3,'p_term_div','JulesVerneLLVM',335),
  ('term -> ID DIVIDE expression','term',3,'p_term_div','JulesVerneLLVM',336),
  ('term -> ID EQUALS factor','term',3,'p_term_equal','JulesVerneLLVM',346),
  ('term -> ID EQUALS LPAREN term COMMA term RPAREN','term',7,'p_term_tuple','JulesVerneLLVM',353),
  ('term -> term SHL factor','term',3,'p_term_shl','JulesVerneLLVM',359),
  ('term -> ID SHL expression','term',3,'p_term_shl','JulesVerneLLVM',360),
  ('term -> term SHR factor','term',3,'p_term_shr','JulesVerneLLVM',371),
  ('term -> ID SHR expression','term',3,'p_term_shr','JulesVerneLLVM',372),
  ('term -> term MOD factor','term',3,'p_term_mod','JulesVerneLLVM',383),
  ('term -> ID MOD expression','term',3,'p_term_mod','JulesVerneLLVM',384),
  ('term -> term ANDLOGIC factor','term',3,'p_term_andlog','JulesVerneLLVM',395),
  ('term -> ID ANDLOGIC expression','term',3,'p_term_andlog','JulesVerneLLVM',396),
  ('term -> term ORLOGIC factor','term',3,'p_term_orlog','JulesVerneLLVM',407),
  ('term -> ID ORLOGIC expression','term',3,'p_term_orlog','JulesVerneLLVM',408),
  ('term -> term XORLOGIC factor','term',3,'p_term_xorlog','JulesVerneLLVM',419),
  ('term -> ID XORLOGIC expression','term',3,'p_term_xorlog','JulesVerneLLVM',420),
  ('term -> OPEN LPAREN factor RPAREN','term',4,'p_term_openFile','JulesVerneLLVM',431),
  ('term -> POW LPAREN factor COMMA factor RPAREN','term',6,'p_term_pow','JulesVerneLLVM',438),
  ('term -> LOG LPAREN factor RPAREN','term',4,'p_term_log','JulesVerneLLVM',446),
  ('term -> LOG LPAREN factor COMMA factor RPAREN','term',6,'p_term_log','JulesVerneLLVM',447),
  ('term -> LOG10 LPAREN factor RPAREN','term',4,'p_term_log10','JulesVerneLLVM',457),
  ('term -> LOG1P LPAREN factor RPAREN','term',4,'p_term_log1p','JulesVerneLLVM',465),
  ('term -> EXP LPAREN factor RPAREN','term',4,'p_term_exp','JulesVerneLLVM',473),
  ('term -> SQRT LPAREN factor RPAREN','term',4,'p_term_sqrt','JulesVerneLLVM',481),
  ('term -> COS LPAREN factor RPAREN','term',4,'p_term_cos','JulesVerneLLVM',489),
  ('term -> SIN LPAREN factor RPAREN','term',4,'p_term_sin','JulesVerneLLVM',497),
  ('term -> TAN LPAREN factor RPAREN','term',4,'p_term_tan','JulesVerneLLVM',505),
  ('term -> PI','term',1,'p_term_pi','JulesVerneLLVM',513),
  ('term -> E','term',1,'p_term_e','JulesVerneLLVM',519),
  ('term -> VAR COLON TYPINT ID EQUALS factor','term',6,'p_term_Int','JulesVerneLLVM',525),
  ('term -> VAR COLON TYPSTRING ID EQUALS factor','term',6,'p_term_String','JulesVerneLLVM',533),
  ('term -> LET ID EQUALS factor','term',4,'p_term_Let','JulesVerneLLVM',541),
  ('term -> PRINT term','term',2,'p_term_print','JulesVerneLLVM',546),
  ('term -> PRINT ID','term',2,'p_term_print','JulesVerneLLVM',547),
  ('term -> PRINT LPAREN term COMMA term RPAREN','term',6,'p_term_print','JulesVerneLLVM',548),
  ('term -> factor','term',1,'p_term_factor','JulesVerneLLVM',559),
  ('term -> ID','term',1,'p_term_IDfactor','JulesVerneLLVM',564),
  ('factor -> NUMBER','factor',1,'p_factor_num','JulesVerneLLVM',569),
  ('factor -> DECIMAL','factor',1,'p_factor_dec','JulesVerneLLVM',574),
  ('factor -> STRING','factor',1,'p_factor_str','JulesVerneLLVM',579),
  ('factor -> EXIT','factor',1,'p_term_exit','JulesVerneLLVM',584),
  ('factor -> HELP','factor',1,'p_term_help','JulesVerneLLVM',589),
  ('factor -> COPYRIGHT','factor',1,'p_term_copyright','JulesVerneLLVM',594),
  ('factor -> LPAREN expression RPAREN','factor',3,'p_factor_expr','JulesVerneLLVM',599),
]
