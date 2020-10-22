<%--
  Created by IntelliJ IDEA.
  User: 测试用户
  Date: 2020/10/20
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <title>添加书籍</title>
</head>
<body>

    <div class="container">
        <div class="row clearfix">
            <div class="col-md-12 column">
                <div class="row page-header">
                    <h1 class="col-md-11 column">
                        <small>添加书籍</small>
                    </h1>
                    <form action="${pageContext.request.contextPath}/book/searchAll">
                        <button class="btn btn-default btn-lg col-md-1 column" type="submit" style="margin-top: 1%" >
                            <span class="glyphicon glyphicon-home" aria-hidden="true"></span>
                        </button>
                    </form>
                </div>
            </div>

            <div class="col-md-12">
                <form action="${pageContext.request.contextPath}/book/addbook" method="post" class="needs-validation" novalidate>
                    <div class="row">
                        <div class="col-md-12 mb-3">
                            <h4 class="mb-12" >添加的书名</h4>
                            <input type="text" class="form-control" name="bookname" placeholder="请输入书名" required>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-12 mb-3">
                            <h4 class="mb-12" >添加的书的数量</h4>
                            <input type="text" class="form-control" name="bookCounts" placeholder="请输入数量" required>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-12 mb-3">
                            <h4 class="mb-12" >书的详细介绍</h4>
                            <input type="text" class="form-control" name="detail" placeholder="请输入详细的介绍" required>
                        </div>
                    </div>
                    <hr class="mb-4"/>
                    <div class="row">
                        <div class="col-md-4 col-md-offset-4">
                            <button class="btn btn-primary btn-lg btn-block" type="submit" >提交</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</body>
</html>
