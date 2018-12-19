
/*
 * Deveoped by Volodymyr Kadzhaia on 2018
 * Copyright (c) 2018.
 */

import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.*;

//TODO: rename project from JulesVernePL to Komorebi
//TODO: make function

public class MyListener extends JulesVerneBaseListener {

    private Map<String, Integer> variables;
    private Map<String, Value> arrs;

    public MyListener() {
        variables = new HashMap<>();
        arrs = new HashMap<>();
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
        arrs.put("array", val);
        //System.out.println(arrs.get(name));
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

        // Add variable to map
        if(ctx.ID().size() > 1) {
            variables.put(variableName, variables.get(value));
        }
        else {
            variables.put(variableName, Integer.parseInt(value));
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
            variables.put(variableName, variables.get(value));
        }
        else {
            variables.put(variableName, Integer.parseInt(value));
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
        if(ctx.expr(0).getText() == ctx.expr(0).getText()) {
            System.out.println(ctx.expr(1).exprtr().TRUE().getText());
        }
        else {
            System.out.println(ctx.expr(1).exprtr().FALSE().getText());
        }
    }

    @Override
    public void exitPrint(JulesVerneParser.PrintContext ctx) {
        // This method is called when the parser has finished
        // parsing the print statement

        if(ctx.ID() == null) {
            if(ctx.NUMBER() != null) {
                String outputNum = ctx.NUMBER().getText();
                System.out.println(outputNum);
            }
            else {
                String outputStr = ctx.string().getText();
                System.out.println(outputStr);
            }
        } else {
            int outputNum = variables.get(ctx.ID().getText());
            //Value outputArr = arrs.get(ctx.declare_var().getText());
            System.out.println(outputNum);
            System.out.println("AALA " +arrs.get("array"));
            //System.out.println(outputArr);
        }
    }
}
class Value {

    final Object value;

    public Value(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }
}