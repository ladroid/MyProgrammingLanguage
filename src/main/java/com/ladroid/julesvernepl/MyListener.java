/*
 * Deveoped by Volodymyr Kadzhaia on 2018
 * Copyright (c) 2018.
 */

package com.ladroid.julesvernepl;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.*;
import java.util.List;

//TODO: rename project from com.ladroid.julesvernepl.JulesVernePL to Komorebi or Whale
//TODO: make function
//TODO: divide everything on some classes(packages)
//TODO: fix "shit" code
//TODO:

public class MyListener extends JulesVerneBaseListener {

    private Map<String, Integer> variables;
    private Map<String, String> stringVariables;
    //private Map<String, Integer> octalVar;
    //private Map<String, Integer> hexVar;
    private Map<String, Value> arrs;
    private Map<String, Boolean> bool;
    private Map<String, Float> variablesFloat;

    public MyListener() {
        variables = new HashMap<>();
        stringVariables = new HashMap<>();
        arrs = new HashMap<>();
        bool = new HashMap<>();
        variablesFloat = new HashMap<>();
    }

    @Override
    public void exitDeclare_var(JulesVerneParser.Declare_varContext ctx) {
        List<Value> numbers = new ArrayList<>();
        if (ctx.array_init() != null) {
            for (TerminalNode tokenNode : ctx.array_init().NUMBER()) {
                numbers.add(new Value(Integer.valueOf(tokenNode.getText())));
            }
        }
        String name = ctx.ID().getText();

        String abc = numbers.toString();
        abc = abc.substring(1, abc.length() - 1);

        Value val = new Value(abc);
        arrs.put(name, val);
    }

    @Override
    public void exitLet(JulesVerneParser.LetContext ctx) {
        // This method is called when the parser has finished
        // parsing the assign statement

        // Get variable name
        String variableName = ctx.ID(0).getText();

        // Get value from variable or number
        String value = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                : ctx.NUMBER().getText();

//        String str = ctx.ID().size() > 1 ? ctx.ID(1).getText()
//                : ctx.concatenation().getText();

        //String octal = ctx.ID().size() > 1 ? ctx.ID(1).getText() : ctx.OCTAL().getText();

        //String hex = ctx.ID().size() > 1 ? ctx.ID(1).getText() : ctx.HEXADECIMAL().getText();

        // Add variable to map
        if(ctx.ID().size() > 1) {
            variables.put(variableName, variables.get(value));
            //stringVariables.put(variableName, stringVariables.get(str));
        }
        else {
            variables.put(variableName, Integer.parseInt(value));
            //stringVariables.put(variableName, str);
        }
    }

