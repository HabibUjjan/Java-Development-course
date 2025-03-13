class Book{
    String title;
    String author;
    double price;
    static String publisher;

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "Java Programming";
        b1.author = "Habib";
        b1.price = 5000.75;
        Book.publisher = "Habib Books Publishing";

        
        Book b2 = new Book();
        b2.title = "Python for Beginners";
        b2.author = "Ali";
        b2.price = 4000.30;

        
        Book b3 = new Book();
        b3.title = "Data Structures";
        b3.author = "Habib";
        b3.price = 3500.00;

        System.out.println("<<<<<<<<Book One>>>>>>>>");
        System.out.println(b1.title);
        System.out.println(b1.author);
        System.out.println(b1.price);
        System.out.println(Book.publisher);
	System.out.println();

        System.out.println("<<<<<<<<Book Two>>>>>>>>");
        System.out.println(b2.title);
        System.out.println(b2.author);
        System.out.println(b2.price);
        System.out.println(Book.publisher);
	System.out.println();

        System.out.println("<<<<<<<<Book Three>>>>>>>>");
        System.out.println(b3.title);
        System.out.println(b3.author);
        System.out.println(b3.price);
        System.out.println(Book.publisher);
    }
}
