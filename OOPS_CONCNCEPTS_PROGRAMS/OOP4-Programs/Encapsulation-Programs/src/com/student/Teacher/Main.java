package com.student.Teacher;

public class Main {
    public static void main(String[] args) {
        System.out.println("*********Teacher's Information*********");
        Teacher teacher = new Teacher();
        teacher.setName("Usama");
        teacher.setAge(29);
        teacher.setSubject("DataBase");
        teacher.setSchoolName("SMI University");
        teacher.displayInfo();
        System.out.println();

        Teacher teacher1 = new Teacher();
        teacher1.setName("Asif");
        teacher1.setAge(37);
        teacher1.setSubject("Information Security");
        teacher1.setSchoolName("SMI University");
        teacher1.displayInfo();
        System.out.println();

        Teacher teacher2 = new Teacher();
        teacher2.setName("Dr. imtaiz");
        teacher2.setAge(45);
        teacher2.setSubject("Artificial Intelligence");
        teacher2.setSchoolName("SMI University");
        teacher2.displayInfo();
        System.out.println();

        Teacher teacher3 = new Teacher();
        teacher3.setName("Wajih Naeem");
        teacher3.setAge(39);
        teacher3.setSubject("Software Engineering");
        teacher3.setSchoolName("SMI University");
        teacher3.displayInfo();
        System.out.println();

    }
}
