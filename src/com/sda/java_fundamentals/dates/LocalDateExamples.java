package com.sda.java_fundamentals.dates;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateExamples {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        System.out.println("\n" + "\n" + "-------------" + "\n");

        LocalDate specificLocalDate1 = LocalDate.of(2022,8,22);
        LocalDate specificLocalDate2 = LocalDate.of(2022, Month.AUGUST, 22);
        System.out.println("Specific local date 1: " + specificLocalDate1);
        System.out.println("Specific local date 2: " + specificLocalDate2);
        System.out.println("\n" + "\n" + "-------------" + "\n");

        LocalDate localDate1 = LocalDate.now();
        System.out.println(localDate1);
        System.out.println(localDate1.plusDays(5));//2022-07-22
        System.out.println(localDate1.plusDays(5));//2022-09-17
        System.out.println(localDate1.plusDays(5));//2072-07-17
        System.out.println("\n" + "\n" + "-------------" + "\n");
        System.out.println(localDate1.plusMonths(1).minusDays(6).plusYears(1));
        System.out.println("\n" + "\n" + "-------------" + "\n");

        LocalDate local1 = LocalDate.of(2022, 7, 22);
        LocalDate local2 = LocalDate.of(2022, 8, 21);
        System.out.println("Local 1 is before local 2: " + local1.isBefore(local2));
        System.out.println("Local 1 is after local 2: " + local1.isAfter(local2));
        System.out.println("\n" + "\n" + "-------------" + "\n");





    }
}
