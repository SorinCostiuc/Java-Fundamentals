package com.sda.java_fundamentals_coding;

import java.util.Scanner;

public class Task8_Calculator {
    public static void main(String[] args) {
//        Task 8.
//        Write an application that implements a simple calculator. The application should:
//        a. read first number (type float)
//        b. read one of following symbols: + - / *
//        c. read second number (type float)
//        d. return a result of given mathematical operation
//        If the user provides a symbol other than supported, the application should print "Invalid
//        symbol". If the entered action cannot be implemented (i.e. it is inconsistent with the
//        principles of mathematics), the application should print "Cannot calculate".
        Scanner scanner = new Scanner(System.in);
        Scanner op = new Scanner(System.in);
        float firstNo;
        String symbol;
        float secondNo;
        System.out.println("Enter float number: ");
        firstNo = scanner.nextFloat();
        System.out.println("Enter operation type: ");
        symbol = op.nextLine();
        System.out.println("Enter float number: ");
        secondNo = scanner.nextFloat();

        float result;
        switch (symbol) {
            case "+" -> {
                result = firstNo + secondNo;
                System.out.println("Your result is: " + result);
            }
            case "-" -> {
                result = firstNo - secondNo;
                System.out.println("Your result is: " + result);
            }
            case "*" -> {
                result = firstNo * secondNo;
                System.out.println("Your result is: " + result);
            }
            case "/" -> {
                result = firstNo / secondNo;
                System.out.println("Your result is: " + result);
            }
            default -> System.out.println("Cannot calculate");
        }

    }
}
