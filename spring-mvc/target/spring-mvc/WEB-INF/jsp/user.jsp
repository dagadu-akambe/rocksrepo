<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link href="<c:url value="/css/style.css"/>" rel="stylesheet">
	<script type="text/javascript" src="<c:url value="/lib/jquery-2.1.3.js"/>"></script>
<title>Add User</title>
</head>
<body>
	<header> Create User </header>
	<nav> Home <br />
	</nav>
	<section> 
		<form:form action="addUser" modelAttribute="user"
			method="post">
			<label for="nameIn">First Name : </label>
			<form:input path="firstName" id="nameIn" />
			<br>
			<label for="lastNameIn">Last Name : </label>
			<form:input path="lastName" id="lastNameIn" />
			<br>
			<label for="gender">Gender : </label>
			<form:radiobutton path="gender" label="Male" value="male" />
			<form:radiobutton path="gender" label="FeMale" value="female" />
			<br>
			<label for="city">City : </label>
			<form:input path="city" id="city" />
			<br>
			<label for="zip">Zip : </label>
			<form:input path="zip" id="zip" />
			<br>
			<button type="submit">Add User</button>
		</form:form> 
	</section>
	<footer>
			
	</footer>
</body>
</html>