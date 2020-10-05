package com.example.testSpring;

import org.springframework.stereotype.Component;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class bookservice {

    private static List<book> books = new ArrayList<>();

    private static int bookcount = 3;

    static {
        books.add(new book(11, "A", new Date()));
        books.add(new book(22, "B", new Date()));
        books.add(new book(33, "C", new Date()));


    }

    public List<book> findAllbooks() {
        return books;
    }

    public static book addbook(book book) {
        if (book.getBookid() ==  null ) {
            book.setBookid(bookcount++);
        }
        books.add(book);

        return book;
    }
    public book findbook(int id){
        for(book book: books){
            if(book.getBookid() == id){
                return book;
            }

        }
        return null;
    }



}
