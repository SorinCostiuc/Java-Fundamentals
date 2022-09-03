package com.sda.java_fundamentals_coding;

import java.util.Scanner;

public class Task18_Sneez {
    public static void main(String[] args) {
//        Write an application that reads a text from the user (type String) and checks whether the
//        user sneezed, i.e. whether the text equals ‘achooo!’ with one or more letter "o" at the end
//        of the expression (so both 'acho!' and 'achooooooo!’ are correct). Hint: use a regular
//        expression with the appropriate quantifier.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Say something: ");
        String text = scanner.nextLine();

        if (text.matches("acho+!")) {
            System.out.println("Bless you!");
        } else {
            System.out.println("Thank you for your message");
        }
    }
}
