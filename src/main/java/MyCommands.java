/*
 * Deveoped by Volodymyr Kadzhaia on 2018
 * Copyright (c) 2018.
 */

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.Scanner;

@ShellComponent
public class MyCommands {
    private String path = "/Users/lado/Documents/MyProgrammingLanguage/JulesVernePL/";
    public void show_menu() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Make a choice");
        String choice = input.nextLine();
        if(choice.equals("file") || choice.equals("File")) {
            String enter = input.nextLine();
            readFile(enter);
        } else if(choice.equals("terminal") || choice.equals("Terminal")) {
            Scanner in = new Scanner(System.in);
            Double nums = in.nextDouble();
            Double res = add(nums, nums);
            System.out.println(res);
        }
    }
    @ShellMethod("Command for read file")
    public void readFile(String name) throws IOException {
        String all_path = path + name;
        File file = new File(all_path);
        readFile(file, Charset.forName("UTF-8"));
    }

    @ShellMethod("Add two integers")
    public double add(double a, double b) {
        return a + b;
    }

    @ShellMethod("Minus two integers")
    public double minus(double a, double b) {
        return a - b;
    }

    @ShellMethod("Divide two integers")
    public double divide(double a, double b) {
        return a / b;
    }

    @ShellMethod("Multiply two integers")
    public double multiply(double a, double b) {
        return a * b;
    }

    private static String readFile(File file, Charset encoding) throws IOException {
        byte[] encoded = Files.readAllBytes(file.toPath());
        return new String(encoded, encoding);
    }
}
