<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.student.models.Student" %> <!-- Import the Student class -->
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student List</title>
</head>
<body>
    <h1>List of Students</h1>
    <table border="1">
        <tr>
            <th>Name</th>
            <th>Age</th>
            <th>Academic Year</th>
        </tr>

        <tr>
            <th colspan="3">Render By JSTL (JavaServer Pages Standard Tag Library)</th>
        </tr>
        <c:forEach var="student" items="${students}">
            <tr>
                <td>${student.name}</td>
                <td>
                    <c:choose>
                        <c:when test="${student.age > 18}">
                            Adult
                        </c:when>
                        <c:otherwise>
                            Child
                        </c:otherwise>
                    </c:choose>
                </td>
                <td>${student.academicYear}</td>
            </tr>
        </c:forEach>

        <tr>
            <th colspan="3">Render By Scriptlet</th>
        </tr>
        <%
            // Retrieve the student list from the request scope
            List<Student> students = (List<Student>) request.getAttribute("students");
            if (students != null) {
                for (Student student : students) {
        %>
                    <tr>
                        <td><%= student.getName() %></td>
                        <td>
                            <%
                                if (student.getAge() > 18) {
                                    out.print("Adult");
                                } else {
                                    out.print("Child");
                                }
                            %>
                        </td>
                        <td><%= student.getAcademicYear() %></td>
                    </tr>
        <%
                }
            }
        %>

    </table>
</body>
</html>
