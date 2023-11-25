<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>欢迎注册</title>
    <%--如果css文件放在webapp的子文件夹下,那么引入css文件时就不能使用相对路径,而是使用绝对路径,否则serlvet在请求转发时会找不到css文件--%>
    <link href="/conversation-demo/brandUi/css/register.css" rel="stylesheet">
</head>
<body>

<div class="form-div">
    <div class="reg-content">
        <h1>欢迎注册</h1>
        <span>已有帐号？</span> <a href="/conversation-demo/brandUi/login.jsp">登录</a>  <%--因为位于webapp的子文件夹,所有要使用绝对路径--%>
    </div>
    <form id="reg-form" action="/conversation-demo/register" method="post">
        <table>
            <tr>
                <td>用户名</td>
                <td class="inputs">
                    <input name="username" type="text" id="username">
                    <br>
                    <span id="username_err" class="err_msg">${register_msg}</span>
                </td>
            </tr>

            <tr>
                <td>密码</td>
                <td class="inputs">
                    <input name="password" type="password" id="password">
                    <br>
                    <span id="password_err" class="err_msg" style="display: none">密码格式有误</span>
                </td>
            </tr>

            <tr>
                <td>验证码</td>
                <td class="inputs">
                    <input name="verificationCode" type="text" id="verificationCode">
                    <img id="checkCodeImg" src="/conversation-demo/verificationCode">
                    <a href="#" id="changeImg">看不清？</a>

                    <script>
                        document.getElementById("changeImg").onclick = function () {
                            // 路径后面添加时间戳的目的是避免浏览器进行缓存静态资源
                            document.getElementById("checkCodeImg").src = "/conversation-demo/verificationCode?" + new Date().getMilliseconds();
                        }
                    </script>
                </td>
            </tr>
        </table>

        <div class="buttons">
            <input value="注 册" type="submit" id="reg_btn">
        </div>
        <br class="clear">
    </form>
</div>

</body>
</html>