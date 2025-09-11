package daoimpl;

import dao.VendorDao;
import database.DBConnection;
import model.Vendor;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VendorDaoImpl implements VendorDao {
    Connection conn = DBConnection.getDbConnection();
    @Override
    public Integer addVendor(Vendor vendor) {
        Integer row = null;
        try {
            String query = "INSERT INTO vendor (vendor_name, email, address, contact, remarks, created_date, created_by, status) VALUES (?, ?, ?, ?, 'None', ?, ?, 1)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, vendor.getVendorName());
            pstmt.setString(2, vendor.getEmail());
            pstmt.setString(3, vendor.getAddress());
            pstmt.setString(4, vendor.getContact());
            pstmt.setDate(5, new Date(vendor.getCreatedDate().getTime()));
            pstmt.setInt(6, vendor.getCreatedBy());

            row = pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("ERROR in addVendor: " + e.getMessage());
            e.printStackTrace();
        }
        return row;
    }

    @Override
    public Integer updateVendor(Vendor vendor) {
        Integer row = null;
        try {
            String query = "UPDATE vendor SET vendor_name = ?, email = ?, address = ?, contact = ?, remarks = ?, modified_date = ?, modified_by = ? WHERE vendor_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);

            pstmt.setString(1, vendor.getVendorName());
            pstmt.setString(2, vendor.getEmail());
            pstmt.setString(3, vendor.getAddress());
            pstmt.setString(4, vendor.getContact());
            pstmt.setString(5, vendor.getRemarks());
            pstmt.setDate(6, new Date(vendor.getModifiedDate().getTime()));
            pstmt.setInt(7, vendor.getCreatedBy()); // This should probably be getModifiedBy()
            pstmt.setInt(8, vendor.getVendorID());

            row = pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("ERROR in updateVendor: " + e.getMessage());
            e.printStackTrace();
        }
        return row;
    }

    @Override
    public Integer deleteVendor(Integer vendorID) {
        Integer row = null;
        try {
            String query = "UPDATE vendor SET status = 0 WHERE vendor_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, vendorID);
            row = pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("ERROR in deleteVendor: " + e.getMessage());
            e.printStackTrace();
        }
        return row;
    }

    @Override
    public Vendor getVendorByID(Integer vendorID) {
        Vendor vendor = null;
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM vendor WHERE vendor_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, vendorID);

            rs = pstmt.executeQuery();
            if (rs.next()) {
                vendor = new Vendor();
                vendor.setVendorID(rs.getInt("vendor_id"));
                vendor.setVendorName(rs.getString("vendor_name"));
                vendor.setEmail(rs.getString("email"));
                vendor.setAddress(rs.getString("address"));
                vendor.setContact(rs.getString("contact"));
                vendor.setCreatedDate(rs.getDate("created_date"));
                vendor.setCreatedBy(rs.getInt("created_by"));
                vendor.setModifiedDate(rs.getDate("modified_date"));
                vendor.setModifiedBy(rs.getInt("modified_by"));
                vendor.setRemarks(rs.getString("remarks"));
                vendor.setVendorAccount(rs.getString("vendor_account"));
                vendor.setVendorAccountBalance(rs.getDouble("vendor_account_balance"));
            }
        } catch (Exception e) {
            System.out.println("ERROR in getVendorByID: " + e.getMessage());
            e.printStackTrace();
        }
        return vendor;
    }

    @Override
    public Integer getVendorIDByName(String vendorName) {
        Integer id = null;
        ResultSet rs = null;
        try {
            String query = "SELECT vendor_id FROM vendor WHERE vendor_name = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, vendorName);

            rs = pstmt.executeQuery();
            if (rs.next()) {
                id = rs.getInt("vendor_id");
            }
        } catch (Exception e) {
            System.out.println("ERROR in getVendorIDByName: " + e.getMessage());
            e.printStackTrace();
        }
        return id;
    }

    @Override
    public List<Vendor> getAllVendor() {
        List<Vendor> allVendors = new ArrayList<>();
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM vendor WHERE status = 1";
            PreparedStatement pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                Vendor vendor = new Vendor();
                vendor.setVendorID(rs.getInt("vendor_id"));
                vendor.setVendorName(rs.getString("vendor_name"));
                vendor.setEmail(rs.getString("email"));
                vendor.setAddress(rs.getString("address"));
                vendor.setContact(rs.getString("contact"));
                vendor.setCreatedDate(rs.getDate("created_date"));
                vendor.setCreatedBy(rs.getInt("created_by"));
                vendor.setModifiedDate(rs.getDate("modified_date"));
                vendor.setModifiedBy(rs.getInt("modified_by"));
                vendor.setRemarks(rs.getString("remarks"));

                allVendors.add(vendor);
            }
        } catch (Exception e) {
            System.out.println("ERROR in getAllVendor: " + e.getMessage());
            e.printStackTrace();
        }
        return allVendors;
    }
}
