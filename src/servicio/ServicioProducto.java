package servicio;

import datos.ProductoDao;


public class ServicioProducto {

	
	public static boolean bajaProducto(String id) {		
		return ProductoDao.bajaJuego(id);
	}
	
	public static boolean reactivarProducto(String id) {		
		return ProductoDao.reactivarJuego(id);
	}
		
}
