<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=utf-8" %>

<!DOCTYPE html>

<html>
<head>

</head>

<body>
<h1>Список товаров</h1>
<ul>
    <c:forEach var="product" items="${products}">
        <li><a href="showProductById/${product.id}">ID: ${product.id} Наименование: ${product.title} Цена: ${product.price}</a></li>
    </c:forEach>
</ul>
</body>
</html>