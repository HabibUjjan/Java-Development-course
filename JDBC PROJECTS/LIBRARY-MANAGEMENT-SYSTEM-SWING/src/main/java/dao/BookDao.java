/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;
import model.Book;

/**
 *
 * @author HABIB
 */
public interface BookDao {
    void addBook(Book book);
    List<Book> getAllBooks();
    
}
