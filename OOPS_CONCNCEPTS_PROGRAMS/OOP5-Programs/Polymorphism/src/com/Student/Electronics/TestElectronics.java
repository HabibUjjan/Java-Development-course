package com.Student.Electronics;

public class TestElectronics {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop();
        myLaptop.setBrand("HP");
        myLaptop.setPower(65);

        Smartphone mySmartphone = new Smartphone();
        mySmartphone.setBrand("Vivo");
        mySmartphone.setPower(15);

        myLaptop.displayInfo();
        mySmartphone.displayInfo();
    }
}

