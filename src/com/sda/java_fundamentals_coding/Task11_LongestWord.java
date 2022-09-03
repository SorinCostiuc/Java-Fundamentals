package com.sda.java_fundamentals_coding;

import java.util.Scanner;

public class Task11_LongestWord {
    public static void main(String[] args) {
//        Task 11.
//        Write an application that will read texts (variables of the String type) until the user gives
//        the text "Enough!" and then writes the longest of the given texts (not including the text
//                "Enough!"). If the user does not provide any text, write "No text provided".
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = scanner.nextLine();

        String maxword = "";

        if ("Enough!".equals(text)) {
            System.out.println("No text provided");
        }

        while ((!"Enough!".equals(text))) {
            if (text.length() > maxword.length()) {
                maxword = text;
            }
            text = scanner.nextLine();
        }
        System.out.println("The longest text of the given texts is: " + maxword);

      /*  String yourText = "";
        ArrayList<String> yourStrings = new ArrayList<>();

        while (!(yourText.equals("Enough!"))) {
            yourText = scanner.nextLine();
            yourStrings.add(yourText);
        }
        yourStrings.remove("Enough!");
        if (yourStrings.isEmpty()) {
            System.out.println("No text provided");
            return;
        }

        String largestString = yourStrings.get(0);
        for (String yourString : yourStrings) {
            if (yourString.length() > largestString.length()) {
                largestString = yourString;
            }
        }

        System.out.println(largestString);
       */

    }
}
