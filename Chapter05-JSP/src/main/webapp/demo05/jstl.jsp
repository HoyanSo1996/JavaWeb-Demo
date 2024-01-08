<%@ page import="com.omega.demo01.pojo.Monster" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--
    Created by IntelliJ IDEA.
    User: KennySo
    Date: 2024/1/8
--%>
<html>
<head>
    <title>JSTL 实例</title>
</head>

<body>
<h1>c:set 标签的使用</h1>
<c:set scope="page" var="key" value="page-key"/>
<c:set scope="request" var="key" value="request-key"/>
<c:set scope="session" var="key" value="session-key"/>
<c:set scope="application" var="key" value="application-key"/>
page: ${pageScope.key} <br/>
request: ${requestScope.key} <br/>
session: ${sessionScope.key} <br/>
application: ${applicationScope.key} <br/>
<hr/>


<h1>c:if 标签的使用</h1>
<%
    request.setAttribute("num1", 60);
    request.setAttribute("num2", 40);
%>
<c:if test="${num1 > num2}">
    ${num1} > ${num2} 为真
</c:if>
<br/>
<hr/>


<h1>c:choose 标签的使用</h1>
<%
    request.setAttribute("age", 40);
%>
<c:choose>
    <c:when test="${age > 0 && age <= 30}">
        青年
    </c:when>
    <c:when test="${age > 30 && age <= 60}">
        壮年
    </c:when>
    <c:otherwise>
        老年
    </c:otherwise>
</c:choose>
<br/>
<hr/>


<h1>c:foreach 标签的使用</h1>
<h3>1.普通遍历</h3>
<c:forEach begin="1" end="10" var="i">
    <c:out value="${i}"/>
</c:forEach>
<hr/>

<h3>2.遍历数组</h3>
<%
    request.setAttribute("sports", new String[]{"打篮球", "乒乓球"});
%>
<c:forEach items="${requestScope.sports}" var="sport">
    <li>运动 = ${sport}</li>
</c:forEach>
<hr/>

<h3>3.遍历List</h3>
<%
    List<Monster> monsters = new ArrayList<>();
    monsters.add(new Monster(100, "小妖怪", "巡山的"));
    monsters.add(new Monster(200, "大妖怪", "做饭的"));
    monsters.add(new Monster(300, "老妖怪", "打扫位置的"));
    request.setAttribute("monsters", monsters);
%>
<c:forEach items="${requestScope.monsters}" var="monster" varStatus="status">
    <li>妖怪${status.count} -- ${monster.id} -- ${monster.name} -- ${monster.skill}</li>
</c:forEach>
<hr/>

<h3>4.遍历Map</h3>
<%
    Map<String, String> map = new HashMap<>();
    map.put("key1", "北京");
    map.put("key2", "上海");
    map.put("key3", "天津");
    request.setAttribute("map", map);
%>
<c:forEach items="${requestScope.map}" var="cities" varStatus="status">
    <li>城市${status.count} -- ${cities.key} -- ${cities.value}</li>
</c:forEach>
</body>
</html>
