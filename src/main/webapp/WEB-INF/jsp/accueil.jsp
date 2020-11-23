<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
		Filmotheque
		<div class="container">
		
		</div>
	</nav>

	<div class="container">
		<div class="jumbotron">
			<h1>
				Bienvenue <small>dans l'application filmotheque !</small>
				
			</h1>
		</div>

<h2>Formulaire de saisie :</h2>
	<form:form method="POST" action="/filmotheque/ajout" modelAttribute="person">
		<div>
			<form:label path="name">Nom :</form:label>
			<form:input path="name"/>
		</div>
		<div>
			<input type="submit" value="Submit"/>	
		</div>
	</form:form>


	</div>

	<jsp:include page="footer.jsp" />
</html>