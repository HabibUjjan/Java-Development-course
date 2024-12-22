class Product{
    String productName;
    double price;
    int quantity;
    static String storeName;

    public static void main(String[] args) {
        Product p1 = new Product();
        p1.productName = "Laptop";
        p1.price = 70000.50;
        p1.quantity = 10;
        Product.storeName = "Habib Store";

        Product p2 = new Product();
        p2.productName = "Smartphone";
        p2.price = 30000.75;
        p2.quantity = 5;

        Product p3 = new Product();
        p3.productName = "Headphones";
        p3.price = 2000.99;
        p3.quantity = 15;

        System.out.println("*********Product One*********");
        System.out.println(p1.productName);
        System.out.println(p1.price);
        System.out.println(p1.quantity);
        System.out.println(Product.storeName);
	System.out.println();

        System.out.println("*********Product Two*********");
        System.out.println(p2.productName);
        System.out.println(p2.price);
        System.out.println(p2.quantity);
        System.out.println(Product.storeName);
	System.out.println();

        System.out.println("*********Product Three*********");
        System.out.println(p3.productName);
        System.out.println(p3.price);
        System.out.println(p3.quantity);
        System.out.println(Product.storeName);
    }
}
