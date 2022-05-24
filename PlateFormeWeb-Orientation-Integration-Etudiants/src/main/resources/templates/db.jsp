<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html xmlns:th="www.thymeleaf.org">
<head>
<meta charset="ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>
	<label>Nom :</label>
	<input type="text" name='<jsp:attribute name="nom"></jsp:attribute>'> 
	<label>Prenom :</label>
	<input type="text" name='<jsp:attribute name="prenom"></jsp:attribute>'>
	<input type="submit" value="envoi"> 
</body>
</html>