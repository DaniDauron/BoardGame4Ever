<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="es">
<head>
<meta charset="UTF-8">

<title>Los mejores juegos de mesa</title>

<jsp:include page="./imports_comunes.html" />
</head>

<body>
	<jsp:include page="./header.html" />


	<div class="container  contenidoprincipal">

		<div class="row">
			<!--  Sidebar div de clase col-lg-3 -->
			<jsp:include page="./sidebar.html" />

			<!--  Contenido de la pagina -->
			<div class="col-lg-9">
				<div class="container">
				<c:redirect url="./VerListado?tipo=todo"/>
				
				</div>
			</div>
		</div>
	</div>

	<jsp:include page="./footer.html" />
</body>
</html>