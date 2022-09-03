package com.sda.java_fundamentals_coding;

import java.util.Scanner;

public class Task2_BMI {
    public static void main(String[] args) {
//        Task 2.
//        Write an application calculating BMI (Body Mass Index) and checking if it’s optimal or not.
//        Your application should read two variables: weight (in kilograms, type float) and height
//        (in centimeters, type int). BMI should be calculated given following formula:
//        The optimal BMI range is from 18.5 to 24.9, smaller or larger values are non-optimal
//        values. Your program should write "BMI optimal" or "BMI not optimal", according to the
//        assumptions above.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight in kg: ");
        float weight = scanner.nextFloat();
        System.out.println("Enter your height in cm: ");
        int height = scanner.nextInt();
        calculateBMI(weight, height);
    }

    public static void calculateBMI(float weight, int height) {
        float bmi = (100 * 100 * weight) / (height * height);
        if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("BMI optimal" + bmi);
        } else {
            System.out.println("BMI not optimal" + bmi);
        }
    }
}
