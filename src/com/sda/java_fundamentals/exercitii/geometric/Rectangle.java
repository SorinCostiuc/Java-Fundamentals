package com.sda.java_fundamentals.exercitii.geometric;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int calculatePerimeter() {
        return 2 * length + 2 * width;
    }

    public int calculateArea(){
        return length*width;
    }
}