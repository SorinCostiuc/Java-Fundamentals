package com.sda.solo_run.exercitii;


public class DeTestat {
    public static void main(String[] args) {
        String s = "My friend Dylan got distracted in school.";
        int replace = s.replaceAll("[^dD]", "").length();
        System.out.println(replace);
    }
}



