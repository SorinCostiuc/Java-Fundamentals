package com.sda.solo_run.exercitii;

public class WeekOne {
    public static void main(String[] args) {
        System.out.println("\n" + "------------------------------" + "\n" + "ARRAY" + "\n" + "--------------------------------" + "\n");
        int[] arr = new int[5];
        //un array care poate contine 5 integers
        //fiecare este asezat intr-o pozitie fixa care se numeste index
        //pentru a simila o valoare unui index se scrie denumirea array, index-ul in paranteze patrate si valoarea lui
        arr[0] = 10;
        arr[1] = 11;
        arr[2] = 12;
        arr[3] = 13;
        arr[4] = 14;
        int sum = arr[2] + arr[4];
        System.out.println("Suma valorilor pozitiei 2 si 4 este: " + sum + ", dar cele 2 pozitii sunt " + arr[2] + " si " + arr[4] + ".");

        System.out.println("\n" + "-------------" + "\n");

        String[] myNames = {"A", "B", "C", "D"};
        System.out.println(myNames[2]);

        System.out.println("\n" + "-------------" + "\n");

        int[] intArr = new int[5];
        System.out.println(intArr.length);
        System.out.println("\n" + "-------------" + "\n");

        int[] myArr = {6, 42, 3, 7};
        int sumA = 0;
        for (int i = 0; i < myArr.length; i++) {
            sumA += myArr[i];
        }
        System.out.println(sumA);
        System.out.println("\n" + "-------------" + "\n");
        //enchanced for
        int[] primes = {1, 3, 5, 7};
        for (int t : primes) ;
        System.out.println("primes: " + primes[0]);
        System.out.println("\n" + "-------------" + "\n");
        System.out.println("\n" + "--------------------------------" + "\n" + "MATRIX" + "\n" + "--------------------------------" + "\n");
        int[][] sample = {{1, 2, 3}, {4, 5, 6}};
        int x = sample[0][1]; //[0]acceseaza prima matrice, [1]al doilea index
        int y = sample[1][2]; //[1]acceseaza a doua matrice, [2]al treilea index
        int mat = x + y;
        System.out.println("suma din matrice este: " + mat);
        System.out.println("\n" + "-------------" + "\n");

        int[][] myNextArr = {{1, 2, 3}, {4}, {5, 6, 7}};
        myNextArr[0][2] = 42; // schimba valoarea unui index
        int alpha = myNextArr[1][0];//transforma un index in variabila
        System.out.println("Nesting arrays: " + myNextArr[0][2] + alpha);
        System.out.println("\n" + "-------------" + "\n");

        int number = 2;
        switch (number) {
            case 1, 3, 5, 7, 9 -> System.out.println("I am the odd positive number");
            case 2, 4, 6, 8 -> System.out.println("I am an even positive number");
            default -> System.out.println("I'm not a positive odd number");
        }
        System.out.println("\n" + "--------------------------------" + "\n" + "LOOPS" + "\n" + "--------------------------------" + "\n");
        //FOR
        for (int l = 0; l < 3; l++) {
            System.out.println("Hello World!");
        }
        System.out.println("\n" + "-------------" + "\n");
        String[] array = {"We", "have", "a cat", "that", "we don't", "like"};
        for (String element : array) {
            System.out.print(element + " ");
        }
        System.out.println("\n" + "-------------" + "\n");
        //WHILE
        int m = 1;
        while (m < 3) {
            System.out.println("Hello World!");
            ++m;
        }
        System.out.println("\n" + "-------------" + "\n");
        //DO WHILE
        int k = 4; // cu while nu s-ar fi printat nimic daca valoarea lui k e 0, se printeaza de 3 ori
        do {
            System.out.println("I'm new to Java");
            ++k;
        } while (k < 3);
        System.out.println("\n" + "-------------" + "\n");
        //BREAK AND CONTINUE
        for (int n = 0; n < 10; n++) {
            System.out.println("Salutari din dreapta!");
            if (n == 1) {
                break;
            }
        }
        System.out.println("\n" + "-------------" + "\n");
        for (int o = 0; o < 5; o++) {
            if (o == 3) {
                continue;
            }
            System.out.println("Salutari din stanga!");
        }
        System.out.println("\n" + "-------------" + "\n");
        System.out.println("\n" + "--------------------------------------" + "\n" + "ARRAY" + "\n" + "--------------------------------------" + "\n");
        //ca schema este sub forma: type[] table name = new type[number of elements];
        //EX: String[] myArray = new String[10];
        /*daca nu se declara numarul de elemente, acestea se specifica individual sub forma: String[] array = new String[] {"Hello", "World", "!" };
         */
        /*exemple de ARRAY:
        int[] myNumbers = new int[5];
        int[] myNumbers2 = new int[]{1, 2, 3};
        String[] myStrings = new String[2];
        long[] myLongs = new long[3];
         */
        //daca nu se declara elementul, acestea vor avea valori default: 0 pentru numere si NULL pentru valori de referinta
        //EX: String[] forenames = new String[4]; // we have declared an empty 4-element array storing character strings, cu NULL:
        /*String[0] = null
        String[1] = null
        String[2] = null
        String[3] = null
        */
        String[] names = new String[4];
        names[0] = "John";
        names[3] = "romance";

        System.out.println("Element number 1: " + names[0]); // Element number 1: John
        System.out.println("Item number 2: " + names[1]); // Item number 2: null
        System.out.println("Item number 3: " + names[2]); // Item number 3: null
        System.out.println("Element number 4: " + names[3]); // Element number 4: romance
        //aceasta metoda este ineficienta si nu ofera un cod curat si simplu
        System.out.println("\n" + "-------------" + "\n");
        int tabLength = 4;
        String[] names2 = new String[tabLength];
        names2[0] = "John";
        names2[3] = "roman";

        for (int i = 0; i < tabLength; i++) {
            System.out.println("Element number " + (i + 1) + ": " + names[i]);
        }
        //sistem automatizat de printare a buclei folosind metoda FOR de printare a unui ARRAY
        System.out.println("\n" + "-------------" + "\n");
        System.out.println("\n" + "-------------" + "\n");
        System.out.println("\n" + "-------------" + "\n");
        //MATRICE

        //As we mentioned earlier, arrays can also store any object, not just simple types. There is therefore nothing to prevent an array from storing other arrays as well, as the array is also an object. Therefore, you can create two-, three- or multidimensional arrays. A two-dimensional array is nothing more than a structure containing rows and columns that store data.
        //The basic declaration and initialization of a two-dimensional array looks like this:
/*
java
        type [][][] name of the table; // table declaration
        table name = new type[number of rows][number of columns]; // table initialization
        type[][][] table name = new type[number of rows][number of columns]; // declaration and initialisation in one

 */
        String[][] myArray = new String[2][];
        myArray[0] = new String[]{"Alice", "has", "cat"}; // create the first line, i.e. with index number 0
        myArray[1] = new String[]{"Cat", "has", "Alice"}; // create a second line, i.e. with index number 1
        System.out.println(myArray[0][0]); // Alice - R1 C1
        System.out.println(myArray[0][2]); // cat - R1 C3
        System.out.println(myArray[1][1]); // has - R2 C2
        System.out.println(myArray[1][2]); // daca punem 3 va fi Error! The java.lang.ArrayIndexOutOfBoundsException will be thrown. Alice - R2 C3
        System.out.println("\n" + "-------------" + "\n");
        //NESTING FOR
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n" + "-------------" + "\n");
        System.out.println("\n" + "-------------" + "\n");
        System.out.println("\n" + "-------------" + "\n");
        System.out.println("\n" + "--------------------------------------" + "\n" + "PROBE" + "\n" + "--------------------------------------" + "\n");
        System.out.println("\n" + "-------------" + "\n");
        System.out.println("\n" + "-------------" + "\n");
        System.out.println("\n" + "-------------" + "\n");
        //loop increment
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n" + "-------------" + "\n");
        //loop decrement
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n" + "-------------" + "\n");
        //operatii in loop
        for (int i = 1; i <= 10; i++) {
            System.out.println("i=" + i + "," + "\t" + "i^2=" + (i * i));
        }
        System.out.println("\n" + "-------------" + "\n");
        //adunarea numerelor din loop
        int sumAb = 0;
        for (int i = 1; i <= 10; i++) {
            sumAb += i;
        }
        System.out.println("Suma numerelor = " + sumAb);
        System.out.println("\n" + "-------------" + "\n");
        //adunare in loop folosind conditionare
        int sumAbc = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) { // numerele pare
                sumAbc += i; //adunarea numerelor pare
            }
        }
        System.out.println("Sum of even numbers = " + sumAbc);
        System.out.println("\n" + "-------------" + "\n");
        //Example of a loop with a step incremented by 5
        for (int i = 5; i <= 10; i = i + 5) {
            System.out.print(i + " ");
        }
        System.out.println("\n" + "-------------" + "\n");

        // Example of a loop using the break statement
        int sumBreak = 0;
        int count = 0;
        for (int a = 1; a <= 200; a++) {
            sumBreak += a;
            count++;
            if (sumBreak >= 50) {//cand ajunge la o valoare peste 50...bucla se opreste
                break;
            }
        }
        System.out.println("Sum = " + sumBreak);
        System.out.println("Number of summed values = " + count);

        System.out.println("\n" + "-------------" + "\n");
        //Example of a loop using the continue statement
        for (int b = 1; b <= 20; b++) {
            if (b >= 13 && b <= 15) {////sare peste numerele 13, 14 si 15
                continue;
            }
            System.out.print(b + " ");
        }
        System.out.println("\n" + "-------------" + "\n");
        System.out.println("\n" + "-------------" + "\n");
        //The (enhanced) for loop
       /* for (<variable> : <collection/array>) {
            // oparations
        }*/
        int[] digits = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int s : digits) {
            System.out.print(s + " ");
        }
        /*
        This loop type is very convenient when you want to view the entire collection or array
        and you do not care about controlling how to do it, i.e. on defining the scope and order
        of the elements to which you want to have access.
         */
        System.out.println("\n" + "-------------" + "\n");


        //Example of the for each loop with its own counter
        System.out.println("\n" + "-------------" + "\n");
        int[] digitsA = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 24, 35, 12349};
        int oddCount = 0;
        int allCount = 0;
        int evenCount = 0;
        for (int i : digitsA) {
            allCount++;
            if (i % 2 != 0) {
                oddCount++;
                System.out.println(i + " is odd");
            }
            if (i % 2 == 0) {
                evenCount++;
                System.out.println(i + " is even");
            }
        }
        System.out.println("Count: all=" + allCount + ", odd=" + oddCount + ", even=" + evenCount);
        System.out.println("\n" + "-------------" + "\n");

        //The while loop
        //The while loop is used most often when the number of repetitions is not known in advance, but you know the condition that must be met for the loop.
        System.out.println("\n" + "-------------" + "\n");
        /*
        The while loop allows you to execute specific statements for as long as the logical condition for the loop is met (its value is true).
        Structure of the while loop
        while (<logical-condition>) {
        // operations
        }
         */
        int max = 10;
        int t = 1;
        while (t <= max) {
            System.out.print(t + " ");
            t++;
        }
        System.out.println("\n" + "-------------" + "\n");
        System.out.println("\n" + "-------------" + "\n");


        //The do while loop
        //The do while loop (similarly as the while loop) allows you to execute specific instructions as long as the logical condition for the loop is met (its value is true).
        /*
        Structure of the do while loop
        do {
        // operations
        } while (logical-condition>);
         */
        //Unlike the while loop, the do while loop will always be executed at least once, even if the logical condition is not met at the beginning.
        do {
            System.out.println("Java is great!!!");
        } while (false);
        System.out.println("\n" + "-------------" + "\n");
        System.out.println("\n" + "-------------" + "\n");
        System.out.println("\n" + "-------------" + "\n");
        System.out.println("\n" + "-------------" + "\n");
        System.out.println("\n" + "--------------------------------------" + "\n" + "NESTED LOOPS" + "\n" + "--------------------------------------" + "\n");
        System.out.println("\n" + "-------------" + "\n");
        for (int i = 1; i <= 3; i++) {//outer loop - it loops 10 times; it is responsible for generating individual lines
            for (int j = 1; j <= 10; j++) {//internal loop - it loops 20 times; it is responsible for generating individual characters in the line
                System.out.print("*");//the print() method prints the * character as many times as the inner loop is executed
            }
            System.out.println();
        }
        System.out.println("\n" + "-------------" + "\n");
        //draw a checkboard
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 50; j++) {
                if ((i % 2 == 0 && j % 2 == 1) || (i % 2 == 1 && j % 2 == 0)) { //daca i par si 7 impar SAU i impar si j par, se va printa #
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("\n" + "-------------" + "\n");
        System.out.println("\n" + "-------------" + "\n");

        //Summary
        /*
There are several types of loops available:
    for
    (enhanced) for
    while
    do while
 - When should you use the for loop and when the while / do while loop?
 - We use the for loop most often when we know the number of elements or the number of repetitions of a given statement. In addition, we use it when we want to have an (easy) access to the loop counter. We use the while / do while loop when we do not know in advance how many times we will iterate since it depends on some factor.
 - What is the difference between the for loop and the (enhanced) for loop?
 - The for loops allows you to declare the iteration method by controlling the loop count. If we want only to go through a given set (without probing into the iteration method), we choose the for (enhanced loop that is also called the foreach loop).
 - What is the difference between the while loop and do while loop?
 - The do while loop will always be executed at least once, even if the logical condition is false at the beginning; the while loop will not be executed in this case.
         */


        int z = 6;
        addOneTo(z);
        System.out.println(z);
        System.out.println("\n" + "-------------" + "\n");
        System.out.println("\n" + "-------------" + "\n");

    }

    static void addOneTo(int num) {
        num = num + 1;
    }


}



