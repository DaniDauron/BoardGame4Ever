<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="es">
<head>
<meta charset="UTF-8">
<jsp:include page="./imports_comunes.html" />
<title>Los mejores juegos de mesa</title>
</head>
<body>
	<header>
		<jsp:include page="./header.html" />
	</header>

	<div class="container contenidoprincipal">

		<div class="row">
			<!--  Sidebar div de clase col-lg-3 -->
			<jsp:include page="./sidebar.html" />

			<!--  Contenido de la pagina -->
			<div class="col-lg-9">

				<div class="container micontenedor">
					<div class="row">
						<h2 class="titulopagina">${tituloPagina}</h2>
					</div>
					<div class="row">

						<c:forEach var="juego" items="${listadoJuegos}">
							<div class="col-lg-4  col-sm-12">

								<a href=" VerProducto?juego=${juego.idProd}"> <img
									alt="${juego.nombreProducto}" class="img-fluid img-listado"
									src="${juego.imagen }">
								</a>

								<p class="nombre">${juego.nombreProducto}</p>
								<p class="precio">${juego.precio}</p>

								<button type="button" class="btn btn-warning">Comprar</button>
							</div>
						</c:forEach>
					</div>
				</div>
			</div>
		</div>

	</div>
	<jsp:include page="./footer.html" />


</body>
</html>