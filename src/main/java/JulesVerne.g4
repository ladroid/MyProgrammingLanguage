grammar JulesVerne;

program   : 'func main() {' statement+ '}';
          
statement : let | varInt | varFloat | declare_var | add | print | minus | multiply | divide | mod | increment | incrementPostfix | decrement | decrementPostfix | shl | shr | xorV | orV | andV | notV | function | smth | if_stat;

declare_var : INTEGER ID '[' (NUMBER)? ']' (ASSIGN '{' array_init '}')? ;
array_init: NUMBER ( ',' NUMBER )*;
ASSIGN : '=';
INTEGER : 'int';

let       : 'let' ID '=' (NUMBER | ID | FLOAT | string);
varInt    : 'var: Int' ID '=' (NUMBER | ID) ;
varFloat  : 'var: Float' ID '=' (FLOAT | ID);
print     : 'print' (NUMBER | ID | FLOAT | declare_var | string | CYRILLIC) ;
add       : '+' (NUMBER | ID | FLOAT |string) 'to' ID ;
minus     : '-' (NUMBER | ID | FLOAT) 'to' ID ;
multiply  : '*' (NUMBER | ID | FLOAT) 'to' ID ;
divide    : '/' (NUMBER | ID | FLOAT) 'to' ID ;
mod       : '%' (NUMBER | ID | FLOAT) 'to' ID ;
increment : '++' (ID) 'to' ID ;
incrementPostfix : (ID) 'to' ID '++';
decrement : '--' (ID) 'to' ID ;
decrementPostfix : (ID) 'to' ID '++';
shl       : '<<' (NUMBER | ID | FLOAT) 'to' (NUMBER | ID | FLOAT) ;
shr       : '>>' (NUMBER | ID | FLOAT) 'to' (NUMBER | ID | FLOAT) ;
xorV      : '^'  (NUMBER | ID | FLOAT) 'to' (NUMBER | ID | FLOAT) ;
orV       : '|'  (NUMBER | ID | FLOAT) 'to' (NUMBER | ID | FLOAT) ;
andV      : '&'  (NUMBER | ID | FLOAT) 'to' (NUMBER | ID | FLOAT) ;
notV      : '~'  (NUMBER | ID | FLOAT) 'to' (NUMBER | ID | FLOAT) ;
string    : '"' (~('\n' | '"'))* '"';
function  : 'func' ID '{' (varInt | varFloat | print)* '}';
smth      : IF (expr | stat_block) ELSE (expr | stat_block);
expr      : '(' (exprtr | exprsmth) ')';
exprtr    : ID 'is' (TRUE | FALSE);
exprsmth  : (add | minus | multiply | divide | mod | increment | decrement);

if_stat   : IF condition_block (ELSE IF condition_block)* (ELSE stat_block)?;
condition_block: expr stat_block;
stat_block: OBRACE block CBRACE | statement;
block: statement*;

IF : 'if';
ELSE : 'else';
OBRACE : '{';
CBRACE : '}';

TRUE  : 'true';
FALSE : 'false';

COMMENT: '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;

ID     : [a-zA-Z]+ ;
CYRILLIC : '\u0400'..'\u04FF' ;

FLOAT: '0'..'9'+ '.' '0'..'9'*;
NUMBER : [0-9]+ ;

Space: [ \t\r\n\u000C] -> skip;

OTHER: .;

WS     : [ \t\n\r]+ -> channel(HIDDEN);