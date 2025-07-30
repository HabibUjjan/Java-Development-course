/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daoImpl;

import dao.BookDao;
import database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Book;

/**
 *
 * @author HABIB
 */
public class BookDaoImpl implements BookDao{
@Override
public void addBook(Book book) {
    Connection connection = DBConnection.getDbConnection();
    String sql = "insert into books (id, name, isbn, author, quantity) VALUES (?, ?, ?, ?, ?)";
    try (
        PreparedStatement preparedstatement = connection.prepareStatement(sql)) {
        preparedstatement.setInt(1, book.getId());
        preparedstatement.setString(2, book.getName());
        preparedstatement.setString(3, book.getIsbn());
        preparedstatement.setString(4, book.getAuthor());
        preparedstatement.setInt(5, book.getQuantity());

        preparedstatement.executeUpdate();
        System.out.println("Book added to database");

    } catch (SQLException e) {
        e.printStackTrace();
    }
}

public List<Book> getAllBooks() {
    Connection con = DBConnection.getDbConnection();
    List<Book> list = new ArrayList<>();
    try {
        String query = "select * from books";
        PreparedStatement ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Book b = new Book(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getString("isbn"),
                rs.getString("author"),
                rs.getInt("quantity")
            );
            list.add(b);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return list;
}


}
