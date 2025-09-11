package daoimpl;

import java.sql.Connection;
import dao.PurchaseDetailsDao;
import database.DBConnection;
import model.Product;
import model.Purchase;
import model.PurchaseDetails;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PurchaseDetailsDaoImpl implements PurchaseDetailsDao {

    Connection conn = DBConnection.getDbConnection();

    @Override
    public Integer addPurchaseDetails(PurchaseDetails purchaseDetails) {
        Integer row = null;
        try {
            java.sql.Date createdDate = new java.sql.Date(purchaseDetails.getCreatedDate().getTime());

            String query = "INSERT INTO purchase_details (purchase_code, total, product_id, quantity, purchase_price, created_date, created_by, status) VALUES (?, ?, ?, ?, ?, ?, ?, 1)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, purchaseDetails.getPurchase().getPurchaseCode());
            pstmt.setDouble(2, purchaseDetails.getTotal());
            pstmt.setInt(3, purchaseDetails.getProduct().getProductID());
            pstmt.setInt(4, purchaseDetails.getQuantity());
            pstmt.setDouble(5, purchaseDetails.getPurchasePrice());
            pstmt.setDate(6, createdDate);
            pstmt.setInt(7, purchaseDetails.getCreatedBy());

            row = pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("ERROR in addPurchaseDetails: " + e.getMessage());
            e.printStackTrace();
        }
        return row;
    }

    @Override
    public Integer updatePurchaseDetails(PurchaseDetails purchaseDetails) {
        Integer row = null;
        try {
            java.sql.Date modifiedDate = new java.sql.Date(purchaseDetails.getModifiedDate().getTime());

            String query = "UPDATE purchase_details SET purchase_code = ?, total = ?, product_id = ?, quantity = ?, purchase_price = ?, remarks = ?, modified_date = ?, modified_by = ? WHERE purchase_details_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, purchaseDetails.getPurchase().getPurchaseCode());
            pstmt.setDouble(2, purchaseDetails.getTotal());
            pstmt.setInt(3, purchaseDetails.getProduct().getProductID());
            pstmt.setInt(4, purchaseDetails.getQuantity());
            pstmt.setDouble(5, purchaseDetails.getPurchasePrice());
            pstmt.setString(6, purchaseDetails.getRemarks());
            pstmt.setDate(7, modifiedDate);
            pstmt.setInt(8, purchaseDetails.getModifiedBy());
            pstmt.setInt(9, purchaseDetails.getPurchaseDetailsID());

            row = pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("ERROR in updatePurchaseDetails: " + e.getMessage());
            e.printStackTrace();
        }
        return row;
    }

    @Override
    public Integer deletePurchaseDetails(Integer purchaseDetailsID) {
        Integer row = null;
        try {
            String query = "UPDATE purchase_details SET status = 0 WHERE purchase_details_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, purchaseDetailsID);

            row = pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("ERROR in deletePurchaseDetails: " + e.getMessage());
            e.printStackTrace();
        }
        return row;
    }

    @Override
    public PurchaseDetails getPurchaseDetailsByID(Integer purchaseDetailsID) {
        PurchaseDetails purchaseDetails = null;
        ResultSet rs = null;

        try {
            String query = "SELECT * FROM purchase_details WHERE purchase_details_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, purchaseDetailsID);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                purchaseDetails = new PurchaseDetails();

                Purchase purchase = new Purchase();
                purchase.setPurchaseCode(rs.getString("purchase_code"));

                Product product = new Product();
                product.setProductID(rs.getInt("product_id"));

                purchaseDetails.setPurchaseDetailsID(rs.getInt("purchase_details_id"));
                purchaseDetails.setPurchase(purchase);
                purchaseDetails.setProduct(product);
                purchaseDetails.setQuantity(rs.getInt("quantity"));
                purchaseDetails.setPurchasePrice(rs.getDouble("purchase_price"));
                purchaseDetails.setTotal(rs.getDouble("total"));
                purchaseDetails.setRemarks(rs.getString("remarks"));
                purchaseDetails.setCreatedDate(rs.getDate("created_date"));
                purchaseDetails.setCreatedBy(rs.getInt("created_by"));
                purchaseDetails.setModifiedDate(rs.getDate("modified_date"));
                purchaseDetails.setModifiedBy(rs.getInt("modified_by"));
            }

        } catch (Exception e) {
            System.out.println("ERROR in getPurchaseDetailsByID: " + e.getMessage());
            e.printStackTrace();
        }
        return purchaseDetails;
    }

    @Override
    public Integer getPurchaseDetailsIDByPurchaseID(Integer purchaseID) {
        Integer id = null;
        ResultSet rs = null;
        try {
            String query = "SELECT purchase_details_id FROM purchase_details WHERE purchase_code = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, purchaseID);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                id = rs.getInt("purchase_details_id");
            }

        } catch (Exception e) {
            System.out.println("ERROR in getPurchaseDetailsIDByPurchaseID: " + e.getMessage());
            e.printStackTrace();
        }
        return id;
    }

    @Override
    public List<PurchaseDetails> getAllVendor() {
        List<PurchaseDetails> allPurchaseDetails = new ArrayList<>();
        ResultSet rs = null;

        try {
            String query = "SELECT * FROM purchase_details";
            PreparedStatement pstmt = conn.prepareStatement(query);

            rs = pstmt.executeQuery();

            while (rs.next()) {
                PurchaseDetails purchaseDetails = new PurchaseDetails();

                Purchase purchase = new Purchase();
                purchase.setPurchaseCode(rs.getString("purchase_code"));

                Product product = new Product();
                product.setProductID(rs.getInt("product_id"));

                purchaseDetails.setPurchaseDetailsID(rs.getInt("purchase_details_id"));
                purchaseDetails.setPurchase(purchase);
                purchaseDetails.setProduct(product);
                purchaseDetails.setQuantity(rs.getInt("quantity"));
                purchaseDetails.setPurchasePrice(rs.getDouble("purchase_price"));
                purchaseDetails.setTotal(rs.getDouble("total"));
                purchaseDetails.setRemarks(rs.getString("remarks"));
                purchaseDetails.setCreatedDate(rs.getDate("created_date"));
                purchaseDetails.setCreatedBy(rs.getInt("created_by"));
                purchaseDetails.setModifiedDate(rs.getDate("modified_date"));
                purchaseDetails.setModifiedBy(rs.getInt("modified_by"));

                allPurchaseDetails.add(purchaseDetails);
            }

        } catch (Exception e) {
            System.out.println("ERROR in getAllVendor: " + e.getMessage());
            e.printStackTrace();
        }
        return allPurchaseDetails;
    }

    @Override
    public List<PurchaseDetails> getAllDetailsOf(Purchase purchase) {
        List<PurchaseDetails> allPurchaseDetails = new ArrayList<>();
        ResultSet rs = null;

        try {
            String query = "SELECT * FROM purchase_details WHERE purchase_code = ? AND status = 1";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, purchase.getPurchaseCode());

            rs = pstmt.executeQuery();

            while (rs.next()) {
                PurchaseDetails purchaseDetails = new PurchaseDetails();

                Product product = new Product();
                product.setProductID(rs.getInt("product_id"));

                purchaseDetails.setPurchase(purchase);
                purchaseDetails.setProduct(product);
                purchaseDetails.setPurchasePrice(rs.getDouble("purchase_price"));
                purchaseDetails.setQuantity(rs.getInt("quantity"));
                purchaseDetails.setTotal(rs.getDouble("total"));
                purchaseDetails.setCreatedDate(rs.getDate("created_date"));
                purchaseDetails.setCreatedBy(rs.getInt("created_by"));
                purchaseDetails.setModifiedDate(rs.getDate("modified_date"));
                purchaseDetails.setModifiedBy(rs.getInt("modified_by"));

                allPurchaseDetails.add(purchaseDetails);
            }

        } catch (Exception e) {
            System.out.println("ERROR in getAllDetailsOf: " + e.getMessage());
            e.printStackTrace();
        }

        return allPurchaseDetails;
    }
}
