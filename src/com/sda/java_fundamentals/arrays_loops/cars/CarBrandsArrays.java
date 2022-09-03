package com.sda.java_fundamentals.arrays_loops.cars;

import java.util.Arrays;

public class CarBrandsArrays {
    //avem diferite masini si vrem sa facem ceva comparatii
    public static void main(String[] args) {


//        String[] carBrands = new String[] {"Audi", "BMW", "BMW"};
//        String[] carTypes = new String[] {"A5", "X1", "X6"};
//        int[] carMaxKmPerHour = new int[] {350, 300, 320};
//        String[] carColours = new String[] {"gray", "black", "black"};
//        int[] carWeights = new int[] {2500, 3000, 3700};

        Car car1 = new Car();
        car1.brand = "Audi";
        car1.type = "A5";
        car1.maxKmPerHour = 350;
        car1.colour = "gray";
        car1.weightInKgs = 2500;
        Motor motor = new Motor();
        motor.fuelType = "gasoline";
        motor.capacity = 100;
        car1.motor = motor;
//        boolean isGas = Car.isGasoline(car1); //as static
        boolean isGas = car1.isGasoline();
        System.out.println("isGas: " + isGas);
        boolean isYellow = car1.doesColourMatch("yellow");
        System.out.println("isYellow: " + isYellow);
        System.out.println("isGray: " + car1.doesColourMatch("gray"));
        System.out.println("isOver 3500" + car1.isOverSpecifiedWeight(3500));


        Car car2 = new Car();
        car2.brand = "BMW";
        car2.type = "X1";
        car2.maxKmPerHour = 300;
        car2.colour = "black";
        car2.weightInKgs = 3000;
        Motor motor2 = new Motor();
        motor2.fuelType = "diesel";
        motor2.capacity = 100;
        car2.motor = motor2;
        System.out.println("isCar2Gray: " + car2.doesColourMatch("gray"));

        Car car3 = new Car();
        car3.brand = "BMW";
        car3.type = "X6";
        car3.maxKmPerHour = 320;
        car3.colour = "black";
        car3.weightInKgs = 3700;
        Motor motor3 = new Motor();
        motor3.fuelType = "gasoline";
        motor3.capacity = 130;
        car3.motor = motor3;


        //vreau sa printez toate masinile de tipul BMW
        Car[] cars = new Car[]{car1, car2, car3};
        for (int i = 0; i < cars.length; i++) {
            printBmwCars(cars[i]);
        }

        System.out.println("----------");
        //vreau sa printez toate masinile negre
        for (int i = 0; i < cars.length; i++) {
            printBlackCars(cars[i]);
        }

        System.out.println("----------");
        //vreau sa printez toate masinile cu o viteza maxima mai mare decat 320
        for (int i = 0; i < cars.length; i++) {
            printCarsWithOver320Speed(cars[i]);
        }

        System.out.println("----------");
        //vreau sa printez toate masinile cu o greutate mai mica de 3500 kg
        for (int i = 0; i < cars.length; i++) {
            cars[i].isOverSpecifiedWeight(3500);
        }

        //verifica daca motorul este pe benzina
        for (int i = 0; i < cars.length; i++) {
            System.out.println("car " + cars[i].type + " is gasoline? " + cars[i].isGasoline());
        }

//        Car heavierCar = Car.getHeavierCar(car1, car2);
//        System.out.println("Max km: " + heavierCar.maxKmPerHour);

        int maxKmPerHour = Car.getMaxKmPerHoursOfHeaviesCar(car1, car2);
        System.out.println("Max km: " + maxKmPerHour);
        // private method
        //

        //compare weight not using static
        int maxKmPerHourNotStatic = car1.getMaxKmPerHourNotStatic(car2);
        System.out.println("MaxKM: " + maxKmPerHourNotStatic);

    }

    public static void printBmwCars(Car car) {
        if (car.brand.equals("BMW")) {
            System.out.println("The " + car.type + " car is " + car.brand);
        }
    }

    public static void printBlackCars(Car car) {
        if (car.colour.equals("black")) {
            System.out.println("The " + car.type + " is black");
        }
    }

    public static void printCarsWithOver320Speed(Car car) {
        if (car.maxKmPerHour > 320) {
            System.out.println("The " + car.type + " has " + car.maxKmPerHour);
        }
    }


}
