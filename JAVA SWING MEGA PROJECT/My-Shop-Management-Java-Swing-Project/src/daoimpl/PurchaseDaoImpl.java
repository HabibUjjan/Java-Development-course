package daoimpl;

import java.sql.Connection;
import dao.PurchaseDao;
import database.DBConnection;
import model.Purchase;
import model.Vendor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PurchaseDaoImpl implements PurchaseDao {

    Connection conn = DBConnection.getDbConnection();

    @Override
    public Integer addPurchase(Purchase purchase) {
        Integer row = null;

        try {
            java.sql.Date purchaseDate = new java.sql.Date(purchase.getPurchaseDate().getTime());
            java.sql.Date createdDate = new java.sql.Date(purchase.getCreatedDate().getTime());

            String query = "INSERT INTO purchase (vendor_id, purchase_code, purchase_date, grand_total, discount, remarks, created_date, created_by, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, 1)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, purchase.getVendor().getVendorID());
            pstmt.setString(2, purchase.getPurchaseCode());
            pstmt.setDate(3, purchaseDate);
            pstmt.setDouble(4, purchase.getGrandTotal());
            pstmt.setDouble(5, purchase.getDiscount());
            pstmt.setString(6, purchase.getRemarks());
            pstmt.setDate(7, createdDate);
            pstmt.setInt(8, purchase.getCreatedBy());

            row = pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("ERROR in addPurchase: " + e.getMessage());
            e.printStackTrace();
        }
        return row;
    }

    @Override
    public Integer updatePurchase(Purchase purchase) {
        Integer row = null;

        try {
            java.sql.Date purchaseDate = new java.sql.Date(purchase.getPurchaseDate().getTime());
            java.sql.Date modifiedDate = new java.sql.Date(purchase.getModifiedDate().getTime());

            String query = "UPDATE purchase SET vendor_id = ?, purchase_code = ?, purchase_date = ?, grand_total = ?, discount = ?, remarks = ?, modified_date = ?, modified_by = ? WHERE purchase_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, purchase.getVendor().getVendorID());
            pstmt.setString(2, purchase.getPurchaseCode());
            pstmt.setDate(3, purchaseDate);
            pstmt.setDouble(4, purchase.getGrandTotal());
            pstmt.setDouble(5, purchase.getDiscount());
            pstmt.setString(6, purchase.getRemarks());
            pstmt.setDate(7, modifiedDate);
            pstmt.setInt(8, purchase.getModifiedBy());
            pstmt.setInt(9, purchase.getPurchaseID());

            row = pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("ERROR in updatePurchase: " + e.getMessage());
            e.printStackTrace();
        }
        return row;
    }

    @Override
    public Integer deletePurchase(Integer purchaseID) {
        Integer row = null;

        try {
            String query = "UPDATE purchase SET status = 0 WHERE purchase_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, purchaseID);

            row = pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("ERROR in deletePurchase: " + e.getMessage());
            e.printStackTrace();
        }
        return row;
    }

    @Override
    public Purchase getPurchaseByID(Integer purchaseID) {
        Purchase purchase = null;
        ResultSet rs = null;

        try {
            String query = "SELECT * FROM purchase WHERE purchase_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, purchaseID);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                purchase = new Purchase();

                Vendor vendor = new Vendor();
                vendor.setVendorID(rs.getInt("vendor_id"));

                purchase.setPurchaseID(rs.getInt("purchase_id"));
                purchase.setVendor(vendor);
                purchase.setPurchaseCode(rs.getString("purchase_code"));
                purchase.setPurchaseDate(rs.getDate("purchase_date"));
                purchase.setGrandTotal(rs.getDouble("grand_total"));
                purchase.setDiscount(rs.getDouble("discount"));
                purchase.setCreatedDate(rs.getDate("created_date"));
                purchase.setCreatedBy(rs.getInt("created_by"));
                purchase.setModifiedDate(rs.getDate("modified_date"));
                purchase.setModifiedBy(rs.getInt("modified_by"));
                purchase.setRemarks(rs.getString("remarks"));
            }

        } catch (Exception e) {
            System.out.println("ERROR in getPurchaseByID: " + e.getMessage());
            e.printStackTrace();
        }

        return purchase;
    }

    @Override
    public Integer getPurchaseIDByName(String purchaseCode) {
        Integer id = null;
        ResultSet rs = null;
        try {
            String query = "SELECT purchase_id FROM purchase WHERE purchase_code = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, purchaseCode);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                id = rs.getInt("purchase_id");
            }

        } catch (Exception e) {
            System.out.println("ERROR in getPurchaseIDByName: " + e.getMessage());
            e.printStackTrace();
        }
        return id;
    }

    @Override
    public List<Purchase> getAllPurchase() {
        List<Purchase> allPurchase = new ArrayList<>();
        ResultSet rs = null;

        try {
            String query = "SELECT * FROM purchase";
            PreparedStatement pstmt = conn.prepareStatement(query);

            rs = pstmt.executeQuery();

            while (rs.next()) {
                Purchase purchase = new Purchase();

                Vendor vendor = new Vendor();
                vendor.setVendorID(rs.getInt("vendor_id"));

                purchase.setPurchaseID(rs.getInt("purchase_id"));
                purchase.setVendor(vendor);
                purchase.setPurchaseCode(rs.getString("purchase_code"));
                purchase.setPurchaseDate(rs.getDate("purchase_date"));
                purchase.setGrandTotal(rs.getDouble("grand_total"));
                purchase.setDiscount(rs.getDouble("discount"));
                purchase.setCreatedDate(rs.getDate("created_date"));
                purchase.setCreatedBy(rs.getInt("created_by"));
                purchase.setModifiedDate(rs.getDate("modified_date"));
                purchase.setModifiedBy(rs.getInt("modified_by"));
                purchase.setRemarks(rs.getString("remarks"));

                allPurchase.add(purchase);
            }

        } catch (Exception e) {
            System.out.println("ERROR in getAllPurchase: " + e.getMessage());
            e.printStackTrace();
        }

        return allPurchase;
    }
}
