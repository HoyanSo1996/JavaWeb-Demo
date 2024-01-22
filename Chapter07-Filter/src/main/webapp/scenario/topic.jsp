<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--
    Created by IntelliJ IDEA.
    User: KennySo
    Date: 2024/1/22
--%>
<html>
<head>
    <title>Topic</title>
</head>

<body>
<h1>发表对阿凡达电影评论</h1>
<p>过滤词：苹果, 香蕉 ~~ ${requestScope.get("error_info")}</p>

<form method="post" action="${pageContext.request.contextPath}/scenario/showTopic.jsp">
    <table>
        <tr>
            <td>用户:</td>
            <td><input type="text" name="username" value="${requestScope.get("username")}"></td>
        </tr>
        <tr>
            <td>评论:</td>
            <td><textarea name="comment">${requestScope.get("comment")}</textarea></td>
        </tr>
        <tr>
            <td><input type="submit" name="提交"></td>
            <td></td>
        </tr>
    </table>
</form>
</body>
</html>
