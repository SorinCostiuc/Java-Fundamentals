package com.sda.java_fundamentals.exercitii.week2;

import java.util.Scanner;

public class NFourteenthExercise {
    public static void main(String[] args) {
//        14) Write an application that implements a simple calculator. The application should:
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
        float seconNo;
        System.out.println("Enter flaot number: ");
        firstNo = scanner.nextFloat();
        System.out.println("Enter operation type: ");
        symbol = op.nextLine();
        System.out.println("Enter flaot number: ");
        seconNo = scanner.nextFloat();

        float result = 0;
        if (symbol.equals("+")) {
            result = firstNo + seconNo;
            System.out.println("Your result is: " + result);
        }else if (symbol.equals("-")) {
            result = firstNo + seconNo;
            System.out.println("Your result is: " + result);
        }else if (symbol.equals("*")) {
            result = firstNo * seconNo;
            System.out.println("Your result is: " + result);
        }else if (symbol.equals("/")) {
            result = firstNo / seconNo;
            System.out.println("Your result is: " + result);
        }else
        System.out.println("Cannot calculate");

    }
}
