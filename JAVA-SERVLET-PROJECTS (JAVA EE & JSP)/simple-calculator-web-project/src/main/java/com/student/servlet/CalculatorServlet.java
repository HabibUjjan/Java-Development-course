package com.student.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


public class CalculatorServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.write("<form>");
        out.write("<input type='number' name='num1'><br><br>");
        out.write("<input type='number' name='num2'><br><br>");
        out.write("<select name='operation'>");
        out.write("<option value='add'>Add</option>");
        out.write("<option value='sub'>Subtract</option>");
        out.write("<option value='mul'>Multiply</option>");
        out.write("<option value='div'>Divide</option>");
        out.write("</select><br><br>");
        out.write("<input type='submit' value='Calculate'>");
        out.write("</form>");

        String n1 = request.getParameter("num1");
        String n2 = request.getParameter("num2");
        String op = request.getParameter("operation");

        int num1 = Integer.parseInt(n1);
        int num2 = Integer.parseInt(n2);
        double result = 0;

        if (op.equals("add")) result = num1 + num2;
        else if (op.equals("sub")) result = num1 - num2;
        else if (op.equals("mul")) result = num1 * num2;
        else if (op.equals("div")) result = (double) num1 / num2;

        out.write("<h2>Result: " + result + "</h2>");
    }
}
