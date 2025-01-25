package com.student.Book;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        System.out.println("*********Poem Information*********");
        book.setTitle("Duniya Saari Khawab");
        book.setAuthor("Shaikh Ayaz");
        book.setPrice(1500);
        book.setPublisher("Ayaz");
        book.displayInfo();
        System.out.println();


        Book book1 = new Book();
        book1.setTitle("Sindhi Zubaan");
        book1.setAuthor("Ghulam Nabi Sagar");
        book1.setPrice(1200);
        book1.setPublisher("Habib Publication");
        book1.displayInfo();
        System.out.println();

        Book book2 = new Book();
        book2.setTitle("Naye Din Ki Soorat");
        book2.setAuthor("Imdad Hussaini");
        book2.setPrice(1800);
        book2.setPublisher("Sahara Press");
        book2.displayInfo();
        System.out.println();


    }
}
