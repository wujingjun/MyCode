<%--
  Created by IntelliJ IDEA.
  User: 测试用户
  Date: 2020/10/22
  Time: 13:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>

    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.5.1.js"></script>

    <script>
      function a() {
        $.post({
          //请求地址
          url:"${pageContext.request.contextPath}/a1",
          //要发送的数据
          data:{"name":$("#username").val()},
          //成功之后执行的回调函数
          success:function (data, status) {
            console.log("data:"+data);
            console.log("status:"+status);
          }
        })
      }

      $(function () {
        $("#btn").click(function () {
          $.post("${pageContext.request.contextPath}/a2",function (data) {
            var html="";
            for (let i = 0;i<data.length;i++){
              html += "<tr>"+
                      "<td>"+data[i].name+"</td>"+
                      "<td>"+data[i].age+"</td>"+
                      "<td>"+data[i].sex+"</td>"+
                      "</tr>"
            }
            $("#content").html(html);
          });
        })
      })
    </script>

  </head>
  <body>

      用户名：<input type="text" id="username" onblur="a()">

      <br/>
      <hr/>
      <br/>


      <input type="button" value="加载数据" id="btn">
      <table>
        <tr>
          <td>姓名</td>
          <td>年龄</td>
          <td>性别</td>
        </tr>

        <tbody id="content">
            <%-- 后台数据  --%>
        </tbody>
      </table>

  </body>
</html>
