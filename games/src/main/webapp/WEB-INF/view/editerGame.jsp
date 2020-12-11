<%@ page language="java" contentType="text/html; charset=windows-1256"
 pageEncoding="windows-1256"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Modifier un Game</title>
</head>
<body>
<form action="updateGame" method="post">
<pre>
id : <input type="text" name="idGame" value="${game.idGame}">
nom :<input type="text" name="nomGame" value="${game.nomGame}">
prix :<input type="text" name="prixGame" value="${game.prixGame}">
Date création :
 <fmt:formatDate pattern="yyyy-MM-dd" value="${game.dateCreation}"
var="formatDate" />
 <input type="date" name="date" value="${formatDate}"></input>
<input type="submit" value="Modifier">
</pre>
</form>
<br/>
<br/>
<a href="ListeGames">Liste Games</a>
</body>
</html>