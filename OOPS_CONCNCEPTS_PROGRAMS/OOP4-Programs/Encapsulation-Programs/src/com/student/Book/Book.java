package com.student.Book;

public class Book {
    private String title;
    private String author;
    private double price;
    private String publisher;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void displayInfo(){
        System.out.println("Title: " + this.getTitle());
        System.out.println("Author: " + this.getAuthor());
        System.out.println("Price: " + this.getPrice());
        System.out.println("Publisher: " + this.getPublisher());

    }
}
