<%--
  Created by IntelliJ IDEA.
  User: KennySo
  Date: 2024/1/2 16:34
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP计算器</title>
    <base href="<%=request.getContextPath()%>/"> <%--getContextPath()本身就带有/--%>
</head>

<body>
<h1>jsp版本-计算器</h1>
<form method="post" action="calServlet">
    <table>
        <tr>
            <td>num1: </td>
            <td><input type="text" name="num1" id="num1"/></td>
            <td><p id="tip1"></p></td>
        </tr>
        <tr>
            <td>num2: </td>
            <td><input type="text" name="num2" id="num2"/></td>
            <td><p id="tip2"></p></td>
        </tr>
        <tr>
            <td>运算符号: </td>
            <td>
                <select name="operator">
                    <option>+</option>
                    <option>-</option>
                    <option>*</option>
                    <option>/</option>
                </select>
            </td>
            <td></td>
        </tr>
        <tr>
            <td><input type="submit" value="计算" onclick="return checkNum()"></td>
            <td></td>
            <td></td>
        </tr>
    </table>
</form>
</body>

<script type="text/javascript">
    // 使用正则表达式验证, js的正则表达式需要两个/夹着前后
    let reg = /^[-]?([1-9]\d*|0)$/;

    function checkNum() {
        let num1 = document.getElementById("num1");
        let num2 = document.getElementById("num2");
        let tip1 = document.getElementById("tip1");
        let tip2 = document.getElementById("tip2");
        let res;

        if (!reg.test(num1.value)) {
            tip1.innerText = "不为整数, 请重新输入.";
            res = false;
        }
        if (!reg.test(num2.value)) {
            tip2.innerText = "不为整数, 请重新输入.";
            res = false;
        }
        if (!res) {
            return false;
        }
    }

</script>
</html>
