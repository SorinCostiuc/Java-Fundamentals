package com.sda.java_fundamentals.exercitii.week2;

import java.util.Scanner;

public class KEleventhExercise {
    public static void main(String[] args) {
//        11) Write a program that reads the text entered by the user, and then checks if the word "Java" appears in the text
//        - checks if the text equals the word "Java", if yes it prints the message "Equals Java"
//                - if the text starts with the word Java it prints the message "Starts with Java"
//                - if the text ends with the word Java it prints the message "Ends with Java"
//                - if neither of the previous, but it contains the word java, it prints the message "Found Java"
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String s1 = scanner.nextLine();
        if ((!(hasOnlyWordJava(s1))) && ((s1.length() > 0 && s1.split("\\s1+").length == 1))) {
            System.out.println("Result: ");
            System.out.println("Equals Java");
        }else if ((!(firstWordJava(s1))) && (s1.length()>0)){
            System.out.println("Result: ");
            System.out.println("Starts with Java");
        }else if ((!(lastWordJava(s1))) && (s1.length()>0)){
            System.out.println("Result: ");
            System.out.println("Ends with Java");
        }else if ((!(hasWordJava(s1))) && (s1.length()>0)){
            System.out.println("Result: ");
            System.out.println("Found Java");
        }else{
            System.out.println("Java not found");
        }

    }

    private static boolean hasOnlyWordJava(String scanner) {

        return !scanner.equals("Java");
    }

    private static boolean firstWordJava(String scanner) {
        return !scanner.startsWith("Java");
    }

    private static boolean lastWordJava(String scanner) {
        return !scanner.endsWith("Java");
    }

    private static boolean hasWordJava(String scanner) {
        return !scanner.contains("Java");
    }
}
