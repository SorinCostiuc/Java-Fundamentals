package com.sda.java_fundamentals.exercitii.week2;

import java.util.Scanner;

public class BSecondExercise {
    public static void main(String[] args) {
//        2) Write an application, that will read a positive integer and will print it's factorial.
//        HInt: Factorial of `n` equals: `n! = 1 * 2 * ... * n
//        Hint2: calculation of the factorial value can be a separate method
        Scanner scanner = new Scanner(System.in);
        int factorial;
        System.out.print("Enter number: ");
        factorial = scanner.nextInt();

        System.out.println("Factorial of " + factorial + " is = " + calculateFactorialNumber(factorial));

    }

    public static int calculateFactorialNumber(int value) {
        int factorial = value;
        int i, total = 1;
        if (factorial <= 0) {
            System.out.println("Number should be non-negative.");
        } else {
            for (i = 1; i <= factorial; i++)
                total = total * i;
        }
        return total;

    }
}

