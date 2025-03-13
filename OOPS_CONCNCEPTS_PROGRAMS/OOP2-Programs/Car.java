class Car{
    String brand;
    String model;
    int year;
    static String companyName;

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Toyota";
        c1.model = "Corolla";
        c1.year = 2020;
        Car.companyName = "Toyota Motors";

        
        Car c2 = new Car();
        c2.brand = "Honda";
        c2.model = "Civic";
        c2.year = 2021;

        
        Car c3 = new Car();
        c3.brand = "Ford";
        c3.model = "Focus";
        c3.year = 2022;

        
        System.out.println("<<<<<<<<<Car One>>>>>>>>>");
        System.out.println(c1.brand);
        System.out.println(c1.model);
        System.out.println(c1.year);
        System.out.println(Car.companyName);
	System.out.println();

        System.out.println("<<<<<<<<<Car Two>>>>>>>>>");
        System.out.println(c2.brand);
        System.out.println(c2.model);
        System.out.println(c2.year);
        System.out.println(Car.companyName);
	System.out.println();

        System.out.println("<<<<<<<<<Car Three>>>>>>>>>");
        System.out.println(c3.brand);
        System.out.println(c3.model);
        System.out.println(c3.year);
        System.out.println(Car.companyName);
    }
}
