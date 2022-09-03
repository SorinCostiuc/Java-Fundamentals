package com.sda.java_fundamentals.arrays_loops.cars;

public class Car {
    String brand;
    String type;
    int maxKmPerHour;
    String colour;
    int weightInKgs;
    Motor motor;

    //this is an example of static method
//    public static boolean isGasoline(Car car) {
//        return car.motor.fuelType.equals("gasoline");
//    }

    public boolean isGasoline() {
        return this.motor.fuelType.equals("gasoline");
    }

    public boolean doesColourMatch(String colourToMatch) {
        return colour.equals(colourToMatch);
    }

    public boolean isOverSpecifiedWeight(int weightToCompare) {
        return weightInKgs > weightToCompare;
    }

    public static int getMaxKmPerHoursOfHeaviesCar(Car car1, Car car2) {
        Car heaviestCar = getHeavierCar(car1, car2);
        return heaviestCar.maxKmPerHour;
    }

    public int getMaxKmPerHourNotStatic(Car car) {
        if (this.weightInKgs >= car.weightInKgs) {
            return this.weightInKgs;
        } else {
            return car.weightInKgs;
        }
    }


//
//    public int getMaxKmPerHourNotStatic(Car car2) {
//        int result = compareWeight(car2);
//        if (result >= 0) {
//            return this.maxKmPerHour;
//        } else {
//            return car2.maxKmPerHour;
//        }
//    }
//
//    public int compareWeight(Car car) {
//        if (this.weightInKgs > car.weightInKgs) {
//            return 1;
//        } else if (this.weightInKgs == car.weightInKgs) {
//            return 0;
//        } else {
//            return -1;
//        }
//    }

    private static Car getHeavierCar(Car car1, Car car2) {
        // ternary if - ? :
        // return <conditie> ? <valoarea de return pe true> : <valoarea de return pe false
        return car1.weightInKgs >= car2.weightInKgs ? car1 : car2;

//        if (car1.weightInKgs >= car2.weightInKgs) {
//            return car1;
//        } else {
//            return car2;
//        }
    }


}
