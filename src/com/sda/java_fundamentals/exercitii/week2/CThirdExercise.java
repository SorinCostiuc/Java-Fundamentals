package com.sda.java_fundamentals.exercitii.week2;

import java.util.Arrays;
import java.util.Scanner;

public class CThirdExercise {
    public static void main(String[] args) {
//        3) Write an application, that will read two times five numbers (ten variables of type `int`) and print only those, which occured both in first and second
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        int[] arr1 = new int[5];
        for (int i = 0; i < 5; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.println("Enter another 5 numbers: ");
        int[] arr2 = new int[5];
        for (int i = 0; i < 5; i++) {
            arr2[i] = scanner.nextInt();
        }
        checkForDuplicates(arr1, arr2);

    }

    public static void checkForDuplicates(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                }
            }
        }
    }
}


