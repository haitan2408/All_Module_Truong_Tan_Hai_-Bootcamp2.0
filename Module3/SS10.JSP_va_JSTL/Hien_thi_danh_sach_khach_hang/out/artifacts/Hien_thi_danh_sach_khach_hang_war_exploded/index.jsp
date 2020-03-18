<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 17/03/2020
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
  <title>Customer</title>
</head>
<center>
  <table border="1">
    <caption>Danh sach khac hang</caption>
    <tr>
      <td>Ten</td>
      <td>Ngay sinh</td>
      <td>Dia chi</td>
    </tr>
    <c:forEach items="${customers}" var="cus">
      <tr>
        <td>${cus.name}</td>
        <td>${cus.birthday}</td>
        <td>${cus.address}</td>
      </tr>
    </c:forEach>
  </table>
</center>
</body>
</html>
