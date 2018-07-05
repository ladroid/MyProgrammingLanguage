grammar JulesVerne;
program   : 'func main() {' statement+ '}';
          
statement : assign| add | print | minus | multiply | divide | mod | increment | decrement | function;

assign    : 'let' ID '=' (NUMBER | ID | FLOAT |string) ;
print     : 'print' (NUMBER | ID | FLOAT | string | CYRILLIC) ;
add       : 'add' (NUMBER | ID | FLOAT |string) 'to' ID ;
minus     : 'minus' (NUMBER | ID | FLOAT) 'to' ID ;
multiply  : 'multiply' (NUMBER | ID | FLOAT) 'to' ID ;
divide    : 'divide' (NUMBER | ID | FLOAT) 'to' ID ;
mod       : 'mod' (NUMBER | ID | FLOAT) 'to' ID ;
increment : '++' (ID) 'to' ID ;
decrement : '--' (ID) 'to' ID ;
string    : '"' (~('\n' | '"'))* '"';
function  : 'func' ID '{' (assign | print)* '}';

ID     : [a-zA-Z]+ ;
CYRILLIC : '\u0400'..'\u04FF' ;
FLOAT: [0-9]+ '.' [0-9]* | '.' [0-9]+ ;
NUMBER : [0-9]+ ;
WS     : [ \t\n\r]+ -> skip;