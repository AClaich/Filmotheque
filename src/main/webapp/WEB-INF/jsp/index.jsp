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
								<h1>Welcome to the Film Library<br />
								Find your film and give us your opinion.</h1>
								<p>Filter in preparation</p>
							</header>
							<section class="tiles">
								<article class="style1" >
									<span class="image">
										<img src="./img/fight_club.jpg" alt="" height="480"/>
									</span>
									<a href="generic.jsp">
										<h2>Fight Club</h2>
										<div class="content">
											<p>Le narrateur, vit seul, travaille seul, dort seul, comme beaucoup d'autres personnes seules qui connaissent la misère morale et sexuelle. 
											 C'est pourquoi il va devenir membre du Fight club, un lieu clandestin dirigé par Tyler Durden, anarchiste entre gourou et philosophe. </p>
										</div>
									</a>
								</article>
								<article class="style2">
									<span class="image">
										<img src="./img/H2G2.jpg" alt="" height="480"/>
									</span>
									<a href="generic.jsp">
										<h2>H2G2</h2>
										<div class="content">
											<p>Sale journée pour le Terrien Arthur Dent. Sa maison est sur le point d'être rasée par un bulldozer, il découvre que son meilleur ami,
											 Ford Prefect, est un extraterrestre et pour couronner le tout, la Terre va être pulvérisée dans quelques minutes pour faire de la place 
											 à une voie express hyperspatiale. Arthur a une chance de survivre, mais il doit pour cela se faire prendre en stop par un vaisseau spatial,
											  avec l'aide de Ford. Sa plus grande aventure va commencer au moment où notre propre monde disparaît... Arthur se jette dans l'inconnu et 
											  entame un délirant périple au cours duquel il va découvrir la véritable nature de l'univers. 
</p>
										</div>
									</a>
								</article>
								<article class="style3">
									<span class="image">
										<img src="./img/Interstellar.jpg" alt="" height="480"/>
									</span>
									<a href="generic.jsp">
										<h2>Interstellar</h2>
										<div class="content">
											<p>Le film raconte les aventures d’un groupe d’explorateurs qui utilisent une faille récemment découverte dans l’espace-temps afin de repousser 
											les limites humaines et partir à la conquête des distances astronomiques dans un voyage interstellaire. </p>
										</div>
									</a>
								</article>
								<article class="style4">
									<span class="image">
										<img src="./img/parasite.png" alt="" height="480"/>
									</span>
									<a href="generic.jsp">
										<h2>Parasite</h2>
										<div class="content">
											<p>Toute la famille de Ki-taek est au chômage, et s’intéresse fortement au train de vie de la richissime famille Park. Un jour, leur fils réussit 
											à se faire recommander pour donner des cours particuliers d’anglais chez les Park. C’est le début d’un engrenage incontrôlable, dont personne ne 
											sortira véritablement indemne... </p>
										</div>
									</a>
								</article>
								<article class="style5">
									<span class="image">
										<img src="./img/pulp_fiction.jpg" alt="" height="480"/>
									</span>
									<a href="generic.jsp">
										<h2>Pulp Fiction</h2>
										<div class="content">
											<p>L'odyssée sanglante et burlesque de petits malfrats dans la jungle de Hollywood à travers trois histoires qui s'entremêlent. </p>
										</div>
									</a>
								</article>
								<article class="style6">
									<span class="image">
										<img src="./img/Vol au dessus d'un nid de coucou.jpg" alt=""  height="480"/>
									</span>
									<a href="generic.jsp">
										<h2>Vol au dessus d'un nid de coucou</h2>
										<div class="content">
											<p>Rebellion dans un hôpital psychiatrique à l'instigation d'un malade qui se révolte contre la dureté d'une infirmière. </p>
										</div>
									</a>
								</article>
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