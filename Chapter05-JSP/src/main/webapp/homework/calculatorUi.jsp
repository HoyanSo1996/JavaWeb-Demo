<%--
  Created by IntelliJ IDEA.
  User: KennySo
  Date: 2024/1/2 16:34
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Jsp版本计算器</title>
</head>
<body>
<h1>jsp版本-计算器</h1>

<form method="post" action="/jsp-demo/calServlet">
    <table>
        <tr>
            <td>num1: </td>
            <td><input type="text" name="num1"/></td>
        </tr>
        <tr>
            <td>num2: </td>
            <td><input type="text" name="num2"/></td>
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
        </tr>
        <tr>
            <td><input type="submit" value="计算"></td>
            <td></td>
        </tr>
    </table>
</form>
</body>

<script type="text/javascript">


</script>
</html>
