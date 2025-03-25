package com.Student.BMS;

import java.util.*;

public class Bus_Management_System {
     ArrayList<Bus> buses = new ArrayList<>();
     ArrayList<Customer> customers = new ArrayList<>();

    public void addBus(String busNumber, int capacity, String busType, String route, String driverName, double ticketPrice) {
        Bus newBus = new Bus(busNumber, capacity, busType, route, driverName, ticketPrice);
        buses.add(newBus);
        System.out.println("Bus added successfully");
        System.out.println();
    }

    public void updateBus(String busNumber, int newCapacity, String newBusType, String newRoute, String newDriverName, double newTicketPrice) {
        boolean found = false;
        for (int i = 0; i < buses.size(); i++) {
            Bus bus = buses.get(i);
            if (bus.getBusNumber().equals(busNumber)) {
                bus.setCapacity(newCapacity);
                bus.setBusType(newBusType);
                bus.setRoute(newRoute);
                bus.setDriverName(newDriverName);
                bus.setTicketPrice(newTicketPrice);
                System.out.println("Bus updated successfully");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Bus with number " + busNumber + " not found");
        }
    }
    public void deleteBus(String busNumber) {
        boolean found = false;
        for (int i = 0; i < buses.size(); i++) {
            Bus bus = buses.get(i);
            if (bus.getBusNumber().equals(busNumber)) {
                buses.remove(i);
                System.out.println("Bus deleted successfully.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Bus with number " + busNumber + " not found");
        }
    }
    public void viewAllBuses() {
        if (buses.isEmpty()) {
            System.out.println("No buses available");
        } else {
            for (int i = 0; i < buses.size(); i++) {
                System.out.println("Bus " + (i + 1) + ":");
                buses.get(i).displayInfo();
                System.out.println();
            }
        }
    }
    public void addCustomer(String customerName, String busNumber, int numberOfSeats) {
        boolean busFound = false;
        for(int i = 0; i < buses.size(); i++) {
            if (buses.get(i).getBusNumber().equals(busNumber)) {
                busFound = true;
                break;
            }
        }
        if (busFound) {
            Customer newCustomer = new Customer(customerName, busNumber, numberOfSeats);
            customers.add(newCustomer);
            System.out.println("Customer added successfully");
            System.out.println();
        } else {
            System.out.println("Bus with number " + busNumber + " not found");
        }
    }
    public void viewAllCustomers() {
        if (customers.isEmpty()) {
            System.out.println("No customers found");
        } else {
            for (int i = 0; i < customers.size(); i++) {
                System.out.println("Customer " + (i + 1) + ":");
                customers.get(i).displayCustomerInfo();
                System.out.println();
            }
        }
    }
    public void printReceipt(String busNumber, String customerName) {
        Bus bus = null;
        Customer customer = null;
        for (int i = 0; i < buses.size(); i++) {
            if (buses.get(i).getBusNumber().equals(busNumber)) {
                bus = buses.get(i);
                break;
            }
        }

        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).customerName.equals(customerName)) {
                customer = customers.get(i);
                break;
            }
        }

        if (bus != null && customer != null) {
            customer.printReceipt(bus);
        } else {
            System.out.println("Bus or Customer not found");
        }
    }
}
