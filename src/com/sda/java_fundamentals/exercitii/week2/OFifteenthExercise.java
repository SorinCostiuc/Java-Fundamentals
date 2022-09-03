package com.sda.java_fundamentals.exercitii.week2;

import java.util.Scanner;

public class OFifteenthExercise {
    public static void main(String[] args) {
//        15) Write an application that reads two lowercase letters of the Latin alphabet (type char)
//        and calculates how many characters is there in the alphabet between given letters.
//                Hint - use the ASCII code table and treat the characters as int numbers.
//        Scanner scanner = new Scanner(System.in);
        char firstChar;
        char secondChar;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter second char: ");
        firstChar = scanner.next().charAt(0);
        System.out.print("Enter second char: ");
        secondChar = scanner.next().charAt(0);
        firstChar = Character.toLowerCase(firstChar);
        secondChar = Character.toLowerCase(secondChar);
        int d1, d2;

        if (firstChar <= secondChar) {
            d1 = secondChar - firstChar;
            d2 = 26 - secondChar + firstChar;
        } else {
            d1 = firstChar - secondChar;
            d2 = 26 - firstChar + secondChar;
        }
        int d;
        if (d1 <= d2)
            d = d1;
        else
            d = d2;
        System.out.println("Distance: " + d);
    }
}



