<%--
  Created by IntelliJ IDEA.
  User: KennySo
  Date: 2024/1/2 16:03
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp 四大域对象测试-存储数据</title>
</head>

<body>
<%
    // 往四个域中都分别保存了数据
    pageContext.setAttribute("key", "pageContext 数据");
    request.setAttribute("key", "request 数据");
    session.setAttribute("key", "session 数据");
    application.setAttribute("key", "application 数据");
%>

<h1>jsp 四大域对象测试-存储数据</h1>
<h3>在本页面读取域数据的情况 </h3>
pageContext key= <%=pageContext.getAttribute("key")%> <br>
request key= <%=request.getAttribute("key")%> <br>
session key= <%=session.getAttribute("key")%> <br>
application key= <%=application.getAttribute("key")%> <br>

<%
    // (1)请求转发到 scope2.jsp, 还是一次 request
    // request.getRequestDispatcher("/demo05/scope2.jsp").forward(request, response);
    // (2)再测试一把重定向到 scope2.jsp, 不是一次 request
    // response.sendRedirect("/jsp-demo/demo05/scope2.jsp");
    // (3)另起一个浏览器测试不同session读取数据的不同
%>
</body>
</html>
