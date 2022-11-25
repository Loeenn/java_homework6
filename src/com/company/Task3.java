package com.company;

public class Task3 {
    public static void main(String[] args) {
        Book book1 = new Book("Роман","Алан По");
        Book book2 = new Book("Фэнтези","Анжей Сапковский");
        Reader[] readers = new Reader[2];
        readers[0] = new Reader("Ануфриев",2,"f","13.04",123);
        readers[1] = new Reader("Ануфриев С.М.",3,"IT","25.12.2022",12331);
        for(int i =0;i<2;i++){
            readers[i].take_book(3);
            readers[i].take_book("Приключения","Фэнтези");
            readers[i].take_book(book1.book_name,book2.book_name);
            readers[i].return_book(4);
            readers[i].return_book("Приключения","Фэнтези");
            readers[i].return_book(book1.book_name,book2.book_name);
        }

    }
}