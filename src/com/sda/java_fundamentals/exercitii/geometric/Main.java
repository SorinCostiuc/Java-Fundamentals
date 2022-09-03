package com.sda.java_fundamentals.exercitii.geometric;

import java.util.Scanner;

public class Main {
    //figuri geometrice
    //patrat/dreptunghi/cerc
    //calculam perimetrul, aria pt un obiect
    //ni se da un array de fiecare tip de figura geometrica, calculam suma total a perimetrelor


    public static void main(String[] args) {
        //calculam perimetrul unui patrat
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add the square side value: ");
        int side = scanner.nextInt();
        Square square = new Square(side);
        System.out.println("Square perimeter: " + square.calculatePerimeter());
        System.out.println("Square area: " + square.calculateAria());

        //calculam la cerc
        System.out.println("----------------------------------------");
        Circle circle = new Circle(3);
        System.out.println("Circle perimeter: " + String.format("%.2f", circle.calculatePerimeter()));
        System.out.println("Circle area: " + String.format("%.2f", circle.calculateArea()));

        //calculam la dreptunghi
        System.out.println("----------------------------------------");
        Rectangle rectangle = new Rectangle(5, 6);
        System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Rectangle area: " + rectangle.calculateArea());

// calculam suma totala a perimetrelor unui array de dreptunghiuri
// calculam media aritmetica a ariilor
        Rectangle rectangle1 = new Rectangle(5, 10);
        Rectangle rectangle2 = new Rectangle(2, 3);
        Rectangle rectangle3 = new Rectangle(7, 11);
        Rectangle rectangle4 = new Rectangle(1, 2);

        Rectangle[] rectangleArr = new Rectangle[]{rectangle1, rectangle2, rectangle3, rectangle4};
        int sumOfPerimeters = 0;
        double averageOfAreas = 0;
        for (int i = 0; i < rectangleArr.length; i++) {
            sumOfPerimeters += rectangleArr[i].calculatePerimeter();
            averageOfAreas += rectangleArr[i].calculateArea();
        }
        System.out.println("----------------------------------------");
        System.out.println("Sum of all perimeters " + sumOfPerimeters);
        System.out.println("Average of areas: " + String.format("%.2f", (averageOfAreas / rectangleArr.length)));

    }
}