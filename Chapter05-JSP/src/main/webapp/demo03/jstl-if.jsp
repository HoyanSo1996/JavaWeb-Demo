<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Jstl-if</title>
</head>
<body>
<%--
    c:if：来完成逻辑判断，替换java 的 if else
--%>
<c:if test="${status == 1}">
    启用
</c:if>
<c:if test="${status ==0}">
    禁用
</c:if>
</body>
</html>