package com.sda.java_fundamentals.exercitii.book_store;

public class Book {
    private String title;
    private String author;
    private int numberOfPages;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        if (author.equals("Dickens")) {
            System.out.println("We don't accept books by Dickens ");
        } else {
            this.author = author;
        }
    }

    public void setNumberOfPages(int numberOfPagesParam) {
        if (isNumberOfPagesCorrect(numberOfPagesParam)) {
            numberOfPages = numberOfPagesParam;
        } else {
            System.out.println("The provided number of pages is incorrect: " + numberOfPagesParam);
        }
    }

    private boolean isNumberOfPagesCorrect(int numberOfPages) {   // private method
        return numberOfPages > 0 && numberOfPages < 1000;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}