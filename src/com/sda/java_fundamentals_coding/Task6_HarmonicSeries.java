package com.sda.java_fundamentals_coding;

import java.util.Scanner;

public class Task6_HarmonicSeries {
    public static void main(String[] args) {
//        Task 6.
//        Write an application that takes a number n from the user (type int) and calculates the
//        sum of the harmonic series from 1 to n, according to the formula below:
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sumH = 0.0f;
        for (int i = 1; i <= n; i++) {
            sumH = sumH + 1.0 / i;
        }
        System.out.println(sumH);
    }
}
