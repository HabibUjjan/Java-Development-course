import java.util.Scanner;

class Publication {
    String title;
    float price;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter title: ");
        title = sc.nextLine();
        System.out.print("Enter price: ");
        price = sc.nextFloat();
    }

    void putdata() {
        System.out.println("Title: " + title);
        System.out.println("Price: $" + price);
    }
}

class Sales {
    float[] sales = new float[3];
    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sales for the last 3 months (3 values): ");
        for (int i = 0; i < 3; i++) {
            sales[i] = sc.nextFloat();
        }
    }
    void putdata() {
        System.out.println("Sales for the last 3 months: ");
        for (int i = 0; i < 3; i++) {
            System.out.println("Month " + (i + 1) + ": $" + sales[i]);
        }
    }
}

class Book extends Publication {
    int pageCount;

    void getdata() {
        super.getdata(); 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of pages: ");
        pageCount = sc.nextInt();
        super.getdata();
    }
    void putdata() {
        super.putdata();
        System.out.println("Page Count: " + pageCount);
        super.putdata(); 
    }
}
class Tape extends Publication {
    float playTime;

    void getdata() {
        super.getdata();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter playing time in minutes: ");
        playTime = sc.nextFloat();
        super.getdata();  
    }

     void putdata() {
        super.putdata();
        System.out.println("Playing Time: " + playTime + " minutes");
        super.putdata(); 
    }
}

public class PublishingCompanyProgram {
    public static void main(String[] args) {
        Book book = new Book();
        Tape tape = new Tape();

        System.out.println("Enter details for the book:");
        book.getdata();

        System.out.println("Enter details for the tape:");
        tape.getdata();


        System.out.println("**********Displaying details of the Book**********");
        book.putdata();

        System.out.println("**********Displaying details of the Tape**********");
        tape.putdata();
    }
}
