<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>

<html>
	<head>
		<title>Filmotheque</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="./css/main.css" />
		<noscript><link rel="stylesheet" href="./css/noscript.css" /></noscript>
		<link rel="stylesheet" href="bootstrap-3.3.7/css/bootstrap.min.css">
		<link rel="stylesheet" href="bootstrap-3.3.7/css/bootstrap-theme.min.css">
		<link rel="stylesheet" href="css/commun.css">

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

				<!-- Menu -->

	<jsp:include page="menu.jsp" />


				<!-- Main -->

					<div id="main">
						<div class="inner">
							<header>
								<h1>Bienvenue dans le filmotheque<br />
								Trouvez votre film et donnez nous votre avis.</h1>
							</header>
							<section class="tiles">

							<c:forEach var="film" items="${listFilm}">
								<article>
									<span class="image">
										<img src="./img/fight_club.jpg" alt="" height="480"/>
									</span>
									<a href="/filmotheque/detail/${film.title}">
										<h2>${film.title}</h2>
										<div class="content">
											<p>${film.releaseYear }</p>
										</div>
									</a>
								</article>
								</c:forEach>
							</section>
						</div>
					</div>

				<!-- Footer -->
	<jsp:include page="footer.jsp" />

			</div>

		<!-- Scripts -->
			<script src="./js/jquery.min.js"></script>
			<script src="./js/browser.min.js"></script>
			<script src="./js/breakpoints.min.js"></script>
			<script src="./js/util.js"></script>
			<script src="./js/main.js"></script>

	</body>
</html>