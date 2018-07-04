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
try {
    ANTLRInputStream input = new ANTLRInputStream(
            new FileInputStream((new File(
                    "/Users/lado/Documents/MyProgrammingLanguage/example1.JulesVerne"))));

    JulesVerneLexer lexer = new JulesVerneLexer(input);
    JulesVerneParser parser = new JulesVerneParser(new CommonTokenStream(lexer));
    parser.addParseListener(new MyListener());

    // Start parsing
    parser.program();
} catch (IOException e) {
    e.printStackTrace();
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
    let k = 12

    add 3 to b
    multiply 2 to a

    print k
    print b
    print a
    print "Hello"
}
```

And that's all.

Thank you very much. Maybe somitems I will update my language and this article ;)
