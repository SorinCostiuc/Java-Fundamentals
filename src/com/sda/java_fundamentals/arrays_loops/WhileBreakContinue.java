package com.sda.java_fundamentals.arrays_loops;

public class WhileBreakContinue {
    public static void main(String[] args) {
        // for (int i=0; i<10; i++)

        System.out.println("\n" + "--------------------------------" + "\n" + "WHILE" + "\n" + "--------------------------------" + "\n");

        int o = 0;
        while (o < 10) {
            System.out.println("test - " + o);
            o++;
        }
        System.out.println(" ");
        System.out.println("----------------------");

        System.out.println("\n" + "--------------------------------" + "\n" + "DO WHILE" + "\n" + "--------------------------------" + "\n");

        int p = 12;//se face cel putin o data indiferent de conditie
        do {
            System.out.println("iteration - " + p);
            p++;
        } while (p < 10);
        System.out.println("\n" + "--------------------------------" + "\n" + "BREAK" + "\n" + "--------------------------------" + "\n");
        //gasim primul par
        int[] intArray = new int[]{1, 3, 5, 7, 8, 10, 11, 14};
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 == 0) {
                System.out.println("Am gasit un numar par: " + intArray[i]);
                break;
            }
        }
        int[][] matrix = {
                {10, 11, 43, 55, 7},
                {2, 5, 6, 9, 9},
                {101, 22, 2, 6, 8},
                {10, 21, 8, 11, 14},
                {15, 11, 16, 4, 6}
        };
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("i: " + i);
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("j: " + j);
                break;

            }
        }
        System.out.println("\n" + "--------------------------------" + "\n" + "CONTINUE" + "\n" + "--------------------------------" + "\n");
        for (int i = 0; i < 10; i++) {
            if (i == 8) {
                continue;
            }
            System.out.println("Salutare " + i);
        }


    }
}
