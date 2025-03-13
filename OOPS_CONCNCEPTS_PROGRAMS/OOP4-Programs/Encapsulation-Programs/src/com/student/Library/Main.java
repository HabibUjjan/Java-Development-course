package com.student.Library;

public class Main {
    public static void main(String[] args) {
        System.out.println("***********Libraries Details***********");
        System.out.println("***********City Library***********");
        Library library = new Library();
        library.setName("City Library");
        library.setLocation("Downtown");
        library.setNumberOfBooks(5000);
        library.setOpeningHours("9 AM to 6 PM");
        library.displayInfo();
        System.out.println();


        System.out.println("***********Public Library***********");
        Library library1 = new Library();
        library1.setName("Public Library");
        library1.setLocation("1234 Street");
        library1.setNumberOfBooks(6000);
        library1.setOpeningHours("10 AM to 10 PM");
        library1.displayInfo();
        System.out.println();

        System.out.println("***********University Library***********");
        Library library2 = new Library();
        library2.setName("University Library");
        library2.setLocation("Campus Area");
        library2.setNumberOfBooks(9000);
        library2.setOpeningHours("8 AM to 10 PM");
        library2.displayInfo();
        System.out.println();
    }
}
