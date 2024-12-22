class Employee{
    String name;
    int age;
    double salary;
    static String companyName;

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "Ali";
        e1.age = 30;
        e1.salary = 60000.50;
        Employee.companyName = "NISUM";

        
        Employee e2 = new Employee();
        e2.name = "Habib";
        e2.age = 28;
        e2.salary = 95000.75;

        
        Employee e3 = new Employee();
        e3.name = "Shahid";
        e3.age = 35;
        e3.salary = 70000.00;

        System.out.println("********Employee One********");
        System.out.println(e1.name);
        System.out.println(e1.age);
        System.out.println(e1.salary);
        System.out.println(Employee.companyName);
	System.out.println();

        System.out.println("********Employee Two********");
        System.out.println(e2.name);
        System.out.println(e2.age);
        System.out.println(e2.salary);
        System.out.println(Employee.companyName);
	System.out.println();


        System.out.println("********Employee Three********");
        System.out.println(e3.name);
        System.out.println(e3.age);
        System.out.println(e3.salary);
        System.out.println(Employee.companyName);
    }
}