    @Override
    public void exitVarInt(JulesVerneParser.VarIntContext ctx) {
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

    @Override
    public void exitVarFloat(JulesVerneParser.VarFloatContext ctx) {
        // This method is called when the parser has finished
        // parsing the assign statement

        // Get variable name
        String variableName = ctx.ID(0).getText();

        // Get value from variable or number
        String value = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                : ctx.FLOAT().getText();

        // Add variable to map
        if(ctx.ID().size() > 1) {
            variablesFloat.put(variableName, variablesFloat.get(value));
        }
        else {
            variablesFloat.put(variableName, Float.parseFloat(value));
        }
    }

    @Override
    public void exitVarString(JulesVerneParser.VarStringContext ctx) {
        // This method is called when the parser has finished
        // parsing the assign statement

        // Get variable name
        String variableName = ctx.ID(0).getText();

        // Get value from variable or number
        String value = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                : ctx.STRING().getText();

        // Add variable to map
        if(ctx.ID().size() > 1) {
            stringVariables.put(variableName, stringVariables.get(value));
        }
        else {
            stringVariables.put(variableName, value);
        }
    }

    @Override
    public void exitAssignment(JulesVerneParser.AssignmentContext ctx) {
        String variableName = ctx.ID().size() > 1 ? ctx.ID(0).getText()
                : ctx.ID(0).getText();

        Integer value1 = variables.get(variableName);

        Integer value2 = ctx.ID().size() > 1 ? variables.get(ctx.ID(1).getText())
                : Integer.parseInt(ctx.ID(1).getText());
        value1 = value2;
        variables.put(variableName, value1);
    }

    @Override
    public void exitConcatenation(JulesVerneParser.ConcatenationContext ctx) {
        String str1 = ctx.STRING().size() > 1 ? ctx.STRING(0).getText()
                : ctx.STRING(0).getText();
        String str2 = ctx.STRING().size() > 1 ? ctx.STRING(1).getText()
                : ctx.STRING(1).getText();

        String res = str1.concat(str2);
        stringVariables.put(str1, res);
        System.out.println(stringVariables.get(str1));
    }

    @Override
    public void exitComparison(JulesVerneParser.ComparisonContext ctx) {
        String variableName = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                : ctx.ID(0).getText();

        Integer value1 = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
                : Integer.parseInt(ctx.NUMBER(0).getText());
        Integer value2 = ctx.ID().size() > 1 ? variables.get(ctx.ID(1).getText())
                : Integer.parseInt(ctx.NUMBER(1).getText());

        Boolean res = value1.equals(value2);
        bool.put(variableName, res);
        //output
        System.out.println(bool.get(variableName));
    }

    @Override
    public void exitComparisonRef(JulesVerneParser.ComparisonRefContext ctx) {
        String variableName = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                : ctx.ID(0).getText();

        Integer value1 = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
                : Integer.parseInt(ctx.NUMBER(0).getText());
        Integer value2 = ctx.ID().size() > 1 ? variables.get(ctx.ID(1).getText())
                : Integer.parseInt(ctx.NUMBER(1).getText());

        Boolean res = (value1 == value2);
        bool.put(variableName, res);
        //output
        System.out.println(bool.get(variableName));
    }

    /*TODO: Make print for variable which is in while statement!!!
        like this
        while(df < 20) {
            df++
            print df
        }
     */
    @Override
    public void exitWhileLoop(JulesVerneParser.WhileLoopContext ctx) {
        String variableName = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                : ctx.ID(0).getText();

        Integer value1 = variables.get(variableName);

        Integer value2 = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
                : Integer.parseInt(ctx.NUMBER(0).getText());

        List<Value> arr = new ArrayList<>();
        switch (ctx.INEQUALITY().getText()) {
            case "<":
                while (value1 < value2) {
                    value1++;
                    arr.add(new Value(value1));
                }
                break;
            case ">":
                while (value1 > value2) {
                    value1++;
                    arr.add(new Value(value1));
                }
                break;
            case "<=":
                while (value1 <= value2) {
                    value1++;
                    arr.add(new Value(value1));
                }
                break;
            case ">=":
                while (value1 >= value2) {
                    value1++;
                    arr.add(new Value(value1));
                }
                break;
            default:
                System.out.println("Error!");
        }

        String newArr = arr.toString();
        newArr = newArr.substring(1, newArr.length() - 1);

        Value val = new Value(newArr);
        arrs.put(variableName, val);

        if(ctx.statement(0).print().ID() != null) {
            System.out.println(arrs.get(variableName));
        } else {
            System.out.println(0);
        }

        if(ctx.statement(0).add() != null) {
            String varName = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                    : ctx.ID(0).getText();
            int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
                    : Integer.parseInt(ctx.NUMBER(0).getText());
            variables.put(varName, variables.get(varName) + value);
        } else if(ctx.statement(0).minus() != null) {
            String varName = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                    : ctx.ID(0).getText();
            int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
                    : Integer.parseInt(ctx.NUMBER(0).getText());
            variables.put(varName, variables.get(varName) - value);
        } else if(ctx.statement(0).divide() != null) {
            String varName = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                    : ctx.ID(0).getText();
            int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
                    : Integer.parseInt(ctx.NUMBER(0).getText());
            variables.put(varName, variables.get(varName) / value);
        } else if(ctx.statement(0).multiply() != null) {
            String varName = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                    : ctx.ID(0).getText();
            int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
                    : Integer.parseInt(ctx.NUMBER(0).getText());
            variables.put(varName, variables.get(varName) * value);
        } else if(ctx.statement(0).mod() != null) {
            String varName = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                    : ctx.ID(0).getText();
            int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
                    : Integer.parseInt(ctx.NUMBER(0).getText());
            variables.put(varName, variables.get(varName) % value);
        } else if(ctx.statement(0).increment() != null) {
            String varName = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                    : ctx.ID(0).getText();
            int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
                    : Integer.parseInt(ctx.NUMBER(0).getText());
            variables.put(varName, ++value);
        } else if(ctx.statement(0).incrementPostfix() != null) {
            String varName = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                    : ctx.ID(0).getText();
            int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
                    : Integer.parseInt(ctx.NUMBER(0).getText());
            variables.put(varName, value++);
        } else if(ctx.statement(0).decrement() != null) {
            String varName = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                    : ctx.ID(0).getText();
            int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
                    : Integer.parseInt(ctx.NUMBER(0).getText());
            variables.put(varName, --value);
        } else if(ctx.statement(0).decrementPostfix() != null) {
            String varName = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                    : ctx.ID(0).getText();
            int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
                    : Integer.parseInt(ctx.NUMBER(0).getText());
            variables.put(varName, value--);
        }
        //System.out.println(value1 + " " + value2);
    }

    @Override
    public void exitForLoop(JulesVerneParser.ForLoopContext ctx) {
        String index = ctx.ID(0).getText();
        Integer ind = variables.get(index);
        String variableName = ctx.ID(1).getText();

        Integer value = variables.get(variableName);
        List<Value> arr = new ArrayList<>();
        for(int i = ind; i <= value; i++) {
            arr.add(new Value(i));
        }
        String newArr = arr.toString();
        newArr = newArr.substring(1, newArr.length() - 1);

        Value val = new Value(newArr);
        arrs.put(index, val);

        if(ctx.statement(0).print().ID() != null) {
            System.out.println(arrs.get(index));
        } else {
            System.out.println(0);
        }
    }

    @Override
    public void exitForLoopReverse(JulesVerneParser.ForLoopReverseContext ctx) {
        String index = ctx.ID(0).getText();
        Integer ind = variables.get(index);
        String variableName = ctx.ID(1).getText();

        Integer value = variables.get(variableName);
        List<Value> arr = new ArrayList<>();
        for(int i = value; i >= ind; i--) {
            arr.add(new Value(i));
        }
        String newArr = arr.toString();
        newArr = newArr.substring(1, newArr.length() - 1);

        Value val = new Value(newArr);
        arrs.put(index, val);

        if(ctx.statement(0).print().ID() != null) {
            System.out.println(arrs.get(index));
        } else {
            System.out.println(0);
        }
    }

    @Override
    public void exitForArray(JulesVerneParser.ForArrayContext ctx) {
        String index = ctx.ID(0).getText();
        Integer ind = variables.get(index);

        String arrayName = ctx.ID(1).getText();
        Value arr = arrs.get(arrayName);

        String temp = arr.toString();
        List<String> elephantList = Arrays.asList(temp.split(","));
        List<Value> arr_new = new ArrayList<>();
        for(int i = ind; i < elephantList.size(); i++) {
            arr_new.add(new Value(elephantList.get(i)));
        }

        String newArr = arr_new.toString();
        newArr = newArr.substring(1, newArr.length() - 1);

        Value val = new Value(newArr);
        arrs.put(index, val);

        final boolean printedVarNotDeclaredArrs = !arrs.containsKey(arrayName);

        if(ctx.statement(0).print().ID() != null) {
            if (printedVarNotDeclaredArrs) {
                System.out.print("");
            } else {
                System.out.println(arrs.get(index));
            }
        } else {
            System.out.println(0);
        }
    }

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
    public void exitIncrementPostfix(JulesVerneParser.IncrementPostfixContext ctx) {
        String variableName = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                : ctx.ID(0).getText();
        int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
                : Integer.parseInt(ctx.ID(1).getText());

        variables.put(variableName, value++);
    }

    @Override
    public void exitDecrement(JulesVerneParser.DecrementContext ctx) {
        String variableName = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                : ctx.ID(0).getText();
        int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
                : Integer.parseInt(ctx.ID(1).getText());

        variables.put(variableName, --value);
    }

    @Override
    public void exitDecrementPostfix(JulesVerneParser.DecrementPostfixContext ctx) {
        String variableName = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                : ctx.ID(0).getText();
        int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
                : Integer.parseInt(ctx.ID(1).getText());

        variables.put(variableName, value--);
    }

    @Override
    public void exitShl(JulesVerneParser.ShlContext ctx) {
        String variableName = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                : ctx.ID(0).getText();
        int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
                : Integer.parseInt(ctx.ID(1).getText());

        variables.put(variableName, variables.get(variableName) << value);
    }

    @Override
    public void exitShr(JulesVerneParser.ShrContext ctx) {
        String variableName = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                : ctx.ID(0).getText();
        int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
                : Integer.parseInt(ctx.ID(1).getText());

        variables.put(variableName, variables.get(variableName) >> value);
    }

    @Override
    public void exitXorV(JulesVerneParser.XorVContext ctx) {
        String variableName = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                : ctx.ID(0).getText();
        int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
                : Integer.parseInt(ctx.ID(1).getText());

        variables.put(variableName, variables.get(variableName) ^ value);
    }

    @Override
    public void exitOrV(JulesVerneParser.OrVContext ctx) {
        String variableName = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                : ctx.ID(0).getText();
        int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
                : Integer.parseInt(ctx.ID(1).getText());

        variables.put(variableName, variables.get(variableName) | value);
    }

    @Override
    public void exitAndV(JulesVerneParser.AndVContext ctx) {
        String variableName = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                : ctx.ID(0).getText();
        int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
                : Integer.parseInt(ctx.ID(1).getText());

        variables.put(variableName, variables.get(variableName) & value);
    }

    @Override
    public void exitNotV(JulesVerneParser.NotVContext ctx) {
        String variableName = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                : ctx.ID(0).getText();
        int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
                : Integer.parseInt(ctx.ID(1).getText());

        variables.put(variableName, ~value);
    }

    //    @Override
//    public void exitIf_stat(JulesVerneParser.If_statContext ctx) {
//        IfStatement ifStatement = new IfStatement();
//        ifStatement.visitIf_stat(ctx);
//    }

    @Override
    public void exitSmth(JulesVerneParser.SmthContext ctx) {
        String varName = ctx.expr().ID(0).getText();
        String varName2 = ctx.expr().ID(1).getText();

        System.out.println(ctx.expr().ID(0).getSymbol().getText());
        System.out.println(ctx.expr().ID(0).getSymbol().getType());
        System.out.println(ctx.expr().ID(0).getText());

        Integer val1 = variables.get(varName);
        Integer val2 = variables.get(varName2);
        System.out.println(ctx.IF().getSymbol().getText());
        switch (ctx.expr().INEQUALITY().getText()) {
            case "<":
                break;
            case ">":
                break;
            case "<=":
                break;
            case ">=":
                break;
            case "==":
                if(val1.equals(val2) == true) {
                    System.out.println("A");
                } else {
                    System.out.println("B");
                    System.out.println(ctx.ELSE().getParent());
                    System.out.println(ctx.ELSE().getParent().getText());
                    switch (ctx.ELSE().getText()) {
                        case "else":
                            ctx.stat_block();
                    }
                }
                break;
            case "===":
                break;
            default:
                System.out.println("Error!");
        }
    }

    @Override
    public void exitPrint(JulesVerneParser.PrintContext ctx) {
        // This method is called when the parser has finished
        // parsing the print statement

//        if(ctx.ID() == null) {
//            if(ctx.NUMBER() != null) {
//                String outputNum = ctx.NUMBER().getText();
//                System.out.println(outputNum);
//            }
//            else {
//                String outputStr = ctx.STRING().getText();
//                System.out.println(outputStr);
//            }
//        } else {
//            int outputNum = variables.get(ctx.ID().getText());
//            //Value outputArr = arrs.get(ctx.declare_var().getText());
//            System.out.println(outputNum);
//            //System.out.println("AALA " +arrs.get("array"));
//            //System.out.println(outputArr);
//        }
        if(ctx.ID() != null) {
            final TerminalNode varName = ctx.ID();
            final boolean printedVarNotDeclared = !variables.containsKey(varName.getText());
            final boolean printedVarNotDeclaredF = !variablesFloat.containsKey(varName.getText());
            final boolean printedVarNotDeclaredS = !stringVariables.containsKey(varName.getText());
            final boolean printedVarNotDeclaredArrs = !arrs.containsKey(varName.getText());
            if(printedVarNotDeclared) {
                System.out.print("");
            } else {
                Integer value = variables.get(varName.getText());
                System.out.println(value);
            }
            if(printedVarNotDeclaredF) {
                System.out.print("");
            } else {
                Float value = variablesFloat.get(varName.getText());
                System.out.println(value);
            }
            if(printedVarNotDeclaredS) {
                System.out.print("");
            } else {
                String value = stringVariables.get(varName.getText());
                System.out.println(value);
            }

            if(printedVarNotDeclaredArrs) {
                System.out.print("");
            } else {
                Value value = arrs.get(varName.getText());
                System.out.println(value);
            }
        } else {
            if(ctx.NUMBER() != null) {
                String outputNum = ctx.NUMBER().getText();
                System.out.println(outputNum);
            } else {
                String outputStr = ctx.STRING().getText();
                System.out.println(outputStr);
            }
        }
    }

    @Override
    public void exitFunction(JulesVerneParser.FunctionContext ctx) {
        String id = ctx.ID().getText();

        String ret_type = ctx.typ().getText();

        List<JulesVerneParser.ParamContext> params = ctx.params().param();
        String param_types = null;
        String param_name = null;
        for(JulesVerneParser.ParamContext x : params) {
            param_types = x.typ().getText();
            param_name = x.ID().getText();
        }
        System.out.println(param_name + param_types);
    }

    @Override
    public void exitOpen(JulesVerneParser.OpenContext ctx) {
        String file = ctx.STRING().getText().substring(1, ctx.STRING().getText().length() - 1);
        try {
            String code = readFile(new File(file), Charset.forName("UTF-8"));
            System.out.println(code);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    private static String readFile(File file, Charset encoding) throws IOException {
        byte[] encoded = Files.readAllBytes(file.toPath());
        return new String(encoded, encoding);
    }

    /*@Override
    public void exitOpen(JulesVerneParser.OpenContext ctx) {
        String file = ctx.STRING().getText();
        try {
            JulesVerneLexer lexer = new JulesVerneLexer(CharStreams.fromFileName(file));
            System.out.println(lexer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
}
class Value {

    final Object value;

    public Value(Object value) {
        this.value = value;
    }

    public Boolean asBoolean() {
        return (Boolean)value;
    }

    @Override
    public int hashCode() {

        if(value == null) {
            return 0;
        }

        return this.value.hashCode();
    }

    @Override
    public boolean equals(Object o) {

        if(value == o) {
            return true;
        }

        if(value == null || o == null || o.getClass() != value.getClass()) {
            return false;
        }

        Value that = (Value)o;

        return this.value.equals(that.value);
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }
}