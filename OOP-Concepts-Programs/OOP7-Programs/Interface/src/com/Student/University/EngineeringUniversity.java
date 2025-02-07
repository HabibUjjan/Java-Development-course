package com.Student.University;

public class EngineeringUniversity implements University{
    @Override
    public void offerCourses() {
        System.out.println("Engineering University offers BS Programs, MS Programs, B.Tech and Ph.D. programs");
    }

    @Override
    public void conductExams() {
        System.out.println("Engineering University conducts annual exams and semester exams");
    }

    @Override
    public void provideScholarships() {
        System.out.println("Engineering University offers merit-based and need-based scholarships");
    }

    @Override
    public void hostEvents() {
        System.out.println("Engineering University hosts tech fests, hackathons, and workshops");
    }
}
