<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>

<link rel="stylesheet" type="text/css"
	href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />

<!-- 
	<spring:url value="/css/main.css" var="springCss" />
	<link href="${springCss}" rel="stylesheet" />
	 -->
<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />

</head>
<body>

	<div class="container">

		<div class="starter-template">
		<h1>Hello !!</h1>
		<h1>Welcome to Library App !!</h1>
			<h1>Books Available In Library</h1>
			<table border="3" style="width:500px;text-align=center;" >
			<tr>
					<td>S.No</td>
					<td>Book Name</td>
					<td>Author Name</td>
      				<td>Availability Status</td>
    			</tr>
			<c:forEach items="${Books}" var="book">
				<tr>
					<td><c:out value="${book.getId()}" /></td>
					<td><c:out value="${book.getName()}" /></td>
					<td><c:out value="${book.getAuthor()}" /></td>
      				<td><c:out value="${book.getAvailability()}" /></td>
    			</tr>
			</c:forEach>
			</table>
		</div>

	</div>
	<!-- /.container -->

	<script type="text/javascript"
		src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</body>

</html>
