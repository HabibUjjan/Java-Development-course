package model;

public class Student {
    private String Name;
    private String rollNumber;
    private int Age;
    private String dept;

    public Student(String Name, String rollNumber, int Age, String dept){
        this.Name = Name;
        this.rollNumber = rollNumber;
        this.Age = Age;
        this.dept = dept;

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

}

