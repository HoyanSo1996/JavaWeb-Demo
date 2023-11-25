<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
    <meta charset="UTF-8">
    <title>修改品牌</title>
</head>
<body>
<h3>修改品牌</h3>
<hr/>
<form action="/jsp-demo/brand/update" method="post">
    <%--隐藏域，提交id--%>
    <input type="hidden" name="id" value="${brand.id}">

    <table>
        <tr>
            <td>品牌名称：</td>
            <td><input name="brandName" value="${brand.brandName}"></td>
        </tr>
        <tr>
            <td>企业名称：</td>
            <td><input name="companyName" value="${brand.companyName}"></td>
        </tr>
        <tr>
            <td>排 序：</td>
            <td><input name="ordered" value="${brand.ordered}"></td>
        </tr>
        <tr>
            <td>描述信息：</td>
            <td><textarea rows="5" cols="20" name="description">${brand.description}</textarea></td>
        </tr>
        <tr>
            <td>状 态：</td>
            <td>
                <c:if test="${brand.status == 0}">
                    <input type="radio" name="status" value="0" checked>禁用
                    <input type="radio" name="status" value="1">启用
                </c:if>

                <c:if test="${brand.status == 1}">
                    <input type="radio" name="status" value="0" >禁用
                    <input type="radio" name="status" value="1" checked>启用
                </c:if>
            </td>
        </tr>

    </table>
    <input type="submit" value="提交">
</form>
</body>
</html>
