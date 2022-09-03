package com.sda.java_fundamentals_coding;

import java.util.Scanner;

public class Task7_Fibonacci {
    public static void main(String[] args) {
//        Task 7.
//        Write an application that will take a positive number from the user (type int) and
//        calculate the Fibonacci number at the indicated index. For example, if the number equals
//        5, your program should print the fifth Fibonacci number. In Fibonacci sequence, each
//        number is the sum of the two preceding ones. For example, the first few Fibonacci
//        numbers are:
//        1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377...
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Enter Fibonacci number to find it's value: ");
        number = scanner.nextInt();
        System.out.println("Fibonacci number value for " + number + " is: " + calculateFibonacci(number));


    }
    public static int calculateFibonacci (int no){
        int a = 0, b = 1, c;
        if (no == 0)
            return a;
        for (int i = 2; i <= no; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
