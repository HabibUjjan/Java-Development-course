package com.student.servlet;

import com.student.daoimpl.StudentDaoImpl;
import com.student.model.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.util.List;

//@WebServlet()
public class StudentServlet extends HttpServlet {
    StudentDaoImpl dao = new StudentDaoImpl();

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String action = req.getParameter("action");

        try {
            switch (action) {
                case "new":
                    req.getRequestDispatcher("add-edit-student.jsp").forward(req, res);
                    break;
                case "insert":
                    dao.insert(getStudent(req));
                    res.sendRedirect("student?action=list");
                    break;
                case "edit":
                    Student s = dao.getByRollNumber(req.getParameter("roll"));
                    req.setAttribute("student", s);
                    req.getRequestDispatcher("add-edit-student.jsp").forward(req, res);
                    break;
                case "update":
                    dao.update(getStudent(req));
                    res.sendRedirect("student?action=list");
                    break;
                case "delete":
                    dao.delete(req.getParameter("roll"));
                    res.sendRedirect("student?action=list");
                    break;
                default:
                    List<Student> list = dao.getAll();
                    req.setAttribute("students", list);
                    req.getRequestDispatcher("list-students.jsp").forward(req, res);
                    break;
            }
        } catch (Exception e) {
            throw new ServletException(e);
        }
    }

    private Student getStudent(HttpServletRequest req) {
        Student s = new Student();
        s.setRollNumber(req.getParameter("rollNumber"));
        s.setName(req.getParameter("name"));
        s.setAge(Integer.parseInt(req.getParameter("age")));
        s.setGender(req.getParameter("gender"));
        s.setCourse(req.getParameter("course"));
        s.setDepartment(req.getParameter("department"));
        return s;
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doGet(req, res);
    }
}
