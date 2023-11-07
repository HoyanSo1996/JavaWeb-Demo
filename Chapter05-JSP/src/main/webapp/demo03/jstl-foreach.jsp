<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Brand</title>
</head>

<body>
<input type="button" value="新增"><br>
<hr>
<table border="1" cellspacing="0" width="800">
    <tr>
        <th>序号</th>
        <th>品牌名称</th>
        <th>企业名称</th>
        <th>排序</th>
        <th>品牌介绍</th>
        <th>状态</th>
        <th>操作</th>
    </tr>

    <%-- 方式1：增强for循环 --%>
    <c:forEach items="${brands}" var="brand" varStatus="quanlity">
        <tr align="center">
            <%--<td>${brand.id}</td>--%>
            <td>${quanlity.count}</td>  <%--列表数量计数器--%>
            <td>${brand.brandName}</td>
            <td>${brand.companyName}</td>
            <td>${brand.ordered}</td>
            <td>${brand.description}</td>
            <c:if test="${brand.status == 1}">
                <td>启用</td>
            </c:if>
            <c:if test="${brand.status != 1}">
                <td>禁用</td>
            </c:if>
            <td><a href="#">修改</a> <a href="#">删除</a></td>
        </tr>
    </c:forEach>


    <%-- 方式2：普通for循环 --%>
    <%-- 列表长度的获取要引入fn标签库才行--%>
    <c:forEach begin="0" end="${fn:length(brands) - 1}" step="1" var="index">
        <tr align="center">
            <td>${brands.get(index).id}</td>
            <td>${brands.get(index).brandName}</td>
            <td>${brands.get(index).companyName}</td>
            <td>${brands.get(index).ordered}</td>
            <td>${brands.get(index).description}</td>
            <c:if test="${brands.get(index).status == 1}">
                <td>启用</td>
            </c:if>
            <c:if test="${brands.get(index).status != 1}">
                <td>禁用</td>
            </c:if>
            <td><a href="#">修改</a> <a href="#">删除</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>