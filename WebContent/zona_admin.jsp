<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">

<title>Los mejores juegos de mesa</title>

<jsp:include page="./imports_comunes.html" />
</head>

<body>
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
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="row">
					<div class="col-sm-2">
						<label for="pwd">Password:</label>
					</div>
					<div class="col-sm-10">
						<input type="password" class="form-control" id="pwd">
					</div>
				</div>

			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>

	</div>

	<jsp:include page="./footer.html" />
</body>
</html>