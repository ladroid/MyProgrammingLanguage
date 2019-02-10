/*
 * Deveoped by Volodymyr Kadzhaia on 2018
 * Copyright (c) 2018.
 */

package com.ladroid.julesvernepl;

import java.util.Map;

/*
    *This class is for making some arithmetic operations and it returns result
    * which cannot do MyListener class
 */
public class ObjectListener extends JulesVerneBaseVisitor<Object> {
    private Map<String, Object> variables;
    @Override
    public Object visitAdd(JulesVerneParser.AddContext ctx) {

        return super.visitAdd(ctx);
    }

    @Override
    public Object visitMinus(JulesVerneParser.MinusContext ctx) {

        return super.visitMinus(ctx);
    }

    @Override
    public Object visitMultiply(JulesVerneParser.MultiplyContext ctx) {

        return super.visitMultiply(ctx);
    }

    @Override
    public Object visitDivide(JulesVerneParser.DivideContext ctx) {

        return super.visitDivide(ctx);
    }

    @Override
    public Object visitMod(JulesVerneParser.ModContext ctx) {

        return super.visitMod(ctx);
    }

    @Override
    public Object visitShl(JulesVerneParser.ShlContext ctx) {

        return super.visitShl(ctx);
    }

    @Override
    public Object visitShr(JulesVerneParser.ShrContext ctx) {

        return super.visitShr(ctx);
    }

    @Override
    public Object visitXorV(JulesVerneParser.XorVContext ctx) {

        return super.visitXorV(ctx);
    }

    @Override
    public Object visitOrV(JulesVerneParser.OrVContext ctx) {

        return super.visitOrV(ctx);
    }

    @Override
    public Object visitAndV(JulesVerneParser.AndVContext ctx) {

        return super.visitAndV(ctx);
    }

    @Override
    public Object visitNotV(JulesVerneParser.NotVContext ctx) {

        return super.visitNotV(ctx);
    }
}
