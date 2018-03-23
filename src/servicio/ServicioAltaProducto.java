package servicio;

import javax.servlet.http.HttpServletRequest;

import modelo.Producto;

public class ServicioAltaProducto {

	
	public static Producto rellenarProducto(HttpServletRequest request){
		
		Producto prod = new Producto();
		
		prod.setNombreProducto(request.getParameter("nombreProd"));
		prod.setEdad(Integer.parseInt(request.getParameter("edad")));
		prod.setTipo(""+request.getParameter("tipo"));
		prod.setMaxJugadores(Integer.parseInt(request.getParameter("jugMax")));
		prod.setMinJugadores(Integer.parseInt(request.getParameter("jugMin")));
		prod.setPrecio(Float.parseFloat(request.getParameter("precio")));
		prod.setTiempoEstimado(Integer.parseInt(request.getParameter("duracion")));
		prod.setImagen(request.getParameter("urlImg"));
		prod.setDescripcion(request.getParameter("descripcion"));
		prod.setStock(Integer.parseInt(request.getParameter("stock")));
		prod.setIdProd(Integer.parseInt(request.getParameter("id")));
	
		return prod;
					
		
		
	}
}
