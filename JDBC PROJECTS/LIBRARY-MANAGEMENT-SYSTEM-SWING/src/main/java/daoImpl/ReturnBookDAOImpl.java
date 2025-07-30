/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daoImpl;

import dao.ReturnBookDAO;
import database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.ReturnBook;

/**
 *
 * @author HABIB
 */


public class ReturnBookDAOImpl implements ReturnBookDAO {

    @Override
    public void returnBook(ReturnBook returnBook) {
        Connection connection = DBConnection.getDbConnection();
        String query = "delete from issued_books where student_id = ? and book_isbn = ?";

        try (
            PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, returnBook.getStudentId());
            statement.setString(2, returnBook.getBookIsbn());
            int rows = statement.executeUpdate();

            if (rows > 0) {
                System.out.println("Book returned successfully");
            } else {
                System.out.println("No matching issued book found for return");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
