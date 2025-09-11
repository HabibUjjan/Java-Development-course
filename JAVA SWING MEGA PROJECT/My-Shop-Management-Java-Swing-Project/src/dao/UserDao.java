/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.User;
import java.util.List;

/**
 *
 * @author HABIB
 */
public interface UserDao {
    public Integer addUser(User role);
    public Integer updateUser(User role);
    public Integer deleteUser(Integer roleId);
    public User getUserById(Integer id);
    public Integer getUserIdByName(String name);
    public List<User> getAllUser();
    
}
