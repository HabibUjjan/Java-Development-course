class Laptop {
    String name;
    double price;
    String color;
    String model;

    //Display laptop details
    public void displayInfo() {
        System.out.println("Name  : " + name);
        System.out.println("Price : " + price);
        System.out.println("Color : " + color);
        System.out.println("Model : " + model);
    }

    // Method to increase the price by a percentage
    public void increasePrice(double percentage) {
        if (percentage > 0) {
            double increaseAmount = price * percentage / 100;
            price += increaseAmount;
            System.out.println("Price Increased by: " + percentage + "%");
            System.out.println("New Price After Increase: " + price);
        } else {
            System.out.println("Invalid percentage for price increase.");
        }
    }

    public static void main(String Args[]) {
        // Laptop details of Habib
		System.out.println("<<<<<<<<LAPTOP'S INFORMATION>>>>>>>>");
        Laptop habibLaptop = new Laptop();
        habibLaptop.name = "Habibullah";
        habibLaptop.price = 45000;
        habibLaptop.color = "Silver";
        habibLaptop.model = "Hp G3 840 Elite Book";
        habibLaptop.displayInfo();  // Display Habib's laptop details
        habibLaptop.increasePrice(10);  // Increase price by 10%
        System.out.println();
		
		
        // Laptop details of Muzafar
        Laptop muzafarLaptop = new Laptop();
        muzafarLaptop.name = "Muzzafar Ali";
        muzafarLaptop.price = 44000;
        muzafarLaptop.color = "Blue";
        muzafarLaptop.model = "Dell Latitude E44";
        muzafarLaptop.displayInfo();  // Display Muzafar's laptop details
        muzafarLaptop.increasePrice(5);  // Increase price by 5%
		System.out.println();


        // Laptop details of Shahzad
        Laptop shahzadLaptop = new Laptop();
        shahzadLaptop.name = "Shahzad Ali";
        shahzadLaptop.price = 410000;
        shahzadLaptop.color = "Black";
        shahzadLaptop.model = "Hp G4 545 Pro Book";
        shahzadLaptop.displayInfo();  // Display Shahzad's laptop details
		System.out.println();


        // Laptop details of Sajid
        Laptop sajidLaptop = new Laptop();
        sajidLaptop.name = "Sajid Hussain";
        sajidLaptop.price = 43000;
        sajidLaptop.color = "Blue";
        sajidLaptop.model = "Dell Latitude E67";
        sajidLaptop.displayInfo();  // Display Sajid's laptop details
        System.out.println();


        // Laptop details of Partab
        Laptop partabLaptop = new Laptop();
        partabLaptop.name = "Partab Kumar";
        partabLaptop.price = 46000;
        partabLaptop.color = "Black";
        partabLaptop.model = "Lenovo 543";
        partabLaptop.displayInfo();  // Display Partab's laptop details
        System.out.println();

    }
}
