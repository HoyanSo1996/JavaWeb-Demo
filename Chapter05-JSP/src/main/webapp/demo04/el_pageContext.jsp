<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--
    Created by IntelliJ IDEA.
    User: KennySo
    Date: 2024/1/8
--%>
<html>
<head>
    <title>pageContext对象的使用</title>
</head>

<body>
<h1>通过 request 对象来获取和HTTP协议相关的数据</h1>
<%--<%
    request.getScheme();      // 获取请求的协议
    request.getServerName();  // 获取请求的服务器ip 或 域名
    request.getServerPort();  // 获取请求的服务器端口号
    request.getContextPath();         // 获取当前工程路径
    request.getMethod();      // 获取请求的方式 (GET 或 POST)
    request.getRemoteHost();  // 获取客户端的ip地址
    session.getId();          // 获取会话的唯一标识
%>--%>

<h1>pageContext 对象的使用</h1>
协议： ${pageContext.request.scheme} <br>
服务器 ip：${pageContext.request.serverName} <br>
服务器端口：${pageContext.request.serverPort} <br>
工程路径：${pageContext.request.contextPath} <br>
请求方法：${pageContext.request.method} <br>
客户端 ip 地址：${pageContext.request.remoteHost} <br>
会话 id ：${pageContext.session.id } <br>
<hr/>

<h1>简化了上面pageContext.xxx的那截代码</h1>
<%
    // 简化了上面pageContext.xxx的那截代码
    pageContext.setAttribute("req", request);
%>
ip 地址: ${req.remoteHost} <br>   <%--el中的requestScope不能获取这些信息--%>
获取请求方法: ${req.method} <br>
</body>
</html>
