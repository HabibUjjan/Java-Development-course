package com.student.Person;

public class Doctor extends Person{
    public String specialization;
    public String licenseNo;
    public String name = "Sara";

    public void show() {
        System.out.println("I am a Doctor");
        System.out.println("My name is: " + super.name);
        System.out.println("My name is: " + name);
    }
        public void display() {
            System.out.println("Display method is called");
            super.show();
        }

        public static void main(String[] args){
            Doctor d = new Doctor();
            d.display();

        }
    }

