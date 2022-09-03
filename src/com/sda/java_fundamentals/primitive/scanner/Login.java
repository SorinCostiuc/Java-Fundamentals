package com.sda.java_fundamentals.primitive.scanner;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String textLine = scan.nextLine();
//        System.out.println(textLine);
//
//        //citim pana userul spune selecteaza exist
//
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please add input");
//        String userInput = "";
//        while (!userInput.equals("exit")) {
//            userInput = scanner.nextLine();
//            System.out.println("user input: " + userInput);


        //vrem ca userul sa introduca prima data un username
        //i se cere o parola
        //se valideaza combinatia: "admin", "password"
        //cat timp nu este valida i se va cere iarasi sa introduca
        //cand este valid ii spunem "Bine ai venit"
        System.out.println("\n" + "--------------------------------" + "\n" + "Sistem de LOG IN" + "\n" + "--------------------------------" + "\n");
        Scanner scanner = new Scanner(System.in);

        String username = "";
        String password = "";


        do {
            System.out.println("Introdu username: ");
            username = scanner.nextLine();
            System.out.println("Introdu parola: ");
            password = scanner.nextLine();

            if (isUsernameAndPasswordWrong(username, password)) {
                System.out.println("Retry");
            }
        } while (isUsernameAndPasswordWrong(username,password));

        System.out.println("Bine ai venit");

    }

    private static boolean isUsernameAndPasswordWrong(String username, String password) {
        return !(username.equals("admin") && password.equals("password"));
    }
}

