<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: KennySo
  Date: 2024/1/2 17:14
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Jsp版本计算器</title>
</head>
<body>
<%
    String num1 = request.getParameter("num1");
    String num2 = request.getParameter("num2");
    String operator = request.getParameter("operator");
    String result = request.getParameter("result");
%>

<h1>计算结果</h1>
<%
    out.println(num1 + " " + operator + " " + num2 + " = " + result);
%>
<br>
<br>
<a href="homework/calculatorUi.jsp">返回再来玩一次</a>
</body>
</html>
