<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Wordle</title>
</head>
<body>
    <h1>Wordle</h1>
    <form:form action="wordle" method="post" modelAttribute="palabraInsertada">
        <label for="palabra">Palabra</label>
        <form:input type="text" path="palabra" />
        <button>Submit</button>
    </form:form>
    <c:out value="Llevas ${intentosUsados} intentos usados y te quedan "></c:out>
    <c:out value="${intentosRestantes} intentos restantes"></c:out>
</body>
</html>