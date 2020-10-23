<%--
  Created by IntelliJ IDEA.
  User: 测试用户
  Date: 2020/10/22
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>

    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.5.1.js"></script>

    <script>
        function a1() {
            $.get({
                url:"${pageContext.request.contextPath}/a3",
                data:{"name":$("#name").val()},
                success:function (data) {
                    if (data.toString()=='ok'){
                        $("#userInfo").css("color","blue");
                    }else{
                        $("#userInfo").css("color","red");
                    }
                    $("#userInfo").html(data);
                }
            })
        }
        function a2() {
            $.get({
                url:"${pageContext.request.contextPath}/a3",
                data:{"password":$("#password").val()},
                success:function (data) {
                    if (data.toString()=='ok'){
                        $("#passwordInfo").css("color","blue");
                    }else {
                        $("#passwordInfo").css("color","red");
                    }
                    $("#passwordInfo").html(data);
                }
            })
        }
    </script>
</head>
<body>

    <p>
        用户名：<input type="text" id="name" onblur="a1()">
        <span id="userInfo"></span>
    </p>

    <p>
        密码：<input type="text" id="password" onblur="a2()">
        <span id="passwordInfo"></span>
    </p>
</body>
</html>
