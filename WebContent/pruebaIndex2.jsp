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
<body>
	<header> <jsp:include page="./header.html" /></header>
</body>	
	<div class="container">
		<div class="row">
			<!-- Carousel -->
			<div id="carousel-example-generic" class="carousel slide" data-interval="4000" data-ride="carousel">
				<!-- Indicators -->
				<ol class="carousel-indicators">
					<li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
					<li data-target="#carousel-example-generic" data-slide-to="1"></li>
					<li data-target="#carousel-example-generic" data-slide-to="2"></li>
				</ol>
				<!-- Wrapper for slides -->
				<h1>
					<span> <strong> AQUI VENDRA EL TITULO DEL JUEGO</strong></span>
				</h1>
				<div class="carousel-inner">
					<div class="item active">
						<img src="src/trivial-pursuit-master.jpg" alt="primera transicion">
						<!-- Static Header -->
						<div class="header-text hidden-xs">
							<div class="col-md-12 text-center">
								<br>
								<h3>
									<span> AQUI VENDRA LA DESCRIPCION DEL TITULO.....</span>
								</h3>
								<br>
								<div class="">
									<a class="btn btn-theme btn-sm btn-min-block" href="#"> COMPRAR </a>
									<a class="btn btn-theme btn-sm btn-min-block" href="#"> LISTA DE SEGUIMIENTO </a>
								</div>
							</div>
						</div>
						<!-- /header-text -->
					</div>
					<div class="item">
						<img src="src/magic.jpg" alt="Segunda transicion">
						<!-- Static Header -->
						<div class="header-text hidden-xs">
							<div class="col-md-12 text-center">
								<h2>
									<span><strong> TITULO SEGUNDA </strong></span>
								</h2>
								<br>
								<h3>
									<span> SEGUNDA DESCRIPTCION </span>
								</h3>
								<br>
								<div class="">
									<a class="btn btn-theme btn-sm btn-min-block" href="#">COMPRAR2</a>
									<a class="btn btn-theme btn-sm btn-min-block" href="#">LISTA DE SEGUIMIENTO 2</a>
								</div>
							</div>
						</div>
						<!-- /header-text -->
					</div>
					<div class="item">
						<img src="src/dados.jpg" alt="Tercera dispositiva">
						<!-- Static Header -->
						<div class="header-text hidden-xs">
							<div class="col-md-12 text-center">
								<h2>
									<span><strong>TERCER TITULO</strong></span>
								</h2>
								<br>
								<h3>
									<span>TERCERA DIAPOSITIVA</span>
								</h3>
								<br>
								<div class="">
									<a class="btn btn-theme btn-sm btn-min-block" href="#"> COMPRAR 3</a>
									<a class="btn btn-theme btn-sm btn-min-block" href="#"> LISTA DE SEGUIMIENTO 2</a>
								</div>
							</div>
						</div>
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
