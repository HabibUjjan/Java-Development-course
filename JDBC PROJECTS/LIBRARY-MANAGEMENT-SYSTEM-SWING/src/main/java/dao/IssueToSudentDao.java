/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;
import model.IssueToSudent;

/**
 *
 * @author HABIB
 */
public interface IssueToSudentDao {
    void issueBook(IssueToSudent issue);
    List<IssueToSudent>getAllIssuedBook();
}
