<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<header class="header_principal">
	<!-- Navigation -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
		<div class="container">
			<a class="navbar-brand" href="VerListado?tipo=todo"> <img
				alt="logo" src="./src/milogo.png" class="milogo">
			</a>
			

				<c:if test="${admin.logeado == true}">
				
				
				<form id="formbuscar" action="Login">									
					<input style="display:none" name="tipo_login" value="logout" /> 	
					<button type="submit" class="btn">Log Out</button>
				</form>
				
				
					
				</c:if>

			</div>
	</nav>
</header>