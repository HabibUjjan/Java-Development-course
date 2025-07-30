/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HABIB
 */


public class Teacher {
    private String name;
    private String TeacherId;
    private String subject;
    private String qualification;
    private String contact;

    public Teacher(){}
    
    public Teacher(String name, String TeacherId,String subject, String qualification, String contact) {
        this.name = name;
        this.name = TeacherId;
        this.subject = subject;
        this.qualification = qualification;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
public String getTeacherId() {
        return name;
    }

    public void setTeacherId(String name) {
        this.name = name;
    }
    
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}

