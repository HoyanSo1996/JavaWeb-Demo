<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>login</title>
    <%--如果css文件放在webapp的子文件夹下,那么引入css文件时就不能使用相对路径,而是使用绝对路径,否则serlvet在请求转发时会找不到css文件--%>
    <link href="/ajax-demo/brandUi/css/login.css" rel="stylesheet">
</head>

<body>
<div id="loginDiv" style="height: 350px">
    <form action="/ajax-demo/login" method="post" id="form">
        <h1 id="loginMsg">LOGIN IN</h1>
        <div id="errorMsg">${login_msg} ${register_msg}</div>  <%--这里消息二选一--%>
        <p>Username:<input id="username" name="username" value="${cookie.username.value}" type="text"></p>
        <p>Password:<input id="password" name="password" value="${cookie.password.value}" type="password"></p>
        <p>Remember:<input id="remember" name="remember" value="1" type="checkbox"></p>

        <div id="subDiv">
            <input type="submit" class="button" value="login up">
            <input type="reset" class="button" value="reset">&nbsp;&nbsp;&nbsp;
            <a href="/ajax-demo/brandUi/register.jsp">没有账号？</a>  <%--因为位于webapp的子文件夹,所有要使用绝对路径--%>
        </div>
    </form>
</div>
</body>
</html>