/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daoImpl;

import dao.IssueToSudentDao;
import database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.IssueToSudent;

/**
 *
 * @author HABIB
 */

public class IssueToStudentDAOImpl implements IssueToSudentDao {
    Connection connection = DBConnection.getDbConnection();
    @Override
    public void issueBook(IssueToSudent issue) {
        String query = "insert into issued_books (student_id, student_name, roll_number, book_isbn) VALUES (?, ?, ?, ?)";
        try (
            PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, issue.getStudentId());
            statement.setString(2, issue.getStudentName());
            statement.setString(3, issue.getRollNumber());
            statement.setString(4, issue.getBookIsbn());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
  
    @Override
    public List<IssueToSudent> getAllIssuedBook() {
    Connection con = DBConnection.getDbConnection();
    List<IssueToSudent> list = new ArrayList<>();
     try{
        String sql = "select * from issued_books";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            IssueToSudent issue = new IssueToSudent(
                rs.getInt("student_id"),
                rs.getString("student_name"),
                rs.getString("student_roll_number"),
                rs.getString("book_isbn")
            );
            list.add(issue);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return list;
    
    }
}


