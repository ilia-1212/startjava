package com.startjava.lesson_final.bookShell;

public class Book {
    String author;
    String title;
    String yearPublish;

    public Book(String author, String title, String yearPublish) {
        this.author = author;
        this.title = title;
        this.yearPublish = yearPublish;
    }

    @Override
    public String toString() {
        return ("<" + this.author + ", " + this.title + ", " + this.yearPublish + ">");
    }
}