<%--
  Created by IntelliJ IDEA.
  User: 测试用户
  Date: 2020/10/22
  Time: 23:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <form action="${pageContext.request.contextPath}/upload" enctype="multipart/form-data" method="post">
      <input type="file" name="file"/>
      <input type="submit" value="upload">
    </form>
    <a href="${pageContext.request.contextPath}/download">下载文件</a>
  </body>
</html>
