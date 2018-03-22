<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">

<title>Los mejores juegos de mesa</title>

<jsp:include page="./imports_comunes.html" />
</head>

<body>
<<<<<<< HEAD
	<jsp:include page="./header.html" />
	<div class="container  contenidoprincipal">

		<form action="/action_page.php">
			<div class="form-group">
				<div class="row">
					<div class="col-sm-2 col-xs-12">
						<label for="email">Usuario:</label>
					</div>
					<div class="col-sm-10 col-xs-12">
						<input type="email" class="form-control " id="email">
=======
	<jsp:include page="./headeradmin.jsp" />

	<c:if test="${admin.logeado == true}">
		<c:redirect url="ListadoAdmin" />
	</c:if>

	<c:if test="${admin.logeado == false or empty admin}">

	
		<div class="container  contenidoprincipal">
	
			<header>
				<h2>Inicie Sesion</h2>
			</header>
			<form action="Login" method="post">
				<div class="form-group">
					<div class="row">
						<div class="col-sm-2 col-xs-12">
							<label for="usuario">Usuario:</label>
						</div>
						<div class="col-sm-10 col-xs-12">
							<input type="text" class="form-control " id="usuario" name="usuario">
						</div>
>>>>>>> cc8d90b947dc0810a6141ba51dc0d8117fc805d6
					</div>
				</div>
				<div class="form-group">
					<div class="row">
						<div class="col-sm-2">
							<label for="pass">Password:</label>
						</div>
						<div class="col-sm-10">
							<input type="password" class="form-control" id="pass" name="pass">
						</div>
					</div>
				<input style="display:none" name="tipo_login" value="login" /> 
				</div>
				<button type="submit" class="btn btn-primary">Submit</button>
			</form>

		</div>
	</c:if>
	
	

	<jsp:include page="./footer.html" />
</body>
</html>