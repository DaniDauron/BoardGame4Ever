package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import modelo.Producto;

public class InsertaJuego {

	public static void insertarBBDD(Producto p){
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		
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

			String nombre, tipo, img, descripcion, publicacion=null; 
			int edad, maxJug, minJug, tiempo, stock;
			float precio;
			
			nombre=p.getNombreProducto();
			edad= p.getEdad();
			tipo= p.getTipo();
			maxJug= p.getMaxJugadores();
			minJug= p.getMinJugadores();
			precio= p.getPrecio();
			tiempo=p.getTiempoEstimado();
			img= p.getImagen();
			descripcion= p.getDescripcion();
			stock=p.getStock();
			
			
			String query = "INSERT INTO (jug_min, jug_max, duracion, precio, publicacion, edad, descripcion, nombre, img, stock, tipo ) "
					+ "VALUES (" +minJug+ ", " +maxJug+ ", " +tiempo+ ", " +precio+ ", " + publicacion+ ", " +edad+ ", " +descripcion+ ", " +nombre+ ", " +img+ ", " +stock+ ", " +tipo+ ")";
			rs = st.executeQuery(query);

			

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
		
	}
	
	
	
public static void actualizarBBDD(Producto p){
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		
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

			String nombre, tipo, img, descripcion, publicacion=null; 
			int edad, maxJug, minJug, tiempo, stock;
			float precio;
			
			nombre=p.getNombreProducto();
			edad= p.getEdad();
			tipo= p.getTipo();
			maxJug= p.getMaxJugadores();
			minJug= p.getMinJugadores();
			precio= p.getPrecio();
			tiempo=p.getTiempoEstimado();
			img= p.getImagen();
			descripcion= p.getDescripcion();
			stock=p.getStock();
			
			
			String query = "UPDATE producto SET jug_min=" +minJug+ ", jug_max=" +maxJug+", duracion=" +tiempo+ ", precio=" +precio+ ", publicacion=" +publicacion+ ", edad=" +edad+
					", descripcion=" +descripcion+ ", nombre=" +nombre+ ", img=" +img+ ", stock=" +stock+ ",tipo=" +tipo+";";
				
			rs = st.executeQuery(query);

			

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
		
	}
	}


