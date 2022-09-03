package com.sda.java_fundamentals_coding;


import java.util.Scanner;

public class Task14_DistanceBetweenLetters {
    public static void main(String[] args) {
//        Task 14.
//        Write an application that reads two lowercase letters of the Latin alphabet (type char)
//        and calculates how many characters is there in the alphabet between given letters.
//        Hint - use the ASCII code table and treat the characters as int numbers.
        Scanner scanner = new Scanner(System.in);
        char firstChar;
        char secondChar;
        System.out.print("Enter first char: ");
        firstChar = scanner.next().charAt(0);
        System.out.print("Enter second char: ");
        secondChar = scanner.next().charAt(0);
        firstChar = Character.toLowerCase(firstChar);
        secondChar = Character.toLowerCase(secondChar);

        System.out.println("There are " + numberOfLettersBetween(firstChar, secondChar) + " letters in the alphabet between them.");
    }

    public static int numberOfLettersBetween(int a, int b) {
        if (a == b) {
            return 0;
        }
        return Math.abs(b - a) - 1;
    }
}
