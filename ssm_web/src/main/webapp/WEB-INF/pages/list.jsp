<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>新增/查询</title>
</head>
<body>
<table>
    <form action="/linkMan/save" method="post">
        <table>
            <tr>
                <td>姓名</td>
                <td><input type="text" name="name"/></td>
            </tr>
            <tr>
                <td>性别</td>
                <td><input type="text" name="sex"/></td>
            </tr>
            <tr>
                <td>年龄</td>
                <td><input type="text" name="age"/></td>
            </tr>
            <tr>
                <td>地址</td>
                <td><input type="text" name="address"/></td>
            </tr>
            <tr>
                <td>qq</td>
                <td><input type="text" name="qq"/></td>
            </tr>
            <tr>
                <td>邮箱</td>
                <td><input type="text" name="email"/></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="提交"/>
                </td>
            </tr>
        </table>
    </form>
</table>
<hr>
<table border="1">
    <tr>
        <td>ID</td>
        <td>name</td>
        <td>sex</td>
        <td>age</td>
        <td>address</td>
        <td>qq</td>
        <td>email</td>
    </tr>
    <c:forEach items="${lists}" var="item" varStatus="index">
        <tr>
            <td>${index.index}</td>
            <td>${item.name}</td>
            <td>${item.sex}</td>
            <td>${item.age}</td>
            <td>${item.address}</td>
            <td>${item.qq}</td>
            <td>${item.email}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>