package com.sda.java_fundamentals.primitive.strings;

public class StringPool {
    public static void main(String[] args) {
        //string literal
        String text1 = "My name is D";
        System.out.println(text1);
        //string object
        String text2 = new String("My name is D");
        System.out.println(text2);

        String text3 = "My name is D";
        String text4 = "My name is D";
        // cand vorbim de obiect (si String este un obiect, nu o primitiva)
        // == compara egalitatea la nivel de referinta din memorie
        // .equals compara egalitatea la nivel de valoare

        System.out.println("My name is D" == "My name is D");       //true
        System.out.println("My name is D".equals("My name is D"));  //true

        System.out.println(new String("My name is D") == "My name is D"); //false
        System.out.println(new String("My name is D").equals("My name is D")); //true

        System.out.println(new String("My name is D") == (new String("My name is D"))); //false
        System.out.println(new String("My name is D").equals(new String("My name is D"))); //true


        System.out.println("-------------");
        String s1 = new String("test"); //0x43543   - "test"
        String s2 = new String("test"); //0x32412   - "test"
        String s3 = "test";
        System.out.println(s1 == s1); // true
        System.out.println(s1 == s2);   // false
        System.out.println(s1.equals(s2)); // true

        System.out.println(s1 == "test"); // false
        System.out.println(s1.intern() == "test");  // true

        //!!!! cand comparam stringuri, intotdeauna folosim .equals pentru a compara valoarea, nu ==, acesta din urma
        // este folosit la compararea referintelor
    }
}
