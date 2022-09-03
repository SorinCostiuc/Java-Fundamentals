package com.sda.java_fundamentals.exercitii.week2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class LTwelfthExercise {
    public static void main(String[] args) {
//        12) Write an application that will read from the user the date of your next SDA classes and calculate how many days are left to them.
//                Hint: read the date as String and parse it to LocalDate. Get the current date usingLocalDate.now() method.
        Scanner scanner = new Scanner(System.in);
        LocalDate.now();
        System.out.println("Today is: " + LocalDate.now());
        String nextDate = "";
        System.out.print("Enter date of your next course: ");
        nextDate = scanner.nextLine();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dt = LocalDate.parse(nextDate, dtf);
        int daysLeft = Period.between(LocalDate.now(), dt).getDays();
        System.out.println("Days left to course: " + daysLeft);
    }
}
