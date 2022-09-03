package com.sda.java_fundamentals_coding;

import java.util.Scanner;

public class Task10_SumOfDigits {
    public static void main(String[] args) {
//        Task 10.
//        Write an application that gets one positive number (type int) from the user and calculates
//        a sum of digits of the given number. Hint: to make some operations on every single digit
//        of the number (digit by digit), you can calculate the remainder of dividing the number by
//        10 (to get the value of the last digit) and divide the number by 10 (to "move" to the next
//        digit).
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int no = scanner.nextInt();
//        int sum = 0;
//        for (; no != 0; no = no / 10) {
//            sum += no % 10;
//        }
//        System.out.println(sum);
        digitsSum(no);
    }

    public static void digitsSum(int number) {
        int reminder;
        int sum = 0;
        System.out.println("Digits sum is: ");
        while (number != 0) {
            reminder = number % 10;
            sum += reminder;
            number /= 10;
        }
        System.out.println(sum);
    }
}