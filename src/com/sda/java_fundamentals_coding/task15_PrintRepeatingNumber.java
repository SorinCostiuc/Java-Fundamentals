package com.sda.java_fundamentals_coding;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task15_PrintRepeatingNumber {
    public static void main(String[] args) {
//        Write an application that reads from the user 10 arbitrarily large numbers (variables of
//                type int) and prints those that occurred at least twice.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();

        }
        boolean visited[] = new boolean[10];
        for (int i = 0; i < 10; i++) {
            if (visited[i] == true) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < 10; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true; //
                    count++;
                }
            }
            if (count >= 2) {
                System.out.println(arr[i] + " - " + count);
            }

        }

        System.out.println("================Alternative solution==============");
        alternativeSolution(arr);
    }
    public  static void alternativeSolution(int[] scannedValues){
        Map<Integer,Integer> countsMap = new HashMap<>();
        int count;
        for (int readNumber : scannedValues) {
            if (countsMap.containsKey(readNumber)) {
                //Obtin numarul de citiri si il incrementez cu 1;
                count = countsMap.get(readNumber) + 1;
                //Actualizez valoarea din map
                countsMap.put(readNumber, count);
            } else {
                //Initializez in map cu 1 prida  data cand am intalnit nu numar nou (key noua)
                countsMap.put(readNumber, 1);
            }
        }

        for (Map.Entry<Integer,Integer> entry: countsMap.entrySet()){
            if (entry.getValue()>1){
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }
}
