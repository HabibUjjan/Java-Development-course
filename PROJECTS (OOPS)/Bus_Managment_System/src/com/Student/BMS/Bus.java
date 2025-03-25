package com.Student.BMS;

public class Bus {
    String busNumber;
    int capacity;
    String busType;
    String route;
    String driverName;
    double ticketPrice;

    public Bus(String busNumber, int capacity, String busType, String route, String driverName, double ticketPrice) {
        this.busNumber = busNumber;
        this.capacity = capacity;
        this.busType = busType;
        this.route = route;
        this.driverName = driverName;
        this.ticketPrice = ticketPrice;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public void displayInfo() {
        System.out.println("Bus Number: " + busNumber);
        System.out.println("Capacity: " + capacity);
        System.out.println("Bus Type: " + busType);
        System.out.println("Route: " + route);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Ticket Price: " + ticketPrice);
    }
}

