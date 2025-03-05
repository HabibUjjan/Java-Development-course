package com.student.Book;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        System.out.println("*********BOOK'S DETAILS***********");
        List<Book> bookList= new ArrayList<>();
        Book book1 = new Book();
        book1.setTitle("Java Programming");
        book1.setAuthor("Herbert Schildt");
        book1.setPrice(999.99);
        bookList.add(book1);

        Book book2 = new Book();
        book2.setTitle("Data Structures");
        book2.setAuthor("Mark Allen Weiss");
        book2.setPrice(1200.75);
        bookList.add(book2);

        Book book3 = new Book();
        book3.setTitle("Algorithms");
        book3.setAuthor("Robert Sedgewick");
        book3.setPrice(1500.50);
        bookList.add(book3);

        Book book4 = new Book();
        book4.setTitle("Introduction to Java");
        book4.setAuthor("James Gosling");
        book4.setPrice(899.99);
        bookList.add(book4);

        Book book5 = new Book();
        book5.setTitle("Database Management Systems");
        book5.setAuthor("Raghu Ramakrishnan");
        book5.setPrice(1300.20);
        bookList.add(book5);

        Book book6 = new Book();
        book6.setTitle("Artificial Intelligence");
        book6.setAuthor("Stuart Russell");
        book6.setPrice(1700.45);
        bookList.add(book6);

        Book book7 = new Book();
        book7.setTitle("Operating Systems");
        book7.setAuthor("Abraham Silberschatz");
        book7.setPrice(1400.99);
        bookList.add(book7);

        Book book8 = new Book();
        book8.setTitle("Computer Networks");
        book8.setAuthor("Andrew S. Tanenbaum");
        book8.setPrice(1250.00);
        bookList.add(book8);

        Book book9 = new Book();
        book9.setTitle("Discrete Mathematics");
        book9.setAuthor("Kenneth H. Rosen");
        book9.setPrice(1100.75);
        bookList.add(book9);

        Book book10 = new Book();
        book10.setTitle("The Pragmatic Programmer");
        book10.setAuthor("Andrew Hunt");
        book10.setPrice(950.00);
        bookList.add(book10);

        for (int i = 0; i<bookList.size(); i++){
            Book book = bookList.get(i);
            System.out.println(book);
            System.out.println();
        }
    }
}
