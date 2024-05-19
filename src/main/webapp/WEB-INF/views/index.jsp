<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: chintanpatel
  Date: 19/05/24
  Time: 8:35 am
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
    <link rel="stylesheet" href='<c:url value="/resources/css/bootstrap.min.css"/>'>
    <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.css"/>">
    <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap-grid.min.css"/>">
    <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap-utilities.rtl.css"/>">
    <script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
</head>
<body>
<div class="container mt-5">
    <c:url value="/employees/getEmployees" var="employeeUrl"/>
    <a href="${employeeUrl}" class="link-primary fs-5">Employee</a>
</div>
</body>
</html>
