<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html lang="es">
<head>
<meta charset="UTF-8">
<jsp:include page="./imports_comunes.html" />
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

				<div class="container micontenedor">
					<div class="row">
						<h2 class="titulopagina">${tituloPagina}</h2>
					</div>
					<div class="row">

						<c:forEach var="juego" items="${listadoJuegos}">
							<div class="col-lg-4  col-sm-12  producto">
								<figure>
									<a href=" VerProducto?juego=${juego.idProd}"> <img
										alt="${juego.nombreProducto}" class="img-fluid img-listado"
										src="${juego.imagen }">
									</a>
								</figure>
								<p class="nombre">${juego.nombreProducto}</p>
								<fmt:setLocale value="es_ES" />
								<p class="precio">
									<fmt:formatNumber type="currency" value="${juego.precio}" />
								</p>
								<div class="row">
								
								<c:if test="${juego.stock > 0}">
									<div class="offset-1 col-lg-4 ">
										<button type="button" class="btn btn-warning">Comprar</button>
									</div>
								</c:if>
								
								<c:if test="${juego.stock <= 0}">
									<div class="offset-1 col-lg-4 ">
										<button type="button" class="btn">Sin Stock ${juego.stock}</button>
									</div>
								</c:if>
								
									<div class="offset-1 col-lg-4">
										<a href=" VerProducto?juego=${juego.idProd}">
											<button class="btn btn-success">Mas Info</button>
										</a>

									</div>
								</div>


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