package com.student;

import com.student.config.AppConfig;
import com.student.dao.BookDao;
import com.student.dao.MemberDao;
import com.student.dao.IssueDao;
import com.student.model.Book;
import com.student.model.Member;
import com.student.model.IssueRecord;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class MainApp{
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        BookDao bookDao = context.getBean(BookDao.class);
        MemberDao memberDao = context.getBean(MemberDao.class);
        IssueDao issueDao = context.getBean(IssueDao.class);
        Scanner scanner = new Scanner(System.in);
        int choice = 1;
        while (choice != 0) {
            System.out.println("*********** Library Management System ***********");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Add Member");
            System.out.println("4. View All Members");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book");
            System.out.println("7. View Issued Books");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();
                    Book book = new Book(0, title, author, quantity);
                    bookDao.addBook(book);
                    System.out.println("Book added successfully!");
                    System.out.println();
                    break;
                case 2:
                    List<Book> books = bookDao.getAllBooks();
                    for (Book b : books) {
                        b.displayInfo();
                        System.out.println("-----------");

                    }
                    break;
                case 3:
                    System.out.print("Enter member name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter member email: ");
                    String email = scanner.nextLine();
                    Member member = new Member(0, name, email);
                    memberDao.addMember(member);
                    System.out.println("Member added successfully!");
                    System.out.println();
                    break;
                case 4:
                    List<Member> members = memberDao.getAllMembers();
                    for (Member m : members) {
                        m.displayInfo();
                        System.out.println("-----------");

                    }
                    break;
                case 5:
                    System.out.print("Enter book ID to issue: ");
                    int bookId = scanner.nextInt();
                    System.out.print("Enter member ID: ");
                    int memberId = scanner.nextInt();
                    scanner.nextLine();
                    Date today = new Date();
                    System.out.print("Enter return date (dd/MM/yyyy): ");
                    String returnStr = scanner.nextLine();
                    Date returnDate = null;
                    try {
                        returnDate = new SimpleDateFormat("dd/MM/yyyy").parse(returnStr);
                    } catch (Exception e) {
                        System.out.println("Invalid return date!");
                        break;
                    }
                    IssueRecord issue = new IssueRecord(0, bookId, memberId, today, returnDate);
                    issueDao.issueBook(issue);
                    System.out.println("Book issued successfully!");
                    System.out.println();
                    break;
                case 6:
                    System.out.print("Enter Issue ID to return book: ");
                    int issueId = scanner.nextInt();
                    scanner.nextLine();
                    issueDao.returnBook(issueId);
                    System.out.println("Book returned successfully!");
                    System.out.println();
                    break;

                case 7:
                    List<IssueRecord> issues = issueDao.getAllIssuedBooks();
                    for (IssueRecord ir : issues) {
                        ir.displayInfo();
                        System.out.println("-----------");
                        System.out.println();

                    }
                    break;
                case 0:
                    System.out.println("Exiting..");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
