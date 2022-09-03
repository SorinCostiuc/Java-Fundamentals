package com.sda.java_fundamentals.exercitii.week2;

import java.util.Scanner;

public class DFourthExercise {
    public static void main(String[] args) {
//        4) Write an application, that will read text (type `String`) and will upper-case letters in last three characters of text.
//                If text is shorter than three characters, your application should upper-case all letters
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String s1 = scanner.nextLine();
        String[] s2 = s1.split(" ");
        System.out.println("Your result: ");
        for (int i = 0; i < s2.length; i++) {
            if (!(s2[i].equals(s2.length))) {
                String toUP = changeChars(s2[i]);
                s2[i] = toUP;
            } else {
                s2[i].toUpperCase();
                System.out.println(s2[i]);
            }
        }
        for (int i = 0; i < s2.length; i++) {
            System.out.print(s2[i]);
            System.out.print(" ");
        }
    }


    public static String changeChars(String s1) {
        String changeWord = "";
        if (s1.length() >= 3) {
            String last = s1.substring(s1.length() - 3).toUpperCase();
            String first = s1.substring(0, s1.length() - 3);
            System.out.print(first + last + " ");
        } else if (s1.length() < 3) {
            String lessThan3 = s1.toUpperCase();
            System.out.print(lessThan3 + " ");

        }
        return changeWord;
    }
}
