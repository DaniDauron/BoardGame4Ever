package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import modelo.Producto;

/**
 * Implementación de la clase ListadoDao, dónde se recuperan los datos de la base de datos para los diferentes listados de la web
 * 
 * @author Cristian, Olga, Dani y Carlos
 *
 */

public class ListadoDao {

	static Connection con = null;
	static Statement st = null;
	static ResultSet rs = null;
	
	/**
	 * Método que conecta con la base de datos y devuelve un listado acotado de productos y sus características
	 * 
	 * @param limite número de elementos que se van a devolver para el listado
	 * 
	 * @return una lista de productos y sus características, cantidad de productos indicada por la variable "limite"
	 */
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List recuperarElementoListado(int limite) {

		List slider = new ArrayList();

		try {
			String driverClassName = "com.mysql.jdbc.Driver";
			String driverUrl = "jdbc:mysql://192.168.200.17/gameboard";
			String user = "boarduser";
			String password = "1111";
			try {
				Class.forName(driverClassName);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			con = DriverManager.getConnection(driverUrl, user, password);
			st = con.createStatement();

			String query = "SELECT id,nombre,precio,img,stock from producto where  en_venta = 1";
			rs = st.executeQuery(query);

			for (int i = 0; i < limite && rs.next(); i++) {
				Producto x = new Producto();
				x.setIdProd(rs.getInt("id"));
				x.setNombreProducto(rs.getString("nombre"));
				x.setPrecio(rs.getFloat("precio"));
				x.setImagen(rs.getString("img"));
				x.setStock(rs.getInt("stock"));
				slider.add(x);
			}

		} catch (Exception a) {
			System.out.println("error es " + a.getMessage());

		}

		finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (st != null) {
					st.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return slider;
	}

	/**
	 * Método que conecta con la base de datos y devuelte un listado completo de los prodcutos y sus características
	 * 
	 * @return Un objeto de tipo List que contiene todos los productos de la base de datos
	 */
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List recuperarElementoListado() {

		List listado = new ArrayList();
		Producto x;

		try {
			String driverClassName = "com.mysql.jdbc.Driver";
			String driverUrl = "jdbc:mysql://192.168.200.17/gameboard";
			String user = "boarduser";
			String password = "1111";
			try {
				Class.forName(driverClassName);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			con = DriverManager.getConnection(driverUrl, user, password);
			st = con.createStatement();

			String query = "SELECT id,nombre,precio,img, stock  from producto where  en_venta = 1";
			rs = st.executeQuery(query);

			while (rs.next()) {
				x = new Producto();
				x.setIdProd(rs.getInt("id"));
				x.setNombreProducto(rs.getString("nombre"));
				x.setPrecio(rs.getFloat("precio"));
				x.setImagen(rs.getString("img"));
				x.setStock(rs.getInt("stock"));
				listado.add(x);
			}

		} catch (Exception a) {
			System.out.println("error es " + a.getMessage());
			x = new Producto();
		}
		
		finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (st != null) {
					st.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return listado;
		
	}

	/**
	 * Método que conecta con la base de datos y devuelve un listado completo de los productos ordenados por fecha de publicación
	 * 
	 * @return una lista de los productos ordenados de más nuevos a más antiguos
	 */
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List recuperarListaNovedades() {

		List listado = new ArrayList();

		try {
			String driverClassName = "com.mysql.jdbc.Driver";
			String driverUrl = "jdbc:mysql://192.168.200.17/gameboard";
			String user = "boarduser";
			String password = "1111";
			try {
				Class.forName(driverClassName);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			con = DriverManager.getConnection(driverUrl, user, password);
			st = con.createStatement();

			String query = "SELECT id, nombre, precio, img, stock FROM producto where en_venta = 1 ORDER BY publicacion DESC ";
			rs = st.executeQuery(query);

			while (rs.next()) {
				Producto x = new Producto();
				x.setIdProd(rs.getInt("id"));
				x.setNombreProducto(rs.getString("nombre"));
				x.setPrecio(rs.getFloat("precio"));
				x.setImagen(rs.getString("img"));
				x.setStock(rs.getInt("stock"));
				listado.add(x);
			}

		} catch (Exception a) {
			System.out.println("error es " + a.getMessage());
		}

		finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (st != null) {
					st.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return listado;
	}

	/**
	 * Método que conecta con la base de datos y devuelve un listado completo de los prodcutos de tipo tablero
	 * 
	 * @return Un objeto List con todos los productos de tipo tablero
	 */
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List recuperarListaPorTipoTablero() {

		List listado = new ArrayList();

		try {
			String driverClassName = "com.mysql.jdbc.Driver";
			String driverUrl = "jdbc:mysql://192.168.200.17/gameboard";
			String user = "boarduser";
			String password = "1111";
			try {
				Class.forName(driverClassName);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			con = DriverManager.getConnection(driverUrl, user, password);
			st = con.createStatement();

			String query = "SELECT id, nombre, precio, img, stock FROM producto WHERE tipo=1 and en_venta = 1";
			rs = st.executeQuery(query);

			while (rs.next()) {
				Producto x = new Producto();
				x.setIdProd(rs.getInt("id"));
				x.setNombreProducto(rs.getString("nombre"));
				x.setPrecio(rs.getFloat("precio"));
				x.setImagen(rs.getString("img"));
				x.setStock(rs.getInt("stock"));
				listado.add(x);
			}

		} catch (Exception a) {
			System.out.println("error es " + a.getMessage());
		}

		finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (st != null) {
					st.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return listado;
	}

	/**
	 * Método que conecta con la base de datos y devuelve un listado completo de los productos de tipo dados
	 * 
	 * @return Un objeto de tipo List de todos los productos de tipo dados
	 */
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List recuperarListaPorTipoDados() {

		List listado = new ArrayList();

		try {
			String driverClassName = "com.mysql.jdbc.Driver";
			String driverUrl = "jdbc:mysql://192.168.200.17/gameboard";
			String user = "boarduser";
			String password = "1111";
			try {
				Class.forName(driverClassName);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			con = DriverManager.getConnection(driverUrl, user, password);
			st = con.createStatement();

			String query = "SELECT id, nombre, precio, img, stock FROM producto WHERE tipo=2 and en_venta = 1";
			rs = st.executeQuery(query);

			while (rs.next()) {
				Producto x = new Producto();
				x.setIdProd(rs.getInt("id"));
				x.setNombreProducto(rs.getString("nombre"));
				x.setPrecio(rs.getFloat("precio"));
				x.setImagen(rs.getString("img"));
				x.setStock(rs.getInt("stock"));
				listado.add(x);
			}

		} catch (Exception a) {
			System.out.println("error es " + a.getMessage());
		}

		finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (st != null) {
					st.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return listado;
	}

	/**
	 * Método que conecta con la base de datos y devuelve un listado completo de los productos de tipo cartas
	 * 
	 * @return Un objeto de tipo List con los productos de tipo cartas
	 */
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List recuperarListaPorTipoCartas() {

		List listado = new ArrayList();

		try {
			String driverClassName = "com.mysql.jdbc.Driver";
			String driverUrl = "jdbc:mysql://192.168.200.17/gameboard";
			String user = "boarduser";
			String password = "1111";
			try {
				Class.forName(driverClassName);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			con = DriverManager.getConnection(driverUrl, user, password);
			st = con.createStatement();

			String query = "SELECT id, nombre, precio, img, stock FROM producto WHERE tipo=3 and  en_venta = 1";
			rs = st.executeQuery(query);

			while (rs.next()) {
				Producto x = new Producto();
				x.setIdProd(rs.getInt("id"));
				x.setNombreProducto(rs.getString("nombre"));
				x.setPrecio(rs.getFloat("precio"));
				x.setImagen(rs.getString("img"));
				x.setStock(rs.getInt("stock"));
				listado.add(x);
			}

		} catch (Exception a) {
			System.out.println("error es " + a.getMessage());
		}

		finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (st != null) {
					st.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return listado;
	}

	/**
	 * Método que conecta con la base de datos y devuelve un listado completo de los productos con una edad recomendad
	 * 
	 * @param rango edad mínima recomendada para el producto
	 * @return listado Un objeto de tipo List con el listado de todos los productos y filtrados por edad
	 */
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List recuperarListaPorEdades(String rango) {

		List listado = new ArrayList();
		String rango_edades = null;

		try {
			String driverClassName = "com.mysql.jdbc.Driver";
			String driverUrl = "jdbc:mysql://192.168.200.17/gameboard";
			String user = "boarduser";
			String password = "1111";
			try {
				Class.forName(driverClassName);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			con = DriverManager.getConnection(driverUrl, user, password);
			st = con.createStatement();

			if (rango == "ninios") {
				rango_edades = "edad <= 10";
			} else if (rango == "adolescentes") {
				rango_edades = "edad > 10 AND edad <= 16";
			} else if (rango == "adultos") {
				rango_edades = "edad > 16";
			}

			String query = "SELECT id, nombre, precio, img, stock FROM producto WHERE " + rango_edades + " and  en_venta = 1";

			rs = st.executeQuery(query);

			while (rs.next()) {
				Producto x = new Producto();
				x.setIdProd(rs.getInt("id"));
				x.setNombreProducto(rs.getString("nombre"));
				x.setPrecio(rs.getFloat("precio"));
				x.setImagen(rs.getString("img"));
				x.setStock(rs.getInt("stock"));
				listado.add(x);
			}

		} catch (Exception a) {
			System.out.println("error es " + a.getMessage());
		}

		finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (st != null) {
					st.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return listado;
	}

	/**
	 * Método que conecta con la base de datos y devuelve un listado completo de los productos con una duración determinada
	 * 
	 * @param duracion especifica la duración mínima del juego para mostrarlo
	 * @return listado Un objeto de tipo List con el listado completo de los productos con una duración mínima especificada
	 */
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List recuperarListaPorDuracion(String duracion) {

		List listado = new ArrayList();
		String rango_duracion = null;

		try {
			String driverClassName = "com.mysql.jdbc.Driver";
			String driverUrl = "jdbc:mysql://192.168.200.17/gameboard";
			String user = "boarduser";
			String password = "1111";
			try {
				Class.forName(driverClassName);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			con = DriverManager.getConnection(driverUrl, user, password);
			st = con.createStatement();

			if (duracion == "ligera") {
				rango_duracion = "duracion < 30";
			} else if (duracion == "media") {
				rango_duracion = "duracion >= 30 AND duracion < 100";
			} else if (duracion == "larga") {
				rango_duracion = "duracion >= 100";
			}

			String query = "SELECT id, nombre, precio, img, stock FROM producto WHERE " + rango_duracion+"  and en_venta = 1";

			rs = st.executeQuery(query);

			while (rs.next()) {
				Producto x = new Producto();
				x.setIdProd(rs.getInt("id"));
				x.setNombreProducto(rs.getString("nombre"));
				x.setPrecio(rs.getFloat("precio"));
				x.setImagen(rs.getString("img"));
				x.setStock(rs.getInt("stock"));
				listado.add(x);
			}

		} catch (Exception a) {
			System.out.println("error es " + a.getMessage());
		}

		finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (st != null) {
					st.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return listado;
	}

	/**
	 * Método que conecta con la base de datos y devuelve un listado completo de los productos con un número de jugadores
	 * 
	 * @param jugadores filtro para listar los productos por número de jugadores mínimo
	 * @return listado Un objeto de tipo List con el listado completo de los juegos con un número de jugadores mínimo especificado
	 */
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List recuperarListaPorNumeroJugadores(String jugadores) {

		List listado = new ArrayList();
		String rango_jugadores = null;

		try {
			String driverClassName = "com.mysql.jdbc.Driver";
			String driverUrl = "jdbc:mysql://192.168.200.17/gameboard";
			String user = "boarduser";
			String password = "1111";
			try {
				Class.forName(driverClassName);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			con = DriverManager.getConnection(driverUrl, user, password);
			st = con.createStatement();

			if (jugadores == "parejas") {
				rango_jugadores = "jug_min = 2";
			} else if (jugadores == "trios") {
				rango_jugadores = "jug_min = 3";
			} else if (jugadores == "multitud") {
				rango_jugadores = "jug_min > 3";
			}

			String query = "SELECT id, nombre, precio, img, stock FROM producto WHERE " + rango_jugadores+ "  and en_venta = 1";

			rs = st.executeQuery(query);

			while (rs.next()) {
				Producto x = new Producto();
				x.setIdProd(rs.getInt("id"));
				x.setNombreProducto(rs.getString("nombre"));
				x.setPrecio(rs.getFloat("precio"));
				x.setImagen(rs.getString("img"));
				x.setStock(rs.getInt("stock"));
				listado.add(x);
			}

		} catch (Exception a) {
			System.out.println("error es " + a.getMessage());
		}

		return listado;
	}

	/**
	 * Método que conecta con la base de datos y devuelve un listado completo de los productos buscados en el cuadro de búsqueda
	 * 
	 * @param juego Un String con la cadena introducida en el cuadro de búsqueda de la web
	 * @return listado Un objeto de tipo List con el listado completo de los productos que coinciden con la búsqueda
	 */
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List recuperarListaPorBusqueda(String juego) {

		List listado = new ArrayList();
		String texto = "";
		String[] cadena_busqueda = juego.split(" ");

		try {
			String driverClassName = "com.mysql.jdbc.Driver";
			String driverUrl = "jdbc:mysql://192.168.200.17/gameboard";
			String user = "boarduser";
			String password = "1111";
			try {
				Class.forName(driverClassName);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			con = DriverManager.getConnection(driverUrl, user, password);
			st = con.createStatement();

			for (int i = 0; i < cadena_busqueda.length; i++) {
				texto = texto + " nombre LIKE '%" + cadena_busqueda[i] + "%'";
				if (i != (cadena_busqueda.length) - 1) {
					texto += " AND";
				}
			}

			String query = "SELECT id, nombre, precio, img, stock FROM producto WHERE" + texto + " and en_venta = 1";

			rs = st.executeQuery(query);

			while (rs.next()) {
				Producto x = new Producto();
				x.setIdProd(rs.getInt("id"));
				x.setNombreProducto(rs.getString("nombre"));
				x.setPrecio(rs.getFloat("precio"));
				x.setImagen(rs.getString("img"));
				x.setStock(rs.getInt("stock"));
				listado.add(x);
			}

		} catch (Exception a) {
			System.out.println("error es " + a.getMessage());
		}

		finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (st != null) {
					st.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return listado;
	}

}
