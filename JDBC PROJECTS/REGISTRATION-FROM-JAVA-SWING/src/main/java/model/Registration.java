/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HABIB
 */


public class Registration {
    private String name;
    private String email;
    private String password;
    private String gender;
    private String phone;
    private String city;
    private String course;
   
    public Registration(String name, String email, String password, String gender, String phone, String city, String course) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.phone = phone;
        this.city = city;
        this.course = course;
        
    }

    public String getName() { 
        return name; 
    }
    public String getEmail() { 
        return email; }
    public String getPassword() { 
        return password; }
    public String getGender() { 
        return gender; }
    public String getPhone() { 
        return phone; }
    public String getCity() { 
        return city; }
    public String getCourse() { 
        return course; }
    
}

