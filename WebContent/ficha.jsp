<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
<title>Ficha</title>
<meta charset="UTF-8">

<!-- 
<link rel="stylesheet" href="./bootstrap/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	-->
	
	 <!-- Bootstrap core CSS -->
    <link href="./startbootstrap-shop-item-gh-pages/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="./startbootstrap-shop-item-gh-pages/css/shop-item.css" rel="stylesheet">
    <!-- Bootstrap core JavaScript -->
    <script src="./startbootstrap-shop-item-gh-pages/vendor/jquery/jquery.min.js"></script>
    <script src="./startbootstrap-shop-item-gh-pages/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
	
</head>
<body>

	<header>
		<jsp:include page="./header.html" />
	</header>
<!-- 
	
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
						<h2>${producto.nombreProducto}</h2>
					</div>
				</div>
				<div class="row ">
					<div class="col-sm-8">
						<img
							src="https://cf.geekdo-images.com/itemrep/img/VevkNKkVOi1DgRBmHqOh1j1azXs=/fit-in/246x300/pic3429338.png"
							alt="ficha" class="imagen_producto_principal"
							style="float: left; padding-left: 1%; padding-right: 1%">
						<p><strong>Jugadores:</strong>${producto.minJugadores} - ${producto.maxJugadores}</p>
						<p><strong>Categoría:</strong> ${producto.categoria}</p>
						<p><strong>Edad mínima recomendada:</strong>${producto.edad}</p>
						<p><strong>Duracción:</strong> ${producto.tiempoEstimado}</p>

					</div>
					<div class="col-sm-4" style="background: #ffffff78">
						<p><strong>Precio:</strong> ${producto.precio}</p>
						<button type="button" class="btn btn-primary">Comprar</button>
					</div>
				</div>
				<div class="row">
					<div class="col-sm12">
						<span><strong>Descripción:</strong> ${producto.descripcion}</span>
						</span>
					</div>
				</div>
			</div>
		</div>
	</div>
	-->
	
	  <!-- Page Content -->
    <div class="container" background="#93a4af">

      <div class="row">
<!--  Sidebar div de clase coHg-3 -->
<jsp:include page="./sidebar.html" />

      <% /*<!--  -->  <div class="col-lg-3">
          <h3 class="my-4">Menu</h3>
          <div class="list-group">
            <div class="list-group-item"><h5>Categorías</h5></div>
			<a href="#" class="list-group-item"> - Tablero</a>
            <a href="#" class="list-group-item"> - Cartas</a>
            <a href="#" class="list-group-item"> - Dados</a>
			<a href="#" class="list-group-item"><h5>Top Ventas</h5></a> <!-- CSS -->
			<a href="#" class="list-group-item"><h5>Novedades</h5></a> <!-- CSS -->
          </div>
        </div> -->
        <!-- /.col-lg-3 -->*/
%>
        <div class="col-lg-9">

          <div class="card mt-4">
            <img class="card-img-top img-fluid" src="https://sgfm.elcorteingles.es/SGFM/dctm/MEDIA03/201708/03/00197632608028____1__640x640.jpg" alt="">
			<div class="row">
				<div class="col-md-6">
					<h2 class="card-title offset-4">${producto.nombreProducto}</h2>
				</div>
				<div class="offset-3 col-md-3 ">
				<div class="row">
				<div class="col-md-7">
					<h4 style="text-align:right;">${producto.precio} €</h4>
					<button style="text-align:right;" type="button" class="btn btn-primary">Comprar</button>
				</div>
			</div>
			</div>
			</div>
            <div class="card-body offset-1">
              
              
			  <h6><b>Tableros</b></h6>
			  <h6><b>Edad recomendada:</b> ${producto.edad}</h6>
			  <h6><b>Número de jugadores</b> ${producto.minJugadores} - ${producto.maxJugadores}</h6>
				<h6><b>Duración de partida:</b> ${producto.tiempoEstimado}</h6>
              <p class="card-text"><h6><b>Descripción: </b></h6> ${producto.descripcion}</p>
              <!--<span class="text-warning">&#9733; &#9733; &#9733; &#9733; &#9734;</span>
              4.0 stars-->
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