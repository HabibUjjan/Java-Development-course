package daoimpl;

import java.sql.Connection;
import database.DBConnection;
import model.Order;
import model.OrderDetails;
import model.Product;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import dao.OrderDetailsDao;

public class OrderDetailsDaoImpl implements OrderDetailsDao {

    Connection conn = DBConnection.getDbConnection();

    @Override
    public Integer addOrderDetails(OrderDetails orderDetails) {
        Integer row = null;
        try {
            String query = "INSERT INTO order_details (product_id, selling_price, quantity, total, order_code, created_date, created_by, status) VALUES (?, ?, ?, ?, ?, ?, ?, 1)";
            java.sql.Date sqlDate = new java.sql.Date(orderDetails.getCreatedDate().getTime());

            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, orderDetails.getProduct().getProductID());
            pstmt.setDouble(2, orderDetails.getSellingPrice());
            pstmt.setInt(3, orderDetails.getQuantity());
            pstmt.setDouble(4, orderDetails.getTotal());
            pstmt.setString(5, orderDetails.getOrder().getOrderCode());
            pstmt.setDate(6, sqlDate);
            pstmt.setInt(7, orderDetails.getCreatedBy());

            row = pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("ERROR IN ADD ORDER DETAILS: " + e.getMessage());
            e.printStackTrace();
        }
        return row;
    }

    @Override
    public Integer updateOrderDetails(OrderDetails orderDetails) {
        Integer row = null;
        try {
            String query = "UPDATE order_details SET product_id = ?, selling_price = ?, quantity = ?, total = ?, order_code = ?, modified_date = ?, modified_by = ? WHERE order_details_id = ?";
            java.sql.Date sqlDate = new java.sql.Date(orderDetails.getModifiedDate().getTime());

            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, orderDetails.getProduct().getProductID());
            pstmt.setDouble(2, orderDetails.getSellingPrice());
            pstmt.setInt(3, orderDetails.getQuantity());
            pstmt.setDouble(4, orderDetails.getTotal());
            pstmt.setString(5, orderDetails.getOrder().getOrderCode());
            pstmt.setDate(6, sqlDate);
            pstmt.setInt(7, orderDetails.getModifiedBy());
            pstmt.setInt(8, orderDetails.getOrderDetailID());

            row = pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("ERROR IN UPDATE ORDER DETAILS: " + e.getMessage());
            e.printStackTrace();
        }
        return row;
    }

    @Override
    public Integer deleteOrderDetails(Integer orderID) {
        Integer row = null;
        try {
            String query = "UPDATE order_details SET status = 0 WHERE order_details_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, orderID);

            row = pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("ERROR IN DELETE ORDER DETAILS: " + e.getMessage());
            e.printStackTrace();
        }
        return row;
    }

    @Override
    public OrderDetails getOrderDetailsByID(Integer orderID) {
        OrderDetails orderDetails = null;
        ResultSet rs = null;

        try {
            String query = "SELECT * FROM order_details WHERE order_details_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, orderID);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                orderDetails = new OrderDetails();

                Product product = new Product();
                product.setProductID(rs.getInt("product_id"));

                Order order = new Order();
                order.setOrderCode(rs.getString("order_code"));

                orderDetails.setOrderDetailID(rs.getInt("order_details_id"));
                orderDetails.setProduct(product);
                orderDetails.setSellingPrice(rs.getDouble("selling_price"));
                orderDetails.setQuantity(rs.getInt("quantity"));
                orderDetails.setTotal(rs.getDouble("total"));
                orderDetails.setOrder(order);
                orderDetails.setCreatedDate(rs.getDate("created_date"));
                orderDetails.setCreatedBy(rs.getInt("created_by"));
                orderDetails.setModifiedDate(rs.getDate("modified_date"));
                orderDetails.setModifiedBy(rs.getInt("modified_by"));
            }

        } catch (Exception e) {
            System.out.println("ERROR IN GET ORDER DETAILS BY ID: " + e.getMessage());
            e.printStackTrace();
        }

        return orderDetails;
    }

    @Override
    public Integer getOrderDetailsIDByORDERID(Integer orderID) {
        Integer id = null;
        ResultSet rs = null;

        try {
            String query = "SELECT order_details_id FROM order_details WHERE order_details_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, orderID);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                id = rs.getInt("order_details_id");
            }

        } catch (Exception e) {
            System.out.println("ERROR IN GET ORDER DETAILS ID BY ORDER ID: " + e.getMessage());
            e.printStackTrace();
        }

        return id;
    }

    @Override
    public List<OrderDetails> getAllOrderDetails() {
        List<OrderDetails> allOrderDetails = new ArrayList<>();
        ResultSet rs = null;

        try {
            String query = "SELECT * FROM order_details WHERE status = 1";
            PreparedStatement pstmt = conn.prepareStatement(query);

            rs = pstmt.executeQuery();

            while (rs.next()) {
                OrderDetails orderDetails = new OrderDetails();

                Product product = new Product();
                product.setProductID(rs.getInt("product_id"));

                Order order = new Order();
                order.setOrderCode(rs.getString("order_code"));

                orderDetails.setOrderDetailID(rs.getInt("order_details_id"));
                orderDetails.setProduct(product);
                orderDetails.setSellingPrice(rs.getDouble("selling_price"));
                orderDetails.setQuantity(rs.getInt("quantity"));
                orderDetails.setTotal(rs.getDouble("total"));
                orderDetails.setOrder(order);
                orderDetails.setCreatedDate(rs.getDate("created_date"));
                orderDetails.setCreatedBy(rs.getInt("created_by"));
                orderDetails.setModifiedDate(rs.getDate("modified_date"));
                orderDetails.setModifiedBy(rs.getInt("modified_by"));

                allOrderDetails.add(orderDetails);
            }

        } catch (Exception e) {
            System.out.println("ERROR IN GET ALL ORDER DETAILS: " + e.getMessage());
            e.printStackTrace();
        }

        return allOrderDetails;
    }

    @Override
    public List<OrderDetails> getAllDetailsOf(Order order) {
        List<OrderDetails> allOrderDetails = new ArrayList<>();
        ResultSet rs = null;

        try {
            String query = "SELECT * FROM order_details WHERE order_code = ? AND status = 1";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, order.getOrderCode());

            rs = pstmt.executeQuery();

            while (rs.next()) {
                OrderDetails orderDetails = new OrderDetails();

                Product product = new Product();
                product.setProductID(rs.getInt("product_id"));

                Order order1 = new Order();
                order1.setOrderCode(rs.getString("order_code"));

                orderDetails.setOrderDetailID(rs.getInt("order_details_id"));
                orderDetails.setProduct(product);
                orderDetails.setSellingPrice(rs.getDouble("selling_price"));
                orderDetails.setQuantity(rs.getInt("quantity"));
                orderDetails.setTotal(rs.getDouble("total"));
                orderDetails.setOrder(order1);
                orderDetails.setCreatedDate(rs.getDate("created_date"));
                orderDetails.setCreatedBy(rs.getInt("created_by"));
                orderDetails.setModifiedDate(rs.getDate("modified_date"));
                orderDetails.setModifiedBy(rs.getInt("modified_by"));

                allOrderDetails.add(orderDetails);
            }

        } catch (Exception e) {
            System.out.println("ERROR IN GET ALL DETAILS OF ORDER: " + e.getMessage());
            e.printStackTrace();
        }

        return allOrderDetails;
    }

}
