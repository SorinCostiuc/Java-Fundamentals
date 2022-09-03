package com.sda.java_fundamentals.dates;

import java.time.Instant;

public class InstantExamples {
    public static void main(String[] args) {
        System.out.println("\n" + "\n" + "-------------" + "\n");
        Instant instant = Instant.now(); //converteste valoarea la GMT
        System.out.println(instant + " ");
        System.out.println("\n" + "\n" + "-------------" + "\n");

//        System.out.println(Instant.ofEpochSecond(LocalDateTime.now().toEpochSecond(ZoneOffset.UTC)));



    }
}
