/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daoimpl;


import dao.LoginDao;
import database.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import model.User;


/**
 *
 * @author HABIB
 */


public class LoginDaoImpl implements LoginDao {

   @Override
public boolean login(User loginUser) {
    boolean status = false;
    Connection con = DBConnection.getDbConnection(); 
    try {
        Statement stmt = con.createStatement();
        String sql = "select * from user where name = '" + loginUser.getUsername() + "' AND password = '" + loginUser.getPassword() + "'";
        ResultSet rs = stmt.executeQuery(sql);

        if (rs.next()) {
            status = true;
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return status;
}


} 





