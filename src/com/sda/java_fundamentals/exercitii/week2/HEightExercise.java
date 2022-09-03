package com.sda.java_fundamentals.exercitii.week2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class HEightExercise {
    public static void main(String[] args) {
//        8) Write a method that accepts the date format and date as String parameters and prints a `LocalDate` class object.,
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter date: ");
        String nextDate = "";
        nextDate = scanner.nextLine();
        printDate(nextDate);

    }
    public static void printDate (String s1){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dt = LocalDate.parse(s1, dtf);
        System.out.println(dt);
    }
}

