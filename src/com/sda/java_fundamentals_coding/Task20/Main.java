package com.sda.java_fundamentals_coding.Task20;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Write an application that will play "too much, too little" game with you. At the beginning
//        the application should randomly choose a number from 0 to 100 (hint: use the
//        Random.nextInt() method) and wait for the user to enter a number. If the user gives a
//        number greater than the number chosen by the computer, your application should print
//        "too much" and wait for the next number. If the user gives a smaller number, the
//        application should print "not enough" and wait for the next number in the same way. If
//        the user provides the exact value, the application should print the word
//        "Congratulations!" and finish.
        System.out.println("Write a number to play: ");
        Random random = new Random();
        int nextInt = random.nextInt(100);
        System.out.println(nextInt);
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();
        System.out.println(nextInt);

        if (userNumber > nextInt) {
            System.out.println("Too much!");
        } else if (userNumber < nextInt) {
            System.out.println("Not enough!");
        } else {
            System.out.println("Congratulations!");
        }

    }
}
