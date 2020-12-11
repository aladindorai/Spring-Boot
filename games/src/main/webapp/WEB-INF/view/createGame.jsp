<%@ page language="java" contentType="text/html; charset=windows-1256"
 pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Créer un Game</title>
</head>
<body>
<form action="saveGame" method="post">
<pre>
nom : <input type="text" name="nomGame">
prix : <input type="text" name="prixGame">
date création : <input type="date" name="date">
<input type="submit" value="ajouter">
</pre>
</form>
${msg}
<br/>
<br/>
<a href="ListeGames">Liste Games</a>
</body>
</html>