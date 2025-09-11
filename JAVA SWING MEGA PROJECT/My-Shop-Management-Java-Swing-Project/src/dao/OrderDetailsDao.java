/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Order;
import model.OrderDetails;
import java.util.List;

/**
 *
 * @author HABIB
 */
public interface OrderDetailsDao {
    public Integer addOrderDetails(OrderDetails order);
    public Integer updateOrderDetails(OrderDetails order);
    public Integer deleteOrderDetails(Integer orderID);
    public OrderDetails getOrderDetailsByID(Integer orderID);
    public Integer getOrderDetailsIDByORDERID(Integer orderID);
    public List<OrderDetails> getAllOrderDetails();
    public List<OrderDetails> getAllDetailsOf(Order order);
}
