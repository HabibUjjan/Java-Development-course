package daoimpl;

import dao.PermissionDao;
import database.DBConnection;
import model.Permission;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PermissionDaoImpl implements PermissionDao {
    Connection conn = DBConnection.getDbConnection();
    @Override
    public Integer addPermission(Permission permission) {
        Integer row = null;
        try {
            String query = "INSERT INTO permission (permission, created_date, created_by, status) VALUES (?, ?, ?, 1)";
            PreparedStatement pstmt = conn.prepareStatement(query);

            java.sql.Date sqlDate = new java.sql.Date(permission.getCreatedDate().getTime());
            pstmt.setString(1, permission.getPermission());
            pstmt.setDate(2, sqlDate);
            pstmt.setInt(3, permission.getCreatedBy());

            row = pstmt.executeUpdate();
        } catch (Exception ex) {
            System.out.println("ERROR IN ADD PERMISSION: " + ex.getMessage());
            ex.printStackTrace();
        }
        return row;
    }

    @Override
    public Integer updatePermission(Permission permission) {
        Integer row = null;
        try {
            String query = "UPDATE permission SET permission = ?, modified_date = ?, modified_by = ? WHERE permission_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);

            java.sql.Date sqlDate = new java.sql.Date(permission.getModifiedDate().getTime());
            pstmt.setString(1, permission.getPermission());
            pstmt.setDate(2, sqlDate);
            pstmt.setInt(3, permission.getModifiedBy());
            pstmt.setInt(4, permission.getPermissionId());

            row = pstmt.executeUpdate();
        } catch (Exception ex) {
            System.out.println("ERROR IN UPDATE PERMISSION: " + ex.getMessage());
            ex.printStackTrace();
        }
        return row;
    }

    @Override
    public Integer deletePermission(Integer permissionId) {
        Integer row = null;
        try {
            String query = "UPDATE permission SET status = 0 WHERE permission_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, permissionId);

            row = pstmt.executeUpdate();
        } catch (Exception ex) {
            System.out.println("ERROR IN DELETE PERMISSION: " + ex.getMessage());
            ex.printStackTrace();
        }
        return row;
    }

    @Override
    public Permission getPermissionById(Integer id) {
        Permission permission = null;
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM permission WHERE permission_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, id);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                permission = new Permission();
                permission.setPermissionId(rs.getInt("permission_id"));
                permission.setPermission(rs.getString("permission"));
                permission.setCreatedDate(rs.getDate("created_date"));
                permission.setCreatedBy(rs.getInt("created_by"));
                permission.setModifiedDate(rs.getDate("modified_date"));
                permission.setModifiedBy(rs.getInt("modified_by"));
            }
        } catch (Exception ex) {
            System.out.println("ERROR IN GET PERMISSION BY ID: " + ex.getMessage());
            ex.printStackTrace();
        }
        return permission;
    }

    @Override
    public Integer getPermissionIdByName(String name) {
        Integer id = null;
        ResultSet rs = null;
        try {
            String query = "SELECT permission_id FROM permission WHERE permission = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, name);

            rs = pstmt.executeQuery();
            if (rs.next()) {
                id = rs.getInt("permission_id");
            }
        } catch (Exception e) {
            System.out.println("ERROR IN GET PERMISSION ID BY NAME: " + e.getMessage());
            e.printStackTrace();
        }
        return id;
    }

    @Override
    public List<Permission> getAllPermission() {
        List<Permission> allPermissions = new ArrayList<>();
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM permission WHERE status = 1";
            PreparedStatement pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                Permission permission = new Permission();
                permission.setPermissionId(rs.getInt("permission_id"));
                permission.setPermission(rs.getString("permission"));
                permission.setCreatedDate(rs.getDate("created_date"));
                permission.setCreatedBy(rs.getInt("created_by"));
                permission.setModifiedDate(rs.getDate("modified_date"));
                permission.setModifiedBy(rs.getInt("modified_by"));
                allPermissions.add(permission);
            }

        } catch (Exception ex) {
            System.out.println("ERROR IN GET ALL PERMISSIONS: " + ex.getMessage());
            ex.printStackTrace();
        }
        return allPermissions;
    }

    @Override
    public List<Permission> getPermissionOf(Integer roleId) {
        List<Permission> allPermission = new ArrayList<>();
        ResultSet rs = null;
        try {
            String query = "SELECT p.permission_id, p.permission FROM role_permission rp INNER JOIN permission p ON rp.permission_id = p.permission_id WHERE rp.role_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, roleId);

            rs = pstmt.executeQuery();

            while (rs.next()) {
                Permission p = new Permission();
                p.setPermissionId(rs.getInt("permission_id"));
                p.setPermission(rs.getString("permission"));
                allPermission.add(p);
            }
        } catch (Exception e) {
            System.out.println("ERROR IN GET PERMISSIONS OF ROLE: " + e.getMessage());
            e.printStackTrace();
        }

        return allPermission;
    }
}
