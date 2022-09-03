package com.sda.java_fundamentals_coding;

import java.util.Scanner;

public class Task1_Circle_Perimeter {
    public static void main(String[] args) {
//        Task 1.
//        Write an application that will read diameter of a circle (variable of type float) and
//        calculate perimeter of given circle.
//        Firstly, assume π = 3.14. Later, use value of π from built-in Math class.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter diameter to calculate de perimeter of your circle");
        float diameter = scanner.nextFloat();
        System.out.println("Circle's perimetrer is " + calculateCirclePerimeter(diameter));
        System.out.printf("Circle's perimeter perimeter using PI in math class is: " + "%.2f", calculateCirclePerimeterWithMathClassAsPi(diameter));

    }

    public static float calculateCirclePerimeter(float d) {
        float pi = 3.14f;
        return pi * d;
    }

    public static double calculateCirclePerimeterWithMathClassAsPi(float d) {
        double pi = Math.PI;
        return pi * d;

    }
}
