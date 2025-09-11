package daoimpl;

import java.sql.PreparedStatement;
import dao.CategoryDao;
import database.DBConnection;
import model.Category;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CategoryDaoImpl implements CategoryDao {

    Connection conn = DBConnection.getDbConnection();

    @Override
    public Integer addCategory(Category category) {
        Integer row = null;
        try {
            String query = "INSERT INTO category (category, remarks, created_date, created_by, status) VALUES (?, ?, ?, ?, 1)";
            java.sql.Date sqlDate = new java.sql.Date(category.getCreatedDate().getTime());

            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, category.getCategoryName());
            pstmt.setString(2, category.getRemarks());
            pstmt.setDate(3, sqlDate);
            pstmt.setInt(4, category.getCreatedBy());

            row = pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        }

        return row;
    }

    @Override
    public Integer updateCategory(Category category) {
        Integer row = null;
        try {
            String query = "UPDATE category SET category = ?, remarks = ?, modified_date = ?, modified_by = ? WHERE category_id = ?";
            java.sql.Date sqlDate = new java.sql.Date(category.getModifiedDate().getTime());

            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, category.getCategoryName());
            pstmt.setString(2, category.getRemarks());
            pstmt.setDate(3, sqlDate);
            pstmt.setInt(4, category.getModifiedBy());
            pstmt.setInt(5, category.getCategoryID());

            row = pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        }
        return row;
    }

    @Override
    public Integer deleteCategory(Integer categoryID) {
        Integer row = null;
        try {
            String query = "DELETE FROM category WHERE category_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, categoryID);
            row = pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        }

        return row;
    }

    @Override
    public Category getCategoryByID(Integer categoryID) {
        Category category = null;
        ResultSet rs = null;

        try {
            String query = "SELECT * FROM category WHERE category_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, categoryID);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                category = new Category();
                category.setCategoryID(rs.getInt("category_id"));
                category.setCategoryName(rs.getString("category"));
                category.setRemarks(rs.getString("remarks"));
                category.setCreatedDate(rs.getDate("created_date"));
                category.setCreatedBy(rs.getInt("created_by"));
                category.setModifiedDate(rs.getDate("modified_date"));
                category.setModifiedBy(rs.getInt("modified_by"));
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        }
        return category;
    }

    @Override
    public Integer getCategoryIDByName(String categoryName) {
        Integer id = null;
        ResultSet rs = null;
        try {
            String query = "SELECT category_id FROM category WHERE category = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, categoryName);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                id = rs.getInt("category_id");
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        }

        return id;
    }

    @Override
    public List<Category> getAllCategory() {
        List<Category> allCategories = new ArrayList<>();
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM category";
            PreparedStatement pstmt = conn.prepareStatement(query);

            rs = pstmt.executeQuery();

            while (rs.next()) {
                Category category = new Category();
                category.setCategoryID(rs.getInt("category_id"));
                category.setCategoryName(rs.getString("category"));
                category.setRemarks(rs.getString("remarks"));
                category.setCreatedDate(rs.getDate("created_date"));
                category.setCreatedBy(rs.getInt("created_by"));
                category.setModifiedDate(rs.getDate("modified_date"));
                category.setModifiedBy(rs.getInt("modified_by"));

                allCategories.add(category);
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        }

        return allCategories;
    }

    @Override
    public boolean checkCategory(String categoryName) {
        ResultSet rs = null;
        boolean result = false;
        try {
            String query = "SELECT category FROM category WHERE category = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, categoryName);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                result = true;
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

}
