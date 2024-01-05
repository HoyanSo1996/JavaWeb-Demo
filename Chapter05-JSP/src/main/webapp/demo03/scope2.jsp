<%--
  Created by IntelliJ IDEA.
  User: KennySo
  Date: 2024/1/2 16:08
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp四大域对象测试-读取数据</title>
</head>
<body>
<h1>jsp 四大域对象测试-存储数据</h1>
<h3>在 scope2.jsp 页面读取域数据</h3>
pageContext 域是否有值：<%=pageContext.getAttribute("key")%> <br>
request 域是否有值：    <%=request.getAttribute("key")%> <br>
session 域是否有值：    <%=session.getAttribute("key")%> <br>
application 域是否有值：<%=application.getAttribute("key")%> <br>
</body>
</html>
