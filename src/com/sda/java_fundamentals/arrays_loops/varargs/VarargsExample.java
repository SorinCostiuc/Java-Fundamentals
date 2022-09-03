package com.sda.java_fundamentals.arrays_loops.varargs;

public class VarargsExample {
    public static void main(String[] args) {
        int a = 100;
        int b = 57;
//        int sumOfValue = sum(a, b);
//
//        System.out.println("Suma este: " + sumOfValue);

        int c = 5;
        int d = 5;
        int e = 100;
        int f = 100;

        int[] arrSum = new int[]{a, b, c, d, e, f};
        int total = 0;
        System.out.println(sumOfArray(arrSum));

        System.out.println(sumOfVarargs(a, b, c, d, e, f));

        int maxNo = findMaxNo(new int[]{10, 5, 8, 2, 33, 5});
        System.out.println("Max no: " + maxNo);

        System.out.println("Max no cu varargs: " + findMaxNoV(10, 5, 8, 2, 4, 5));


    }
                /////////METODE
    public static int sum(int firstValue, int secondValue) {
        return firstValue + secondValue;
    }


    public static int sumOfVarargs(int... varArg) { //nu trebuie declarat array dinainte
        int sum = 0;
        for (int i = 0; i < varArg.length; i++) {
            sum += varArg[i];
        }
        return sum;
    }

    public static int sumOfArray(int[] intArray) {
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }
        return sum;
    }

    public static int findMaxNo(int[] intArr) {
        if (intArr.length == 0) {
            //am arunca noi o exceptie
            return Integer.MIN_VALUE;
        }
        int max = intArr[0];
        for (int i = 1; i < intArr.length; i++) {
            if (intArr[i] > max) {
                max = intArr[i];
            }
        }
        return max;
    }

    public static int findMaxNoV(int firstValue, int... intArr) {
        if (intArr.length == 0) {
            //am arunca noi o exceptie
            return Integer.MIN_VALUE;
        }
        int max = intArr[0];
        for (int i = 1; i < intArr.length; i++) {
            if (intArr[i] > max) {
                max = intArr[i];
            }
        }
        return max;
    }

}
