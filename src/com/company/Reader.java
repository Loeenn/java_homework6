package com.company;

import java.util.Arrays;

public class Reader {
    String fio;
    int bilet_number;
    String fac;
    String date;
    int phone_number;
    public void take_book(){}
    public void returnBook(){}

    public void take_book(int num_books){
        System.out.println(fio+" взял "+num_books +" книги");
    }
    public void take_book(String ...book_names){
        System.out.println(fio+" взял книги: "+ Arrays.toString(book_names).replace("[", "").replace("]", ""));
    }
    public void take_book(Book...book_name){
        System.out.println(fio+" взял книги: "+ Arrays.toString(book_name));
    }

    public void return_book(int num_books){
        System.out.println(fio+" вернул "+num_books +" книги");
    }
    public void return_book(String ...book_names){
        System.out.println(fio+" вернул книги: "+ Arrays.toString(book_names).replace("[", "").replace("]", ""));
    }
    public void return_book(Book...book_name){
        System.out.println(fio+" вернул книги: "+ Arrays.toString(book_name));
    }

    public Reader(String fio, int bilet_number, String fac, String date, int phone_number) {
        this.fio = fio;
        this.bilet_number = bilet_number;
        this.fac = fac;
        this.date = date;
        this.phone_number = phone_number;
    }



    public Reader() {
    }
}
