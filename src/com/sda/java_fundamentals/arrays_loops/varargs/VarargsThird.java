package com.sda.java_fundamentals.arrays_loops.varargs;

public class VarargsThird {
    public static void main(String[] args) {
        print(5, 3,4,5);
    }

    public static void print(int a, int... input) {
        System.out.println("before");
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }
        System.out.println("after");
    }

    //will not compile, vararg has to be the last parameter
//    public static void printVals(int... input, int b) {
//        System.out.println("before");
//        for (int i = 0; i < input.length; i++) {
//            System.out.println(input[i]);
//        }
//        System.out.println("after");
//    }
}
