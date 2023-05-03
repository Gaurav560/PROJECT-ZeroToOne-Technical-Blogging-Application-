<%@page import="com.blog.entities.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<%@page errorPage="error_page.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile Page</title>
<!--  Bootstrap css-->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
	crossorigin="anonymous">
<!--css  -->
<link href="css/style.css" rel="stylesheet" type="text/css" />
<!-- font-awesome -->
<script src="https://kit.fontawesome.com/d52455da93.js"
	crossorigin="anonymous"></script>
</head>
<style>
.bkc {
	background-color: #e07a5f;
}
</style>
<body>

	<c:if test="${empty currentUser} ">
		<c:redirect url="login_page.jsp"></c:redirect>

	</c:if>







	<c:if test="${not empty failMsg} ">
		<p class="text-center text-danger fs-3">${failMsg}</p>
		<c:remove var="failMsg" scope="session" />
	</c:if>


	<%
		User user = (User) session.getAttribute("currentUser");
	%>



	<!--  NAVBAR starts here-->
	<nav class="navbar navbar-expand-lg  bg-primary dar "
		data-bs-theme="dark">
		<div class="container-fluid">

			<a class="navbar-brand" href="index.jsp"><i
				class="fa-brands fa-blogger-b"></i> Zero-To-One</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#">Home</a></li>
					<li class="nav-item"><a class="nav-link active" href="#"><i
							class="fa-solid fa-address-book"></i> Contact</a></li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle active" href="#" role="button"
						data-bs-toggle="dropdown" aria-expanded="false">Cateogries </a>
						<ul class="dropdown-menu">
							<li><a class="dropdown-item " href="#">Action</a></li>
							<li><a class="dropdown-item" href="#">Another action</a></li>
							<li><hr class="dropdown-divider"></li>
							<li><a class="dropdown-item" href="#">Something else
									here</a></li>
						</ul></li>

				</ul>
				<form class="d-flex" role="search">

					<a href="#!" class="btn fw-bold text-dark me-2" type="submit"
						data-bs-toggle="modal" data-bs-target="#exampleModal"> <i
						class="fa-regular fa-user"></i> <%=user.getName()%>
					</a> <a href="LogoutServlet" class="btn btn-outline-warning"
						type="button"> <i class="fa-solid fa-right-from-bracket"></i>Logout
					</a>
				</form>
			</div>
		</div>
	</nav>
	<!-- NAVBAR ends here -->


	<!-- profile modal starts here -->

	<!-- Button trigger modal -->


	<!-- Modal -->
	<div class="modal fade" id="exampleModal" tabindex="-1"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header bkc">
					<div class="container text-center">
						<h1 class="modal-title fs-5" id="exampleModalLabel">User
							Details</h1>
					</div>
					<button type="button" class="btn-close" data-bs-dismiss="modal"
						aria-label="Close"></button>
				</div>
				<div class="modal-body text-center ">

					<h1 class=" fs-5 bg-dark text-white">
						<img src="pics/<%=user.getProfile()%>" class="img-fluid"
							style="border-radius: 50%"> <br>
						<%=user.getName()%><br>
					</h1>
					<!--  table starts here-->

					<table class="table  table-success table-striped">
						
						<tbody>
							<tr>
								<th scope="row">ID</th>
								<td><%=user.getId() %></td>
								
							</tr>
							<tr>
								<th scope="row">Email</th>
								<td><%=user.getEmail() %></td>
							
							</tr>
							<tr>
								<th scope="row">Profession</th>
								<td ><%=user.getProfession() %></td>
								
							</tr>
							<tr>
								<th scope="row">Contact</th>
								<td ><%=user.getNumber() %></td>
								
							</tr>
								<tr>
								<th scope="row">Registered On</th>
								<td ><%=user.getDateTime() %></td>
								
							</tr>
						</tbody>
					</table>
					<!--  table ends here-->

				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-bs-dismiss="modal">Close</button>
					<button type="button" class="btn btn-primary">Edit</button>
				</div>
			</div>
		</div>
	</div>
	<!-- profile modal ends here -->













	<!-- jquery cdn -->
	<script src="https://code.jquery.com/jquery-3.6.4.min.js"
		integrity="sha256-oP6HI9z1XaZNBrJURtCoUT5SUnxFr8s3BzRl+cbzUq8="
		crossorigin="anonymous">
		
	</script>

	<!-- js  -->

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
		crossorigin="anonymous"></script>
	<script src="js/myjs.js" type="text/javascript"></script>
</body>
</html>