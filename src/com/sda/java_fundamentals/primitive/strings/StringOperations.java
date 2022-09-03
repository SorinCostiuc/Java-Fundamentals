package com.sda.java_fundamentals.primitive.strings;

public class StringOperations {
    public static void main(String[] args) {
        String s1 = " te st ";
        String s2 = "test2";

        String concat = s1 + s2;
        System.out.println(concat);

        String concat2 = s1.concat(s2);
        System.out.println(concat2);

        System.out.println("Length of string: " + s1.length());
        System.out.println("First string without trailing spaces: ." + s1.trim() + ".");
        System.out.println("Length of string without spaces: " + s1.trim().length());

        System.out.println("toUpper: " + s2.toUpperCase());
        System.out.println("toLower: " + s2.toLowerCase());


        String s3 = "We are working with java to exercise";
        System.out.println("Index of w: " + s3.indexOf('w'));
        System.out.println("Index of z: " + s3.indexOf('z'));


        String s4 = "test1 - test2 - test3 - test4 - test5";
        System.out.println(s4.replaceAll("-", "+"));
        System.out.println(s4.replaceFirst("-", "+"));
        System.out.println(s4.replaceAll("test", "abc"));

        //String is immutable - o instanta nu poate fi modificata dupa creere
        //Stringul mereu iti returneaza o instanta noua de string
        String a = "AsFfa".toUpperCase();
        String b = a.toLowerCase();
        System.out.println(a);
        System.out.println(b);

        //sa pargurgem stringul caracter cu caracter
        for (int i = 0; i < s4.length(); i++) {
            System.out.print(s4.charAt(i) + " ");
        }
        System.out.println("\n ------ ");
        char[] charArr = s4.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            System.out.print(charArr[i] + " ");
        }

        System.out.println("\n ------ ");
        String s5 = "Testing your code makes a life better for everyone";
        System.out.println("substring: " + s5.substring(5));
        System.out.println("substring: " + s5.substring(5, 6));

        String[] stringArr = new String[]{"adsa", "bvcbc", "adsa", "aaa"};
        for (int i = 0; i < stringArr.length; i++) {
            if (stringArr[i].startsWith("ad")) {
                System.out.println(stringArr[i]);
            }
        }

        String emptyString = "";
        String stringWithOneSpace = " ";
        System.out.println("Is string empty: " + emptyString.isEmpty());
        System.out.println("Is string empty: " + emptyString.isBlank());
        System.out.println("Is string empty: " + stringWithOneSpace.isEmpty());
        System.out.println("Is string empty: " + stringWithOneSpace.isBlank());

        System.out.println("    .fd saf.  ".strip());//tratarea caracterului special u2001
        System.out.println("    .fd saf.   ".trim());
        System.out.println("\n" + "\n" + "-------------" + "\n");
        String stringWithSpaces = "Learning Java is awsome.";
        String[] words = stringWithSpaces.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
        System.out.println("\n" + "\n" + "-------------" + "\n");
        for (String word : words) {        //identic cu cel de mai sus
            System.out.println(word);
        }
        System.out.println("\n" + "\n" + "-------------" + "\n");

        ///////////////////escape///////////////////
        String unescapedString = "test\tb\nceva";
        String escapedString = "test\\tb\\nceva";
        System.out.println(unescapedString);
        System.out.println(escapedString);

    }
}
