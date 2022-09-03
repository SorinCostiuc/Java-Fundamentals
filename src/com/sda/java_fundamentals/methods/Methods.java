package com.sda.java_fundamentals.methods;

public class Methods {
    public static void main(String[] args) {
        //
        //se foloseste la spargerea flow-ului in bucati mai mici pentru vizibilitate
        //reutilizarea codului
        int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        calculateAndPrintSumOfEvenNumbers(intArray);
//        int sum = 0;
//        for (int i = 0; i < intArray.length; i++) {
//            if (intArray[i] % 2 == 0) {
//                sum += intArray[i];
//            }
//        }
//        System.out.println("Sum of even numbers is: " + sum);
        System.out.println("----------------------");
        int[] intArray2 = new int[]{11, 12, 13, 14, 15, 16, 17, 18, 19};
        calculateAndPrintSumOfEvenNumbers(intArray2);
//        int sum2 = 0;
//        for (int i = 0; i < intArray2.length; i++) {
//            if (intArray2[i] % 2 == 0) {
//                sum2 += intArray2[i];
//            }
//        }
//        System.out.println("Sum of even numbers on second array is: " + sum2);
        System.out.println("----------------------");
        int[] intArr3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        calculateAndPrintSumOfEvenNumbers(intArr3);

        System.out.println("----------------------");
        float[] floatArr = new float[]{1.2f, 2.3f, 4.2f};
//        calculateAndPrintSumOfEvenNumbers(floatArr); - tb facuta metoda pentru float
        floatSUM(floatArr);

        System.out.println("----------------------");
        System.out.println("test");



    }

    //aici se pune metoda

    public static void calculateAndPrintSumOfEvenNumbers(int[] intArr) {
        int sum = 0;
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] % 2 == 0) {
                sum += intArr[i];
            }
        }
        System.out.println("Sum of even numbers is: " + sum);
    }


    public static void floatSUM(float[] intArr) {
        int sum = 0;
        for (int i = 0; i < intArr.length; i++) {
   //         if (intArr[i] % 2 == 0) {
                sum += intArr[i];
            }
  //      }
        System.out.println("Sum of float numbers is: " + sum);
    }
}
