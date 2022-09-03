package com.sda.java_fundamentals.methods;

public class SimplerMethodsTwo {
    public static void main(String[] args) {
        int[] intArr = new int[]{2, 4, 8, 10, 100, 99, 56};
        //vrem sa printam suma pana la primul numar impar
//        int sum = sumUntilFirstOddNo(intArr);
//        System.out.println(sum);

//        int[] intArr2 = new int[]{2, 4, 8, 10, 100, 99, 56};
//        sumUntilFirstOddNo(intArr2);
//
//
//        sumUntilFirstOddNo(new int[]{2, 4, 8, 10, 100, 99, 56});

//        printSum(10, 11);
        printSum(9, 1600);

    }

    public static int sumUntilFirstOddNo(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            } else {
                return sum;
            }
        }

        return sum;
    }

    public static boolean case1(int a) {
        return a % 2 == 0;
    }

    public static boolean case2(int a) {
        if (a > 10) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean case3(int a) {
        if (a > 10) {
            return true;
        }

        if (a < 8) {
            return false;
        }

        return false;
    }

    public static int sumOfArrElements(int[] arrEl) {
        if (arrEl.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < arrEl.length; i++) {
            sum += arrEl[i];
        }

        return sum;
    }

    public static void printSum(int firstValue, int secondValue) {
        if (firstValue > 10) {
            return;
        }


        int sum = firstValue + secondValue;
        System.out.println("sum: " + sum);

        if (sum > 1000) {
            return;
        }

        System.out.println(secondValue);
    }
}
