package daoimpl;

import java.sql.Connection;
import dao.PurchaseTransactionHistoryDao;
import database.DBConnection;
import model.Account;
import model.Purchase;
import model.PurchaseTransactionHistory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PurchaseTransactionHistoryDaoImpl implements PurchaseTransactionHistoryDao {

    Connection conn = DBConnection.getDbConnection();

    @Override
    public Integer addPurchaseTransactionHistory(PurchaseTransactionHistory purchaseTransactionHistory) {
        Integer row = null;
        try {
            java.sql.Date purchaseDate = new java.sql.Date(purchaseTransactionHistory.getPurchaseDate().getTime());
            java.sql.Date createdDate = new java.sql.Date(purchaseTransactionHistory.getCreatedDate().getTime());

            String query = "INSERT INTO purchase_transaction_history (account_id, purchase_date, purchase_id, transaction_ammount, remarks, created_date, created_by, status) VALUES (?, ?, ?, ?, ?, ?, ?, 1)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, purchaseTransactionHistory.getAccount().getAccountID());
            pstmt.setDate(2, purchaseDate);
            pstmt.setInt(3, purchaseTransactionHistory.getPurchase().getPurchaseID());
            pstmt.setDouble(4, purchaseTransactionHistory.getTransactionAmount());
            pstmt.setString(5, purchaseTransactionHistory.getRemarks());
            pstmt.setDate(6, createdDate);
            pstmt.setInt(7, purchaseTransactionHistory.getCreatedBy());

            row = pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("ERROR in addPurchaseTransactionHistory: " + e.getMessage());
            e.printStackTrace();
        }
        return row;
    }

    @Override
    public Integer updatePurchaseTransactionHistory(PurchaseTransactionHistory purchaseTransactionHistory) {
        Integer row = null;
        try {
            java.sql.Date purchaseDate = new java.sql.Date(purchaseTransactionHistory.getPurchaseDate().getTime());
            java.sql.Date modifiedDate = new java.sql.Date(purchaseTransactionHistory.getModifiedDate().getTime());

            String query = "UPDATE purchase_transaction_history SET account_id = ?, purchase_date = ?, purchase_id = ?, transaction_ammount = ?, remarks = ?, modified_date = ?, modified_by = ? WHERE purchase_transaction_history_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, purchaseTransactionHistory.getAccount().getAccountID());
            pstmt.setDate(2, purchaseDate);
            pstmt.setInt(3, purchaseTransactionHistory.getPurchase().getPurchaseID());
            pstmt.setDouble(4, purchaseTransactionHistory.getTransactionAmount());
            pstmt.setString(5, purchaseTransactionHistory.getRemarks());
            pstmt.setDate(6, modifiedDate);
            pstmt.setInt(7, purchaseTransactionHistory.getModifiedBy());
            pstmt.setInt(8, purchaseTransactionHistory.getPurchaseTransactionID());

            row = pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("ERROR in updatePurchaseTransactionHistory: " + e.getMessage());
            e.printStackTrace();
        }
        return row;
    }

    @Override
    public Integer deletePurchaseTransactionHistory(Integer purchaseTransactionHistoryID) {
        Integer row = null;
        try {
            String query = "UPDATE purchase_transaction_history SET status = 0 WHERE purchase_transaction_history_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, purchaseTransactionHistoryID);

            row = pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("ERROR in deletePurchaseTransactionHistory: " + e.getMessage());
            e.printStackTrace();
        }
        return row;
    }

    @Override
    public PurchaseTransactionHistory getPurchaseTransactionHistoryByID(Integer purchaseTransactionHistoryID) {
        PurchaseTransactionHistory purchaseTransactionHistory = null;
        ResultSet rs = null;

        try {
            String query = "SELECT * FROM purchase_transaction_history WHERE purchase_transaction_history_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, purchaseTransactionHistoryID);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                purchaseTransactionHistory = new PurchaseTransactionHistory();

                Purchase purchase = new Purchase();
                purchase.setPurchaseID(rs.getInt("purchase_id"));

                Account account = new Account();
                account.setAccountID(rs.getInt("account_id"));

                purchaseTransactionHistory.setPurchaseTransactionID(rs.getInt("purchase_transaction_history_id"));
                purchaseTransactionHistory.setAccount(account);
                purchaseTransactionHistory.setPurchaseDate(rs.getDate("purchase_date"));
                purchaseTransactionHistory.setPurchase(purchase);
                purchaseTransactionHistory.setTransactionAmount(rs.getDouble("transaction_ammount"));
                purchaseTransactionHistory.setRemarks(rs.getString("remarks"));
                purchaseTransactionHistory.setCreatedDate(rs.getDate("created_date"));
                purchaseTransactionHistory.setCreatedBy(rs.getInt("created_by"));
                purchaseTransactionHistory.setModifiedDate(rs.getDate("modified_date"));
                purchaseTransactionHistory.setModifiedBy(rs.getInt("modified_by"));
            }

        } catch (Exception e) {
            System.out.println("ERROR in getPurchaseTransactionHistoryByID: " + e.getMessage());
            e.printStackTrace();
        }

        return purchaseTransactionHistory;
    }

    @Override
    public Integer getPurchaseTransactionHistoryIDByPurchaseID(Integer purchaseID) {
        Integer id = null;
        ResultSet rs = null;

        try {
            String query = "SELECT purchase_transaction_history_id FROM purchase_transaction_history WHERE purchase_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, purchaseID);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                id = rs.getInt("purchase_transaction_history_id");
            }

        } catch (Exception e) {
            System.out.println("ERROR in getPurchaseTransactionHistoryIDByPurchaseID: " + e.getMessage());
            e.printStackTrace();
        }

        return id;
    }

    @Override
    public List<PurchaseTransactionHistory> getAllPurchaseTransactionHistory() {
        List<PurchaseTransactionHistory> historyList = new ArrayList<>();
        ResultSet rs = null;

        try {
            String query = "SELECT * FROM purchase_transaction_history";
            PreparedStatement pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                PurchaseTransactionHistory purchaseTransactionHistory = new PurchaseTransactionHistory();

                Purchase purchase = new Purchase();
                purchase.setPurchaseID(rs.getInt("purchase_id"));

                Account account = new Account();
                account.setAccountID(rs.getInt("account_id"));

                purchaseTransactionHistory.setPurchaseTransactionID(rs.getInt("purchase_transaction_history_id"));
                purchaseTransactionHistory.setAccount(account);
                purchaseTransactionHistory.setPurchaseDate(rs.getDate("purchase_date"));
                purchaseTransactionHistory.setPurchase(purchase);
                purchaseTransactionHistory.setTransactionAmount(rs.getDouble("transaction_ammount"));
                purchaseTransactionHistory.setRemarks(rs.getString("remarks"));
                purchaseTransactionHistory.setCreatedDate(rs.getDate("created_date"));
                purchaseTransactionHistory.setCreatedBy(rs.getInt("created_by"));
                purchaseTransactionHistory.setModifiedDate(rs.getDate("modified_date"));
                purchaseTransactionHistory.setModifiedBy(rs.getInt("modified_by"));

                historyList.add(purchaseTransactionHistory);
            }

        } catch (Exception e) {
            System.out.println("ERROR in getAllPurchaseTransactionHistory: " + e.getMessage());
            e.printStackTrace();
        }

        return historyList;
    }
}
