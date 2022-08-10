<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Id</title>
</head>
<body>
<h1 style="text-align:center">${checkifthere}</h1>

<form:form method="post">

<label>Product Id</label>

<input type="number" name="id">
<input type="submit" value="submit">

</form:form>

</body>
</html>