<%--
  Created by IntelliJ IDEA.
  User: 测试用户
  Date: 2020/10/22
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
    <h1>login</h1>

    <form action="${pageContext.request.contextPath}/user/login" method="post">
        username:<input type="text" name="username">
        password:<input type="text" name="password">
        <input type="submit" value="提交">
    </form>
</body>
</html>
