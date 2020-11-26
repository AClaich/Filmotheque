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
								<a href="/filmotheque/filmotheque" class="logo">
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

				<!-- Menu -->
					<nav id="menu">
						<h2>Menu</h2>
						<ul>
							<li><a href="/filmotheque/home">Home</a></li>
							<li><a href="/filmotheque/management">Film Management</a></li>
							<li><a href="generic.jsp">Tempus etiam</a></li>
							<li><a href="generic.jsp">Consequat dolor</a></li>
							<li><a href="elements.jsp">Elements</a></li>
						</ul>
					</nav>

				<				<!-- Main -->
					<div id="main">
						<div class="inner">
						<h2>Ajouter un film</h2>	
						<form action="/filmotheque/add" method="post">
							<label for="title">Film :</label>
							<input type="text" name="title"/></br>
							<button type="submit">Add</button>		
						</form>
						</br>
						
						<h2>Liste des Films :</h2>		
						<c:if test="${ empty listFilm  }">
				    		Rien à faire !
						</c:if>
						<table class="table">
							<c:forEach var="film" items="${listFilm}">
								<tr>
									<td>${film.title} </td>
									<td><a href="/filmotheque/delete?noFilm=${film.id }">Supprimer</a></td>
								</tr>
							</c:forEach>
						</table>
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