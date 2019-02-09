/*
 * Deveoped by Volodymyr Kadzhaia on 2018
 * Copyright (c) 2018.
 */

package com.ladroid.julesvernepl;

import jline.TerminalFactory;
import jline.console.ConsoleReader;
import jline.console.completer.ArgumentCompleter;
import jline.console.completer.Completer;
import jline.console.completer.StringsCompleter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Example {
    private String[] commandsList;

    private void init() {
        commandsList = new String[] { "help", "print", "compile", "add", "multiply", "divide", "subtraction", "modulo", "exit"};
    }

    public void run() {
        init();
        try {
            ConsoleReader console = new ConsoleReader();
            console.setPrompt("whale> ");
            List<Completer> completors = new LinkedList<Completer>();
            completors.add(new StringsCompleter(commandsList));
            console.addCompleter(new ArgumentCompleter(completors));

            String line;
            String str;
            while((line = console.readLine()) != null) {
                if("help".equals(line)) {
                    printHelp();
                } else if("print".equals(line)) {
                    Scanner in = new Scanner(System.in);
                    str = in.nextLine();
                    System.out.println(str);
                } else if("compile".equals(line)) {
                    System.out.println("a");
                }
                else {
                    System.out.println("Invalid");
                }
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    private void printHelp() {
        System.out.println("help		- Show help");
        System.out.println("print		- Print");
        System.out.println("compile		- Compile");
        System.out.println("add         - Add");
        System.out.println("multiply    - Multiply");
        System.out.println("divide      - Divide");
        System.out.println("subtraction - Subtraction");
        System.out.println("modulo      - Modulo");
        System.out.println("exit        - Exit the app");
    }
}
