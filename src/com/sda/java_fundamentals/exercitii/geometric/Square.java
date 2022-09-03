package com.sda.java_fundamentals.exercitii.geometric;
public class Square {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int calculatePerimeter() {
        return 4 * side;
    }

    public int calculateAria() {
        return side * side;
        // math.pow(side, 2) - dar aici e double
    }
}