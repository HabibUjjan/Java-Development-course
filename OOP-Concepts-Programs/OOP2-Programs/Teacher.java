class Teacher {
    String name;
    int age;
    String subject;
    static String schoolName;

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "Mr.Habib";
        t1.age = 40;
        t1.subject = "Mathematics";
        Teacher.schoolName = "Govt: Murad High School"; 

        Teacher t2 = new Teacher();
        t2.name = "Mr.Ali";
        t2.age = 35;
        t2.subject = "English";

        
        Teacher t3 = new Teacher();
        t3.name = "Mr.Shahid";
        t3.age = 45;
        t3.subject = "Science";

        
        System.out.println("**********Teacher One**********");
        System.out.println(t1.name);
        System.out.println(t1.age);
        System.out.println(t1.subject);
        System.out.println(Teacher.schoolName);
	System.out.println();

        System.out.println("**********Teacher Two**********");
        System.out.println(t2.name);
        System.out.println(t2.age);
        System.out.println(t2.subject);
        System.out.println(Teacher.schoolName);
	System.out.println();

        System.out.println("**********Teacher Three**********");
        System.out.println(t3.name);
        System.out.println(t3.age);
        System.out.println(t3.subject);
        System.out.println(Teacher.schoolName);
    }
}
