<%--
  Created by IntelliJ IDEA.
  User: nc7619
  Date: 2019-12-27
  Time: 23:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>spring boot form submit example</title>
</head>
<body>
<h2>Employee Details</h2>
<form method="post" action="saveDetails">   <!-- saveDetails url mapping in EmployeeController -->
    Enter Employee Name : <input type="text" name="employeeName"/>
    Enter Employee Email Address: <input type="email" name="employeeEmail">
    <input type="submit" value="Submit">
</form>
</body>
</html>
