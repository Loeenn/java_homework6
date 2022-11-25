package com.company;

public class Book {
    public String book_name;
    public String author_name;

    public Book(String book_name) {
        this.book_name = book_name;
    }

    public Book(String book_name, String author_name) {
        this.book_name = book_name;
        this.author_name = author_name;
    }
    public void get_name(){
        System.out.println(book_name);
        return;
    }
}
