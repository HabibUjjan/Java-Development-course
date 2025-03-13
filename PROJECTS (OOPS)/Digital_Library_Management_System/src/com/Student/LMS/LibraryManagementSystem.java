package com.Student.LMS;
import java.util.*;
public class LibraryManagementSystem {
     ArrayList<Book> books = new ArrayList<>();
     ArrayList<Student> students = new ArrayList<>();
     Scanner scanner = new Scanner(System.in);

    public  LibraryManagementSystem() {
        books.add(new Book(14, "Java  ",  " 56", "Habib  ",  30));
        books.add(new Book(89, "CPP   ",  " 32", "Deen   ",  25));
        books.add(new Book(21, "DotNet",  " 77", "Jame   ",  20));
        books.add(new Book(41, "Python",  " 58", "Alice  ",  15));
        books.add(new Book(99, "C#    ",  " 65", "John   ",  10));
    }

    public void menu() {
        while (true) {
            System.out.println("*************WELL COME TO LIBRARY MANAGEMENT SYSTEM*************");
            System.out.println("1- Add Book into Library");
            System.out.println("2- Issue Book to Student");
            System.out.println("3- Return Book from Student");
            System.out.println("4- Show all Books");
            System.out.println("5- Show all Students");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    issueBook();
                    break;
                case 3:
                    returnBook();
                    break;
                case 4:
                    showAllBooks();
                    break;
                case 5:
                    showAllStudents();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public void addBook() {
        System.out.print("Enter book ID: ");
        int bookId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter name of book: ");
        String bookName = scanner.nextLine();
        System.out.print("Enter book ISBAN: ");
        String isban = scanner.nextLine();
        System.out.print("Enter author name: ");
        String author = scanner.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        Book newBook = new Book(bookId, bookName, isban, author, quantity);
        books.add(newBook);
        System.out.println("Book added successfully!");
    }

    public void issueBook() {
        System.out.print("Enter student ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter student roll number: ");
        String rollNumber = scanner.nextLine();
        System.out.print("Enter book ISBAN you want to issue: ");
        String isban = scanner.nextLine();
        Book book = findBookByIban(isban);
        if (book == null) {
            System.out.println("Invalid ISBAN Number");
        } else {
            if (book.getQuantity() > 0) {
                students.add(new Student(studentId, studentName, rollNumber, isban));
                book.setQuantity(book.getQuantity() - 1);
                System.out.println("Book issued successfully");
            } else {
                System.out.println("Book not available");
            }
        }
    }

    public void returnBook() {
        System.out.print("Enter student ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter book ISBAN you want to return: ");
        String isban = scanner.nextLine();
        Book book = findBookByIban(isban);
        if (book == null) {
            System.out.println("Invalid ISBAN number Entered");
        } else {
            Student student = findStudentById(studentId);
            if (student != null) {
                students.remove(student);
                book.setQuantity(book.getQuantity() + 1);
                System.out.println("Book returned successfully!");
            } else {
                System.out.println("Student ID not found");
            }
        }
    }


    public void showAllBooks() {
        System.out.println("              <<<<<<<<<<Books in Library>>>>>>>>>>            ");
        System.out.println("Book Name        ISBAN           Author   Quantity Book ID");
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            String bookName = book.name +                    "            ";
            String iban = book.iban +                        "            ";
            String author = book.author +"  ";
            String quantity = String.valueOf(book.quantity) +"       ";
            String bookId = String.valueOf(book.bookId) +    "       ";
            System.out.println(bookName + iban + author + quantity + bookId);
        }
    }


    public void showAllStudents() {
        System.out.println("            <<<<<<<<<<Students with Issued Books>>>>>>>>>>            ");
        System.out.println("Student ID   Student Name   Roll Number   ISBAN");
        for (int i = 0; i < students.size(); i++) {
            students.get(i).showStudentData();
        }
    }

    public Book findBookByIban(String isban) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).iban.equals(isban)) {
                return books.get(i);
            }
        }

        return null;
    }

    public Student findStudentById(int studentId) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).studentId == studentId) {
                return students.get(i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        LibraryManagementSystem libraryManagementSystem = new LibraryManagementSystem();
        libraryManagementSystem.menu();
    }
}

