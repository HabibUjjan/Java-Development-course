class Car {
    String name;
    double price;
    String color;
    String model; 

    //Method car details
    public void displayInfo() {
        System.out.println("Name  : " + name);
        System.out.println("Price : " + price);
        System.out.println("Color : " + color);
        System.out.println("Model : " + model);
    }

    // Method of tax of the car's price
    public void applyTax(double taxPercentage) {
        if (taxPercentage > 0) {
            double taxAmount = price * taxPercentage / 100; 
			price += taxAmount;
            System.out.println("Tax Applied: " + taxPercentage + "%");
            System.out.println("New Price After Tax: " + price);
        } else {
            System.out.println("Invalid tax percentage.");
        }
    }

    public static void main(String Args[]) {
        // Details Of carChevrolet
        System.out.println("<<<<<<<<CAR'S INFORMATION>>>>>>>>");
        Car carChevrolet = new Car();
        carChevrolet.name = "Malibu";
        carChevrolet.price = 4400000;
        carChevrolet.color = "Grey";
        carChevrolet.model = "Chevrolet Malibu LS";
        carChevrolet.displayInfo();  // Display carChevrolet details
        carChevrolet.applyTax(5);  // Apply 5% tax to carChevrolet
        System.out.println();  // For separating details of different cars

        // Details Of carFord
        Car carFord = new Car();
        carFord.name = "Mustang";
        carFord.price = 4453300;
        carFord.color = "Blue";
        carFord.model = "Ford Mustang GT";
        carFord.displayInfo();  // Display carFord details
        carFord.applyTax(5);  // Apply 5% tax to carFord
        System.out.println();

        // Details of carBMW
        Car carBMW = new Car();
        carBMW.name = "3 Series";
        carBMW.price = 94100000;
        carBMW.color = "White";
        carBMW.model = "BMW 330i";
		carChevrolet.displayInfo();
        System.out.println();

        // Details Of CarMercedes
        Car carMercedes = new Car();
        carMercedes.name = "C-Class";
        carMercedes.price = 94400000;
        carMercedes.color = "Yellow";
        carMercedes.model = "Mercedes-Benz C300";
		carChevrolet.displayInfo();
        System.out.println();

        // Details of carAudi
        Car carAudi = new Car();
        carAudi.name = "A4";
        carAudi.price = 78100000;
        carAudi.color = "Red";
        carAudi.model = "Audi A4 Premium";
		carChevrolet.displayInfo();
        System.out.println();
    }
}
