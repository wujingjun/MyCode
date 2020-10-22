<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 测试用户
  Date: 2020/10/20
  Time: 13:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <%--  引用bootstrap  --%>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <title>书籍展示</title>

</head>
<body>
    <div class="container">

        <div class="row clearfix">
            <div class="col-md-12 column">
                <div class="page-header">
                    <h1>
                        <small>书籍列表</small>
                    </h1>
                </div>
            </div>

            <div class="row">
                <
                <div class="col-md-4 column">
                    <a class="btn btn-primary my-2" style="margin-left: 5%"  href="${pageContext.request.contextPath}/book/toaddbook">
                        <strong>新增书籍</strong>
                    </a>
                </div>
                <div class="col-md-8 column">
                    <form class="form-inline" action="${pageContext.request.contextPath}/book/querybook" method="post" style="float: right;margin-right: 5%">
                        <input type="text" name="bookName" class="form-control" placeholder="请输入要查询的书籍名称">
                        <input type="submit" value="查询" class="btn btn-primary my-2 ">
                    </form>
                </div>
            </div>
        </div>

        <div class="row clearfix">
            <div class="col-md-12 column">
                <table class="table table-hover table-striped">
                    <thead>
                        <tr>
                            <th>书籍编号</th>
                            <th>书籍名称</th>
                            <th>书籍数量</th>
                            <th>书籍详情</th>
                            <th>操作</th>
                        </tr>
                    </thead>

                    <tbody>
                        <c:forEach var="book" items="${books}">
                            <tr>
                                <td>${book.bookID}</td>
                                <td>${book.bookname}</td>
                                <td>${book.bookCounts}</td>
                                <td>${book.detail}</td>
                                <td>
                                    <a href="${pageContext.request.contextPath}/book/toupdatebook?id=${book.bookID}">
                                        <strong>
                                            修改
                                        </strong>
                                    </a>
                                    &nbsp;&nbsp;
                                    <a href="${pageContext.request.contextPath}/book/deletebook?id=${book.bookID}">
                                        <strong>
                                            删除
                                        </strong>
                                    </a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>

    </div>
</body>
</html>
