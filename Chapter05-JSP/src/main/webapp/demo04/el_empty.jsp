<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--
    Created by IntelliJ IDEA.
    User: KennySo
    Date: 2024/1/6
--%>
<html>
<head>
    <title>EL 的 empty 运算</title>
</head>

<body>
<h1>EL 的empty运算</h1><hr/>
<%
    request.setAttribute("k1", null);
    request.setAttribute("k2", "");
    request.setAttribute("k3", new Object[]{});
    request.setAttribute("k4", new ArrayList<String>());
    request.setAttribute("k5", new HashMap<String,Object>());
%>

k1是否为空 = ${empty k1} <br/>
k2是否为空 = ${empty k2} <br/>
k3是否为空 = ${empty k3} <br/>
k4是否为空 = ${empty k4} <br/>
k5是否为空 = ${empty k5} <br/>
</body>
</html>
