/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.SellTransactionHistory;
import java.util.List;

/**
 *
 * @author HABIB
 */
public interface SellTransactionHistoryDao {
    public Integer addSellTransactionHistory(SellTransactionHistory purchaseTransactionHistory);
    public Integer updateSellTransactionHistory(SellTransactionHistory purchaseTransactionHistory);
    public Integer deleteSellTransactionHistory(Integer purchaseTransactionHistoryID);
    public SellTransactionHistory getSellTransactionHistoryByID(Integer purchaseTransactionHistoryID);
    public Integer getSellTransactionHistoryIDByOrderID(Integer orderId);
    public List<SellTransactionHistory> getAllSellTransactionHistory();
}
