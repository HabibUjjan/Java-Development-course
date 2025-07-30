/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daoimpl;

import dao.FeeDao;
import database.DBConnection;
import java.sql.Connection;
import java.sql.Statement;
import model.Fee;

/**
 *
 * @author HABIB
 */


public class FeeDaoImpl implements FeeDao {
    @Override
    public void addFee(Fee fee) {
        try {
            Connection con = DBConnection.getDbConnection();
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO fees (roll_no, name, total_fee, paid_amount, due_amount, payment_date) VALUES ('"
                    + fee.getRollNo() + "', '"
                    + fee.getName() + "', "
                    + fee.getTotalFee() + ", "
                    + fee.getPaidAmount() + ", "
                    + fee.getDueAmount() + ", '"
                    + fee.getPaymentDate() + "')";

            stmt.executeUpdate(sql);
            System.out.println("Fee record inserted successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
