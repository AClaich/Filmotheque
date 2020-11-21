<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
<link rel="stylesheet" href="bootstrap-3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="bootstrap-3.3.7/css/bootstrap-theme.min.css">
<script src="js/jquery.min.js"></script>
<script src="bootstrap-3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/commun.css">
<link rel="icon" href="img/favicon.ico" />


</head>
<body>

	<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container">
			
		</div>
	</nav>

	<div class="container">
		<div class="jumbotron">
			<h1>
				Bienvenue <small>dans l'application chifoumi !</small>
				
			</h1>
		</div>

			<p class="h3">
			JOUEZ !
			</p>
			<form action="/demoMVC/demoParamHttp" method="post">
			<div class="row">
				<div class="row">
					<a href=""><img alt="chi" src="/img/chi.png" id="chi"></a>
				</div>
				<div class="row">
					<a href=""><img alt="fou" src="/img/fou.png" id="fou"></a>
				</div>
				<div class="row">
					<a href=""><img alt="mi" src="/img/mi.png" id="mi"></a>
				</div>
				</div>
			</form>


	</div>

	<jsp:include page="footer.jsp" />
</html>