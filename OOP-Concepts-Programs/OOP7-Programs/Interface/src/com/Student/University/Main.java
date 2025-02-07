package com.Student.University;

public class Main {
    public static void main(String[] args) {
        University engUni = new EngineeringUniversity();
        University medUni = new MedicalUniversity();
        University artsUni = new ArtsUniversity();
        University busUni = new BusinessUniversity();


        System.out.println("************Engineering University************");
        engUni.offerCourses();
        engUni.conductExams();
        engUni.provideScholarships();
        engUni.hostEvents();
        System.out.println();


        System.out.println("************Medical University************");
        medUni.offerCourses();
        medUni.conductExams();
        medUni.provideScholarships();
        medUni.hostEvents();
        System.out.println();


        System.out.println("************Arts University************");
        artsUni.offerCourses();
        artsUni.conductExams();
        artsUni.provideScholarships();
        artsUni.hostEvents();
        System.out.println();



        System.out.println("************Business University************");
        busUni.offerCourses();
        busUni.conductExams();
        busUni.provideScholarships();
        busUni.hostEvents();
        System.out.println();
    }
}
