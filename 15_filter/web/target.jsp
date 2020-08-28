<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/7
  Time: 19:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    System.out.println("target.jsp页面执行了");
    System.out.println("target.jsp线程:"+ Thread.currentThread().getName());
    System.out.println("target.jsp"+request.getParameter("username"));

%>
</body>
</html>
