package com.sda.java_fundamentals.exercitii.pizza_store;

import java.util.Arrays;

public class Utils {

    //ni se da un array si un element nou de adaugat in array
    //vrem sa se returneze un array nou care contine si elementul nou
    public static Pizza[] appendToArray(Pizza[] initialArray, Pizza newElement) {
        Pizza[] newArray = new Pizza[initialArray.length + 1];
        for (int i = 0; i < initialArray.length; i++) {
            newArray[i] = initialArray[i];
        }

        newArray[newArray.length - 1] = newElement;
        return newArray;
    }

    public static String[] appendToArray(String[] initialArray, String newElement) {
        String[] newArray = new String[initialArray.length + 1];
        for (int i = 0; i < initialArray.length; i++) {
            newArray[i] = initialArray[i];
        }

        newArray[newArray.length - 1] = newElement;
        return newArray;
    }


    public static int[] appendToArray(int[] initialArray, int newElement) {
        int[] newArray = new int[initialArray.length + 1];
        for (int i = 0; i < initialArray.length; i++) {
            newArray[i] = initialArray[i];
        }

        newArray[newArray.length - 1] = newElement;
        return newArray;
    }
}
