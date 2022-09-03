package com.sda.java_fundamentals.exercitii.week2;

import java.util.Scanner;

public class AFirstExercise {
    public static void main(String[] args) {
//        1) Write an application, that will read text (type `String`, representing web address) and verifies if the string is an url
//        Hint - starts with http;// or https://, Hint 2 - a method on String class can be used to check the begining of the string agains http or https
        Scanner scanner = new Scanner(System.in);
        String urlHttp = "";

        do {
            System.out.print("Enter web address: ");
            urlHttp = scanner.nextLine();

            if (isWorkingURL(urlHttp)) {
                System.out.println("Retry! Invalid web address");
            }
        } while (isWorkingURL(urlHttp));

        System.out.print("Accepted web address");

    }

    private static boolean isWorkingURL(String scanner) {
        return !(scanner.contains("http;//") || (scanner.contains("https://")));
    }
}
