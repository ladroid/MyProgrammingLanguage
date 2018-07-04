grammar JulesVerne;
program   : 'func main() {' statement+ '}';
          
statement : assign| add | print | minus | multiply | divide | function;

assign    : 'let' ID '=' (NUMBER | ID | FLOAT |string) ;
print     : 'print' (NUMBER | ID | FLOAT | string) ;
add       : 'add' (NUMBER | ID | FLOAT |string) 'to' ID ;
minus     : 'minus' (NUMBER | ID | FLOAT) 'to' ID ;
multiply  : 'multiply' (NUMBER | ID | FLOAT) 'to' ID ;
divide    : 'divide' (NUMBER | ID | FLOAT) 'to' ID ;
string    : '"' (~('\n' | '"'))* '"';
function  : 'func' ID '{' (assign | print)* '}';

ID     : [a-zA-Z]+ ;
FLOAT: [0-9]+ '.' [0-9]* | '.' [0-9]+ ;
NUMBER : [0-9]+ ;
WS     : [ \t\n\r]+ -> skip;