<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<!--
	Phantom by HTML5 UP
	html5up.net | @ajlkn
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>
	<head>
		<title>Filmotheque</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="./css/main.css" />
		<noscript><link rel="stylesheet" href="./css/noscript.css" /></noscript>
	</head>
	<body class="is-preload">
		<!-- Wrapper -->
			<div id="wrapper">

				<!-- Header -->
					<header id="header">
						<div class="inner">

							<!-- Logo -->
								<a href="/filmotheque/accueil" class="logo">
									<span class="symbol"><img src="./img/logo.svg" alt="" /></span><span class="title">Filmotheque</span>
								</a>

							<!-- Nav -->
								<nav>
									<ul>
										<li><a href="#menu">Menu</a></li>
									</ul>
								</nav>

						</div>
					</header>
					<jsp:include page="menu.jsp" />


				<!-- Main -->
					<div id="main">
						<div class="inner">
							<c:forEach var="film" items="${listFilm}">
								<h1>${film.title}</h1>								
								<span class="image main"><img src="./img/pic13.jpg" alt="" /></span>
									<form:form method="GET" action="/filmotheque/detail" modelAttribute="film" >
										<form:hidden path="id" />	
										<div>
											<form:label path="title">Title :</form:label>
											<form:input path="title" />				
										</div>
										<div>
											<form:label path="releaseYear">Release Year :</form:label>
											<form:input path="releaseYear" />
										</div>
										<div>
											<button type="submit" value="Save" onClick="modifyFilm()" >
												<a href="/filmotheque/modify?noFilm=${film.id}">Modify</a>
											</button>
											<button type="submit" value="Delete" >
												<a href="/filmotheque/delete?noFilm=${film.id}">Delete</a>
											</button>
											
										</div>
									</form:form>
								<tr>
									<td>Release Year : ${film.releaseYear} </td>
									<td><a href="/filmotheque/delete?noFilm=${film.id}">Delete</a>|
											<a href="/filmotheque/modify?noFilm=${film.id}">Modify</a></td>
									 date de sortie|categorie|realisateur|acteurs
									
									<td><a href="/demoJpa/supprimer?noPers=${personne.id}">Supprimer</a> | 
									<a href="/demoJpa/modifier?noPers=${personne.id}">Modifier</a></td>
								</tr>
								
							</c:forEach>
							-->
						</div>
					</div>

				<!-- Footer -->
	<jsp:include page="footer.jsp" />

		<!-- Scripts -->
			<script src="./js/jquery.min.js"></script>
			<script src="./js/browser.min.js"></script>
			<script src="./js/breakpoints.min.js"></script>
			<script src="./js/util.js"></script>
			<script src="./js/main.js"></script>

	</body>
</html>