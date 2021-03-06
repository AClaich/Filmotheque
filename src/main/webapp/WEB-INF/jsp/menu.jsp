<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<head>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="./css/main.css" />
		<noscript><link rel="stylesheet" href="./css/noscript.css" /></noscript>


	</head>
</head>
<body>

					<nav id="menu">
						<h2>Menu</h2>
						<ul>
							<li><a href="/filmotheque/accueil">ACCUEIL</a></li>
							<c:if test="${userToken.getRole().getRoleName().equals('Admin')}">
							<li><a href="/filmotheque/accueil">AJOUTER FILM</a></li>
							<li><a href="/filmotheque/accueil">ACTEUR / REALISATEUR</a></li>
							</c:if>
							<c:if test="${!userToken.getRole().getRoleName().equals('Admin') 
							&& !userToken.getRole().getRoleName().equals('User') }">
							<li><a href="/filmotheque/login">SE CONNECTER</a></li>
							</c:if>
							<c:if test="${userToken.getRole().getRoleName().equals('Admin') || userToken.getRole().getRoleName().equals('User') }">
							<li><a href="/filmotheque/monCompte">MON COMPTE | ${userToken.getUsername().toUpperCase()}</a></li>
							</c:if>
							<c:if test="${userToken.getRole().getRoleName().equals('Admin') 
							|| userToken.getRole().getRoleName().equals('User') }">
							<li><a href="/filmotheque/logout">SE DECONNECTER</a></li>
							</c:if>
							
						</ul>
					</nav>

</body>
</html>