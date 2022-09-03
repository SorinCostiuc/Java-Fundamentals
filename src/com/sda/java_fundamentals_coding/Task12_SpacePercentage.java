package com.sda.java_fundamentals_coding;

import java.util.Scanner;

public class Task12_SpacePercentage {
    public static void main(String[] args) {
//        Write an application that reads a text from the user (type String) and counts a percentage
//        of occurrences of a space character.
        Scanner scanner = new Scanner(System.in);
        String text = "";
        System.out.println("Enter text: ");
        text = scanner.nextLine();
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (" ".charAt(0) == (text.charAt(i))) {
                counter += 1;
            }
        }
        double percent = counter * 100.0 / text.length();
        System.out.printf("Percentage of spaces in your text is: %.3f", percent);
    }
}
