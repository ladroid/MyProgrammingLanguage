/*
 * Deveoped by Volodymyr Kadzhaia on 2018
 * Copyright (c) 2018.
 */

package com.ladroid.julesvernepl;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyListenerVisitor extends JulesVerneBaseVisitor<Object> {

    private Map<String, Integer> variables;
    private Map<String, Value> arrs;

    public MyListenerVisitor() {
        variables = new HashMap<>();
        arrs = new HashMap<>();
    }

    @Override
    public Object visitDeclare_var(JulesVerneParser.Declare_varContext ctx) {
        List<Value> numbers = new ArrayList<>();
        if (ctx.array_init() != null) {
            for (TerminalNode tokenNode : ctx.array_init().NUMBER()) {
                numbers.add(new Value(Integer.valueOf(tokenNode.getText())));
            }
        }
        String name = ctx.ID().getText();
        Value val = new Value(numbers);
        arrs.put(name, val);
        System.out.println(arrs.get(name));
        return val;
    }

    @Override
    public Object visitLet(JulesVerneParser.LetContext ctx) {
        String id = ctx.ID(0).getText();
        String value = ctx.NUMBER().getText();
        variables.put(id, Integer.valueOf(value));
        return value;
    }

    @Override
    public Object visitVarInt(JulesVerneParser.VarIntContext ctx) {
        String id = ctx.ID(0).getText();
        String value = ctx.NUMBER().getText();
        variables.put(id, Integer.valueOf(value));
        //System.out.println(id);
        return value;
    }

    @Override
    public Object visitVarFloat(JulesVerneParser.VarFloatContext ctx) {
        String id = ctx.ID(0).getText();
        String value = ctx.FLOAT().getText();
        variables.put(id, Integer.valueOf(value));
        return value;
    }

    @Override
    public Object visitPrint(JulesVerneParser.PrintContext ctx) {
        if(ctx.ID() == null) {
            if(ctx.NUMBER() != null) {
                String outputNum = ctx.NUMBER().getText();
                System.out.println(outputNum);
                return outputNum;
            }
            else {
                String outputStr = ctx.STRING().getText();
                System.out.println(outputStr);
                return outputStr;
            }
        } else {
            int outputNum = variables.get(ctx.ID().getText());
            System.out.println(outputNum);
            return outputNum;
        }
    }

    @Override
    public Object visitAdd(JulesVerneParser.AddContext ctx) {
        String id = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                : ctx.ID(0).getText();
        int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
                : Integer.parseInt(ctx.NUMBER().getText());
        variables.put(id, variables.get(id) + value);
        return variables.get(id) + value;
    }

    @Override
    public Object visitMinus(JulesVerneParser.MinusContext ctx) {
        String id = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                : ctx.ID(0).getText();
        int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
                : Integer.parseInt(ctx.NUMBER().getText());
        variables.put(id, variables.get(id) - value);
        return variables.get(id) - value;
    }

    @Override
    public Object visitMultiply(JulesVerneParser.MultiplyContext ctx) {
        String id = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                : ctx.ID(0).getText();
        int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
                : Integer.parseInt(ctx.NUMBER().getText());
        variables.put(id, variables.get(id) * value);
        return variables.get(id) * value;
    }

    @Override
    public Object visitDivide(JulesVerneParser.DivideContext ctx) {
        String id = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                : ctx.ID(0).getText();
        int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
                : Integer.parseInt(ctx.NUMBER().getText());
        variables.put(id, variables.get(id) / value);
        return variables.get(id) / value;
    }

    @Override
    public Object visitMod(JulesVerneParser.ModContext ctx) {
        String id = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                : ctx.ID(0).getText();
        int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
                : Integer.parseInt(ctx.NUMBER().getText());
        variables.put(id, variables.get(id) % value);
        return variables.get(id) % value;
    }

    @Override
    public Object visitIncrement(JulesVerneParser.IncrementContext ctx) {
        String id = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                : ctx.ID(0).getText();
        int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
                : Integer.parseInt(ctx.ID(1).getText());
        variables.put(id, ++value);
        return ++value;
    }

    @Override
    public Object visitIncrementPostfix(JulesVerneParser.IncrementPostfixContext ctx) {
        String id = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                : ctx.ID(0).getText();
        int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
                : Integer.parseInt(ctx.ID(1).getText());
        variables.put(id, value++);
        return value++;
    }

    @Override
    public Object visitDecrement(JulesVerneParser.DecrementContext ctx) {
        String id = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                : ctx.ID(0).getText();
        int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
                : Integer.parseInt(ctx.ID(1).getText());
        variables.put(id, --value);
        return --value;
    }

    @Override
    public Object visitDecrementPostfix(JulesVerneParser.DecrementPostfixContext ctx) {
        String id = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                : ctx.ID(0).getText();
        int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
                : Integer.parseInt(ctx.ID(1).getText());
        variables.put(id, value--);
        return value--;
    }

    @Override
    public Object visitShl(JulesVerneParser.ShlContext ctx) {
        String id = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                : ctx.ID(0).getText();
        int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
                : Integer.parseInt(ctx.ID(1).getText());
        variables.put(id, variables.get(id) << value);
        return variables.get(id) << value;
    }

    @Override
    public Object visitShr(JulesVerneParser.ShrContext ctx) {
        String id = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                : ctx.ID(0).getText();
        int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
                : Integer.parseInt(ctx.ID(1).getText());
        variables.put(id, variables.get(id) >> value);
        return variables.get(id) >> value;
    }

    @Override
    public Object visitXorV(JulesVerneParser.XorVContext ctx) {
        String id = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                : ctx.ID(0).getText();
        int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
                : Integer.parseInt(ctx.ID(1).getText());
        variables.put(id, variables.get(id) ^ value);
        return variables.get(id) ^ value;
    }

    @Override
    public Object visitOrV(JulesVerneParser.OrVContext ctx) {
        String id = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                : ctx.ID(0).getText();
        int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
                : Integer.parseInt(ctx.ID(1).getText());
        variables.put(id, variables.get(id) | value);
        return variables.get(id) | value;
    }

    @Override
    public Object visitAndV(JulesVerneParser.AndVContext ctx) {
        String id = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                : ctx.ID(0).getText();
        int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
                : Integer.parseInt(ctx.ID(1).getText());
        variables.put(id, variables.get(id) & value);
        return variables.get(id) & value;
    }

    @Override
    public Object visitNotV(JulesVerneParser.NotVContext ctx) {
        String id = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                : ctx.ID(0).getText();
        int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
                : Integer.parseInt(ctx.ID(1).getText());
        variables.put(id, ~value);
        return ~value;
    }
}
