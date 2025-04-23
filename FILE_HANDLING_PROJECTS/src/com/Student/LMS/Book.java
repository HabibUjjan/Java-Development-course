package com.Student.LMS;


public class Book {
    public int bookId;
    public String name;
    public String iban;
    public String author;
    public int quantity;

    public Book(int bookId, String name, String iban, String author, int quantity) {
        this.bookId = bookId;
        this.name = name;
        this.iban = iban;
        this.author = author;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getIban() {
        return iban;
    }

    public void showBookData() {
        System.out.println(name + "     " + iban + "     " + author + "     " + quantity);
    }
}

