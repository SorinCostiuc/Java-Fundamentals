package com.sda.java_fundamentals.dates;


public class LocalTime {
    public static void main(String[] args) {
        java.time.LocalTime localTime = java.time.LocalTime.now();
        System.out.println(localTime);

        System.out.println("\n" + "\n" + "-------------" + "\n");

        java.time.LocalTime localTime1 = localTime.plusHours(3);
        System.out.println(localTime1);
        java.time.LocalTime localTime2 = localTime.plusMinutes(10);
        System.out.println(localTime2);
        java.time.LocalTime localTime3 = localTime.plusSeconds(33);
        System.out.println(localTime3);
        System.out.println("\n" + "\n" + "-------------" + "\n");
        java.time.LocalTime localTime4 = localTime.plusHours(3);
        System.out.println(localTime4);
        java.time.LocalTime localTime5 = localTime4.plusMinutes(10);
        System.out.println(localTime5);
        java.time.LocalTime localTime6 = localTime5.plusSeconds(33);
        System.out.println(localTime6);

        System.out.println("\n" + "\n" + "-------------" + "\n");

        java.time.LocalTime localTime7 = localTime.plusMinutes(120).minusSeconds(180).plusMinutes(10);
        System.out.println(localTime7);
        java.time.LocalTime localTime8 = localTime.plusMinutes(120);
        java.time.LocalTime localTime9 = localTime8.minusSeconds(180);
        java.time.LocalTime localTime10 = localTime9.plusMinutes(100);
        System.out.println(localTime10);
        System.out.println("\n" + "\n" + "-------------" + "\n");

        java.time.LocalTime l1 = java.time.LocalTime.now();
        java.time.LocalTime l2 = java.time.LocalTime.now().plusHours(1);
        System.out.println("l1: " + l1);
        System.out.println("l2: " + l2);
        System.out.println("l1 is after l2: " + l1.isAfter(l2));
        System.out.println("l1 is before l2: " + l1.isBefore(l2));
        System.out.println("\n" + "\n" + "-------------" + "\n");

        java.time.LocalTime specificLocalTime1 = java.time.LocalTime.of(18,15);
        java.time.LocalTime specificLocalTime2 = java.time.LocalTime.of(18,15,10);
        java.time.LocalTime specificLocalTime3 = java.time.LocalTime.of(18,15,10,100);
        System.out.println("Specific local time 1: " + specificLocalTime1);
        System.out.println("Specific local time 2: " + specificLocalTime2);
        System.out.println("Specific local time 3: " + specificLocalTime3);
        System.out.println("Modified specific local time 1: " + specificLocalTime1.plusSeconds(10));
        System.out.println("\n" + "\n" + "-------------" + "\n");




    }
}
