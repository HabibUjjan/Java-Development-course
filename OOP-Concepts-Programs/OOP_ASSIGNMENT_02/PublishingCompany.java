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
        System.out.println("Price: " + price);
    }
}

class Book extends Publication {
    private int pageCount;

    void getdata() {
        super.getdata(); 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of pages: ");
        pageCount = sc.nextInt();
    }

    void putdata() {
        super.putdata(); 
        System.out.println("Page Count: " + pageCount);
    }
}


class Tape extends Publication {
    float playTime;

    public void getdata() {
        super.getdata(); 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter playing time in minutes: ");
        playTime = sc.nextFloat();
    }

    public void putdata() {
        super.putdata(); 
        System.out.println("Playing Time: " + playTime + " minutes");
    }
}

public class PublishingCompany {
	
    public static void main(String[] args) {
        Book book = new Book();
        Tape tape = new Tape();

        System.out.println("***********Enter details for the book***********");
        book.getdata();

        System.out.println("***********Enter details for the tape***********");
        tape.getdata();

        System.out.println("***********Displaying details of The Book***********");
        book.putdata();
	System.out.println();

        System.out.println("********Displaying details Of The Tape********");
        tape.putdata();
    }
}
