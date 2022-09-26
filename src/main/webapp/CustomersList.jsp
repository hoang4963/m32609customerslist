<%--
  Created by IntelliJ IDEA.
  User: Acer
  Date: 9/26/2022
  Time: 11:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="models.Customers" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customers List</title>
</head>
<body>
<h1>Customers Management</h1>
<table border="1">
        <tr>
            <td>No</td>
             <td>Name</td>
             <td>Birthday</td>
             <td>Image</td>
        </tr>
        <c:forEach var = "item" items = "${customersList}">
            <tr>
              <td><c:out value="${item.getName()}"></c:out></td>
                <td><c:out value="${item.getBirthday()}"></c:out></td>
                <td><c:out value="${item.getAddress()}"></c:out></td>
              <td><img src="<c:out value="${item.getImage()}"></c:out>"></td>
            </tr>

        </c:forEach>
</table>

</body>
</html>
