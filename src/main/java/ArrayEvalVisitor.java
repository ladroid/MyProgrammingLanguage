/*
 * Deveoped by Volodymyr Kadzhaia on 2018
 * Copyright (c) 2018.
 */
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class ArrayEvalVisitor extends JulesVerneBaseVisitor<Value> {
    @Override
    public Value visitDeclare_var(JulesVerneParser.Declare_varContext ctx) {
        List<Value> numbers = new ArrayList<>();
        if (ctx.array_init() != null) {
            for (TerminalNode tokenNode : ctx.array_init().NUMBER()) {
                numbers.add(new Value(Integer.valueOf(tokenNode.getText())));
            }
        }
        return new Value(numbers);
    }
}

