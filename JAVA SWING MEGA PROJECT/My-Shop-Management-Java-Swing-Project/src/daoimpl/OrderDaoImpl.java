package daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import dao.OrderDao;
import database.DBConnection;
import model.Order;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class OrderDaoImpl implements OrderDao {

    Connection conn = DBConnection.getDbConnection();

    @Override
    public Integer addOrder(Order order) {
        Integer row = null;
        try {
            String query = "INSERT INTO orders (order_code, customer_name, order_date, customer_address, grand_total, remarks, created_date, created_by, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, 1)";
            java.sql.Date sqlDate = new java.sql.Date(order.getCreatedDate().getTime());

            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, order.getOrderCode());
            pstmt.setString(2, order.getCustomerName());
            pstmt.setDate(3, new java.sql.Date(order.getOrderDate().getTime()));
            pstmt.setString(4, order.getCustomerAddress());
            pstmt.setDouble(5, order.getGrandTotal());
            pstmt.setString(6, order.getRemarks());
            pstmt.setDate(7, sqlDate);
            pstmt.setInt(8, order.getCreatedBy());

            row = pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("ERROR IN ADD ORDER: " + e.getMessage());
            e.printStackTrace();
        }
        return row;
    }

    @Override
    public Integer updateOrder(Order order) {
        Integer row = null;
        try {
            String query = "UPDATE orders SET customer_name = ?, customer_address = ?, grand_total = ?, remarks = ?, modified_date = ?, modified_by = ? WHERE order_id = ?";
            java.sql.Date sqlDate = new java.sql.Date(order.getModifiedDate().getTime());

            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, order.getCustomerName());
            pstmt.setString(2, order.getCustomerAddress());
            pstmt.setDouble(3, order.getGrandTotal());
            pstmt.setString(4, order.getRemarks());
            pstmt.setDate(5, sqlDate);
            pstmt.setInt(6, order.getModifiedBy());
            pstmt.setInt(7, order.getOrderID());

            row = pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("ERROR IN UPDATE ORDER: " + e.getMessage());
            e.printStackTrace();
        }
        return row;
    }

    @Override
    public Integer deleteOrder(Integer orderID) {
        Integer row = null;
        try {
            String query = "UPDATE orders SET status = 0 WHERE order_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, orderID);

            row = pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("ERROR IN DELETE ORDER: " + e.getMessage());
            e.printStackTrace();
        }
        return row;
    }

    @Override
    public Order getOrderByID(Integer orderID) {
        Order order = null;
        ResultSet rs = null;

        try {
            String query = "SELECT * FROM orders WHERE order_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, orderID);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                order = new Order();
                order.setOrderID(rs.getInt("order_id"));
                order.setOrderCode(rs.getString("order_code"));
                order.setCustomerName(rs.getString("customer_name"));
                order.setCustomerAddress(rs.getString("customer_address"));
                order.setOrderDate(rs.getDate("order_date"));
                order.setGrandTotal(rs.getDouble("grand_total"));
                order.setCreatedDate(rs.getDate("created_date"));
                order.setCreatedBy(rs.getInt("created_by"));
                order.setModifiedDate(rs.getDate("modified_date"));
                order.setModifiedBy(rs.getInt("modified_by"));
                order.setRemarks(rs.getString("remarks"));
            }

        } catch (Exception e) {
            System.out.println("ERROR IN GET ORDER BY ID: " + e.getMessage());
            e.printStackTrace();
        }

        return order;
    }

    @Override
    public Integer getOrderIDByCode(String orderCode) {
        Integer id = null;
        ResultSet rs = null;
        try {
            String query = "SELECT order_id FROM orders WHERE order_code = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, orderCode);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                id = rs.getInt("order_id");
            }

        } catch (Exception e) {
            System.out.println("ERROR IN GET ORDER ID BY CODE: " + e.getMessage());
            e.printStackTrace();
        }

        return id;
    }

    @Override
    public List<Order> getAllOrder() {
        List<Order> allOrders = new ArrayList<>();
        ResultSet rs = null;

        try {
            String query = "SELECT * FROM orders WHERE status = 1";
            PreparedStatement pstmt = conn.prepareStatement(query);

            rs = pstmt.executeQuery();

            while (rs.next()) {
                Order order = new Order();
                order.setOrderID(rs.getInt("order_id"));
                order.setOrderCode(rs.getString("order_code"));
                order.setCustomerName(rs.getString("customer_name"));
                order.setCustomerAddress(rs.getString("customer_address"));
                order.setGrandTotal(rs.getDouble("grand_total"));
                order.setCreatedDate(rs.getDate("created_date"));
                order.setCreatedBy(rs.getInt("created_by"));
                order.setModifiedDate(rs.getDate("modified_date"));
                order.setModifiedBy(rs.getInt("modified_by"));
                order.setRemarks(rs.getString("remarks"));
                order.setOrderDate(rs.getDate("order_date"));

                allOrders.add(order);
            }

        } catch (Exception e) {
            System.out.println("ERROR IN GET ALL ORDER: " + e.getMessage());
            e.printStackTrace();
        }

        return allOrders;
    }

}
