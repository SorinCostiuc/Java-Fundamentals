package com.sda.java_fundamentals.exercitii.week2;


public class GSeventhExercise {
    public static void main(String[] args) {
//        7) Write a method that will take a variable number of arguments (all are `int`s) and return their average value (`float`)
        allAreInts(2, 3, 5);
    }

    public static void allAreInts(int... input) {
        float sum = 0;
        for (int numbers : input)
            sum += numbers;
        float average = (sum / input.length);

        System.out.println("The average value of input numbers is: " + average);
    }
}

