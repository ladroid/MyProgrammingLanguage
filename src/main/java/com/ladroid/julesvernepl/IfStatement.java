/*
 * Deveoped by Volodymyr Kadzhaia on 2018
 * Copyright (c) 2018.
 */

package com.ladroid.julesvernepl;

import other.Value;

import java.util.List;

public class IfStatement extends JulesVerneBaseVisitor<Value> {

    /*@Override
    public Value visitSmth(JulesVerneParser.SmthContext ctx) {
        List<JulesVerneParser.ExprContext> conditions = ctx.expr();
        boolean evaluatedBlock = false;

        for(JulesVerneParser.ExprContext condition: conditions) {
            Value evaluated = this.visit(condition.stat_block());

            if(evaluated.asBoolean()) {
                evaluatedBlock = true;
                // evaluate this block whose expr==true
                this.visit(condition.stat_block());
                break;
            }
        }

        if(!evaluatedBlock && ctx.stat_block() != null) {
            // evaluate the else-stat_block (if present == not null)
            this.visit(ctx.stat_block());
        }

        return Value.VOID;
    }*/

    @Override
    public Value visitIf_stat(JulesVerneParser.If_statContext ctx) {
        List<JulesVerneParser.Condition_blockContext> conditions = ctx.condition_block();
        boolean evaluatedBlock = false;

        for(JulesVerneParser.Condition_blockContext condition: conditions) {
            Value evaluated = this.visit(condition.expr());

            if(evaluated.asBoolean()) {
                evaluatedBlock = true;
                // evaluate this block whose expr==true
                this.visit(condition.stat_block());
                break;
            }
        }

        if(!evaluatedBlock && ctx.stat_block() != null) {
            // evaluate the else-stat_block (if present == not null)
            this.visit(ctx.stat_block());
        }

        return Value.VOID;
    }

}
