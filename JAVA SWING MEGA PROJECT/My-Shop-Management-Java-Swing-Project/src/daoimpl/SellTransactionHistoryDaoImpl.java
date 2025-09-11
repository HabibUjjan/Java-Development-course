package daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dao.SellTransactionHistoryDao;
import database.DBConnection;
import model.Account;
import model.Order;
import model.SellTransactionHistory;

public class SellTransactionHistoryDaoImpl implements SellTransactionHistoryDao {

    Connection conn = DBConnection.getDbConnection();

    @Override
    public Integer addSellTransactionHistory(SellTransactionHistory history) {
        Integer row = null;
        try {
            String query = "INSERT INTO sell_transaction_history (account_id, selling_date, order_id, amount, remarks, created_date, created_by, status) VALUES (?, ?, ?, ?, ?, ?, ?, 1)";
            PreparedStatement pstmt = conn.prepareStatement(query);

            pstmt.setInt(1, history.getAccount().getAccountID());
            pstmt.setDate(2, new java.sql.Date(history.getSellingDate().getTime()));
            pstmt.setInt(3, history.getOrder().getOrderID());
            pstmt.setDouble(4, history.getAmount());
            pstmt.setString(5, history.getRemarks());
            pstmt.setDate(6, new java.sql.Date(history.getCreatedDate().getTime()));
            pstmt.setInt(7, history.getCreatedBy());

            row = pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("ERROR in addSellTransactionHistory: " + e.getMessage());
            e.printStackTrace();
        }
        return row;
    }

    @Override
    public Integer updateSellTransactionHistory(SellTransactionHistory history) {
        Integer row = null;
        try {
            String query = "UPDATE sell_transaction_history SET account_id = ?, selling_date = ?, order_id = ?, amount = ?, remarks = ?, modified_date = ?, modified_by = ? WHERE sell_transaction_history_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);

            pstmt.setInt(1, history.getAccount().getAccountID());
            pstmt.setDate(2, new java.sql.Date(history.getSellingDate().getTime()));
            pstmt.setInt(3, history.getOrder().getOrderID());
            pstmt.setDouble(4, history.getAmount());
            pstmt.setString(5, history.getRemarks());
            pstmt.setDate(6, new java.sql.Date(history.getModifiedDate().getTime()));
            pstmt.setInt(7, history.getModifiedBy());
            pstmt.setInt(8, history.getSellTransactionID());

            row = pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("ERROR in updateSellTransactionHistory: " + e.getMessage());
            e.printStackTrace();
        }
        return row;
    }

    @Override
    public Integer deleteSellTransactionHistory(Integer sellTransactionHistoryID) {
        Integer row = null;
        try {
            String query = "UPDATE sell_transaction_history SET status = 0 WHERE sell_transaction_history_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, sellTransactionHistoryID);

            row = pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("ERROR in deleteSellTransactionHistory: " + e.getMessage());
            e.printStackTrace();
        }
        return row;
    }

    @Override
    public SellTransactionHistory getSellTransactionHistoryByID(Integer sellTransactionHistoryID) {
        SellTransactionHistory history = null;
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM sell_transaction_history WHERE sell_transaction_history_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, sellTransactionHistoryID);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                history = new SellTransactionHistory();

                Account account = new Account();
                account.setAccountID(rs.getInt("account_id"));

                Order order = new Order();
                order.setOrderID(rs.getInt("order_id"));

                history.setSellTransactionID(rs.getInt("sell_transaction_history_id"));
                history.setAccount(account);
                history.setSellingDate(rs.getDate("selling_date"));
                history.setOrder(order);
                history.setAmount(rs.getDouble("amount"));
                history.setRemarks(rs.getString("remarks"));
                history.setCreatedDate(rs.getDate("created_date"));
                history.setCreatedBy(rs.getInt("created_by"));
                history.setModifiedDate(rs.getDate("modified_date"));
                history.setModifiedBy(rs.getInt("modified_by"));
            }

        } catch (Exception e) {
            System.out.println("ERROR in getSellTransactionHistoryByID: " + e.getMessage());
            e.printStackTrace();
        }
        return history;
    }

    @Override
    public Integer getSellTransactionHistoryIDByOrderID(Integer orderId) {
        Integer id = null;
        ResultSet rs = null;
        try {
            String query = "SELECT sell_transaction_history_id FROM sell_transaction_history WHERE order_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, orderId);

            rs = pstmt.executeQuery();
            if (rs.next()) {
                id = rs.getInt("sell_transaction_history_id");
            }

        } catch (Exception e) {
            System.out.println("ERROR in getSellTransactionHistoryIDByOrderID: " + e.getMessage());
            e.printStackTrace();
        }
        return id;
    }

    @Override
    public List<SellTransactionHistory> getAllSellTransactionHistory() {
        List<SellTransactionHistory> historyList = new ArrayList<>();
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM sell_transaction_history";
            PreparedStatement pstmt = conn.prepareStatement(query);

            rs = pstmt.executeQuery();

            while (rs.next()) {
                SellTransactionHistory history = new SellTransactionHistory();

                Account account = new Account();
                account.setAccountID(rs.getInt("account_id"));

                Order order = new Order();
                order.setOrderID(rs.getInt("order_id"));

                history.setSellTransactionID(rs.getInt("sell_transaction_history_id"));
                history.setAccount(account);
                history.setSellingDate(rs.getDate("selling_date"));
                history.setOrder(order);
                history.setAmount(rs.getDouble("amount"));
                history.setRemarks(rs.getString("remarks"));
                history.setCreatedDate(rs.getDate("created_date"));
                history.setCreatedBy(rs.getInt("created_by"));
                history.setModifiedDate(rs.getDate("modified_date"));
                history.setModifiedBy(rs.getInt("modified_by"));

                historyList.add(history);
            }

        } catch (Exception e) {
            System.out.println("ERROR in getAllSellTransactionHistory: " + e.getMessage());
            e.printStackTrace();
        }
        return historyList;
    }
}
