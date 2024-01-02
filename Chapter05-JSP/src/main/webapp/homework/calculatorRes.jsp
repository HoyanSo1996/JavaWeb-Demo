<%--
  Created by IntelliJ IDEA.
  User: KennySo
  Date: 2024/1/2 17:14
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP计算器</title>
    <base href="<%=request.getContextPath()%>/"> <%--getContextPath()本身就带有/--%>
</head>
<body>

<h1>计算结果</h1>
<%=request.getAttribute("resultInfo")%> <%--不是getParameter()--%>
<br>
<br>
<%--由于是由servlet请求转发来的,所以前面要加homework/--%>
<a href="homework/calculatorUi.jsp">返回再来玩一次</a>
</body>
</html>
