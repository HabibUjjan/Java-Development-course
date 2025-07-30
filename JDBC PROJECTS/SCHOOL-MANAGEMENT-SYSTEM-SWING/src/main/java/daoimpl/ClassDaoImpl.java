package daoimpl;

import dao.ClassDao;
import database.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.StudentClass;

public class ClassDaoImpl implements ClassDao {
    Connection connection = DBConnection.getDbConnection();
    @Override
    public List<StudentClass> getAllClasses() {
        List<StudentClass> classes = new ArrayList<>();
        try {
            String query = "SELECT * FROM classes";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                classes.add(new StudentClass(rs.getString("class_name")));
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return classes;
    }

}
