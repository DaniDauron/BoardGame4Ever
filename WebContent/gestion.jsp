<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">

<title>Los mejores juegos de mesa</title>

<jsp:include page="./imports_comunes.html" />
</head>

<body>
	<jsp:include page="./headeradmin.jsp" />


<c:if test="${admin.logeado == false or empty admin}">
		<c:redirect url="zona_admin.jsp" />
</c:if>

	
	<c:if test="${admin.logeado == true}">
	<div class="container  contenidoprincipal">

		<div class="row titulo">
			<!--  Contenido de la pagina -->
			<h2 class="titulopagina">GESTIÓN DE PRODUCTOS</h2>

		</div>

		<div class="container botonAlta">
			<div class="row">
				<div class="col-lg-4">
					<button type="button" class="btn btn-primary">ALTA</button>

				</div>
			</div>
		</div>
		<div class="container datos">
			<div class="row">
				<div class="col-sm-1">
					<b>ID</b>
				</div>
				<div class="col-sm-5">
					<b>NOMBRE JUEGO</b>
				</div>
				<div class="col-sm-2">
					<b>STOCK</b>
				</div>
				<div class="col-sm-2"></div>
				<div class="col-sm-2"></div>
			</div>

			<c:forEach var="juego" items="${listadoAdmin}">
				<div class="row">
					<div class="col-sm-1">
						<span>${juego.idProd}</span>
					</div>

					<div class="col-sm-5">
						<p class="nombre">${juego.nombreProducto}</p>
					</div>

					<div class="col-sm-2">
						<p class="nombre">${juego.stock}</p>
					</div>

					<div class="col-sm-2">
						<button type="button" class="btn btn-light">Modificar</button>
					</div>
					<div class="col-sm-2">
						<button type="button" class="btn btn-light">Eliminar</button>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
	</c:if>


	<jsp:include page="./footer.html" />
</body>
</html>