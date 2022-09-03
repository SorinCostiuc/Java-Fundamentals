package com.sda.java_fundamentals.dates;


import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeExamples {
    public static void main(String[] args) {
        System.out.println("\n" + "\n" + "-------------" + "\n");
        LocalDateTime localDAteTime = LocalDateTime.now();
        System.out.println("Data si ora: " + localDAteTime);
        System.out.println("\n" + "\n" + "-------------" + "\n");
        LocalDateTime localDateTime1 = LocalDateTime.of(2022, 7, 24, 14, 54);
        System.out.println("Local date and time 1: " + localDateTime1);
        LocalDateTime localDateTime2 = LocalDateTime.of(2022, 7, 24, 14, 54, 10);
        System.out.println("Local date and time 2: " + localDateTime2);
        LocalDateTime localDateTime3 = LocalDateTime.of(2022, 7, 24, 14, 54, 10, 1500);
        System.out.println("Local date and time 3: " + localDateTime3);
        LocalDateTime localDateTime4 = LocalDateTime.of(2022, Month.SEPTEMBER, 24, 14, 54);
        System.out.println("Local date and time 4: " + localDateTime4);

        System.out.println("\n" + "\n" + "-------------" + "\n");
        LocalDateTime localDateTime5 = localDateTime4.plusDays(10).minusHours(2).plusMinutes(12);
        System.out.println("Local date and time 5: " + localDateTime5);
        System.out.println("\n" + "\n" + "-------------" + "\n");

        System.out.println("Is local date 5 after local date 4: " + localDateTime5.isAfter(localDateTime4));
        System.out.println("Is local date 5 before local date 4: " + localDateTime5.isBefore(localDateTime4));
        System.out.println("\n" + "\n" + "-------------" + "\n");

        int year = localDateTime5.getYear();
        System.out.println(localDateTime5);
        System.out.println(year);
        System.out.println(localDateTime5.getMonth());
        System.out.println(localDateTime5.getMonthValue());
        System.out.println(localDateTime5.getDayOfMonth());
        System.out.println(localDateTime5.getHour());
        System.out.println(localDateTime5.getMinute());
        System.out.println("\n" + "\n" + "-------------" + "\n");

        System.out.println(localDAteTime);
        System.out.println(localDAteTime.withHour(14).withMinute(0).withSecond(0).withNano(0));//arata valorile specificate
        System.out.println(localDAteTime.plusHours(12));//adauga la variabila .now
        System.out.println("\n" + "\n" + "-------------" + "\n");



    }
}
