<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="./css/formularios.css" rel="stylesheet" type="text/css">

<jsp:include page="./imports_comunes.html" />
<link href="//netdna.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
</head>
<body>
<div class="container auth">
    <h1 class="text-center"> ALTA PRODUCTOS  </h1>
    <div id="big-form" class="well auth-box">
      <form action="InsertaRegistro"> 
        <fieldset>
<!--Obciones producto-->
          <legend><strong>Introduce los siguientes datos para el alta del producto:</strong></legend>
                 
         		
		 <!-- Nombre del producto-->
          <div class="form-group">
            <label class=" control-label" for="textinput"><strong>Nombre del producto</strong></label>  
            <div class="">
              <input id="textinput" name="nombreProd"  class="form-control input-md" type="text">
              </div>
          </div>

          <!-- Edad-->
          <div class="form-group">
            <label class=" control-label" for="passwordinput"><strong>Indica la edad:</strong></label>
            <div class="">
              <input id="textinput" name="edad"  class="form-control input-md" type="text">
              </div>
          </div>

          <!-- categoria  -->
          <div class="form-group">
            <label class="control-label" for="selectbasic"><strong>Indica el tipo de juego:</strong></label>
            <div class="">
              <select id="selectbasic" name="tipo" class="form-control">
                <option value="0">-----</option>
                <option value="1">Dados</option>
                <option value="2">Tableros</option>
                <option value="3">Cartas</option>
               </select>
            </div>
          </div>
  		
  		<!-- Jugadores Max-->
          <div class="form-group">
            <label class=" control-label" for="passwordinput"><strong> N� Jugadores m�ximo: </strong></label>
            <div class="">
              <input id="textinput" name="maxJug"  class="form-control input-md" type="text">
              </div>
          </div>
          
          <!-- Jugadores min-->
          <div class="form-group">
            <label class=" control-label" for="passwordinput"><strong>N� Jugadores m�nimo:</strong></label>
            <div class="">
              <input id="textinput" name="minJug"  class="form-control input-md" type="text">
              </div>
          </div>
          
          <!-- Precio-->
          <div class="form-group">
            <label class=" control-label" for="passwordinput"><strong>Indica el precio:</strong></label>
            <div class="">
              <input id="textinput" name="precio"  class="form-control input-md" type="text">
              </div>
          </div>
		
		  <!-- Duracion-->
          <div class="form-group">
            <label class=" control-label" for="passwordinput"><strong>Indica la duraci�n del juego (minutos):</strong></label>
            <div class="">
              <input id="textinput" name="duracion"  class="form-control input-md" type="text">
             </div>
          </div>
      
         <!-- OPCION SUBIR IMAGEN --> 
          <div class="form-group">
            <label class=" control-label" for="filebutton"><strong>Imagen a subir desde el equipo:</strong></label>
            <div class="">
              <input id="filebutton" name="urlImg" class="input-file" type="file">
            </div>
             <button class="btn btn-default" type="button">Subir</button>
          </div> 
           <!-- Imagen URL-->
          <div class="form-group">
            <label class=" control-label" for="passwordinput"><strong>Indica la direcci�n url de la imagen:</strong></label>
            <div class="">
              <input id="textinput" name="url"  class="form-control input-md" type="text">
              </div>
          </div> 
       
        <!-- Stock-->
          <div class="form-group">
            <label class=" control-label" for="passwordinput"><strong>Control de Stock:</strong></label>
            <div class="">
              <input id="textinput" name="stock"  class="form-control input-md" type="text">
              </div>
          </div>
          <!-- Descripcion -->
          <div class="form-group">
            <label class=" control-label" for="textarea"><strong>Indica una peque�a descripci�n: </strong></label>
            <div class="">                     
              <textarea class="form-control" id="descripcion" name="textarea">Introduce el texo que quieras</textarea>
            </div>
          </div>
           
 		
 		<!-- BOTONES ALTAR -->
          <div class="form-group">
              <div class="">
              
              <button id="button1id" name="button1id" class="btn btn-success" type="submit"><strong>Subir Producto</strong></button>
              
           </div>
          </div>
      

        </fieldset>
      </form>
    </div>
    <div class="clearfix"></div>
  </div>
	</body>
</html>
