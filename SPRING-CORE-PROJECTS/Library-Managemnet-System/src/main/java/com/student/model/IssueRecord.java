package com.student.model;


import java.util.Date;
import java.text.SimpleDateFormat;

public class IssueRecord {
    private int id;
    private int bookId;
    private int memberId;
    private Date issueDate;
    private Date returnDate;

    public IssueRecord() {}

    public IssueRecord(int id, int bookId, int memberId, Date issueDate, Date returnDate) {
        this.id = id;
        this.bookId = bookId;
        this.memberId = memberId;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getBookId() {
        return bookId;
    }
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    public int getMemberId() {
        return memberId;
    }
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }
    public Date getIssueDate() {
        return issueDate;
    }
    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }
    public Date getReturnDate() {
        return returnDate;
    }
    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public void displayInfo(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Issue Record ID: " + id);
        System.out.println("Book ID: " + bookId);
        System.out.println("Member ID: " + memberId);
        System.out.println("Issue Date: " + sdf.format(issueDate));
        System.out.println("Return Date: " + sdf.format(returnDate));

    }


}
