package com.sda.java_fundamentals_coding;

import java.util.Scanner;

public class Task9_Wave {
    public static void main(String[] args) {
//        Write an application that will take a positive number from the user (type int) and draw a
//        wave with a given length and height of 4 lines, according to the following example (fill
//        empty spaces with spaces):
        //todo: de facut in matrice
        Scanner scanner = new Scanner(System.in);
        System.out.println("Imput wave length: ");
        int waveLength = scanner.nextInt();
        int waveHeight = 4;
        pattern(waveHeight, waveLength);
    }
//    static void pattern(int height, int length) {
//        int e = 2;
//        int x = 1;
//        for (int i = 0; i < height; i++) {
//            for (int j = height; j <= height + i; j++)
//                System.out.print(" ");
//            for (int count = 1; count <= length; count++) {
//                for (int n = (height + height - 2); n >= x; n--)
//                    System.out.print(" ");
//                for (int k = 1; k <= e; k++) {
//                    if (k == 1)
//                        System.out.print("*");
//                    else if (k == e)
//                        System.out.print("*");
//                    else
//                        System.out.print(" ");
//                }
//            }
//            x += 2;
//            e += 2;
//            System.out.println();
//        }
//    }

    static void pattern(int height, int length) {
        int x = height - 1;
        for (int i = 0; i <= height; i++) {
            for (int j = 0; j < height * length; j++) {
                if (j % (height * 2) == x || j % (height * 2) == height + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            x--;
            System.out.println();
        }
    }
}
