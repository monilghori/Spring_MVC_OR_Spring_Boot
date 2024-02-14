<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 13-02-2024
  Time: 02:02 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Customer Information</h1>
<form:form method="post" action="submit" modelAttribute="customer">
    Enter name : <form:input type="text" path="name" name="patientName"/><br><form:errors path="name" style="color:red"/><br>
    Date : <form:input type="date" path="date"  name="date"/><br><form:errors path="date" style="color:red"/><br>
    Email : <form:input type="text" path="email" name="email" /><br><form:errors path="email" style="color:red"/><br>
    <input type="submit" value="submit"/>
</form:form>
</body>
</html>
