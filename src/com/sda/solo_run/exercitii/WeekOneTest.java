package com.sda.solo_run.exercitii;

import java.util.Scanner;

public class WeekOneTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti textul aici: ");
        String text = scanner.nextLine();
        System.out.println("Textul introdus: " + text);
        char[] arr = text.toCharArray();
        System.out.print("Rezultatul dumneavoastra este: ");
        //your code goes here
        for(int i=text.length()-1;i>=0;i--)//inverseaza cuvantul introdus
        {
            System.out.print(text.charAt(i));
        }
    }
}

