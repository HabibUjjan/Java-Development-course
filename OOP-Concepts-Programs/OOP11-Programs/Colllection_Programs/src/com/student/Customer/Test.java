package com.student.Customer;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        System.out.println("*************CUSTOMER'S INFORMATION**************");
        List<Customer> customerList = new ArrayList<>();
        Customer customer1 = new Customer("Ali", 23, "GBT");
        customerList.add(customer1);

        Customer customer2 = new Customer("Fatima", 30, "Karachi");
        customerList.add(customer2);

        Customer customer3 = new Customer("Omar", 35, "New York");
        customerList.add(customer3);

        Customer customer4 = new Customer("Ayesha", 28, "London");
        customerList.add(customer4);

        Customer customer5 = new Customer("Ibrahim", 40, "Sydney");
        customerList.add(customer5);

        Customer customer6 = new Customer("Zainab", 22, "Dubai");
        customerList.add(customer6);

        Customer customer7 = new Customer("Hassan", 33, "Berlin");
        customerList.add(customer7);

        Customer customer8 = new Customer("Khadija", 27, "Paris");
        customerList.add(customer8);

        Customer customer9 = new Customer("Bilal", 45, "Toronto");
        customerList.add(customer9);

        Customer customer10 = new Customer("Mariam", 32, "Los Angeles");
        customerList.add(customer10);

        for (int i = 0; i<customerList.size(); i++){
            Customer customer = customerList.get(i);
            customer.displayInfo();
            System.out.println();

        }
    }
}
