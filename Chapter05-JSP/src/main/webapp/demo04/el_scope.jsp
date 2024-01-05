<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--
    Created by IntelliJ IDEA.
    User: KennySo
    Date: 2024/1/8
--%>
<html>
<head>
    <title>>EL 获取四个特定域中的属性</title>
</head>

<%
    pageContext.setAttribute("key1", "pageContext_key1 的值");
    request.setAttribute("key1", "request_key1 的值");
    session.setAttribute("key1", "session_key1 的值");
    application.setAttribute("key1", "application_key1 的值");
%>
<body>
<h1>EL 获取四个特定域中的属性</h1>
pageContext 的 key1: ${pageScope.key1} <br/>
request 的 key1: ${requestScope.key1} <br/>
session 的 key1: ${sessionScope.key1} <br/>
application 的 key1: ${applicationScope.key1} <br/>
</body>
</html>
