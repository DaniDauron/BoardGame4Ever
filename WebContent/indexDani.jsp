<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@
taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html lang="es">
<head>
<meta charset="UTF-8">
<jsp:include page="./imports_comunes.html" />

<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
  
<title>Los mejores juegos de mesa</title>
</head>
<body>

	<jsp:include page="./header.html" />


	<div class="container contenidoprincipal">

		<div class="row">
			<!--  Sidebar div de clase col-lg-3 -->
			<jsp:include page="./sidebar.html" />

			<!--  Contenido de la pagina -->
			<div class="col-lg-9">

				<div class="">
					<h2>NOVEDADES</h2>
					<div id="myCarousel" class="carousel slide" data-ride="carousel">
						<!-- Indicators -->
						<ol class="carousel-indicators">
							<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
							<li data-target="#myCarousel" data-slide-to="1"></li>
							<li data-target="#myCarousel" data-slide-to="2"></li>
						</ol>

						<!-- Wrapper for slides -->
						<div class="carousel-inner">
							<div class="item active">
								<img src="./src/novedad_1.jpg" alt="Los Angeles" style="width: 100%;">
							</div>

							<div class="item">
								<img src="./src/novedad_2.jpg" alt="Chicago" style="width: 100%;">
							</div>

							<div class="item">
								<img src="./src/novedad_3.jpg"  alt="New york" style="width: 100%;">
							</div>
						</div>

						<!-- Left and right controls -->
						<a class="left carousel-control" href="#myCarousel"							data-slide="prev">
						 <span							class="glyphicon glyphicon-chevron-left"></span> 
						 <span							class="sr-only">Previous</span>
						</a> <a class="right carousel-control" href="#myCarousel"							data-slide="next"> 
							<span							class="glyphicon glyphicon-chevron-right"></span> 
							<span							class="sr-only">Next</span>
						</a>
					</div>
				</div>

			</div>
			<jsp:include page="./footer.html" />
</body>
</html>
