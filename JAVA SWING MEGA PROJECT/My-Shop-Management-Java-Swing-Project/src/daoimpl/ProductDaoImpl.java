package daoimpl;

import java.sql.Connection;
import dao.ProductDao;
import database.DBConnection;
import model.Category;
import model.Product;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements ProductDao {

    Connection conn = DBConnection.getDbConnection();

    @Override
    public Integer addProduct(Product product) {
        Integer row = null;
        try {
            String query = "INSERT INTO product (product_name, quantity, price, category_id, remarks, created_date, created_by, status) VALUES (?, ?, ?, ?, ?, ?, ?, 1)";
            java.sql.Date sqlDate = new java.sql.Date(product.getCreatedDate().getTime());

            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, product.getProductName());
            pstmt.setInt(2, product.getQuantity());
            pstmt.setDouble(3, product.getPrice());
            pstmt.setInt(4, product.getCategory().getCategoryID());
            pstmt.setString(5, product.getRemarks());
            pstmt.setDate(6, sqlDate);
            pstmt.setInt(7, product.getCreatedBy());

            row = pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("ERROR IN ADD PRODUCT: " + e.getMessage());
            e.printStackTrace();
        }
        return row;
    }

    @Override
    public Integer updateProduct(Product product) {
        Integer row = null;
        try {
            String query = "UPDATE product SET product_name = ?, quantity = ?, price = ?, category_id = ?, remarks = ?, modified_date = ?, modified_by = ? WHERE product_id = ?";
            java.sql.Date sqlDate = new java.sql.Date(product.getModifiedDate().getTime());

            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, product.getProductName());
            pstmt.setInt(2, product.getQuantity());
            pstmt.setDouble(3, product.getPrice());
            pstmt.setInt(4, product.getCategory().getCategoryID());
            pstmt.setString(5, product.getRemarks());
            pstmt.setDate(6, sqlDate);
            pstmt.setInt(7, product.getCreatedBy()); // should this be modifiedBy?
            pstmt.setInt(8, product.getProductID());

            row = pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("ERROR IN UPDATE PRODUCT: " + e.getMessage());
            e.printStackTrace();
        }
        return row;
    }

    @Override
    public Integer deleteProduct(Integer productID) {
        Integer row = null;
        try {
            String query = "UPDATE product SET status = 0 WHERE product_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, productID);

            row = pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("ERROR IN DELETE PRODUCT: " + e.getMessage());
            e.printStackTrace();
        }
        return row;
    }

    @Override
    public Product getProductByID(Integer productID) {
        Product product = null;
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM product WHERE product_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, productID);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                product = new Product();
                Category category = new Category();
                category.setCategoryID(rs.getInt("category_id"));

                product.setProductID(rs.getInt("product_id"));
                product.setProductName(rs.getString("product_name"));
                product.setQuantity(rs.getInt("quantity"));
                product.setPrice(rs.getDouble("price"));
                product.setCategory(category);
                product.setCreatedDate(rs.getDate("created_date"));
                product.setCreatedBy(rs.getInt("created_by"));
                product.setModifiedDate(rs.getDate("modified_date"));
                product.setModifiedBy(rs.getInt("modified_by"));
                product.setRemarks(rs.getString("remarks"));
            }

        } catch (Exception e) {
            System.out.println("ERROR IN GET PRODUCT BY ID: " + e.getMessage());
            e.printStackTrace();
        }
        return product;
    }

    @Override
    public Integer getProductIDByName(String productName) {
        Integer id = null;
        ResultSet rs = null;
        try {
            String query = "SELECT product_id FROM product WHERE product_name = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, productName);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                id = rs.getInt("product_id");
            }

        } catch (Exception e) {
            System.out.println("ERROR IN GET PRODUCT ID BY NAME: " + e.getMessage());
            e.printStackTrace();
        }
        return id;
    }

    @Override
    public List<Product> getAllProduct() {
        List<Product> allProduct = new ArrayList<>();
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM product WHERE status = 1 AND quantity > 0";
            PreparedStatement pstmt = conn.prepareStatement(query);

            rs = pstmt.executeQuery();

            while (rs.next()) {
                Product product = new Product();
                Category category = new Category();
                category.setCategoryID(rs.getInt("category_id"));

                product.setProductID(rs.getInt("product_id"));
                product.setProductName(rs.getString("product_name"));
                product.setQuantity(rs.getInt("quantity"));
                product.setPrice(rs.getDouble("price"));
                product.setCategory(category);
                product.setCreatedDate(rs.getDate("created_date"));
                product.setCreatedBy(rs.getInt("created_by"));
                product.setModifiedDate(rs.getDate("modified_date"));
                product.setModifiedBy(rs.getInt("modified_by"));
                product.setRemarks(rs.getString("remarks"));

                allProduct.add(product);
            }

        } catch (Exception e) {
            System.out.println("ERROR IN GET ALL PRODUCT: " + e.getMessage());
            e.printStackTrace();
        }
        return allProduct;
    }

    @Override
    public Integer reduceProduct(Product product, int reduceQuantity) {
        Integer row = null;
        try {
            String query = "UPDATE product SET quantity = quantity - ? WHERE product_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, reduceQuantity);
            pstmt.setInt(2, product.getProductID());

            row = pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("ERROR IN REDUCE PRODUCT: " + e.getMessage());
            e.printStackTrace();
        }
        return row;
    }

    @Override
    public Integer plusProduct(Product product, int plusQuantity) {
        Integer row = null;
        try {
            String query = "UPDATE product SET quantity = quantity + ? WHERE product_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, plusQuantity);
            pstmt.setInt(2, product.getProductID());

            row = pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("ERROR IN PLUS PRODUCT: " + e.getMessage());
            e.printStackTrace();
        }
        return row;
    }

    @Override
    public Integer productQuantity(Integer productID) {
        Integer quantity = null;
        ResultSet rs = null;
        try {
            String query = "SELECT quantity FROM product WHERE product_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, productID);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                quantity = rs.getInt("quantity");
            }

        } catch (Exception e) {
            System.out.println("ERROR IN GET PRODUCT QUANTITY: " + e.getMessage());
            e.printStackTrace();
        }
        return quantity;
    }
}
