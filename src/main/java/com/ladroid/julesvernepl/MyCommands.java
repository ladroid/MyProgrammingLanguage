/*
 * Deveoped by Volodymyr Kadzhaia on 2018
 * Copyright (c) 2018.
 */

package com.ladroid.julesvernepl;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.commons.cli.*;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;

public class MyCommands {
    public static void menu(String[] args) throws ParseException, IOException {
        Options options = new Options();
        options.addOption("h", "help", false, "Help")
                .addOption("p", "print", true, "Send print request to printer.")
                .addOption("n", "nothing", false, "Show something")
                .addOption("c", "compile", true, "Compile file")
                .addOption("a", "add", false, "add numbers")
                .addOption("m", "multiply", false, "multiply numbers")
                .addOption("d", "divide", false, "divide numbers")
                .addOption("s", "subtraction",false, "subtraction numbers")
                .addOption("mod", "modulo", false, "Modulo division")
                .addOption("e", "exit", false, "Exit");

        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp("JulesVernePL", options);

        //***Parsing Stage***
        //Create a parser
        CommandLineParser parser = new DefaultParser();

        //parse the options passed as command line arguments
        CommandLine cmd = parser.parse( options, args);

        if(cmd.hasOption("p")) {
            System.out.println(cmd.getOptionValue("p"));
        } else if(cmd.hasOption("h")) {
            formatter.printHelp("help", options);
        } else if(cmd.hasOption("n")) {
            System.out.println("Hello");
        } else if(cmd.hasOption("c")) {
            readingFile(args);
        } else if(cmd.hasOption("a")) {
            System.out.println(getSum(args));
        } else if(cmd.hasOption("d")) {
            System.out.println(getDivide(args));
        } else if(cmd.hasOption("m")) {
            System.out.println(getMultiplication(args));
        } else if(cmd.hasOption("s")) {
            System.out.println(getSubtraction(args));
        } else if(cmd.hasOption("mod")) {
            System.out.println(getModulo(args));
        }
        else if(cmd.hasOption("e")) {
            System.exit(0);
        }
    }

    private static void readingFile(String[] args) throws IOException {
        //String newString = Arrays.toString(args);
        File file = new File(args[1]);

        String code = readFile(file, Charset.forName("UTF-8"));

        ANTLRInputStream input = new ANTLRInputStream(code);

        JulesVerneLexer lexer = new JulesVerneLexer(input);
        JulesVerneParser parser = new JulesVerneParser(new CommonTokenStream(lexer));
        parser.addParseListener(new MyListener());
        //new MyListenerVisitor().visit(parser.program());

        // Start parsing
        parser.program();
    }

    private static String readFile(File file, Charset encoding) throws IOException {
        byte[] encoded = Files.readAllBytes(file.toPath());
        return new String(encoded, encoding);
    }

    public static int getSum(String[] args) {
        int sum = 0;
        for(int i = 1; i < args.length ; i++) {
            sum += Integer.parseInt(args[i]);
        }
        return sum;
    }

    public static int getMultiplication(String[] args) {
        int multiplication = 1;
        for(int i = 1; i < args.length ; i++) {
            multiplication *= Integer.parseInt(args[i]);
        }
        return multiplication;
    }

    public static double getDivide(String[] args) {
        double divide = 0;
        double num1 = Double.parseDouble(args[1]);
        double num2 = Double.parseDouble(args[2]);
        divide = num1 / num2;
        return divide;
    }

    public static int getSubtraction(String[] args) {
        int subtraction = 0;
        int num1 = Integer.parseInt(args[1]);
        int num2 = Integer.parseInt(args[2]);
        subtraction = num1 - num2;
        return subtraction;
    }

    public static double getModulo(String[] args) {
        double modulo = 0;
        double num1 = Double.parseDouble(args[1]);
        double num2 = Double.parseDouble(args[2]);
        modulo = num1 % num2;
        return modulo;
    }
}
