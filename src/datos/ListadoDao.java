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

			String query = "SELECT id,nombre,precio,img from producto ";
			rs = st.executeQuery(query);
			
		for (int i = 0; i < limite && rs.next(); i++) {
				Producto x = new Producto();
				x.setIdProd(rs.getInt("id"));
				x.setNombreProducto(rs.getString("nombre"));
				x.setPrecio(rs.getFloat("precio"));
				x.setImagen(rs.getString("img"));
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

			String query = "SELECT id, nombre, precio, img FROM producto ORDER BY publicacion DESC";
			rs = st.executeQuery(query);

			while (rs.next()) {
				Producto x = new Producto();
				x.setIdProd(rs.getInt("id"));
				x.setNombreProducto(rs.getString("nombre"));
				x.setPrecio(rs.getFloat("precio"));
				x.setImagen(rs.getString("img"));
				slider.add(x);
			}
	

		} catch (Exception a) {
			System.out.println("error es " + a.getMessage());
		}

		return slider;
	}

	public static List recuperarListaPorTipoTablero() {

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

			String query = "SELECT id, nombre, precio, img FROM producto WHERE tipo='Tablero'";
			rs = st.executeQuery(query);

			while (rs.next()) {
				Producto x = new Producto();
				x.setIdProd(rs.getInt("id"));
				x.setNombreProducto(rs.getString("nombre"));
				x.setPrecio(rs.getFloat("precio"));
				x.setImagen(rs.getString("img"));
				slider.add(x);
			}
	

		} catch (Exception a) {
			System.out.println("error es " + a.getMessage());
		}

		return slider;
	}
	
	public static List recuperarListaPorTipoDados() {

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

			String query = "SELECT id, nombre, precio, img FROM producto WHERE tipo='Dados'";
			rs = st.executeQuery(query);
			

		
			while (rs.next()) {
				Producto x = new Producto();
				x.setIdProd(rs.getInt("id"));
				x.setNombreProducto(rs.getString("nombre"));
				x.setPrecio(rs.getFloat("precio"));
				x.setImagen(rs.getString("img"));
				slider.add(x);
			}
	

		} catch (Exception a) {
			System.out.println("error es " + a.getMessage());
			
		}

		return slider;

	}
	
	public static List recuperarListaPorTipoCartas() {

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

			String query = "SELECT id, nombre, precio, img FROM producto WHERE tipo='Cartas'";
			rs = st.executeQuery(query);
			

		
			while (rs.next()) {
				Producto x = new Producto();
				x.setIdProd(rs.getInt("id"));
				x.setNombreProducto(rs.getString("nombre"));
				x.setPrecio(rs.getFloat("precio"));
				x.setImagen(rs.getString("img"));
				slider.add(x);
			}
	

		} catch (Exception a) {
			System.out.println("error es " + a.getMessage());
			
		}

		return slider;

	}
	
	public static List recuperarListaPorEdades(int edad) {

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

			String query;
			
			if(edad < 4){
				query = "SELECT id, nombre, precio, img FROM producto WHERE edad=" + edad;
			}else{
				query = "SELECT id, nombre, precio, img FROM producto WHERE edad>=" + edad;
			}
			
			
			rs = st.executeQuery(query);
			

		
			while (rs.next()) {
				Producto x = new Producto();
				x.setIdProd(rs.getInt("id"));
				x.setNombreProducto(rs.getString("nombre"));
				x.setPrecio(rs.getFloat("precio"));
				x.setImagen(rs.getString("img"));
				slider.add(x);
			}
	

		} catch (Exception a) {
			System.out.println("error es " + a.getMessage());
			
		}

		return slider;

	}
	
}
