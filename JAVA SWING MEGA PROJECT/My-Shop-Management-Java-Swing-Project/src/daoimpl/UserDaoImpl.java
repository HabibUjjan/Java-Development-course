package daoimpl;

import dao.UserDao;
import database.DBConnection;
import model.Role;
import model.User;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

    Connection conn = DBConnection.getDbConnection();

    @Override
    public Integer addUser(User user) {
        Integer row = null;
        try {
            String query = "INSERT INTO user (user_name, password, role_id, email, contact, address, created_date, created_by, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, 1)";
            PreparedStatement pstmt = conn.prepareStatement(query);

            pstmt.setString(1, user.getUserName());
            pstmt.setString(2, user.getPassword());
            pstmt.setInt(3, user.getRole().getRoleId());
            pstmt.setString(4, user.getEmail());
            pstmt.setString(5, user.getContact());
            pstmt.setString(6, user.getAddress());
            pstmt.setDate(7, new Date(user.getCreatedDate().getTime()));
            pstmt.setInt(8, user.getCreatedBy());

            row = pstmt.executeUpdate();
        } catch (Exception ex) {
            System.out.println("ERROR in addUser: " + ex.getMessage());
            ex.printStackTrace();
        }
        return row;
    }

    @Override
    public Integer updateUser(User user) {
        Integer row = null;
        try {
            String query = "UPDATE user SET user_name = ?, password = ?, role_id = ?, email = ?, contact = ?, address = ?, status = ?, created_date = ?, created_by = ? WHERE user_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);

            pstmt.setString(1, user.getUserName());
            pstmt.setString(2, user.getPassword());
            pstmt.setInt(3, user.getRole().getRoleId());
            pstmt.setString(4, user.getEmail());
            pstmt.setString(5, user.getContact());
            pstmt.setString(6, user.getAddress());
            pstmt.setInt(7, 1);
            pstmt.setDate(8, new Date(user.getModifiedDate().getTime()));
            pstmt.setInt(9, user.getModifiedBy());
            pstmt.setInt(10, user.getUserId());

            row = pstmt.executeUpdate();
        } catch (Exception ex) {
            System.out.println("ERROR in updateUser: " + ex.getMessage());
            ex.printStackTrace();
        }
        return row;
    }

    @Override
    public Integer deleteUser(Integer userId) {
        Integer row = null;
        try {
            String query = "UPDATE user SET status = 0 WHERE user_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, userId);
            row = pstmt.executeUpdate();
        } catch (Exception ex) {
            System.out.println("ERROR in deleteUser: " + ex.getMessage());
            ex.printStackTrace();
        }
        return row;
    }

    @Override
    public User getUserById(Integer id) {
        User user = null;
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM user WHERE user_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                user = new User();
                Role role = new Role();
                role.setRoleId(rs.getInt("role_id"));

                user.setUserId(rs.getInt("user_id"));
                user.setUserName(rs.getString("user_name"));
                user.setPassword(rs.getString("password"));
                user.setRole(role);
                user.setEmail(rs.getString("email"));
                user.setContact(rs.getString("contact"));
                user.setAddress(rs.getString("address"));
                user.setCreatedDate(rs.getDate("created_date"));
                user.setCreatedBy(rs.getInt("created_by"));
                user.setModifiedDate(rs.getDate("modified_date"));
                user.setModifiedBy(rs.getInt("modified_by"));
            }

        } catch (Exception ex) {
            System.out.println("ERROR in getUserById: " + ex.getMessage());
            ex.printStackTrace();
        }
        return user;
    }

    @Override
    public Integer getUserIdByName(String name) {
        Integer id = null;
        ResultSet rs = null;
        try {
            String query = "SELECT user_id FROM user WHERE user_name = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, name);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                id = rs.getInt("user_id");
            }
        } catch (Exception e) {
            System.out.println("ERROR in getUserIdByName: " + e.getMessage());
            e.printStackTrace();
        }
        return id;
    }

    @Override
    public List<User> getAllUser() {
        List<User> allUsers = new ArrayList<>();
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM user WHERE status = 1";
            PreparedStatement pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                User user = new User();
                Role role = new Role();
                role.setRoleId(rs.getInt("role_id"));

                user.setUserId(rs.getInt("user_id"));
                user.setUserName(rs.getString("user_name"));
                user.setPassword(rs.getString("password"));
                user.setRole(role);
                user.setEmail(rs.getString("email"));
                user.setContact(rs.getString("contact"));
                user.setAddress(rs.getString("address"));
                user.setCreatedDate(rs.getDate("created_date"));
                user.setCreatedBy(rs.getInt("created_by"));
                user.setModifiedDate(rs.getDate("modified_date"));
                user.setModifiedBy(rs.getInt("modified_by"));

                allUsers.add(user);
            }

        } catch (Exception ex) {
            System.out.println("ERROR in getAllUser: " + ex.getMessage());
            ex.printStackTrace();
        }
        return allUsers;
    }
}
