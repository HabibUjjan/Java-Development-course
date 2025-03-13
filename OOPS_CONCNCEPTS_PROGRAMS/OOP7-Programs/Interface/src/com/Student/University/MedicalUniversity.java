package com.Student.University;

public class MedicalUniversity implements University{
    @Override
    public void offerCourses() {
        System.out.println("Medical University offers MBBS, MD, and other healthcare programs");

    }

    @Override
    public void conductExams() {
        System.out.println("Medical University conducts medical entrance exams and professional exams");

    }

    @Override
    public void provideScholarships() {
        System.out.println("Medical University provides scholarships for underprivileged students");

    }

    @Override
    public void hostEvents() {
        System.out.println("Medical University organizes medical conferences and health awareness programs");

    }
}
