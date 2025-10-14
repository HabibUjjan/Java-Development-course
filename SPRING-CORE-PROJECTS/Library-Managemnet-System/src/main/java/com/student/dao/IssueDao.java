package com.student.dao;


import java.util.List;
import com.student.model.IssueRecord;

public interface IssueDao {
    void issueBook(IssueRecord issueRecord);
    void returnBook(int issueId);
    List<IssueRecord> getAllIssuedBooks();
}
