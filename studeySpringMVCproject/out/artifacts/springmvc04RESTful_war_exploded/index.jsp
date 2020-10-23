<%--
  Created by IntelliJ IDEA.
  User: 测试用户
  Date: 2020/10/17
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/restful/receive" method="post">
    <input type="text" name="name">
  </form>

  <h1>======================</h1>
    <form action="/restful/pojo" method="post">
      <input type="text" name="id">
      <input type="text" name="name">
      <input type="text" name="age">
      <input type="submit">
    </form>
  </body>
</html>
