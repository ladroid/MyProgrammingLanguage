# JulesVernePL
This is my JVM Language

Hello today I did my own JVM Language. So how I did it?

At first download from ANTLR [jar](http://www.antlr.org/). And add it to your project and make for this file **CLASSPATH**.

If you have IntelliJ IDEA you can install [plugin](https://plugins.jetbrains.com/plugin/7358-antlr-v4-grammar-plugin) and use it.

So after this we can start. 

At first we must make a **.g4** file and compile it. Why? Because there we have all instructions of our future language. ANTLR make EBNF.

So this is my code
```
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

COMMENT: '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
ID     : [a-zA-Z]+ ;
CYRILLIC : '\u0400'..'\u04FF' ;
FLOAT: [0-9]+ '.' [0-9]* | '.' [0-9]+ ;
NUMBER : [0-9]+ ;
WS     : [ \t\n\r]+ -> channel(HIDDEN);
```

I named my language *JulesVerne*.

So the next step is parse everything.

```java public class MyListener extends JulesVerneBaseListener{...}```

This is for making **parsing**.

As you can see we have assign so let's add it in our class.

```java 
@Override
public void exitAssign(JulesVerneParser.AssignContext ctx) {
// This method is called when the parser has finished
// parsing the assign statement

// Get variable name
String variableName = ctx.ID(0).getText();

// Get value from variable or number
String value = ctx.ID().size() > 1 ? ctx.ID(1).getText()
      : ctx.NUMBER().getText();

// Add variable to map
if(ctx.ID().size() > 1) {
  variables.put(variableName, variables.get(value));
}
else {
  variables.put(variableName, Integer.parseInt(value));
}
}
```

Now the next step is adding addition, multiply, division and subtraction

```java 
@Override
public void exitAdd(JulesVerneParser.AddContext ctx) {
// This method is called when the parser has finished
// parsing the add statement

String variableName = ctx.ID().size() > 1 ? ctx.ID(1).getText()
      : ctx.ID(0).getText();
int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
      : Integer.parseInt(ctx.NUMBER().getText());

variables.put(variableName, variables.get(variableName) + value);
}

@Override
public void exitMinus(JulesVerneParser.MinusContext ctx) {
String variableName = ctx.ID().size() > 1 ? ctx.ID(1).getText()
      : ctx.ID(0).getText();
int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
      : Integer.parseInt(ctx.NUMBER().getText());

variables.put(variableName, variables.get(variableName) - value);
}

@Override
public void exitMultiply(JulesVerneParser.MultiplyContext ctx) {
String variableName = ctx.ID().size() > 1 ? ctx.ID(1).getText()
      : ctx.ID(0).getText();
int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
      : Integer.parseInt(ctx.NUMBER().getText());

variables.put(variableName, variables.get(variableName) * value);
}

@Override
public void exitDivide(JulesVerneParser.DivideContext ctx) {
String variableName = ctx.ID().size() > 1 ? ctx.ID(1).getText()
      : ctx.ID(0).getText();
int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
      : Integer.parseInt(ctx.NUMBER().getText());

variables.put(variableName, variables.get(variableName) / value);
}

@Override
public void exitMod(JulesVerneParser.ModContext ctx) {
String variableName = ctx.ID().size() > 1 ? ctx.ID(1).getText()
      : ctx.ID(0).getText();
int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
      : Integer.parseInt(ctx.NUMBER().getText());

variables.put(variableName, variables.get(variableName) % value);
}

@Override
public void exitIncrement(JulesVerneParser.IncrementContext ctx) {
String variableName = ctx.ID().size() > 1 ? ctx.ID(1).getText()
      : ctx.ID(0).getText();
int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
      : Integer.parseInt(ctx.ID(1).getText());

variables.put(variableName, ++value);
}

@Override
public void exitDecrement(JulesVerneParser.DecrementContext ctx) {
String variableName = ctx.ID().size() > 1 ? ctx.ID(1).getText()
      : ctx.ID(0).getText();
int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
      : Integer.parseInt(ctx.ID(1).getText());

variables.put(variableName, --value);
}
```

Great! As you can see everything is a same. But what about print. Here we must print not only numbers but strings too. How did it? Well it's very simple.

Let's see.

```java
@Override
public void exitPrint(JulesVerneParser.PrintContext ctx) {
// This method is called when the parser has finished
// parsing the print statement

if(ctx.ID() == null) {
  if(ctx.NUMBER() != null) {
      String outputNum = ctx.NUMBER().getText();
      System.out.println(outputNum);
  } else {
      String outputStr = ctx.string().getText();
      System.out.println(outputStr);
  }
} else {
  int outputNum = variables.get(ctx.ID().getText().toString());
  System.out.println(outputNum);
}
}
```

And that's all. By the way in my grammer I add function. So we can call function and it can output everything, so in general work with this function.

```
function  : 'func' ID '{' (assign | print)* '}';
```

**(...)*** it means that we can make many assigns and print everything what we want.

And now let's compile our file.

How I did it? Let's see.

```java
System.out.println("Enter path to you file");
String path;
Scanner in = new Scanner(System.in);
path = in.nextLine();

File file = new File(path);

String code = readFile(file, Charset.forName("UTF-8"));

ANTLRInputStream input = new ANTLRInputStream(code);

JulesVerneLexer lexer = new JulesVerneLexer(input);
JulesVerneParser parser = new JulesVerneParser(new CommonTokenStream(lexer));
parser.addParseListener(new MyListener());

// Start parsing
parser.program();
}
private static String readFile(File file, Charset encoding) throws IOException {
          byte[] encoded = Files.readAllBytes(file.toPath());
          return new String(encoded, encoding);
}
```

That's it. Very simple.

And this is my example
```
func example {
    print "First"
}

func main() {

    let a = 5
    let b = 10
    let k = 10
    let c = 3

    + 3 to b
    * 2 to a
    % 3 to k
    ++ c to c

    print c
    print k
    print b
    print a
    print "Hello"
    print "Привет"

    if(a) {
        print "true"
    } else(a) {
        print "false"
    }
}
```

And that's all.

Thank you very much. Maybe somitems I will update my language and this article ;)
