package com.sda.java_fundamentals.conditional;

public class Main {

    public static void main(String[] args) {
        int a = 500;
        int b = 100;

        boolean condition = a / b == 5;
        if (condition){
            System.out.println("entered if ");
        }

        if (a <= b) {
            System.out.println("will not enter this if ever");
        }else {
            System.out.println("This will be executed");
        }

        System.out.println( );
        System.out.println("----------");

        a = 100;
        b = 100;
        if (a >= b){
            System.out.println("A este mai mare sau egal ca B");
        }else if (a == b) {
            System.out.println("A este egal B");
        }else {
            System.out.println("A nu este mai mare ca B");
        }

        System.out.println( );
        System.out.println("----------");

        a = 100;
        b = 200;
        int c = 100;
        if (a < b && b < c) {
            System.out.println("First if executed");
        } else if (a > b || b < c) {
            System.out.println("Second if executed");
        } else {
            System.out.println("Entered else");
        }
        System.out.println( );
        System.out.println("----------");

        //switch-uri
        String variable = "MALE";
        switch (variable){
            case "MALE":
                System.out.println("Sex was determined as male");
                break;
            case "FEMALE":
                System.out.println("sex was determined as female");
                break;
            default:
                System.out.println("Other sexes");
                break;
        }



    }


}

