package com.sda.java_fundamentals.arrays_loops;

public class Array {

    public static void main(String[] args) {
        //este o structura de date care tine mai multe elemente

        int[] intArr = new int[]{55, 100, 1000};
        System.out.println(intArr);
        /* intArr
        // 0-> a (55)
        // 1-> b (100)
        // 2-> c (1000)
         */
        System.out.println(intArr[0]);
        System.out.println(intArr[1]);
        System.out.println(intArr[2]);

        System.out.println(" ");
        System.out.println("-------------");

        int[] emptyArr = new int[4];
        System.out.println(emptyArr[0]);
        System.out.println(emptyArr[1]);
        System.out.println(emptyArr[2]);
        System.out.println(emptyArr[3]);
        //   System.out.println(emptyArr[4]); // this will throw an exception

        String[] stringArr = new String[3];
        System.out.println(stringArr[0]);
        System.out.println("lenght: " + stringArr.length);

        System.out.println(" ");
        System.out.println("-------------");
        System.out.println(" ");
        System.out.println("-------------");

        int[] numberArr = new int[]{2, 5, 6, 7, 11, 14, 21, 25};
        System.out.println("number Arr lenght: " + numberArr.length);
        //FOR is the first type of loop
        for (int counter = 0; counter < numberArr.length; counter++) {
            System.out.println("inside the for loop " + counter + " - " + numberArr[counter]);

        }
        for (int counter = 0; counter < 3; counter++) {
            System.out.println("Doing stuff " + counter);
        }
        System.out.println(" ");
        System.out.println("-------------");

        int[] secondNumberArr = new int[]{2, 5, 6, 7, 11, 14, 21, 25};
        System.out.println("Second number Arr lenght: " + secondNumberArr.length);
        //FOR is the first type of loop
        for (int counter = 0; counter < numberArr.length; counter++) {
            System.out.println("inside the for loop " + counter + " - " + secondNumberArr[counter]);
        }
        for (int counter = 0; counter < secondNumberArr.length; counter++) {
            if (secondNumberArr[counter] % 2 == 0) {
                System.out.println("acest nuamr este par - " + secondNumberArr[counter]);
            }
        }
        System.out.println(" ");
        System.out.println("-------------");
        System.out.println(" ");
        System.out.println("-------------");

        //Ana are mere.
        String[] stringArr2 = new String[]{"Ana", "are", "mere"};
        for (int i = 0; i < stringArr2.length; i++) {
            System.out.print(stringArr2[i]);
            if (i != stringArr2.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println(".");
        System.out.println(" ");
        System.out.println("-------------");

        String[] nameArray = new String[4];
        nameArray[0] = "acest";
        nameArray[1] = "beta";
        nameArray[2] = "test";
        for (int i = 0; i < nameArray.length; i++) {
            System.out.println(nameArray[i]);
        }
        System.out.println(" ");
        //multi-dimensional arrays (matrici)
        // array [10, 50, 60, 12, 11]
        //multi-dimensional array
        //              [0 , 0]
        //              [0 , 0]
        //              [0 , 0]
        System.out.println("-------------");
        int[][] emptyMatrix = new int[3][2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("[" + i + "]" + "[" + j + "]" + "=" + emptyMatrix[i][j]);
            }

        }
        System.out.println("-------------");
        int[][] matrix = new int[3][];
        matrix[0] = new int[]{10, 7, 3, 2, 5};
        matrix[1] = new int[]{11, 23, 7, 22, 0};
        matrix[2] = new int[]{11, 77, 7, 22, 0};

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            //    sum += matrix[i][1]; //se poate si asa
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == 1) {
                    sum = sum + matrix[i][j];
                }
            }
        }
        System.out.println("sum: " + sum);
        System.out.println("-------------");
        System.out.println("-------------");

        //foreach or enhanced for
        String[] names = new String[]{"Dragos", "Bogdan", "Anca"};
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]);
            if (i != names.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.print(".");
        System.out.println("\n" + "-------------");
        for (String name : names) {
            System.out.println(name);
        }



    }

}
