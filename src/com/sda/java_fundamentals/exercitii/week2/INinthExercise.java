package com.sda.java_fundamentals.exercitii.week2;

public class INinthExercise {
    public static void main(String[] args) {
//        9) Write a method which converts kilometers to miles, returning the result. Write another method which converts miles to kilometers, returning the result.
//        Scanner scanner = new Scanner(System.in);
        float km = 10;
        float miles = 6;
//        System.out.print("Enter distance: ");
//        distance = scanner.nextFloat();
        System.out.println(km + " km converted to miles is: " + convertToMiles(km));
        System.out.println(miles + " miles converted to km is: " + convertToKm(miles));
    }

    public static float convertToMiles(float no) {
//        1 mile = 1609.344 / 1.609344 km
        float km = 1;
        float mile = km / 1.609344F;
        float miles = (mile * no);
        return miles;
    }

    public static float convertToKm(float no) {
//        1 mile = 1609.344 / 1.609344 km
        float km = 1 * 1.609344F;
        float kilometers = (km * no);
        return kilometers;
    }
}
