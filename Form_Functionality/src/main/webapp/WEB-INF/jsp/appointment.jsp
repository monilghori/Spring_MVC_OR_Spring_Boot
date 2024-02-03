<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 01-02-2024
  Time: 02:04 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>appointment</title>
</head>
<body>
<h1>Patient Appointment Registration</h1>
    <form:form method="post" action="addappointment">
        Enter name : <form:input type="text" path="patientName" name="patientName"/><br><br>
        Contact No : <form:input type="number" path="patientContact" name="patientContact" /><br><br>
        <input type="submit" value="Add appointment"/>
    </form:form>
</body>
</html>
