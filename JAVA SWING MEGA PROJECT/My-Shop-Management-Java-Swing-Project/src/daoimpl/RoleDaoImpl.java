package daoimpl;

import dao.RoleDao;
import database.DBConnection;
import model.Role;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RoleDaoImpl implements RoleDao {

    Connection conn = DBConnection.getDbConnection();

    @Override
    public Integer addRole(Role role) {
        Integer row = null;
        try {
            String query = "INSERT INTO role (role_name, created_date, created_by, status) VALUES (?, ?, ?, 1)";
            PreparedStatement pstmt = conn.prepareStatement(query);

            java.sql.Date createDate = new java.sql.Date(role.getCreatedDate().getTime());

            pstmt.setString(1, role.getRoleName());
            pstmt.setDate(2, createDate);
            pstmt.setInt(3, role.getCreatedBy());

            row = pstmt.executeUpdate();

        } catch (Exception ex) {
            System.out.println("ERROR in addRole: " + ex.getMessage());
            ex.printStackTrace();
        }
        return row;
    }

    @Override
    public Integer updateRole(Role role) {
        Integer row = null;
        try {
            String query = "UPDATE role SET role_name = ?, modified_date = ?, modified_by = ? WHERE role_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);

            java.sql.Date modifiedDate = new java.sql.Date(role.getModifiedDate().getTime());

            pstmt.setString(1, role.getRoleName());
            pstmt.setDate(2, modifiedDate);
            pstmt.setInt(3, role.getModifiedBy());
            pstmt.setInt(4, role.getRoleId());

            row = pstmt.executeUpdate();

        } catch (Exception ex) {
            System.out.println("ERROR in updateRole: " + ex.getMessage());
            ex.printStackTrace();
        }
        return row;
    }

    @Override
    public Integer deleteRole(Integer roleId) {
        Integer row = null;
        try {
            String query = "UPDATE role SET status = 0 WHERE role_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, roleId);

            row = pstmt.executeUpdate();

        } catch (Exception ex) {
            System.out.println("ERROR in deleteRole: " + ex.getMessage());
            ex.printStackTrace();
        }
        return row;
    }

    @Override
    public Role getRoleById(Integer id) {
        Role role = null;
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM role WHERE role_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, id);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                role = new Role();

                role.setRoleId(rs.getInt("role_id"));
                role.setRoleName(rs.getString("role_name"));
                role.setCreatedDate(rs.getDate("created_date"));
                role.setCreatedBy(rs.getInt("created_by"));
                role.setModifiedDate(rs.getDate("modified_date"));
                role.setModifiedBy(rs.getInt("modified_by"));
            }

        } catch (Exception ex) {
            System.out.println("ERROR in getRoleById: " + ex.getMessage());
            ex.printStackTrace();
        }
        return role;
    }

    @Override
    public Integer getRoleIdByName(String name) {
        Integer id = null;
        ResultSet rs = null;
        try {
            String query = "SELECT role_id FROM role WHERE role_name = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, name);

            rs = pstmt.executeQuery();
            if (rs.next()) {
                id = rs.getInt("role_id");
            }

        } catch (Exception e) {
            System.out.println("ERROR in getRoleIdByName: " + e.getMessage());
            e.printStackTrace();
        }
        return id;
    }

    @Override
    public List<Role> getAllRole() {
        List<Role> allRoles = new ArrayList<>();
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM role WHERE status = 1";
            PreparedStatement pstmt = conn.prepareStatement(query);

            rs = pstmt.executeQuery();

            while (rs.next()) {
                Role role = new Role();

                role.setRoleId(rs.getInt("role_id"));
                role.setRoleName(rs.getString("role_name"));
                role.setCreatedDate(rs.getDate("created_date"));
                role.setCreatedBy(rs.getInt("created_by"));
                role.setModifiedDate(rs.getDate("modified_date"));
                role.setModifiedBy(rs.getInt("modified_by"));

                allRoles.add(role);
            }

        } catch (Exception ex) {
            System.out.println("ERROR in getAllRole: " + ex.getMessage());
            ex.printStackTrace();
        }
        return allRoles;
    }
}
