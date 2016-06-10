<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value="/css/style.css"/>" rel="stylesheet">
<script type="text/javascript" src="<c:url value="/lib/jquery-2.1.3.js"/>"></script>
<title>Insert title here</title>
</head>
<body>
	<header>
		User Sign Up	
	</header>
	<nav>
		Login <br/>
		Home <br/>
	</nav>
	<section>
		<div class="user-info-form">
			<div class="label-text">
				<label for="firstName">First Name</label>
			</div>
			<div class="text-input">
				<input type="text" name="firstName"> 
			</div>
			<div class="label-text">
				<label for="lastName">Last Name</label>
			</div>
			<div class="text-input">
				<input type="text" name="lastName">
			</div>
			<div class="label-text">
				<label for="Address">Address </label>
			</div>
			<div class="text-input">
				<input type="text" name="address">
			</div>
			<div class="label-text">
				<label for="city">City</label>
			</div>
			<div class="text-input">
				<input type="text" name="city">
			</div>
			<div class="label-text">
				<label for="Zip">Zip</label>
			</div>
			<div class="text-input">
				<input type="text" name="zip">
			</div>
		</div>	
		<div>
			<button type="button" id="submit">Sign Up</button>
		</div>
	</section>
	<footer>
	Copyrights @...
	</footer>
</body>
</html>