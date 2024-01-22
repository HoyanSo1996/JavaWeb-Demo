<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--
    Created by IntelliJ IDEA.
    User: KennySo
    Date: 2024/1/22
--%>
<html>
<head>
    <title>showTopic</title>
</head>

<body>
<h1>${requestScope.get("username")} 发表的评论是</h1>
评论内容：${requestScope.get("comment")}

</body>
</html>
