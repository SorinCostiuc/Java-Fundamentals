package com.sda.java_fundamentals_coding.Task19_Author;

public class Author {
    private String surname;
    private String nationality;

    public Author(){

    }
    Author (String surname, String nationality){
        this.surname = surname;
        this.nationality = nationality;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}