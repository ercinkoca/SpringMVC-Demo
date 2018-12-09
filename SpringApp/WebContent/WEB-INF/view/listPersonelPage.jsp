<%@ page language="java" contentType="text/html; charset=ISO-8859-9"
    pageEncoding="ISO-8859-9"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-9">
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>


	<div class="container">
		<div class="jumbotron">
	 		<h1 class="display-4">Personel Sistemi</h1>
	  		<p class="lead">This is a simple hero unit, a simple jumbotron-style component for calling extra attention to featured content or information.</p>
	  		<hr class="my-4">
	  		<p>It uses utility classes for typography and spacing to space content out within the larger container.</p>
	  		<a class="btn btn-primary btn-lg" href="#" role="button">Personel Ekle</a>
		</div>
		<table class="table table-striped">
			
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Adress</th>
				<th>E-mail Adress</th>
				<th>Update/Delete</th>
			</tr>
			
			
			<c:forEach var="tempPersonel" items="${personel}">
			
				<tr>
					<td>${tempPersonel.perName }</td>
					<td>${tempPersonel.perSurname }</td>
					<td>${tempPersonel.perAdres }</td>
					<td>${tempPersonel.perMail }</td>
<!-- 					<td> -->
<%-- 						<a class="btn btn-warning" href="${pageContext.request.contextPath }/student/showFormforUpdate?studentId=${tempStudent.ogrenciId} ">Update</a>  --%>
<%-- 						<a class="btn btn-danger" href="${pageContext.request.contextPath }/student/deleteStudent?studentId=${tempStudent.ogrenciId}" --%>
<!-- 						onclick="if(!(confirm('Are you sure delete this student?'))) return false;">Delete</a> -->
<!-- 					</td> -->
				</tr>
			</c:forEach>
		</table>
	
	</div>

</body>
</html>