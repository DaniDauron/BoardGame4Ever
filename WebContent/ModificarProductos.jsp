<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="./formularios.css" rel="stylesheet" type="text/css">
<jsp:include page="./imports_comunes.html" />

<link
	href="//netdna.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
</head>
<body>

	<div class="container auth">
		<h1 class="text-center">MODIFICAR PRODUCTOS</h1>
		<div id="big-form" class="well auth-box">
			<form>
				
				<!-- Nombre del producto-->
				<div class="form-group">
					<label class=" control-label" for="textinput"><strong>Indica el nuevo Nombre del producto</strong></label>
					<div class="">
						<input id="textinput" name="textinput"
							class="form-control input-md" type="text">
					</div>
					<button class="btn btn-default" type="button">Modificar</button>
				</div>

				<!-- 	EDAD    -->
				<div class="form-group">
					<label class=" control-label" for="passwordinput"><strong>Indica la	edad:</strong></label>
					<div class="">
						<input id="textinput" name="textinput"
							class="form-control input-md" type="text">
					</div>
					<button class="btn btn-default" type="button">Modificar</button>
				</div>

				<!-- categoria  -->
				<div class="form-group">
					<label class=" control-label" for="selectbasic"><strong>Indica el tipo de juego:</strong></label>
					<div class="">
						<select id="selectbasic" name="selectbasic" class="form-control">
							<option value="0">-----</option>
							<option value="1">Dados</option>
							<option value="2">Tableros</option>
							<option value="3">Cartas</option>
						</select>
					</div>
					<button class="btn btn-default" type="button">Modificar</button>
				</div>
			
			
				<!-- Jugadores Max-->
				<div class="form-group">
					<label class=" control-label" for="passwordinput"><strong> Nº Jugadores máximo:</strong></label>
					<div class="">
						<input id="textinput" name="textinput"
							class="form-control input-md" type="text">
					</div>
					<button class="btn btn-default" type="button">Modificar</button>
				</div>

				<!-- Jugadores min-->
				<div class="form-group">
					<label class=" control-label" for="passwordinput"><strong>Nº Jugadores mínimo:</strong></label>
					<div class="">
						<input id="textinput" name="textinput"
							class="form-control input-md" type="text">
					</div>
					<button class="btn btn-default" type="button">Modificar</button>
				</div>

				<!-- Precio-->
				<div class="form-group">
					<label class=" control-label" for="passwordinput"><strong>Indica el	precio:</strong></label>
					<div class="">
						<input id="textinput" name="textinput"
							class="form-control input-md" type="text">
					</div>
					<button class="btn btn-default" type="button">Modificar</button>
				</div>

				<!-- Duracion-->
				<div class="form-group">
					<label class=" control-label" for="passwordinput"><strong>Indica la duración del juego (minutos):</strong></label>
					<div class="">
						<input id="textinput" name="textinput"
							class="form-control input-md" type="text">
					</div>
					<button class="btn btn-default" type="button">Modificar</button>
				</div>

				<!-- OPCION SUBIR IMAGEN -->
				<div class="form-group">
					<label class=" control-label" for="filebutton"><strong>Imagen a subir:</strong></label>
					<div class="">
						<input id="filebutton" name="filebutton" class="input-file"
							type="file">
					</div>
					<button class="btn btn-default" type="button">Subir</button>
				</div>

				<!-- Descripcion -->
				<div class="form-group">
					<label class=" control-label" for="textarea"><strong>Indica una pequeña descripción:</strong> </label>
					<div class="">
						<textarea class="form-control" id="textarea" name="textarea">Introduce el texo que quieras</textarea>
					</div>
					<button class="btn btn-default" type="button">Modificar</button>
				</div>

				<!-- BOTONES Guardar -->
				<div class="form-group">
					<div class="">
						<button id="button1id" name="button1id" class="btn btn-success"><strong>Guardar Cambios</strong></button>
					</div>
				</div>
			</form>
		</div>
	</div>
</body>
</html>
