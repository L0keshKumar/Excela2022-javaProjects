<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HOME</title>
<style type="text/css">

table{
border:1px solid blue;
	border-collapse: collapse;
	margin-right: auto;
	margin-left: auto;
}
tr,td,th{
border: 1px solid red;
}

</style>
</head>
<body>
    <!--   ${list}  -->
<table>
<tr>
<th>Product Id</th>
<th>Product Name</th>
<th>Rate</th>
</tr>
<c:forEach items="${list}" var="eachItem">
<tr>
<td>${eachItem.productId}</td>
<td>${eachItem.productName}</td>
<td>${eachItem.price}</td>
</tr>
</c:forEach>
</table>
</body>
</html>