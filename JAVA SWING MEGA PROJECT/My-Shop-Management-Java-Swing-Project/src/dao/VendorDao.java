/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Vendor;
import java.util.List;

/**
 *
 * @author HABIB
 */

public interface VendorDao{
    public Integer addVendor(Vendor vendor);
    public Integer updateVendor(Vendor vendor);
    public Integer deleteVendor(Integer vendorID);
    public Vendor getVendorByID(Integer vendorID);
    public Integer getVendorIDByName(String vendorName);
    public List<Vendor> getAllVendor();
}
