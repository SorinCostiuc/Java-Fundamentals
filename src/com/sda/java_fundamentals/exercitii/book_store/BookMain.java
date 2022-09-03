package com.sda.java_fundamentals.exercitii.book_store;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setAuthor("Dickens");
        book1.setTitle("My title");
        book1.setNumberOfPages(10000);
        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthor());
        System.out.println(book1.getNumberOfPages());

        book1.setAuthor("Eminescu");
        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthor());
        System.out.println(book1.getNumberOfPages());



        //public vs private vs package protected (mai exista protected, dar la mosteniri)
//        Employee employee = new Employee();
//        employee.name = "Dragos"; //field public
//        System.out.println(employee.name); //field public

//        employee.setName("Dragos");   //field private, n-avem acces, trebuie sa folosim getter si setter
//        System.out.println(employee.getName()); //field private, n-avem acces, trebuie sa folosim getter si setter

//        employee.name = "Dragos";
//        System.out.println(employee.name);
//        System.out.println(employee.getName());

    }
}
