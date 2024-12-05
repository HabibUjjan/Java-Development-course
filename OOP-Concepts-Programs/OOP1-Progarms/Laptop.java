class Laptop{
    String name;
    double price;
    String color;
    String model;
	public static void main(String Args[]){
	Laptop habibLaptop = new Laptop();
	habibLaptop.name = "Habibullah";
	habibLaptop.price = 45000;
	habibLaptop.color = "Sliver";
	habibLaptop.model = "Hp G3 840 Elite Book";
		
	System.out.println("LAPTOP'S INFORMATION");
        System.out.println("Name  : "+habibLaptop.name);
        System.out.println("Price : "+habibLaptop.price);
        System.out.println("Color : "+habibLaptop.color);
        System.out.println("Model : "+habibLaptop.model);
	System.out.println();


	Laptop muzafarLaptop = new Laptop();
        muzafarLaptop.name = "Muzzafar Ali";
        muzafarLaptop.price = 44000;
        muzafarLaptop.color = "Blue";
        muzafarLaptop.model = "Dell Latitude E44";


        System.out.println("Name  : "+muzafarLaptop.name);
        System.out.println("Price : "+muzafarLaptop.price);
        System.out.println("Color : "+muzafarLaptop.color);
        System.out.println("Model : "+muzafarLaptop.model);
	System.out.println();
		
	Laptop shahzadLaptop = new Laptop();
        shahzadLaptop.name = "Shahzad Ali";
        shahzadLaptop.price = 410000;
        shahzadLaptop.color = "Black";
        shahzadLaptop.model = "Hp G4 545 Pro Book";


        System.out.println("Name  : "+shahzadLaptop.name);
        System.out.println("Price : "+shahzadLaptop.price);
        System.out.println("Color : "+shahzadLaptop.color);
        System.out.println("Model : "+shahzadLaptop.model);
	System.out.println();
		
		
	Laptop sajidLaptop  = new Laptop();
        sajidLaptop.name = "Sajid Hussain";
        sajidLaptop.price = 43000;
        sajidLaptop.color = "Blue";
        sajidLaptop.model = "Dell Latitude E67";

        
        System.out.println("Name  : "+sajidLaptop.name);
        System.out.println("Price : "+sajidLaptop.price);
        System.out.println("Color : "+sajidLaptop.color);
        System.out.println("Model : "+sajidLaptop.model);
        System.out.println();
		
		
	Laptop partabLaptop = new Laptop();
        partabLaptop.name = "Partab Kumar";
        partabLaptop.price = 46000;
        partabLaptop.color = "black";
        partabLaptop.model = "Lenovo 543";

      
        System.out.println("Name  : "+partabLaptop.name);
        System.out.println("Price : "+partabLaptop.price);
        System.out.println("Color : "+partabLaptop.color);
        System.out.println("Model : "+partabLaptop.model);
	}

}
