<%--
  Created by IntelliJ IDEA.
  User: KennySo
  Date: 2023/12/29 15:24
--%>
<%@ page import="com.omega.demo01.pojo.Monster" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp代码脚本实例</title>
</head>
<%
    List<Monster> list = new ArrayList<>();
    list.add(new Monster(1, "牛魔王", "芭蕉扇"));
    list.add(new Monster(2, "蜘蛛精", "吐蛛丝"));
%>
<body>
<table bgcolor="#f0f8ff" border="1px" width="500px">
    <tr>
        <td>id</td>
        <td>name</td>
        <td>skill</td>
    </tr>
        <%
            for (int i = 0; i < list.size(); i++) {
                Monster monster = list.get(i);
        %>
            <tr>
                <td><%=monster.getId()%>
                </td>
                <td><%=monster.getName()%>
                </td>
                <td><%=monster.getSkill()%>
                </td>
            </tr>
        <%
            }
        %>
</body>
</html>
