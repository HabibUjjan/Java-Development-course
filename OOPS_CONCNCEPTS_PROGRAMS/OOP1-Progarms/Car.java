class Car{
      String name;
      double price;
      String color;
      String model; 

      public void applyDiscount(double discountPercentage) {
        if (discountPercentage > 0 && discountPercentage <= 100) {
            double discountAmount = price * discountPercentage / 100;
            price -= discountAmount;
            System.out.println("Discount Applied: " + discountPercentage + "%");
            System.out.println("New Price After Discount: " + price);
        } else {
            System.out.println("Invalid discount percentage.");
        }
    }
    
        public static void main(String Args[]){
        Car carChevrolet = new Car();
        carChevrolet.name = "Malibu";
        carChevrolet.price = 4400000;
        carChevrolet.color = "Grey";
        carChevrolet.model = "Chevrolet Malibu LS";

        System.out.println("<<<<<<<<CAR'S INFORAMTION>>>>>>>>");
        System.out.println("Name  : "+carChevrolet.name);
        System.out.println("Price : "+carChevrolet.price);
        System.out.println("Color : "+carChevrolet.color);
        System.out.println("Model : "+carChevrolet.model);
        // Apply a discount to carChevrolet
        carChevrolet.applyDiscount(10);  // 10% discount
	System.out.println();


	Car carFord = new Car();
        carChevrolet.name = "Mustang";
        carChevrolet.price = 4453300;
        carChevrolet.color = "Blue";
        carChevrolet.model = "Ford Mustang GT";

        
        System.out.println("Name  : "+carChevrolet.name);
        System.out.println("Price : "+carChevrolet.price);
        System.out.println("Color : "+carChevrolet.color);
        System.out.println("Model : "+carChevrolet.model);
	System.out.println();
		
	Car carBMW = new Car();
        carChevrolet.name = "3 Series";
        carChevrolet.price = 94100000;
        carChevrolet.color = "White";
        carChevrolet.model = "BMW 330i";

        
        System.out.println("Name  : "+carChevrolet.name);
        System.out.println("Price : "+carChevrolet.price);
        System.out.println("Color : "+carChevrolet.color);
        System.out.println("Model : "+carChevrolet.model);
	System.out.println();
		
		
	Car carMercedes = new Car();
        carChevrolet.name = "C-Class";
        carChevrolet.price = 94400000;
        carChevrolet.color = "Yellow";
        carChevrolet.model = "Mercedes-Benz C300";

        
        System.out.println("Name  : "+carChevrolet.name);
        System.out.println("Price : "+carChevrolet.price);
        System.out.println("Color : "+carChevrolet.color);
        System.out.println("Model : "+carChevrolet.model);
        System.out.println();
		
		
	Car carAudi = new Car();
        carChevrolet.name = "A4";
        carChevrolet.price = 78100000;
        carChevrolet.color = "Red";
        carChevrolet.model = "Audi A4 Premium";

        
        System.out.println("Name  : "+carChevrolet.name);
        System.out.println("Price : "+carChevrolet.price);
        System.out.println("Color : "+carChevrolet.color);
        System.out.println("Model : "+carChevrolet.model);
     }

}
