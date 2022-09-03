package com.sda.java_fundamentals.primitive.types_and_operations;

public class Conversii {
    //CASTING
    public static void main(String[] args) {
        System.out.println("\n" + "--------------------------------" + "\n" + "Conversii" + "\n" + "--------------------------------" + "\n");

        //o valoare mica se pote modifica fara probleme intr-o valoare mai mare
        // se mai numeste WIDENING
        int i = 25;
        System.out.println("i : " + i);
        float j = i;
        System.out.println("j : " + j);

        //exista risc de pierdere date cand convertesti un int/long la float/double

        char c1 = "text".charAt(0); //"text".charAt(0) o sa fie 't'
        int c = c1;
        System.out.println("Se poate face asa: " + c1);

        System.out.println("\n" + "--------------------------------" + "\n" + "CASTING" + "\n" + "--------------------------------" + "\n");
        //daca punem (int) si obligam sa afiseze in int, se va pierde tot ce este dupa punct

        double d1 = 2.5D;
        System.out.println("d1 - " + d1);
        int i1 = (int) d1;  //int i1 = d1; - compilatorul da erroare
        System.out.println("i1 - " + i1);

        long a = 123453423425231553L;
        System.out.println("a - " + a);
        int a1 = (int) a; //  int a1 = a - aceeasi problema
        //face overflow
        System.out.println("a1 - " + a1);


    }
}
