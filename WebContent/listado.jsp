<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="es">
<head>
<meta charset="UTF-8">
<!-- Bootstrap core CSS -->
<link
	href="./startbootstrap-shop-item-gh-pages/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Custom styles for this template -->
<link href="./startbootstrap-shop-item-gh-pages/css/shop-item.css"
	rel="stylesheet">
	
	<link href="./css/nuestro.css" rel="stylesheet">
<!-- Bootstrap core JavaScript -->
<script
	src="./startbootstrap-shop-item-gh-pages/vendor/jquery/jquery.min.js"></script>
<script
	src="./startbootstrap-shop-item-gh-pages/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
<title>Los mejores juegos de mesa</title>
</head>
<body>
	<header>
		<jsp:include page="./header.html" />
	</header>

	<div class="container" style="background: #93a4af;">

		<div class="row">
			<!--  Sidebar div de clase coHg-3 -->
			<jsp:include page="./sidebar.html" />

			<!--  Contenido de la pagina -->
			<div class="col-lg-9">

				<div class="container micontenedor" style="">
					<div class="row">
						<h2>${tituloPagina} Observe todos nuestros juegos</h2>
					</div>
					<div class="row">

						<c:forEach var="juego" items="${listadoJuegos}">
							<div class="col-lg-4">
								<a href=" VerProducto?juego=${juego.id}"> <img
									alt="${juego.bombre}" class="img-fluid" src="${juego.imagen}">
									<p>${juego.nombre}</p>
									<p>${juego.precio}</p>
								</a>
							</div>

						</c:forEach>
					</div>
				</div>


				<div class="container">
					<div class="row">
						<div class="col-lg-4">
							<img alt="juego" class="img-fluid"
								src="https://images-na.ssl-images-amazon.com/images/I/71gRRFM0daL._SY355_.jpg">
							<p>Juego</p>
							<p>Precio</p>
						</div>
						<div class="col-lg-4">
							<img alt="juego" class="img-fluid"
								src="https://images-na.ssl-images-amazon.com/images/I/71gRRFM0daL._SY355_.jpg">
							<p>Juego</p>
							<p>Precio</p>
						</div>
						<div class="col-lg-4">
							<img alt="juego" class="img-fluid"
								src="https://images-na.ssl-images-amazon.com/images/I/71gRRFM0daL._SY355_.jpg">
							<p>Juego</p>
							<p>Precio</p>
						</div>
						<div class="col-lg-4">
							<img alt="juego" class="img-fluid"
								src="https://images-na.ssl-images-amazon.com/images/I/71gRRFM0daL._SY355_.jpg">
							<p>Juego</p>
							<p>Precio</p>
						</div>
						<div class="col-lg-4">
							<img alt="juego" class="img-fluid"
								src="https://images-na.ssl-images-amazon.com/images/I/71gRRFM0daL._SY355_.jpg">
							<p>Juego</p>
							<p>Precio</p>
						</div>
						<div class="col-lg-4">
							<img alt="juego" class="img-fluid"
								src="https://images-na.ssl-images-amazon.com/images/I/71gRRFM0daL._SY355_.jpg">
							<p>Juego</p>
							<p>Precio</p>
						</div>
						<div class="col-lg-4">
							<img alt="juego" class="img-fluid"
								src="https://images-na.ssl-images-amazon.com/images/I/71gRRFM0daL._SY355_.jpg">
							<p>Juego</p>
							<p>Precio</p>
						</div>
						<div class="col-lg-4">
							<img alt="juego" class="img-fluid"
								src="https://images-na.ssl-images-amazon.com/images/I/71gRRFM0daL._SY355_.jpg">
							<p>Juego</p>
							<p>Precio</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<jsp:include page="./footer.html" />
</body>
</html>