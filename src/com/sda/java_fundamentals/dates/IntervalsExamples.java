package com.sda.java_fundamentals.dates;

import java.time.*;
import java.time.LocalTime;



public class IntervalsExamples {
    public static void main(String[] args) {
        System.out.println("\n" + "\n" + "-------------" + "\n");
        ///pentru ore, minute, secunde
        Duration duration = Duration.ofHours(5);
        System.out.println("durations: " + duration);
        System.out.println("chained duration operations: " + duration.plusHours(1).plusMinutes(10).plusSeconds(15));
        Duration durationToSubstract = duration.ofMinutes(15);
        System.out.println("substacting other durations: " + duration.minus(durationToSubstract));
        System.out.println("\n" + "\n" + "-------------" + "\n");


        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(Duration.between(localDateTime, localDateTime.plusHours(10)));
        System.out.println("\n" + "\n" + "-------------" + "\n");

        System.out.println("with 10 minutes: "+localDateTime.plus(Duration.ofMinutes(10)));
        System.out.println("with 10 minutes: "+localDateTime.plusMinutes(10));
        System.out.println(LocalTime.now().plus(Duration.ofHours(3)));

        System.out.println("\n" + "\n" + "-------------" + "\n");
        System.out.println("Exemple 1: " + Duration.between(LocalDateTime.now(), LocalDateTime.now().plusYears(1)));
        System.out.println("Exemple 2: " + Period.between(LocalDate.now(), LocalDate.now().plusYears(1)));




        System.out.println("\n" + "\n" + "-------------" + "\n");
        System.out.println("\n" + "\n" + "-------------" + "\n");
        System.out.println("\n" + "\n" + "-------------" + "\n");

        ///pentru nai, lune, zile
        Period period = Period.of(1, 1, 1);
        System.out.println("period: " + period);
        System.out.println("chained period operations: " + period.plusDays(7).plusMonths(2).plusYears(1));
        System.out.println("adding other period " + period.plus(Period.of(1, 1, 1)));
        System.out.println("\n" + "\n" + "-------------" + "\n");

        System.out.println(Period.between(LocalDate.now(), LocalDate.now().plusMonths(3).plusDays(5)));


        System.out.println("\n" + "\n" + "-------------" + "\n");
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        System.out.println(localDate.plus(Period.ofWeeks(1)));
        System.out.println(localDate.minus(Period.ofDays(6)));
        System.out.println("---");

        localDate=localDate.plus(Period.ofWeeks(1));
        System.out.println(localDate);
        System.out.println(localDate.minus(Period.ofDays(6)));
        System.out.println(localDate);

    }
}
