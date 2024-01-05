<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: KennySo
  Date: 2024/1/5 15:52
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>显示妖怪信息</title>
</head>
<body>
<h1>显示妖怪信息</h1>
<table border="1px" width="400px">
    <tr>
        <td>id</td>
        <td>name</td>
        <td>skill</td>
    </tr>

    <c:forEach items="${requestScope.monsterList}" var="monster">
        <tr>
            <td>${monster.id}</td>
            <td>${monster.name}</td>
            <td>${monster.skill}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
