/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daoimpl;

import dao.SubjectDao;
import database.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.TeacherSub;

/**
 *
 * @author HABIB
 */
public class SubjectDaoImpl implements SubjectDao {
    @Override
    public List<TeacherSub> getAllSubjects() {
        List<TeacherSub> subjects = new ArrayList<>();
        Connection con = DBConnection.getDbConnection();
        try {
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM subjects";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String name = rs.getString("subject_name");
                subjects.add(new TeacherSub(name));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return subjects;
    }
}
