<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false"%>
<!doctype html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Form</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">
</head>

<body>
	<c:if test="${page=='home' }">
		<c:if test="${not empty msg }">
			<div class="alert alert-success">
				<b><c:out value="${msg}"></c:out> </b>
			</div>
		</c:if>
		<div class="list-group">
			<button type="button"
				class="list-group-item list-group-item-action active">Menu</button>
			<a href='<c:url value='/home'></c:url>'
				class="list-group-item list-group-item-action">Form</a> <a
				href='<c:url value='/view'></c:url>'
				class="list-group-item list-group-item-action">View </a>
		</div>

		


		<form action="save" method="POST" modelAttribute="Theinfo">

			<div class="container">
				<div class="form-group py-2">
					<label for="name" class="form-label">Name</label> <input
						path="name" class="form-control" id="name" name="name" type="text"
						placeholder="Enter your name">
				</div>
				<div class="form-group py-2">
					<label for="email" class="form-label">Email address</label> <input
						path="email" type="email" class="form-control" name="email"
						id="email" placeholder="name@example.com">
				</div>
				<div class="form-group py-2">
					<label for="phone" class="form-label">Phone no.</label> <input
						path="phone" class="form-control" id="phone" name="phone"
						type="text" placeholder="Enter your phone number">
				</div>
				<div class="container text-center">
					<button class="btn btn-outline-success">Submit</button>
				</div>
			</div>
		</form>
	</c:if>
</body>

</html>