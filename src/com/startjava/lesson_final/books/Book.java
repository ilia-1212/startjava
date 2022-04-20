package com.startjava.lesson_final.books;

public class Book {
    private String author;
    private String title;
    private String yearPublish;

    public Book(String author, String title, String yearPublish) {
        this.author = author;
        this.title = title;
        this.yearPublish = yearPublish;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYearPublish() {
        return yearPublish;
    }

    public void setYearPublish(String yearPublish) {
        this.yearPublish = yearPublish;
    }

    @Override
    public String toString() {
        return ("<" + this.author + ", " + this.title + ", " + this.yearPublish + ">");
    }
}