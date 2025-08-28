<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="com.student.model.Student" %>
<html>
<head>
    <link rel="stylesheet" href="style.css">
    <title>Students List</title>
</head>
<body>
<div class="form-container">
    <h2>All Students</h2>
    <a href="student?action=new"><button>Add New Student</button></a>
    <table>
        <tr>
            <th>Roll No</th><th>Name</th><th>Age</th><th>Gender</th>
            <th>Course</th><th>Department</th><th>Actions</th>
        </tr>
        <%
            List<Student> students = (List<Student>) request.getAttribute("students");
            if (students != null) {
                for (Student s : students) {
        %>
        <tr>
            <td><%= s.getRollNumber() %></td>
            <td><%= s.getName() %></td>
            <td><%= s.getAge() %></td>
            <td><%= s.getGender() %></td>
            <td><%= s.getCourse() %></td>
            <td><%= s.getDepartment() %></td>
            <td>
                <a href="student?action=edit&roll=<%= s.getRollNumber() %>">Edit</a>
                <a href="student?action=delete&roll=<%= s.getRollNumber() %>" onclick="return confirm('Are you sure?')">Delete</a>
            </td>
        </tr>
        <% }} %>
    </table>
</div>
</body>
</html>
