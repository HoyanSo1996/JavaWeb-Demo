<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="com.omega.demo04.Book" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
    Created by IntelliJ IDEA.
    User: KennySo
    Date: 2024/1/5
--%>
<html>
<head>
    <title>el 常用输出表达式</title>
</head>
<%
    // 导入数据
    Book book = new Book();
    book.setName("昆虫总动员");
    book.setWriter(new String[]{"jack", "tom", "terry"});

    ArrayList<String> readers = new ArrayList<>();
    readers.add("汤姆");
    readers.add("玛丽");
    readers.add("米兰");
    book.setReader(readers);

    HashMap<String, Object> topics = new HashMap<>();
    topics.put("key1", "这是我看过的最好的动画片");
    topics.put("key2", "昆虫总动员 2，非常期待..");
    topics.put("key33", "昆虫总动员 3，非常期待..");
    book.setTopics(topics);

    pageContext.setAttribute("book", book);
%>
<body>
<h3>Bean</h3>
book 信息：${book} <br/>

<h3>Bean普通属性</h3>
book.name： ${book.name} <br/> <%-- ${book.name} 调用的就是 getName() --%>

<h3>数组</h3>
book.writer 数组第1个元素：${book.writer[0]} <br>

<h3>集合</h3>
book.reader 集合：${book.reader} <br>
book.reader 集合第3个元素：${book.reader[2]} <br>

<h3>map</h3>
book 的 Map 集合: ${book.topics} <br>
book 的 Map 集合 key1 的值: ${book.topics.key1} <br>
book 的 Map 集合 key2 的值: ${book.topics['key2']} <br> <%-- map 特殊字符 key 可以用[]方式来读取,比如就 book.topics['1'] --%>
book 的 Map 集合 key33 的值: ${book.topics['key33']} <br>
</body>
</html>
