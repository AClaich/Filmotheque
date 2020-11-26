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
		<link rel="stylesheet" href="./css/monCompte.css" />
		<noscript><link rel="stylesheet" href="./css/noscript.css" /></noscript>
		<link rel="stylesheet" href="bootstrap-3.3.7/css/bootstrap.min.css">
		<link rel="stylesheet" href="bootstrap-3.3.7/css/bootstrap-theme.min.css">
		<script src="js/jquery.min.js"></script>
		<link rel="icon" href="img/favicon.ico" />
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

	</head>
<body class="is-preload">
		<!-- Wrapper -->
			<div id="wrapper">

				<!-- Header -->
					<header id="header">
					
						<div class="inner">

							<!-- Logo -->
								<a href="/filmotheque/accueil" class="logo">
									<span class="symbol"><img src="./img/logo.svg" alt="" /></span><span class="title">Mon compte</span>
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
				
				<div class="container">
    
    			<div class="row bg-faded">
        			<div class="col-md-6">
        							<div class="card">
  					<h5 class="card-header">Informations</h5>
            			<div class="card-body h-100 justify-content-center">

					<form:form  modelAttribute="userToken">
						<div>
							<form:label path="username" class="d-inline p2">Nom d'utilisateur</form:label><form:input class="d-inline p2" style="width: 100px" path="username"/>
							<form:errors path="username" cssClass="erreur"/>
						</div>
					</form:form>
					
   					<a href="#" class="btn btn-primary">Go somewhere</a>
            			</div>
        			</div>
    			</div>
				</div>


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