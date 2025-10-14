package com.student.daoimpl;


import com.student.dao.IssueDao;
import com.student.model.IssueRecord;
import com.student.database.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class IssueDaoImpl implements IssueDao {
    @Override
    public void issueBook(IssueRecord issueRecord) {
        Connection connection = DBConnection.getDbConnection();
        String sql = "insert into issue_records (book_id, member_id, issue_date, return_date) values (?, ?, ?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, issueRecord.getBookId());
            ps.setInt(2, issueRecord.getMemberId());
            ps.setDate(3, new java.sql.Date(issueRecord.getIssueDate().getTime()));
            if (issueRecord.getReturnDate() != null) {
                ps.setDate(4, new java.sql.Date(issueRecord.getReturnDate().getTime()));
            } else {
                ps.setNull(4, Types.DATE);
            }
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void returnBook(int issueId) {
        Connection connection = DBConnection.getDbConnection();
        String sql = "update issue_records set return_date = ? where id = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setDate(1, new java.sql.Date(new Date().getTime()));
            ps.setInt(2, issueId);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<IssueRecord> getAllIssuedBooks() {
        Connection connection = DBConnection.getDbConnection();
        String sql = "select * from issue_records";
        List<IssueRecord> issueRecords = new ArrayList<>();
        try (PreparedStatement ps = connection.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                IssueRecord ir = new IssueRecord(
                        rs.getInt("id"),
                        rs.getInt("book_id"),
                        rs.getInt("member_id"),
                        rs.getDate("issue_date"),
                        rs.getDate("return_date")
                );
                issueRecords.add(ir);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return issueRecords;
    }
}
