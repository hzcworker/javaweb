<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/7
  Time: 12:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
这是登录页面
<form action="http://localhost:8080/15_filter/loginServlet" method="get">
    用户名:<input type="text" name="username"/><br/>
    密&nbsp;&nbsp;&nbsp;码：<input type="text" name="password"/><br/>
    <input type="submit" value="登录"/><br/>
</form>
</body>
</html>
