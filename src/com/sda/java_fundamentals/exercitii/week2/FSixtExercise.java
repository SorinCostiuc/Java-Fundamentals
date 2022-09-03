package com.sda.java_fundamentals.exercitii.week2;

import java.util.Scanner;

public class FSixtExercise {
    public static void main(String[] args) {
//        6) Write an application, that will read a number (of type `int`) and will write in one line all numbers starting from given number to 0 (included).
//                Keep in mind that given number may be equal to 0 or be negative.
//                Examples:
//        for given number: `5`, application should write: 5 4 3 2 1 0
//        for given number: `0`, application should write: 0
//        for given number: `-4`, application should write: -4 -3 -2 -1 0
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Enter number from which to start counting: ");
        number = scanner.nextInt();
        System.out.print("Counting: ");
        countingNumbers(number);
    }

    public static void countingNumbers(int value) {
        if (value == 0) {
            System.out.print(0);
        } else if (value > 0) {
            for (int i = value; i >= 0; i--) {
                System.out.print(i + " ");
            }
        } else if (value < 0) {
            for (int i = value; i <= 0; i++) {
                System.out.print(i + " ");
            }

        }
    }
}
