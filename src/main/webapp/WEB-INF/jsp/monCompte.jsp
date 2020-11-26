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
		<title>Mon Compte</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="./css/main.css" />
		<noscript><link rel="stylesheet" href="./css/noscript.css" /></noscript>
		<link rel="stylesheet" href="bootstrap-3.3.7/css/bootstrap.min.css">
		<link rel="stylesheet" href="bootstrap-3.3.7/css/bootstrap-theme.min.css">
		<script src="js/jquery.min.js"></script>
		<script src="bootstrap-3.3.7/js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="css/commun.css">
		<link rel="icon" href="img/favicon.ico" />

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
				<div class="containeur">
				
				<c:if test="${ userError == true}"><p class="error">Utilisateur non valide. Veuillez réessayer.</p></c:if>
					<form:form  modelAttribute="userToken">
						<div>
						<form:label path="username">Nom d'utilisateur</form:label><form:input style="width: 100px" path="username"/>
						<form:errors path="username" cssClass="erreur"/>
					</div>
					</form:form>
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