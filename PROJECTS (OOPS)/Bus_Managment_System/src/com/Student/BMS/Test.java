package com.Student.BMS;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bus_Management_System busSystem = new Bus_Management_System();
        while (true) {
            System.out.println("***************Well Come to Bus Management System***************");
            System.out.println("1- Add Bus");
            System.out.println("2- View All Buses");
            System.out.println("3- Update Bus");
            System.out.println("4- Delete Bus");
            System.out.println("5- Add Customer");
            System.out.println("6- View All Customers");
            System.out.println("7- Print Receipt");
            System.out.println("8- Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                System.out.print("Enter bus number: ");
                String busNumber = sc.nextLine();
                System.out.print("Enter bus capacity: ");
                int capacity = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter bus type (AC/Non-AC): ");
                String busType = sc.nextLine();
                System.out.print("Enter bus route: ");
                String route = sc.nextLine();
                System.out.print("Enter driver name: ");
                String driverName = sc.nextLine();
                System.out.print("Enter ticket price: ");
                double ticketPrice = sc.nextDouble();
                busSystem.addBus(busNumber, capacity, busType, route, driverName, ticketPrice);

            } else if (choice == 2) {
                busSystem.viewAllBuses();

            } else if (choice == 3) {
                System.out.print("Enter bus number to update: ");
                String busNumber = sc.nextLine();
                System.out.print("Enter new capacity: ");
                int newCapacity = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter new bus type: ");
                String newBusType = sc.nextLine();
                System.out.print("Enter new route: ");
                String newRoute = sc.nextLine();
                System.out.print("Enter new driver name: ");
                String newDriverName = sc.nextLine();
                System.out.print("Enter new ticket price: ");
                double newTicketPrice = sc.nextDouble();
                busSystem.updateBus(busNumber, newCapacity, newBusType, newRoute, newDriverName, newTicketPrice);

            } else if (choice == 4) {
                System.out.print("Enter bus number to delete: ");
                String busNumber = sc.nextLine();
                busSystem.deleteBus(busNumber);

            } else if (choice == 5) {
                System.out.print("Enter customer name: ");
                String customerName = sc.nextLine();
                System.out.print("Enter bus number: ");
                String busNumber = sc.nextLine();
                System.out.print("Enter number of seats: ");
                int numberOfSeats = sc.nextInt();
                busSystem.addCustomer(customerName, busNumber, numberOfSeats);

            } else if (choice == 6) {
                busSystem.viewAllCustomers();

            } else if (choice == 7) {
                System.out.print("Enter customer name: ");
                String customerName = sc.nextLine();
                System.out.print("Enter bus number: ");
                String busNumber = sc.nextLine();
                busSystem.printReceipt(busNumber, customerName);

            } else if (choice == 8) {
                System.out.println("Thanks For using our Service");
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}
