package com.Student.LMS;

import java.io.*;
import java.util.*;

public class LibraryManagementSystem {
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public LibraryManagementSystem() {
        loadBooksFromFile();
        loadStudentsFromFile();
    }

    public void menu() {
        while (true) {
            System.out.println("\n************* WELCOME TO LIBRARY MANAGEMENT SYSTEM *************\n");
            System.out.println("Please choose an option:");
            System.out.println("---------------------------------------------------------------");
            System.out.println("1 - Add Book into Library");
            System.out.println("2 - Issue Book to Student");
            System.out.println("3 - Return Book from Student");
            System.out.println("4 - Show All Books");
            System.out.println("5 - Show All Students");
            System.out.println("6 - Exit");
            System.out.println("---------------------------------------------------------------");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            System.out.println();

            if (choice == 1) {
                addBook();
            } else if (choice == 2) {
                issueBook();
            } else if (choice == 3) {
                returnBook();
            } else if (choice == 4) {
                showAllBooks();
            } else if (choice == 5) {
                showAllStudents();
            } else if (choice == 6) {
                System.out.println("Thank you for using Library Management System!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
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
        saveBookToFile(newBook);
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
                Student s = new Student(studentId, studentName, rollNumber, isban);
                students.add(s);
                book.setQuantity(book.getQuantity() - 1);
                saveStudentToFile(s);
                updateBookFile();
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
                updateStudentFile();
                updateBookFile();
                System.out.println("Book returned successfully!");
            } else {
                System.out.println("Student ID not found");
            }
        }
    }

    public void showAllBooks() {
        System.out.println("<<<<<<<<<< Books in Library >>>>>>>>>>");
        System.out.printf("%-10s %-20s %-15s %-20s %-10s\n", "Book ID", "Book Name", "ISBAN", "Author", "Quantity");
        System.out.println("-----------------------------------------------------------------------------------");

        for (Book book : books) {
            System.out.printf("%-10d %-20s %-15s %-20s %-10d\n",
                    book.bookId, book.name, book.iban, book.author, book.quantity);
        }
    }

    public void showAllStudents() {
        System.out.println("<<<<<<<<<< Students with Issued Books >>>>>>>>>>");
        System.out.printf("%-12s %-20s %-15s %-15s\n", "Student ID", "Student Name", "Roll Number", "ISBAN");
        System.out.println("--------------------------------------------------------------------------");

        for (Student student : students) {
            System.out.printf("%-12d %-20s %-15s %-15s\n",
                    student.studentId, student.studentName, student.rollNumber, student.issuedBookIban);
        }
    }

    public Book findBookByIban(String isban) {
        for (Book book : books) {
            if (book.iban.equals(isban)) {
                return book;
            }
        }
        return null;
    }

    public Student findStudentById(int studentId) {
        for (Student student : students) {
            if (student.studentId == studentId) {
                return student;
            }
        }
        return null;
    }

    public void saveBookToFile(Book book) {
        try {
            FileWriter fw = new FileWriter("books.txt", true);
            fw.write(book.bookId + "," + book.name + "," + book.iban + "," + book.author + "," + book.quantity + "\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("Error writing book to file.");
        }
    }

    public void saveStudentToFile(Student s) {
        try {
            FileWriter fw = new FileWriter("students.txt", true);
            fw.write(s.studentId + "," + s.studentName + "," + s.rollNumber + "," + s.issuedBookIban + "\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("Error saving student.");
        }
    }

    public void updateBookFile() {
        try {
            FileWriter fw = new FileWriter("books.txt");
            for (Book b : books) {
                fw.write(b.bookId + "," + b.name + "," + b.iban + "," + b.author + "," + b.quantity + "\n");
            }
            fw.close();
        } catch (IOException e) {
            System.out.println("Error updating book file.");
        }
    }

    public void updateStudentFile() {
        try {
            FileWriter fw = new FileWriter("students.txt");
            for (Student s : students) {
                fw.write(s.studentId + "," + s.studentName + "," + s.rollNumber + "," + s.issuedBookIban + "\n");
            }
            fw.close();
        } catch (IOException e) {
            System.out.println("Error updating student file.");
        }
    }

    public void loadBooksFromFile() {
        try {
            File file = new File("books.txt");
            if (!file.exists()) return;
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String[] parts = reader.nextLine().split(",");
                if (parts.length == 5) {
                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    String isban = parts[2];
                    String author = parts[3];
                    int quantity = Integer.parseInt(parts[4]);
                    books.add(new Book(id, name, isban, author, quantity));
                }
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Error loading books.");
        }
    }

    public void loadStudentsFromFile() {
        try {
            File file = new File("students.txt");
            if (!file.exists()) return;
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String[] parts = reader.nextLine().split(",");
                if (parts.length == 4) {
                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    String roll = parts[2];
                    String isban = parts[3];
                    students.add(new Student(id, name, roll, isban));
                }
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Error loading students.");
        }
    }

    public static void main(String[] args) {
        LibraryManagementSystem lms = new LibraryManagementSystem();
        lms.menu();
    }
}
