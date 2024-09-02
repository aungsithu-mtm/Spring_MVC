<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
    <title>Students List</title>
</head>
<body>
    <h2>Students List</h2>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Age</th>
            <th>Academic Year</th>
        </tr>
        <c:forEach items="${students}" var="student">
            <tr>
                <td>${student.id}</td>
                <td>${student.firstName}</td>
                <td>${student.lastName}</td>
                <td>${student.email}</td>
            </tr>
        </c:forEach>
    </table>

    <h2>Add New Student</h2>
    <form:form action="/students" modelAttribute="student">
        <form:input path="firstname" placeholder="Name"/>
        <form:input path="lastName" placeholder="Last Name"/>
        <form:input path="email" placeholder="Email"/>
        <input type="submit" value="Save"/>
    </form:form>
</body>
</html>
