<%--
  Created by IntelliJ IDEA.
  User: 测试用户
  Date: 2020/10/19
  Time: 23:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <%-- 引用boostrap --%>
      <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
    <title>首页</title>

    <style>
      p{
        margin: 15%;
        text-align: center;
      }
    </style>

  </head>
  <body>
        <p class="lead">
          <a href="${pageContext.request.contextPath}/book/searchAll" class="btn btn-lg btn-secondary">查看全部书籍</a>
        </p>

  </body>
</html>
