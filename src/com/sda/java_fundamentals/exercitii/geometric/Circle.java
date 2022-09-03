package com.sda.java_fundamentals.exercitii.geometric;

public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public double calculateArea(){
        return Math.PI * Math.pow(radius, 2);
    }
}