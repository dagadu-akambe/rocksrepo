<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link href="<c:url value="/css/style.css"/>" rel="stylesheet">
	<link href="<c:url value="/css/bootstrap.min.css"/>" rel="stylesheet">
	<link href="<c:url value="http://cdn.datatables.net/1.10.7/css/jquery.dataTables.min.css"/>" rel="stylesheet">
	
	<!-- bootstrap data table required libraries -->
	<script type="text/javascript" src="<c:url value="/lib/jquery-2.1.3.js"/>"></script>
	<script type="text/javascript" src="http://cdn.datatables.net/1.10.7/js/jquery.dataTables.min.js"></script>
	
	<script type="text/javascript"  src="http://cdn.datatables.net/plug-ins/1.10.7/integration/bootstrap/3/dataTables.bootstrap.js"></script>
	<link href="http://cdn.datatables.net/plug-ins/1.10.7/integration/bootstrap/3/dataTables.bootstrap.css" rel="stylesheet">

<title>Login</title>
</head>
<body>
	<header>
		<h1>Spring MVC Application</h1>
	</header>
	<nav>
		<span class="login">Login</span>  <br />
		<span class="signUp">Sign Up</span> <br />
		<span class="reports">Reports </span> <br />
	</nav>
	<section>
		<div class="container">
			<div class="data-container"></div>
			<table id="example" class="display"></table>
		</div>
	</section>
	
	<footer>
	<script type="text/javascript" src="<c:url value="/lib/bootstrap.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/js/application.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/js/LoginElement.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/js/RegisterUserElement.js"/>"></script>	
		
	</footer>
</body>
</html>