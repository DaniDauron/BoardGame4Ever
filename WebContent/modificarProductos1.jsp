<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">

<link href="./css/formularios.css" rel="stylesheet" type="text/css">
<jsp:include page="./imports_comunes.html" />
<!-- 
<link
	href="//netdna.bootstrapcdn.com/bootstrap/4.3.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
</head>
 -->
<body>
<jsp:include page="./headeradmin.jsp" />

	<div class="container  contenidoprincipal">
		<h1 class="text-center">MODIFICAR PRODUCTOS</h1>
		<div id="big-form" class="well auth-box">
			<form action="InsertaRegistro" >
		 <legend><strong>Modifica los campos que desees del producto:</strong></legend>		
		 <input name="accion" value="modificar" style="display:none">
		 <input name="id" value="${prod.idProd }" style="display:none">
				<!-- Nombre del producto-->
				<div class="form-group">
					<label class="control-label" for="textinput"><strong>Indica el nuevo Nombre del producto:</strong></label>
					<div class="">
						<input id="textinput" name="nombre" value="${prod.nombreProducto }"
							class="form-control input-md" type="text">
			
					</div>
				</div>

				<!-- 	EDAD    -->
				<div class="form-group">
					<label class=" control-label" for="passwordinput"><strong>Indica la	edad:</strong></label>
					<div class="">
						<input id="textinput" name="edad" value="${prod.edad }"
							class="form-control input-md" type="text">
					</div>
					
				</div>

				<!-- categoria  -->
				<div class="form-group">
					<label class=" control-label" for="selectbasic"><strong>Indica el tipo de juego:</strong></label>
					<div class="">
						<select id="selectbasic" name="tipo" class="form-control">
							<c:if test="${prod.tipo == '1' }">
							<option selected="selected" value="1">Tableros</option>
							<option value="2">Dados</option>
							<option value="3">Cartas</option>
							</c:if>
							
							<c:if test="${prod.tipo == '2' }">
							<option value="1">Tableros</option>
							<option selected="selected" value="2">Dados</option>
							<option value="3">Cartas</option>
							</c:if>
							
							<c:if test="${prod.tipo == '3' }">
							<option value="1">Tableros</option>
							<option value="2">Dados</option>
							<option selected="selected" value="3">Cartas</option>
							</c:if>
							
						</select>
					</div>
					
				</div>
			
			
				<!-- Jugadores Max-->
				<div class="form-group">
					<label class=" control-label" for="passwordinput"><strong> Nº Jugadores máximo:</strong></label>
					<div class="">
						<input id="textinput" name="jugMax" value="${prod.maxJugadores }"
							class="form-control input-md" type="text">
					</div>
					
				</div>

				<!-- Jugadores min-->
				<div class="form-group">
					<label class=" control-label" for="passwordinput"><strong>Nº Jugadores mínimo:</strong></label>
					<div class="">
						<input id="textinput" name="jugMin" value="${prod.minJugadores }"
							class="form-control input-md" type="text">
					</div>
					
				</div>

				<!-- Precio-->
				<div class="form-group">
					<label class=" control-label" for="passwordinput"><strong>Indica el	precio:</strong></label>
					<div class="">
						<input id="textinput" name="precio" value="${prod.precio }"
							class="form-control input-md" type="text">
					</div>
					
				</div>

				<!-- Duracion-->
				<div class="form-group">
					<label class=" control-label" for="passwordinput"><strong>Indica la duración del juego (minutos):</strong></label>
					<div class="">
						<input id="textinput" name="duracion" value="${prod.tiempoEstimado }"
							class="form-control input-md" type="text">
					</div>
					
				</div>

				<!-- Imagen URL-->
          <div class="form-group">
            <label class=" control-label" for="passwordinput"><strong>Indica la dirección url de la imagen:</strong></label>
            <div class="">
              <input id="textinput" name="img" value="${prod.imagen}"
              	class="form-control input-md" type="text">
              </div>
          </div> 
       
        <!-- Stock-->
          <div class="form-group">
            <label class=" control-label" for="passwordinput"><strong>Control de Stock:</strong></label>
            <div class="">
              <input id="textinput" name="stock" value="${prod.stock }"
              	class="form-control input-md" type="text">
              </div>
          </div>

				<!-- Descripcion -->
				<div class="form-group">
					<label class=" control-label" for="textarea"><strong>Indica una pequeña descripción:</strong> </label>
					<div class="">
						<textarea class="form-control" id="textarea"
							name="descripcion">${prod.descripcion }</textarea>
					</div>
					
				</div>

				<!-- BOTONES Guardar -->
				<div class="form-group">
					<div class="">
						<button id="button1id" name="button1id" type="submit" class="btn btn-success"><strong>Guardar Cambios</strong></button>
					</div>
				</div>
			</form>
		</div>
	</div>
</body>
	
</html>
