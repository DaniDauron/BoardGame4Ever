<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<script src="startbootstrap-shop-item-gh-pages/vendor/jquery/jquery.min.js"></script>
<link href="./startbootstrap-shop-item-gh-pages/css/bootstrap_index.css" rel="stylesheet" id="bootstrap-css">
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<link href="./startbootstrap-shop-item-gh-pages/css/shop-item.css"
	rel="stylesheet">
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

<!------ Include the above in your HEAD tag ---------->

<html lang="en">
<meta charset="UTF-8">

	<header> <jsp:include page="./header.html" /></header>
	
	<div class="container">
	
			<div class="row">
			<!-- Carousel -->
			<div id="carousel-example-generic" class="carousel slide" data-interval="5000" data-ride="carousel">
				<!-- Indicators -->
				<ol class="carousel-indicators">
					<li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
					<li data-target="#carousel-example-generic" data-slide-to="1"></li>
					<li data-target="#carousel-example-generic" data-slide-to="2"></li>
				</ol>
				<!-- Wrapper for slides -->
									
					<div class="carousel-inner">
					<div class="item active">
		<!-- AQUI EMPIEZA LA PRIMERA TRANSICION -->				
					<h1 id="titulo">
					<strong> AQUI VENDRA EL TITULO DEL JUEGO</strong>
					</h1>
					<img src="src/trivial-pursuit-master.jpg" alt="primera transicion">
						<!-- Static Header -->
						<div class="header-text hidden-xs"></div>
							<div class="col-md-12 text-center"></div>					
							<div>
							<h3>
								<p id="descripcion"> AQUI VENDRA LA DESCRIPCION DEL JUEGO.....</p>
							</h3>
							</div>
							
					<!--  Botones de abajo comprar, seguir -->		
						<div class="">
					
						</div>
						<!-- /header-text AQUI EMPIEZA LA SEGUNDA DIAPOSITIVA-->
					</div>
					<div class="item">
					<h1 id="titulo">
					<strong> AQUI VENDRA EL TITULO DEL 2 JUEGO</strong></p>
					</h1>
					<img src="src/magic.jpg" alt="Segunda transicion">
						<!-- Static Header -->
						<div class="header-text hidden-xs"></div>
							<div class="col-md-12 text-center"></div>
								<h3>
									<p id="descripcion"> SEGUNDA DESCRIPTCION </p>
								</h3>
					</div>
					<!-- /header-text  AQUI EMPIEZA LA TERCERA TRANSICION -->
					<div class="item">
					<h1 id="titulo">
				 	<strong> AQUI VENDRA EL TITULO DEL JUEGO 3</strong>
						<img src="src/dados.jpg" alt="Tercera dispositiva">
						<!-- Static Header -->
						<div class="header-text hidden-xs"></div>
							<div class="col-md-12 text-center"></div>
								<br>
								<h3>
									<p id="descripcion">TERCERA DESCRIPCION....</p>
							</div>
					</div>
				
				<!-- CONTROLES LATERALES -->
				
				<a class="left carousel-control" href="#carousel-example-generic" data-slide="prev">
				<span class="glyphicon glyphicon-chevron-left"></span> </a> 
				<a class="right carousel-control" href="#carousel-example-generic" data-slide="next"> 
				<span class="glyphicon glyphicon-chevron-right"></span>
				</a>
			</div>
			
			<!-- /carousel -->
		</div>
	</div>
	<jsp:include page="./footer.html" />
</html>
