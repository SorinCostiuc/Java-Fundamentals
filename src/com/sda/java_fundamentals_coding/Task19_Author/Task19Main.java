package com.sda.java_fundamentals_coding.Task19_Author;

public class Task19Main {
    public static void main(String[] args) {
//        Write an application that consists of few classes:
//        a. Author class, representing an author – poem writer, which consists of fields surname
//        and nationality (both of type String)
//        b. Poem class, representing poem, which consists of fields creator (type Author) and
//        stropheNumbers (type int – numbers of strophes in poem)
//        c. Main class, with main method, inside which you will:
//        i. Create three instances of Poem class, fill them with data (using constructor
//        and/or setters) and store them in array
//        ii. Write a surname of an author, that wrote a longest poem (let your application
//        calculate it!)
        Author eminescu = new Author();
        eminescu.setNationality("roman");
        eminescu.setSurname("Eminescu");

        Poem poem = new Poem(eminescu, 4);
        Author creanga = new Author("Creanga", "necunoscuta");
        Author bacovia = new Author("Bacovia", "grec");
        Poem poem1 = new Poem(creanga, 7);
        Poem poem2 = new Poem();
        poem2.setCreator(bacovia);
        poem2.setStropheNumbers(3);


        Poem[] poems = new Poem[3];
        poems[0] = poem;
        poems[1] = poem1;
        poems[2] = poem2;
        Author authorToDisplay = new Author();
        int longestPoem = Integer.MIN_VALUE;

        for (int i = 0; i < poems.length; i++) {
            if (poems[i].getStropheNumbers()>longestPoem){
                authorToDisplay=poems[i].getCreator();
                longestPoem=poems[i].getStropheNumbers();
            }
        }
        System.out.println("Autorul cu cel mai lung poem este: " + authorToDisplay.getSurname());
    }
}
