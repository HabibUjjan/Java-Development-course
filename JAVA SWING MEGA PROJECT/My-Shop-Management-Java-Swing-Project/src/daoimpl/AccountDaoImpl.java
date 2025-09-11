package daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import dao.AccountDao;
import database.DBConnection;
import model.Account;
import java.util.ArrayList;
import java.util.List;

public class AccountDaoImpl implements AccountDao {
    Connection conn = DBConnection.getDbConnection();
    @Override
    public Integer addAccount(Account account) {
        Integer row = null;
        try {
            String query = "INSERT INTO accounts (account_title, bank_name, account_number, current_balance, remarks, created_date, created_by, status) VALUES (?, ?, ?, ?, ?, ?, ?, 1)";
            java.sql.Date sqlDate = new java.sql.Date(account.getCreatedDate().getTime());

            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, account.getAccountName());
            pstmt.setString(2, account.getBankName());
            pstmt.setString(3, account.getAccountNumber());
            pstmt.setDouble(4, account.getCurrentBalance());
            pstmt.setString(5, account.getRemarks());
            pstmt.setDate(6, sqlDate);
            pstmt.setInt(7, account.getCreatedBy());

            row = pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("ERROR IN ADD ACCOUNT: " + e.getMessage());
            e.printStackTrace();
        }
        return row;
    }

    @Override
    public Integer updateAccount(Account account) {
        Integer row = null;
        try {
            String query = "UPDATE accounts SET account_title=?, bank_name=?, current_balance=?, remarks=?, modified_date=?, modified_by=? WHERE account_id=?";
            java.sql.Date sqlDate = new java.sql.Date(account.getModifiedDate().getTime());

            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, account.getAccountName());
            pstmt.setString(2, account.getBankName());
            pstmt.setDouble(3, account.getCurrentBalance());
            pstmt.setString(4, account.getRemarks());
            pstmt.setDate(5, sqlDate);
            pstmt.setInt(6, account.getModifiedBy());
            pstmt.setInt(7, account.getAccountID());

            row = pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("ERROR IN UPDATE ACCOUNT: " + e.getMessage());
            e.printStackTrace();
        }
        return row;
    }

    @Override
    public Integer deleteAccount(Integer accountID) {
        Integer row = null;
        try {
            String query = "UPDATE accounts SET status = 0 WHERE account_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, accountID);
            row = pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("ERROR IN DELETE ACCOUNT: " + e.getMessage());
            e.printStackTrace();
        }
        return row;
    }

    @Override
    public Account getAccountByID(Integer accountID) {
        Account account = null;
        ResultSet rs = null;

        try {
            String query = "SELECT * FROM accounts WHERE account_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, accountID);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                account = new Account();
                account.setAccountID(rs.getInt("account_id"));
                account.setAccountName(rs.getString("account_title"));
                account.setBankName(rs.getString("bank_name"));
                account.setAccountNumber(rs.getString("account_number"));
                account.setCurrentBalance(rs.getDouble("current_balance"));
                account.setCreatedDate(rs.getDate("created_date"));
                account.setCreatedBy(rs.getInt("created_by"));
                account.setModifiedDate(rs.getDate("modified_date"));
                account.setModifiedBy(rs.getInt("modified_by"));
                account.setRemarks(rs.getString("remarks"));
            }

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        }

        return account;
    }

    @Override
    public Integer getAccountIDByName(String accountName) {
        Integer id = null;
        ResultSet rs = null;
        try {
            String query = "SELECT account_id FROM accounts WHERE account_title = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, accountName);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                id = rs.getInt("account_id");
            }

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        }
        return id;
    }

    @Override
    public List<Account> getAllAccount() {
        List<Account> allAccounts = new ArrayList<>();
        ResultSet rs = null;

        try {
            String query = "SELECT * FROM accounts WHERE status = 1";
            PreparedStatement pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                Account account = new Account();
                account.setAccountID(rs.getInt("account_id"));
                account.setAccountName(rs.getString("account_title"));
                account.setBankName(rs.getString("bank_name"));
                account.setAccountNumber(rs.getString("account_number"));
                account.setCurrentBalance(rs.getDouble("current_balance"));
                account.setCreatedDate(rs.getDate("created_date"));
                account.setCreatedBy(rs.getInt("created_by"));
                account.setModifiedDate(rs.getDate("modified_date"));
                account.setModifiedBy(rs.getInt("modified_by"));
                account.setRemarks(rs.getString("remarks"));
                allAccounts.add(account);
            }

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        }

        return allAccounts;
    }

    @Override
    public boolean checkAccountNumber(String accountNumber) {
        boolean result = false;
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM accounts WHERE account_number = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, accountNumber);
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

    @Override
    public boolean checkAccount(String accountName) {
        boolean result = false;
        ResultSet rs = null;
        try {
            String query = "SELECT account_title FROM accounts WHERE account_title = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, accountName);
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

    @Override
    public Integer depositAmount(Account account, Double amount) {
        Integer row = null;
        try {
            String query = "UPDATE accounts SET current_balance = current_balance + ? WHERE account_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setDouble(1, amount);
            pstmt.setInt(2, account.getAccountID());
            row = pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        }
        return row;
    }

    @Override
    public Integer withdrawAmount(Account account, Double amount) {
        Integer row = null;
        try {
            String query = "UPDATE accounts SET current_balance = current_balance - ? WHERE account_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setDouble(1, amount);
            pstmt.setInt(2, account.getAccountID());
            row = pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        }
        return row;
    }

}
