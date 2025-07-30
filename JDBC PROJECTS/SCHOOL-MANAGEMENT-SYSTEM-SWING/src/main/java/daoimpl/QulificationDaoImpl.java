/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daoimpl;

import dao.QulificationDao;
import database.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.TeacherQulification;

/**
 *
 * @author HABIB
 */


public class QulificationDaoImpl implements QulificationDao {
    @Override
    public List<TeacherQulification> getAllqulification(){
        List<TeacherQulification> qulification = new ArrayList<>();
        Connection con = DBConnection.getDbConnection();
        try {
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM qulificatin";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
            String name = rs.getString("teacher_qulification");
            qulification.add(new TeacherQulification(name)); 
}


        } catch (Exception e) {
            e.printStackTrace();
        }
        return qulification;
    }  
}
