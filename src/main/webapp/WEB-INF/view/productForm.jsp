<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=utf-8" %>

<!DOCTYPE html>

<html>
<head>

</head>

<body>
<h1>Редактирование товара</h1>
<form:form action="processProductForm" modelAttribute="product">
    ID: <form:input path="id" value="${product.id}"/>
    <br>
    Наименование: <form:input path="title" value="${product.title}" />
    <br>
    Цена: <form:input path="price" value="${product.price}" />
    <br>
    <input type="submit" value="Submit" />
</form:form>
</body>
</html>