<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
<title>Ficha</title>
<meta charset="UTF-8">
<link rel="stylesheet" href="./bootstrap/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</head>
<body>

	<header>
		<jsp:include page="./header.html" />
	</header>

	</div>
	<div class="container">
		<div class="row">
			<div class="col-md-2  d-none d-md-none d-xl-block "
				style="background: teal">
				<h3>SIDEBAR</h3>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p>
			</div>

			<div class="col-offset-1 col-md-9 col-sm-12">
				<div class="row">
					<div class="col-sm12">
						<h2>Nombre del Producto</h2>
					</div>
				</div>
				<div class="row ">
					<div class="col-sm-8">
						<img
							src="https://cf.geekdo-images.com/itemrep/img/VevkNKkVOi1DgRBmHqOh1j1azXs=/fit-in/246x300/pic3429338.png"
							alt="ficha" class="imagen_producto_principal"
							style="float: left; padding-left: 1%; padding-right: 1%">
						<p><strong>Jugadores:</strong> (producto.min) - (producto.max)</p>
						<p><strong>Categoría: (producto.categoria)</strong></p>
						<p><strong>Edad mínima recomendada:</strong> (producto.edad)</p>
						<p><strong>Duracción:</strong> (producto.tiempoExtimado)</p>

					</div>
					<div class="col-sm-4" style="background: #ffffff78">
						<p><strong>Precio:</strong> (producto.precio)</p>
						<button type="button" class="btn btn-primary">Comprar</button>
					</div>
				</div>
				<div class="row">
					<div class="col-sm12">
						<span><strong>Descripción:</strong> (producto.descripcion)</span> <span> <span>Lorem
								ipsum dolor sit amet, consectetur adipisicing elit. Tempore
								incidunt similique rem qui non, suscipit animi iste minus
								nesciunt eveniet nulla aspernatur vel ipsam quas iure repellat,
								magnam iusto quam?</span>
						</span>
					</div>
				</div>
			</div>
		</div>
	</div>
		<jsp:include page="./footer.html" />
		
</body>
</html>