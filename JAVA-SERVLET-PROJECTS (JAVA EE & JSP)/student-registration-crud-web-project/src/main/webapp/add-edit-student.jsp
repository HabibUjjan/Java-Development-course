<%@ page contentType="text/html;charset=UTF-8" %>
<%
    com.student.model.Student s = (com.student.model.Student) request.getAttribute("student");
    String action = (s == null) ? "insert" : "update";
%>
<html>
<head>
    <link rel="stylesheet" href="style.css">
    <title>Student Form</title>
</head>
<body>
<div class="form-container">
    <h2><%= action.equals("insert") ? "Register Student" : "Update Student" %></h2>
    <form action="student" method="get">
        <input type="hidden" name="action" value="<%=action%>">

        <label>Roll Number:</label>
        <input type="text" name="rollNumber" required value="<%= s != null ? s.getRollNumber() : "" %>" <%= action.equals("update") ? "readonly" : "" %>>

        <label>Name:</label>
        <input type="text" name="name" required value="<%= s != null ? s.getName() : "" %>">

        <label>Age:</label>
        <input type="number" name="age" required value="<%= s != null ? s.getAge() : "" %>">

        <label>Gender:</label>
        <select name="gender" required>
            <option value="">Select Gender</option>
            <option value="Male" <%= s != null && "Male".equals(s.getGender()) ? "selected" : "" %>>Male</option>
            <option value="Female" <%= s != null && "Female".equals(s.getGender()) ? "selected" : "" %>>Female</option>
        </select>

        <label>Course:</label>
        <input type="text" name="course" required value="<%= s != null ? s.getCourse() : "" %>">

        <label>Department:</label>
        <input type="text" name="department" required value="<%= s != null ? s.getDepartment() : "" %>">

        <div class="buttons">
            <button type="submit"><%= action.equals("insert") ? "Register" : "Update" %></button>
            <a href="student?action=list"><button type="button">Back to List</button></a>
        </div>
    </form>
</div>
</body>
</html>
