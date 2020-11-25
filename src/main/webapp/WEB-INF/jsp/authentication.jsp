<%@ page language="java" contentType="text/html; charset=UTF-8"
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
		<title>Phantom by HTML5 UP</title>
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
								<a href="index.jsp" class="logo">
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
							<li><a href="index.jsp">Home</a></li>
							<li><a href="generic.jsp">Ipsum veroeros</a></li>
							<li><a href="generic.jsp">Tempus etiam</a></li>
							<li><a href="generic.jsp">Consequat dolor</a></li>
							<li><a href="elements.jsp">Elements</a></li>
						</ul>
					</nav>

				<!-- Main -->
				<form:form action="/filmotheque/authentication" modelAttribute="user" method="POST">
				
					<form:label path="username">Nom d'utilisateur</form:label><form:input path="username"/>
					
					<form:label path="password">Mot de passe</form:label><form:input path="password" class="password" type="password"/>
				
				<input type="submit" value="Valider"/>
				</form:form>

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