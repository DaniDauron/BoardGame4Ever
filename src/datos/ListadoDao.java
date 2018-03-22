package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import modelo.Producto;

public class ListadoDao {

	static Connection con = null;
	static Statement st = null;
	static ResultSet rs = null;

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

			String query = "SELECT id,nombre,precio,img,stock from producto ";
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
		return slider;
	}

	public static List recuperarElementoListado() {

		List slider = new ArrayList();
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

			String query = "SELECT id,nombre,precio,img from producto ";
			rs = st.executeQuery(query);

			while (rs.next()) {
				x = new Producto();
				x.setIdProd(rs.getInt("id"));
				x.setNombreProducto(rs.getString("nombre"));
				x.setPrecio(rs.getFloat("precio"));
				x.setImagen(rs.getString("img"));
				slider.add(x);
			}

		} catch (Exception a) {
			System.out.println("error es " + a.getMessage());
			x = new Producto();
		}
		return slider;
	}

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

			String query = "SELECT id, nombre, precio, img FROM producto ORDER BY publicacion DESC";
			rs = st.executeQuery(query);

			while (rs.next()) {
				Producto x = new Producto();
				x.setIdProd(rs.getInt("id"));
				x.setNombreProducto(rs.getString("nombre"));
				x.setPrecio(rs.getFloat("precio"));
				x.setImagen(rs.getString("img"));
				listado.add(x);
			}

		} catch (Exception a) {
			System.out.println("error es " + a.getMessage());
		}

		return listado;
	}

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

			String query = "SELECT id, nombre, precio, img FROM producto WHERE tipo=1";
			rs = st.executeQuery(query);

			while (rs.next()) {
				Producto x = new Producto();
				x.setIdProd(rs.getInt("id"));
				x.setNombreProducto(rs.getString("nombre"));
				x.setPrecio(rs.getFloat("precio"));
				x.setImagen(rs.getString("img"));
				listado.add(x);
			}

		} catch (Exception a) {
			System.out.println("error es " + a.getMessage());
		}

		return listado;
	}

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

			String query = "SELECT id, nombre, precio, img FROM producto WHERE tipo=2";
			rs = st.executeQuery(query);

			while (rs.next()) {
				Producto x = new Producto();
				x.setIdProd(rs.getInt("id"));
				x.setNombreProducto(rs.getString("nombre"));
				x.setPrecio(rs.getFloat("precio"));
				x.setImagen(rs.getString("img"));
				listado.add(x);
			}

		} catch (Exception a) {
			System.out.println("error es " + a.getMessage());
		}

		return listado;
	}

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

			String query = "SELECT id, nombre, precio, img FROM producto WHERE tipo=3";
			rs = st.executeQuery(query);

			while (rs.next()) {
				Producto x = new Producto();
				x.setIdProd(rs.getInt("id"));
				x.setNombreProducto(rs.getString("nombre"));
				x.setPrecio(rs.getFloat("precio"));
				x.setImagen(rs.getString("img"));
				listado.add(x);
			}

		} catch (Exception a) {
			System.out.println("error es " + a.getMessage());
		}

		return listado;
	}

	public static List recuperarListaPorEdades(String rango) {

		List listado = new ArrayList();
		String rango_edades=null;

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
				rango_edades ="edad <= 10";
			} else if (rango == "adolescentes") {
				rango_edades ="edad > 10 AND edad <= 16";
			} else if(rango == "adultos"){
				rango_edades ="edad > 16";
			}

			String query = "SELECT id, nombre, precio, img FROM producto WHERE " + rango_edades;

			rs = st.executeQuery(query);

			while (rs.next()) {
				Producto x = new Producto();
				x.setIdProd(rs.getInt("id"));
				x.setNombreProducto(rs.getString("nombre"));
				x.setPrecio(rs.getFloat("precio"));
				x.setImagen(rs.getString("img"));
				listado.add(x);
			}

		} catch (Exception a) {
			System.out.println("error es " + a.getMessage());
		}

		return listado;
	}

	public static List recuperarListaPorDuracion(String duracion) {

		List listado = new ArrayList();
		String rango_duracion=null;

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
				rango_duracion ="duracion < 30";
			} else if (duracion == "media") {
				rango_duracion ="duracion >= 30 AND duracion < 100";
			} else if(duracion == "larga"){
				rango_duracion ="duracion >= 100";
			}

			String query = "SELECT id, nombre, precio, img FROM producto WHERE " + rango_duracion;

			rs = st.executeQuery(query);

			while (rs.next()) {
				Producto x = new Producto();
				x.setIdProd(rs.getInt("id"));
				x.setNombreProducto(rs.getString("nombre"));
				x.setPrecio(rs.getFloat("precio"));
				x.setImagen(rs.getString("img"));
				listado.add(x);
			}

		} catch (Exception a) {
			System.out.println("error es " + a.getMessage());
		}

		return listado;
	}
	
	public static List recuperarListaPorNumeroJugadores(String jugadores) {

		List listado = new ArrayList();
		String rango_jugadores=null;

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
				rango_jugadores ="jug_min = 2";
			} else if (jugadores == "trios") {
				rango_jugadores ="jug_min = 3";
			} else if(jugadores == "multitud"){
				rango_jugadores ="jug_min > 3";
			}
			
			String query = "SELECT id, nombre, precio, img FROM producto WHERE " + rango_jugadores;

			rs = st.executeQuery(query);

			while (rs.next()) {
				Producto x = new Producto();
				x.setIdProd(rs.getInt("id"));
				x.setNombreProducto(rs.getString("nombre"));
				x.setPrecio(rs.getFloat("precio"));
				x.setImagen(rs.getString("img"));
				listado.add(x);
			}

		} catch (Exception a) {
			System.out.println("error es " + a.getMessage());
		}

		return listado;
	}
	
	public static List recuperarListaPorBusqueda(String juego) {

		List listado = new ArrayList();
		String texto="";
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

			for(int i=0; i<cadena_busqueda.length; i++){
				texto = texto + " nombre LIKE '%" + cadena_busqueda[i] + "%'";
				if(i != (cadena_busqueda.length)-1){
					texto += " AND";
				}
			}
			
			String query = "SELECT id, nombre, precio, img FROM producto WHERE" + texto;
			
			rs = st.executeQuery(query);

			while (rs.next()) {
				Producto x = new Producto();
				x.setIdProd(rs.getInt("id"));
				x.setNombreProducto(rs.getString("nombre"));
				x.setPrecio(rs.getFloat("precio"));
				x.setImagen(rs.getString("img"));
				listado.add(x);
			}

		} catch (Exception a) {
			System.out.println("error es " + a.getMessage());
		}

		return listado;
	}

}
