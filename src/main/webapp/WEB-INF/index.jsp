<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form</title>
</head>
<body>
	<h1>Send an Omikuji!</h1>
	<form action="/submit" method="POST">
		<label for="years">Choose a number between 5 and 25</label>
		<input type="number" id="years" name="years" min="5" max ="25">
		<label for="city">Enter the name of a city</label>
		<input type="text" id="city" name="city">
		<label for="person">Enter the name of a person</label>
		<input type="text" id="person" name="person">
		<label for="job">Enter a profession</label>
		<input type="text" id="job" name="job">
		<label for="creature">Enter a creature</label>
		<input type="text" id="creature" name="creature">
		<label for="say">Say something nice</label>
		<input type="text" id="say" name="say">
		<input type="submit" value="submit">
	</form>
</body>
</html>