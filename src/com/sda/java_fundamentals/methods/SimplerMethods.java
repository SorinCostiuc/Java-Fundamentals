package com.sda.java_fundamentals.methods;

public class SimplerMethods {
    public static void main(String[] args) {

        int no1 = 10;
        int no2 = 11;
//        int sum = no1 + no2;
//        System.out.println("Sum: " + sum);
        printSum(no1, no2);

        int no3 = 15;
        int no4 = 11;
//        int sum2 = no3 + no4;
//        System.out.println("Sum: " + sum2);
        printSum(no3, no4);

        int no5 = 22;
        int no6 = 33;
//        int sum3 = no5 + no6;
//        System.out.println("Sum: " + sum3);
        printSum(no5, no6);

        System.out.println("----------------------");
        printFirstThenNumbers();
        System.out.println("----------------------");
        printFirstNNnumbers(5);
        System.out.println("----------------------");
        printFirstNNnumbers(3);
        System.out.println("----------------------");

        float f1 = 5.6f;
        int i1 = (int) f1;
        printFirstNNnumbers(i1); // merge si cu casting: printFirstNNnumbers((int)f1);

        System.out.println("----------------------");

        printSumOfFloats(10.3f, 11.5f);
        System.out.println("----------------------");
        System.out.println("\n" + "--------------------------------" + "\n" + "Methods returning value" + "\n" + "--------------------------------" + "\n");


        int a = 100;
        int b = 70;
        int sum = sum(a, b);
//        int sum = a+b;
        if (isNumberEven(sum)) {
            System.out.println("Suma este para");
        } else {
            System.out.println("Suma nu este para");
        }
        System.out.println("----------------------");
    }

    ///pot sa aiba acelasi nume dar parametrii separati - va recunoaste in main ce aparametru ii vom da si se va duce acutomat la metoda care trebuie
    public static void printSum(int firstValue, int secondValue) {  //intre () se dau parametrii: ce date primeste
        int sum = firstValue + secondValue;
        System.out.println("Sum: " + sum);
    }

    public static void printSumOfFloats(float firstValue, float secondValue) {  //intre () se dau parametrii: ce date primeste
        float sum = firstValue + secondValue;
        System.out.println("Sum of floats: " + sum);
    }

    public static void printFirstThenNumbers() {
        System.out.println("First 10 numbers");
        for (int i = 0; i < 10; i++) {
            System.out.println("Number - " + i);
        }
    }

    public static void printFirstNNnumbers(int n) {
        System.out.println("First " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;

    }

    public static boolean isNumberEven(int number) {
        return number % 2 == 0; // mult mai simplu
//        if (number % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
    }
}
