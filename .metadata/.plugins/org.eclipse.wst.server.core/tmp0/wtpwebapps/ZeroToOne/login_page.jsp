<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<%@page errorPage="error_page.jsp"%>
<%@ page import = "java.io.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
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
.banner-background {
	clip-path: polygon(30% 0%, 70% 0%, 100% 0, 100% 91%, 77% 88%, 36% 94%, 0 90%, 0 0);
}
</style>
<body>
	<!--  navbar starts here-->
	<%@include file="indexNavbar.jsp"%>
	<!-- navbar ends here -->

	<!-- checking if the login credentials are OK or not  -->







	<!-- login card starts here -->
	<main class="d-grid align-items-center bg-primary banner-background  pt-5"
		style="padding-bottom: 80px">
		<div class="contaier ">
			<div class="row">
				<div class="col-md-4 offset-md-4">
					<div class="card">


						<c:if test="${ not empty failMsg}">
							<div class="alert bg-danger fs-3 text-center" role="alert">${failMsg}</div>
							<c:remove var="failMsg" scope="session" />
						</c:if>
							<c:if test="${ not empty sucMsg1}">
							<div class="alert bg-success fs-3 text-center" role="alert">${sucMsg1}</div>
							
							<c:remove var="sucMsg1" scope="session" />
							<% 
							response.setIntHeader("Refresh",1);
							
							%>
						</c:if>
						

						<div class="card-header fs-4 text-center bg-warning">
							<c:if test="${ not empty failMsg}">
								<p class="text-center text-dark bg-primary fs-3">${failMsg}</p>
								<c:remove var="failMsg" scope="session" />
							</c:if>
							<i class="fa-solid  fa-right-to-bracket"></i> Login here
						</div>
						<div class="card-body">

							<form action="LoginServlet" method="post">

								<!-- email row -->
								<div class="mb-3">
									<label for="exampleInputEmail1" class="form-label">Email
										address</label> <input type="email" class="form-control"
										id="exampleInputEmail1" aria-describedby="emailHelp"
										name="email">
									<div id="emailHelp" class="form-text">We'll never share
										your email with anyone else.</div>
								</div>



								<!--  password row-->

								<div class="mb-3">
									<label for="exampleInputPassword1" class="form-label">Password</label>
									<input type="password" class="form-control"
										id="exampleInputPassword1" name="password">
								</div>

								<!-- button -->

								<div class="container">
									<button type="submit" class="btn btn-primary me-3">Submit</button>
								<a href="register_page.jsp">Don't have an account ! Sign Up </a>
								</div>

							</form>
						</div>
					</div>

				</div>
			</div>
		</div>

	</main>
	<!-- login card ends here -->
















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