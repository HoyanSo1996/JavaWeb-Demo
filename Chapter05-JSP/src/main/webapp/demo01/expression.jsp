<%--
  Created by IntelliJ IDEA.
  User: KennySo
  Date: 2023/12/29 15:14
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp表达式脚本实例</title>
</head>
<%!
    String name = "Kenny";
%>

<body>
<%-- 访问路径: http://localhost:8080/jsp-demo/demo01/expression.jsp?sex=male --%>
<h1>个人信息</h1>
用户名= <%=name%><br/>
工作= <%="java工程师"%><br/>
得到参数= <%=request.getParameter("sex")%>
</body>
</html>
