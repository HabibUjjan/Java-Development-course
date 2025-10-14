package com.student.dao;


import java.util.List;
import com.student.model.Book;

public interface BookDao {
    void addBook(Book book);
    Book getBookById(int id);
    List<Book> getAllBooks();
    void updateBook(Book book);
    void deleteBook(int id);
}

