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

	<div id="footer">
  		  <jsp:include page="./footer.html"/>
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
				<div class="row">
					<div class="col-sm-8">
						<img
							src="https://cf.geekdo-images.com/itemrep/img/VevkNKkVOi1DgRBmHqOh1j1azXs=/fit-in/246x300/pic3429338.png"
							alt="ficha" class="imagen_producto_principal"
							style="float: left; padding-left: 1%; padding-right: 1%">
						<p>Jugadores: (producto.min) - (producto.max)</p>
						<p>Categoria: (producto.categoria)</p>
						<p>Edad m&iacute;nima recomendada: (producto.edad)</p>
						<p>Duracción: (producto.tiempoExtimado)</p>
						
						<span>Descripcion: (producto.descripcion)</span>
						<span>
						    <span>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Tempore incidunt similique rem qui non, suscipit animi iste minus nesciunt eveniet nulla aspernatur vel ipsam quas iure repellat, magnam iusto quam?</span>
						    <span>Ut aut vitae voluptas commodi dolores maiores obcaecati, nostrum voluptatibus, repudiandae error placeat molestiae animi debitis, cum voluptate corporis porro eveniet optio doloribus. Similique, earum accusamus dolores rem soluta. Delectus.</span>
						    <span>Cumque, aut aliquid eligendi! Maiores fugiat pariatur ratione voluptas dolore aperiam consectetur minima, voluptatum expedita molestiae tenetur doloribus dolorem officia rem repudiandae laborum beatae nulla odit, aut reprehenderit iusto! Saepe.</span>
						    <span>Doloribus similique amet quasi dolor, ducimus debitis saepe accusantium suscipit, ipsum officia aperiam? Quisquam dolores ipsum possimus architecto, sed, blanditiis consequatur quasi expedita vitae similique dolor. Ipsa, sint. Cupiditate, vitae.</span>
						    <span>Placeat suscipit error sit dolorem similique quis unde voluptas sunt? Nam impedit velit obcaecati, nulla debitis doloremque ab magni tenetur modi minus necessitatibus doloribus reprehenderit cum autem alias eum quia.</span>
						</span>

					</div>
					<div class="col-sm-4" style="background: #ffffff78">LA COMPRA
						TO GUAPA</div>
				</div>
			</div>
		</div>
		
		<div id="footer">
  		  <jsp:include page="./footer.html"/>
		</div>

	</div>


</body>
</html>