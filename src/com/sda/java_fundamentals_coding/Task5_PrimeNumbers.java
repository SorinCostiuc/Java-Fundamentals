package com.sda.java_fundamentals_coding;

import java.util.Scanner;

public class Task5_PrimeNumbers {
    public static void main(String[] args) {
//        Task 5.
//        Write an application that takes a positive number from the user (type int) and prints all
//        prime numbers greater than 1 and less than the given number.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number above 0 to check all the primes that come before");
        int num = scanner.nextInt();
        System.out.println("The prime numbers before " + num + " are:");
        calculatePrimes(num);

    }

    public static void calculatePrimes(int num) {
        int i = 1;
        while (i < num) {
            if (isPrimeNumber(i)) {
                System.out.println(i);
            }
            i++;
        }
    }


    public static boolean isPrimeNumber(int i) {
        int j = 2;
        if (i < 2) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        while (j <= (i / 2)) {
            if (i % j == 0) {
                return false;
            }
            j++;
        }
        return true;
    }
}


