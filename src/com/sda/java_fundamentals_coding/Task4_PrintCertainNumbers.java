package com.sda.java_fundamentals_coding;

import java.util.Scanner;

public class Task4_PrintCertainNumbers {
    public static void main(String[] args) {
//        Task 4.
//        Write an application that takes a positive number from the user (type int) and writes all
//        numbers from 1 to the given number, each on the next line, with the following changes:
//● in place of numbers divisible by 3, instead of a number the program should print "Fizz"
//● in place of numbers divisible by 7, instead of a number the program should write
//        "Buzz"
//● if the number is divisible by both 3 and 7, the program should print "Fizz buzz"
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();

        for (int i = 1; i <= no; i++) {
            if (i % 3 == 0 || i % 7 == 0) {
                if (i % 3 == 0) {
                    System.out.print("Fizz ");
                }
                if (i % 7 == 0) {
                    System.out.print("Buzz ");
                }
            } else {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
