package com.sda.java_fundamentals.primitive.regexes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        //todo a{,3} not working, why?

        String patternString = "[a-zA-Z]+[0-9]+[!]+";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher("afdsaf3211!");
        System.out.println(matcher.matches());

        String s = "testing";
        System.out.println(s.replaceAll("[a-z]", "z"));

    }
}