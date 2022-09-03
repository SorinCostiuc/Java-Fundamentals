package com.sda.java_fundamentals_coding;

import java.util.Scanner;

public class Task13_Stutter {
    public static void main(String[] args) {
//        Write an application that "stutters", that is, reads the user's text (type String), and prints
//        the given text, in which each word is printed twice.
//        For example, for the input: "This is my test" the application should print "This This is is
//        my my test test".
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter text to stutter: ");
        String text = scanner.nextLine();
        System.out.println("Your stutter text is: ");
        String[] values = text.split(" ");
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " " + values[i] + " ");
        }


    }
}
