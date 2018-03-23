package servicio;

import datos.ProductoDao;


public class ServicioProducto {

	
	public static boolean bajaProducto(String id) {		
		return ProductoDao.bajaJuego(id);
	}
	
	
}
