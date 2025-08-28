package com.student.servlet;
import com.student.dao.StudentDao;
import com.student.daoimpl.StudentDaoImpl;
import com.student.model.Student;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;
@WebServlet("/register")
public class StudentRegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html");
        String name = request.getParameter("name");
        String rollNumber = request.getParameter("roll_number");
        String gender = request.getParameter("gender");
        String course = request.getParameter("course");
        String department = request.getParameter("department");
        int age = Integer.parseInt(request.getParameter("age"));


        Student student = new Student();
        student.setName(name);
        student.setRollNumber(rollNumber);
        student.setGender(gender);
        student.setCourse(course);
        student.setDepartment(department);
        student.setAge(age);


        System.out.println("Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Age: " + student.getAge());
        System.out.println("Gender: " + student.getGender());
        System.out.println("Course: " + student.getCourse());
        System.out.println("Department: " + student.getDepartment());

        StudentDao dao = new StudentDaoImpl();
        dao.addStudent(student);
        response.sendRedirect("index.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        doGet(request, response);
    }
}
