<%--
  Created by IntelliJ IDEA.
  User: KennySo
  Date: 2023/12/29 15:01
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp声明脚本实例</title>
</head>
<body>
<%!
    private Integer id;
    private String name = "Kenny";
    private String job;
    private static String company;

    static {
        company = "lps";
    }

    public String getName() {
        return name;
    }
%>
</body>
</html>
