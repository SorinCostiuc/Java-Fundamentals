package com.sda.java_fundamentals_coding;

import java.util.Scanner;

public class Task16_LongestSequence {
    public static void main(String[] args) {
//        Write an application that takes 10 numbers from the user (type int) and write the length
//        of the longest such subsequence of these numbers, which is increasing.
//        For example, for the numbers: "1, 3, 8, 4, 2, 5, 6, 11, 13, 7" the program should write "5"
//        as the length of the longest increasing subsequence (underlined in the example).
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        int[] arr = new int[10];
        int lastPreviousNumber = Integer.MIN_VALUE;
        int counter = 0;
        int maxLength=-1;
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] > lastPreviousNumber) {
                ++counter;
            } else {
                if (counter> maxLength){
                    maxLength=counter;
                }
                counter = 1;
            }
            lastPreviousNumber = arr[i];
        }
        System.out.println(maxLength);
    }
}
