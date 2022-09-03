package com.sda.java_fundamentals_coding;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3_QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first coefficient");
        int firstCoefficient = readValue(scanner);
        System.out.println("Enter second coefficient");
        int secondCoefficient = readValue(scanner);
        System.out.println("Enter third coefficient");
        int thirdCoefficient = readValue(scanner);

        float delta = secondCoefficient * secondCoefficient - 4 * firstCoefficient*thirdCoefficient;
        if (delta < 0) {
            System.out.println("Delta negative");
        } else {
            double x1 = (-secondCoefficient - Math.sqrt(delta)) / (2 * firstCoefficient);
            double x2 = (-secondCoefficient + Math.sqrt(delta)) / (2 * firstCoefficient);
            System.out.println("X1 is " + x1 + " and X2 is " + x2);
        }
    }

    private static int readValue(Scanner scanner) {
        int firstCoefficient;
        while (true) {
            try {

                System.out.println("Type coefficient");
                firstCoefficient = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid value");
                scanner.next();
                continue;
            }
        }
        return firstCoefficient;
    }
}
