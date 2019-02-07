grammar JulesVerne;

@parser::header {
    import java.util.*;
}

@parser::members {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
    String date = sdf.format(new Date());
}

program   : 'func main' LSCOPE RSCOPE OBRACE statement+ CBRACE;
          
statement : let | varInt | varFloat | varString | assignment | open | declare_var | concatenation | comparison | comparisonRef | whileLoop | forLoop | forLoopReverse | forArray | add | print | minus | multiply | divide | mod | increment | incrementPostfix | decrement | decrementPostfix | shl | shr | xorV | orV | andV | notV | function | smth | if_stat;

declare_var : INTEGER ID '[' (NUMBER)? ']' (ASSIGN OBRACE array_init CBRACE)? ;
array_init: (NUMBER | ID) ( ',' NUMBER )*;
ASSIGN : '=';
INTEGER : 'int';

concatenation : STRING 'concat' STRING;
comparison : (NUMBER | ID | STRING) INEQUALITY (NUMBER | ID | STRING);
comparisonRef : (NUMBER | ID | STRING) INEQUALITY (NUMBER | ID | STRING);

whileLoop : 'while' LSCOPE (ID | NUMBER) INEQUALITY (ID | NUMBER) RSCOPE OBRACE statement+ CBRACE;

forLoop   : 'for' LSCOPE ID 'in' (ID | NUMBER) RSCOPE OBRACE statement+ CBRACE;

forLoopReverse: 'for' LSCOPE ID 'in' 'reversed' LSCOPE (ID | NUMBER) RSCOPE RSCOPE OBRACE statement+ CBRACE;

forArray : 'for' LSCOPE ID 'in' ID '.length'LSCOPE RSCOPE RSCOPE OBRACE statement+ CBRACE;

open      : 'open' LSCOPE (STRING) RSCOPE;

let       : 'let' ID '=' (NUMBER | OCTAL | HEXADECIMAL | ID | FLOAT | STRING | concatenation);
varInt    : 'var: Int' ID '=' (NUMBER | ID) ;
varFloat  : 'var: Float' ID '=' (FLOAT | ID);
varString : 'var: String' ID '=' (STRING | ID | concatenation);
assignment: ID '=' ID;
print     : 'print' (NUMBER | OCTAL | HEXADECIMAL | ID | FLOAT | declare_var | STRING | CYRILLIC | JAPANESE | KOREAN) ;
add       : '+' (NUMBER | ID | FLOAT |STRING) 'to' ID ;
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
STRING    : '"' ~('"')* '"';

function  : 'func' ID LSCOPE params? RSCOPE (ARROW typ)? block;
params    : param (',' param)*;
param     : ID ':' typ;
typ       : 'Int';

smth: IF (expr) ELSE (stat_block);
expr: '(' (ID | NUMBER | STRING) INEQUALITY (ID | NUMBER | STRING) ')' stat_block;
stat_block: OBRACE statement+ CBRACE;

if_stat   : IF condition_block (ELSE IF condition_block)* (ELSE stat_block)?;
condition_block: expr stat_block;
block: '{' statement* '}';

IF : 'if';
ELSE : 'else';
OBRACE : '{';
CBRACE : '}';

LSCOPE : '(';
RSCOPE : ')';

ARROW : '->';

TRUE  : 'true';
FALSE : 'false';

INEQUALITY : (GRTTHEN | LESTHEN | GRTTHENEQUL | LESTHENEQUL | EQUALITY | TRIPLEEQUAL);
GRTTHEN : '>';
LESTHEN : '<';
GRTTHENEQUL : '>=';
LESTHENEQUL :'<=';
EQUALITY : '==';
TRIPLEEQUAL: '===';

COMMENT: '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;

ID     : ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')* ;
CYRILLIC : '\u0400'..'\u04FF' ;
JAPANESE: [\p{Hiragana}\p{Script=Katakana}\p{Script=Han}];
KOREAN: '\uac00'..'\ubfff';

FLOAT: ('0'..'9')+ '.' ('0'..'9')+;
DOT: '.';
NUMBER : [0-9]+ ;
OCTAL  : '0' [1-7] ([0-7])*;
HEXADECIMAL : '0x' ([a-fA-F0-9])+;

Space: [ \t\r\n\u000C] -> skip;

OTHER: .;

WS     : [ \t\n\r]+ -> channel(HIDDEN);