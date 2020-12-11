<%@ page language="java" contentType="text/html; charset=windows-1256"
 pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Liste Games</title>
</head>
<body>
 <h1 >
 Liste des Games
 </h1>
 <table>
 <tr>
 <th>ID</th><th>Nom Game</th><th>Prix</th><th>Date
Création</th><th>Suppression<th>Edition</th>
 </tr>
 <c:forEach items="${games}" var="g">
 <tr>
 <td>${g.idGame }</td>
 <td>${g.nomGame }</td>
 <td>${g.prixGame }</td>
 <td><fmt:formatDate pattern="dd/MM/yyyy"
value="${g.dateCreation}" /></td>
 <td><a onclick="return confirm('Etes-vous sûr ?')"
href="supprimerGame?id=${g.idGame }">Supprimer</a></td>
 <td><a href="modifierGame?id=${g.idGame }">Edit</a></td>
 </tr>
 </c:forEach>
 </table>
</body>
</html>
