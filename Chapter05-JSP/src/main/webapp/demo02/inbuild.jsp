<%--
  Created by IntelliJ IDEA.
  User: KennySo
  Date: 2024/1/2 10:20
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp内置对象</title>
</head>
<body>
<%
    // 运行类型是JspWriter, 父类是Writer, 和PrintWriter继承的父类一样
    out.print("xxx");

    // 运行类型是HttpServletRequest
    String username = request.getParameter("username");

    // 运行类型是HttpServletResponse
    // response.sendRedirect("https://www.baidu.com");

    // 运行类型是HttpSession
    session.setAttribute("password", "123456");

    // 运行类型是ServletContext
    application.setAttribute("age", "26");

    // 运行类型是ServletConfig
    String email = config.getInitParameter("email");

    // 运行类型是PageContext, 是jsp独有的对象
    pageContext.setAttribute("address", "China");

    // 运行类型是Object, 代表jsp这个实例本身, 类似this
    out.print("page = " + page);
%>
</body>
</html>
