package com.sda.java_fundamentals.exercitii.week2;

import java.util.Scanner;
import java.util.Arrays;

public class JTenthExercise {
    public static void main(String[] args) {
//        10) Write a program that reads the text entered by the user and then divides it into individual words and writes them to the console in alphabetical order.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String s1 = scanner.nextLine();
        String[] s2 = s1.split(" ");
        Arrays.sort(s2);
        for(int i = 0; i < s2.length; i++)
            System.out.println(s2[i]);
    }
}
