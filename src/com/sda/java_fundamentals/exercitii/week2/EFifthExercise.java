package com.sda.java_fundamentals.exercitii.week2;

import java.util.Scanner;

public class EFifthExercise {
    public static void main(String[] args) {
//        5) Write an application that will read text (type `String`) and check if given text is a palindrome. Your application should print `true` or `false`
//        Hint: Palindrome is a text, that reads the same backwards as forwards.
//        Hint: the verification that the String is a palindrome can be a separate method
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word to verify if is palindrome: ");
        String palindrome = scanner.nextLine();
        System.out.println("Your palindrome is: ");

        System.out.println("\n" + isPalindrome(palindrome));


    }

    public static boolean isPalindrome(String s1) {
        String word = "";
        boolean answer = false;
        char[] arr = s1.toCharArray();
        for (int i = s1.length() - 1; i >= 0; i--) {
            word = word + s1.charAt(i);

        }
        if (s1.equals(word)){
            answer = true;
        }
        return answer;
    }

}
