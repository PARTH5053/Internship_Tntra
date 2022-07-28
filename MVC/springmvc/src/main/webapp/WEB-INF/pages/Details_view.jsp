<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="col-md-10">
		<h1 class="text-center">The entries</h1>

		<c:forEach items="${Theinfo}" var="d1">

			<div class="card">
				<div class="card-body">
						<c:out value="${d1.name }"></c:out>
						<c:out value="${d1.email }"></c:out>
						<c:out value="${d1.phone }"></c:out>
				</div>
			</div>
		</c:forEach>
	</div>
</body>
</html>