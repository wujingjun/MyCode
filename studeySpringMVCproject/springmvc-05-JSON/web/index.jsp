<%--
  Created by IntelliJ IDEA.
  User: 测试用户
  Date: 2020/10/17
  Time: 23:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>

    <script type="text/javascript">
      //编写一个javascript对象
      var user = {
        name : "俊哥",
        age : 3,
        sex : "男"
      }

      //将js对象转换为json对象
      var json = JSON.stringify(user);
      console.log(json);
      console.log("========")

      //将JSON对象转换为JavaScript对象
      var obj = JSON.parse(json)
      console.log(obj);
    </script>
  </head>
  <body>


  </body>
</html>
