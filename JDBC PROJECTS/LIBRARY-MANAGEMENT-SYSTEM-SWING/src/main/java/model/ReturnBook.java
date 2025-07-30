/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HABIB
 */


public class ReturnBook {
    private int studentId;
    private String bookIsbn;

    public ReturnBook(int studentId, String bookIsbn) {
        this.studentId = studentId;
        this.bookIsbn = bookIsbn;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getBookIsbn() {
        return bookIsbn;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setBookIsbn(String bookIsbn) {
        this.bookIsbn = bookIsbn;
    }
}
