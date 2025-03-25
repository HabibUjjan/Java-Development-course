package com.Student.BMS;

public class Customer {
    String customerName;
    String busNumber;
    int numberOfSeats;

    public Customer(String customerName, String busNumber, int numberOfSeats) {
        this.customerName = customerName;
        this.busNumber = busNumber;
        this.numberOfSeats = numberOfSeats;
    }

    public void displayCustomerInfo() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Bus Number: " + busNumber);
        System.out.println("Seats Reserved: " + numberOfSeats);
    }

    public void printReceipt(Bus bus) {
        System.out.println("<<<<<<<<<<<<Receipt>>>>>>>>>>>>>");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Bus Number: " + busNumber);
        System.out.println("Route: " + bus.getRoute());
        System.out.println("Driver Name: " + bus.getDriverName());
        System.out.println("Seats Reserved: " + numberOfSeats);
        System.out.println("Ticket Price: " + bus.getTicketPrice());
        double totalAmount = bus.getTicketPrice() * numberOfSeats;
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>");
        System.out.println("Thank you for traveling with us");
    }
}
