package com.sda.java_fundamentals_coding;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task17_DaysLeftTo {
    public static void main(String[] args) {
//        Write an application that will read from the user the date of your next SDA classes and
//        calculate how many days are left to them.
//        Hint: read the date as String and parse it to LocalDate. Get the current date using
//        LocalDate.now() method.
        Scanner scanner = new Scanner(System.in);
        LocalDate.now();
        System.out.println("Today is: " + LocalDate.now());
        System.out.print("Enter date of your next course: ");
        String nextDate = scanner.nextLine();
//1st solve
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate dt = LocalDate.parse(nextDate, dtf);
        int daysLeft = Period.between(LocalDate.now(), dt).getDays();
        System.out.println("Days left to course: " + daysLeft);
//2nd solve
//        LocalDate nextClass = LocalDate.parse(nextDate);
//        Period p = Period.between(LocalDate.now(), nextClass);
//        System.out.println("Days left to course: " + p.getDays());
    }
}
