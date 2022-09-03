package com.sda.java_fundamentals.exercitii;

public class Week1ArrayMatrixDifSums {
    public static void main(String[] args) {
        System.out.println("\n" + "--------------------------------" + "\n" + "First exercise" + "\n" + "--------------------------------" + "\n");
        //1) Given an array of float number [10.5, 12.1, 14.3, 5.21, 6.21, 10.9]
        float[] floatArr = new float[]{10.5F, 12.1F, 14.3F, 5.21F, 6.21F, 10.9F};
        //- calculate and print the total sum of the elements
        float sum = 0f;
        for (int z = 0; z < floatArr.length; z++) {
            sum += floatArr[z];
        }
        System.out.println("Total sum of elements: " + sum);
        System.out.println("\n" + "-------------" + "\n");
//- calculate and print the result of adding the first element and subtracting the next, meaning the operation should be: 10.5 - 12.1 + 14.3 - 5.21 + 6.21 - 10.9
        float res = 0f;
        for (int x = 0; x < floatArr.length; x++) {
            if (x % 2 == 0) {
                res += floatArr[x];
            } else {
                res -= floatArr[x];
            }
        }
        System.out.println("Sum of adding and subtracting elements: " + res);
        System.out.println("Sum of adding and subtracting elements: " + Math.floor(res * 100) / 100);
        System.out.println("\n" + "-------------" + "\n");
        //- calculate and print the difference between the first and last element of the array: 10.5 - 10.9
        float res1 = floatArr[0] - floatArr[floatArr.length - 1];
        System.out.println("Sum of subtracting first and last elements: " + res1);
        System.out.println("Sum of subtracting first and last elements: " + +Math.floor(res1 * 100) / 100);
        System.out.println("\n" + "-------------" + "\n");
        //- calculate and print the number of values found that are grater than 9
        System.out.print("Values greater than 9 are: ");
        float val = 0;
        for (int i = 0; i < floatArr.length; i++) {
            if (floatArr[i] > 9) {
                System.out.print(floatArr[i] + " ");
            }

        }
        System.out.println("\n" + "\n" + "-------------" + "\n");
        //- calculate and print the product of all elements in the array, but iteration has to be done using a while
        float prod = 1;
        int p = 0;
        while (p < floatArr.length) {
            prod *= floatArr[p];
            p++;
        }
        System.out.println("Product of elements using WHILE is: " + prod);
        System.out.println("\n" + "\n" + "-------------" + "\n");
        System.out.println("\n" + "--------------------------------" + "\n" + "Second exercise" + "\n" + "--------------------------------" + "\n");

// Given the following array of chars ['a', 'n', 'a', 'a', 'r', 'e', 'm', 'e', 'r', 'e'] print the number of occurrences of the letter 'a'
        System.out.print("The A char appears: ");
        char[] charArr = new char[]{'a', 'n', 'a', 'a', 'r', 'e', 'm', 'e', 'r', 'e'};
        int counter = 0;
        for (int b = 0; b < charArr.length; b++) {
            if (charArr[b] == 'a') {
                counter++;
            }
        }
        System.out.println(counter + " " + "times");

        System.out.println("\n" + "\n" + "-------------" + "\n");
        System.out.println("\n" + "--------------------------------" + "\n" + "Third exercise" + "\n" + "--------------------------------" + "\n");
        //3) Given the following array of String ["The", "only", "way", "to", "learn", "a", "new", "programming language", "is", "by writing programs in it"]
        String[] arrPhrase = new String[]{"The", "only", "way", "to", "learn", "a", "new", "programming language", "is", "by writing programs in it"};
        //	- print the array as a single phrase with a dot at the end: The only way to learn a new programming language is by writing programs in it.
        int n = 0;
        for (int d = 0; d < arrPhrase.length; d++) {
            System.out.print(arrPhrase[d]);
            if (d != arrPhrase.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.print(".");
        System.out.println("\n" + "\n" + "-------------" + "\n");
//	- calculate the total number of letters in the entire array (Hint: to get the number of letters of a String, you can use the .length() method, Ex String s = "The"; and if we call s.length() we will receive the number 3
        int sumChar = 0;
        int sumSpace = 0;
        for (int i = 0; i < arrPhrase.length; i++) {
            String stringValue = arrPhrase[i];
            sumChar += stringValue.length();
            for (int j = 0; j < stringValue.length(); j++) {
                if (stringValue.charAt(j) == ' ') {
                    sumSpace++;
                }

            }
        }
        System.out.println("Total sum of characters is: " + sumChar);
        System.out.println("Total sum of characters without spaces : " + (sumChar - sumSpace));
        System.out.println("\n" + "\n" + "-------------" + "\n");
        System.out.println("\n" + "--------------------------------" + "\n" + "Fourth exercise" + "\n" + "--------------------------------" + "\n");
     /*
        4) Given the following matrix:
        10	11	43	55	7
        2	5	6	9	9
        101	22	2	6	8
        10	21	8	11	14
        15	11	16	4	6
       */
        int[][] matrix = {
                {10, 11, 43, 55, 7},
                {2, 5, 6, 9, 9},
                {101, 22, 2, 6, 8},
                {10, 21, 8, 11, 14},
                {15, 11, 16, 4, 6}
        };

        //Calculate the sum of all even numbers on the main diagonal and the sum of all prime elements on the secondary diagonal (or use odd instead of prime if not able to determine prime).

        int firstDiag = 0, secondDiag = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int valueAtPosition = matrix[i][j];
                if (i == j && valueAtPosition % 2 == 0) {
                        firstDiag += valueAtPosition;

                }
                if ((i + j) == (matrix.length - 1)) {
                    if (isPrimeNumber(valueAtPosition)) {
                        secondDiag += valueAtPosition;
                    }

                }
            }
        }
        System.out.println("The sum of main diagonal even numbers of the matrix is: " + firstDiag);
        System.out.println("The sum of secondary diagonal prime elements of the matrix is: " + secondDiag);
        //Main diagonal (or primary) is formed from 10, 5, 2, 11, 6 - the sum will be 10 + 2 + 6
        //Secondary diagonal is 7, 9, 2, 21,15 - the sum of prime elements will be 7 + 2
    }

    public static boolean isPrimeNumber(int i) {
        int verifNumb = 0;
        int j = 1;

        while (j <= i) {
            if (i % j == 0) {
                verifNumb++;
            }
            j++;
        }
        return (verifNumb == 2);
    }
}

        //SAU:
        /*
        boolean isPrime = true;
        for (int k=2; k<valueAtPosition); k++{
        if(valueAtPosition % k == 0){
        isPrime = false;
        }
        }
         */

