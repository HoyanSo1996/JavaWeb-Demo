<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="UTF-8">
    <title>添加品牌</title>
</head>
<body>
<h3>添加品牌</h3>
<hr/>
<form action="/filterAndListener-demo/brand/add" method="post">
    <table>
        <tr>
            <td>品牌名称：</td>
            <td><input name="brandName"></td>
        </tr>
        <tr>
            <td>企业名称：</td>
            <td><input name="companyName"></td>
        </tr>
        <tr>
            <td>排 序：</td>
            <td><input name="ordered"></td>
        </tr>
        <tr>
            <td>描述信息：</td>
            <td><textarea rows="5" cols="20" name="description"></textarea></td>
        </tr>
        <tr>
            <td>状 态：</td>
            <td>
                <input type="radio" name="status" value="0">禁用
                <input type="radio" name="status" value="1">启用
            </td>
        </tr>

    </table>
    <input type="submit" value="提交">
</form>
</body>
</html>
