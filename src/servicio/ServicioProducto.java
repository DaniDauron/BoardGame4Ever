package servicio;

import datos.ProductoDao;


public class ServicioProducto {

	/**
	 * @author Dani
	 * @param id del producto que queremos desactivar su compra
	 * @return Un booleano que indica si se ha podido desactivar la compra del producto requerido
	 */
	public static boolean bajaProducto(String id) {		
		return ProductoDao.bajaJuego(id);
	}
	
	public static boolean reactivarProducto(String id) {		
		return ProductoDao.reactivarJuego(id);
	}
		
}
