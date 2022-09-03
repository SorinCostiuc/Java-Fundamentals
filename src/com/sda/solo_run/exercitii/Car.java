package com.sda.solo_run.exercitii;


public class Car {
    private String color;
    private int maxSpeed;
    private String brand;

    public Car(String color, int maxSpeed, String brand) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.brand = brand;
    }
    public void printCarParameters() {
        System.out.println(String.format("Car color is: %s, max speed is: %d, car brand is: %s", color, maxSpeed, brand));
    }
}