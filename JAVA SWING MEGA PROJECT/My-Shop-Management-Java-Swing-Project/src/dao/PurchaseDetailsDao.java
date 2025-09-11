/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Purchase;
import model.PurchaseDetails;
import java.util.List;

/**
 *
 * @author HABIB
 */
public interface PurchaseDetailsDao {
    public Integer addPurchaseDetails(PurchaseDetails purchaseDetails);
    public Integer updatePurchaseDetails(PurchaseDetails purchaseDetails);
    public Integer deletePurchaseDetails(Integer purchaseDetailsID);
    public PurchaseDetails getPurchaseDetailsByID(Integer purchaseDetailsID);
    public Integer getPurchaseDetailsIDByPurchaseID(Integer purchaseDetailsID);
    public List<PurchaseDetails> getAllVendor();
    public List<PurchaseDetails> getAllDetailsOf(Purchase purchase);
}
