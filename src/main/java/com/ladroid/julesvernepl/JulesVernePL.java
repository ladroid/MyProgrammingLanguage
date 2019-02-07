/*
 * Deveoped by Volodymyr Kadzhaia on 2018
 * Copyright (c) 2018.
 */

package com.ladroid.julesvernepl;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.commons.cli.ParseException;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.Scanner;

public class JulesVernePL {
    public static void main(String[] args) throws IOException, ParseException {
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
        //new MyListenerVisitor().visit(parser.program());

        // Start parsing
        parser.program();

//        MyCommands mc = new MyCommands();
//        mc.menu(args);
//        Example ex = new Example();
//        ex.run();
    }
    private static String readFile(File file, Charset encoding) throws IOException {
        byte[] encoded = Files.readAllBytes(file.toPath());
        return new String(encoded, encoding);
    }
}
