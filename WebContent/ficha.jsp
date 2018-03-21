<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
<title>Ficha</title>
<meta charset="UTF-8">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<jsp:include page="./imports_comunes.html" />
</head>
<body>

	<header>
		<jsp:include page="./header.html" />
	</header>

	<!-- Page Content -->
	<div class="container  contenidoprincipal">
		<div class="row">
			<!--  Sidebar div de clase coHg-3 -->
			<jsp:include page="./sidebar.html" />

			<div class="col-lg-9 col-sm-12">
				<div class="container">
					<div class="card mt-4 ">
						<div class="row">
							<div class="offset-4 col-md-4">
								<img class="card-img-top img-fluid" src="${producto.imagen }"
									alt="${producto.nombreProducto}">
							</div>
						</div>
						<div class="row">
							<div class="col-sm-12 col-md-6">
								<h2 class="card-title offset-4">${producto.nombreProducto}</h2>
							</div>
							<div class="col-sm-12 offset-3 col-md-3  ">
								<div class="row">
									<div class="  col-sm-12 col-md-7">
										<fmt:setLocale value="es_ES" />
										<h4 style="text-align: right;">
											<fmt:formatNumber type="currency" value="${producto.precio}" />
										</h4>
										<button style="text-align: right;" type="button"
											class="btn btn-primary">Comprar</button>
									</div>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="card-body offset-1 col-sm-12">


								<h6>
									<b>Tableros</b>
								</h6>
								<h6>
									<b>Edad recomendada:</b> ${producto.edad}
								</h6>
								<h6>
									<b>Número de jugadores</b> ${producto.minJugadores} -
									${producto.maxJugadores}
								</h6>
								<h6>
									<b>Duración de partida:</b> ${producto.tiempoEstimado}
								</h6>
								<p class="card-text">
								<h6>
									<b>Descripción: </b>
								</h6>
								${producto.descripcion}
								</p>
								<!--<span class="text-warning">&#9733; &#9733; &#9733; &#9733; &#9734;</span>
              4.0 stars-->
							</div>
						</div>
					</div>
				</div>

			</div>
			<!-- /.col-lg-9 -->

		</div>

	</div>
	<!-- /.container -->


	<jsp:include page="./footer.html" />

</body>
</html>