<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>	
	<meta charset="UTF-8">
	<title>Main page</title>	
	<link rel="stylesheet" type="text/css" href="style.css"/>
</head>
<body>
<div class="container">
<div class="header">
<ul type="square" class="menu">
	<li><a href="${pageContext.request.contextPath}/main"><span>Main</span></a></li> 
	<li><a href="${pageContext.request.contextPath}/catalog"><span>Catalog</span></a></li>
	<li><a href="${pageContext.request.contextPath}/product"><span>Product</span></a></li>
	<li><a href="${pageContext.request.contextPath}/cart"><span>Cart</span></a></li>
	<li><a href="${pageContext.request.contextPath}/order"><span>Order</span></a></li>
	<li><a href="111.html"><span>Error</span></a></li> 	
</ul>
</div>

<div class="page">
</div>

<footer>
<p>&#169; Все права защищены.</p>
</footer>
</div>
</body>
</html>
