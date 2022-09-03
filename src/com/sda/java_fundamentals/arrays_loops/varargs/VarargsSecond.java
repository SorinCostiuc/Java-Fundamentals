package com.sda.java_fundamentals.arrays_loops.varargs;

public class VarargsSecond {
    public static void main(String[] args) {
//        printNo(new String[]{});

        printVal("val", "val2");
        printValWithVarargs(); // before si after
//        printValWithVarargs("test");
//        printValWithVarargs("test", "test2");
//        printValWithVarargs("test", "test2", "test3", "test4", "test5");

    }

    public static void printVal(String val, String val2) {
        System.out.println(val);
        System.out.println(val2);
    }

    public static void printValWithVarargs(String... input) {
        System.out.println("before");
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }
        System.out.println("after");
    }

    //cand array-ul este gol, nu se va intra in for deloc
    public static void printNo(String[] strings) {
        System.out.println("before");
        for (int i = 0; i < strings.length; i++) { //i=0; strings.lenth=0; 0<0
            System.out.println(strings[i]);        //
        }                                          //
        System.out.println("after");
    }

}