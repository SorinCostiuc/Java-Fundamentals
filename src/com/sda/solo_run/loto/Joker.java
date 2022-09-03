package com.sda.solo_run.loto;

import java.util.Random;

public class Joker {
    public static void main(String[] args) {
        int numbers, joker = 0;
        Random rand = new Random();
        System.out.println("Numerele sunt: ");
        for (int i = 0; i < 5; i++) {
            numbers = rand.nextInt(45) + 1;
            System.out.print(numbers + " ");
        }
        System.out.println();
        System.out.println();
        joker = rand.nextInt(20) + 1;
        System.out.println("Joker: " + joker);

    }
}
