package datos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

import java.sql.PreparedStatement;

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
			
			
			String query = "INSERT INTO producto (jug_min, jug_max, duracion, precio, publicacion, edad, descripcion, nombre, img, stock, tipo ) "
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

			PreparedStatement ps = null;
			
			String query = "UPDATE producto SET jug_min = ?, jug_max = ?, duracion=?, precio=?, publicacion=?, edad=?, descripcion=?, nombre=?, img=?, stock=?, tipo=? WHERE id = ?;";
			
			ps = con.prepareStatement(query);
			
			ps.setInt(1, p.getMinJugadores());
			ps.setInt(2, p.getMaxJugadores());
			ps.setInt(3, p.getTiempoEstimado());
			ps.setFloat(4, p.getPrecio());
			ps.setDate(5, new Date(2018, 03, 27));
			ps.setInt(6, p.getEdad());
			ps.setString(7, p.getDescripcion());
			ps.setString(8, p.getNombreProducto());
			ps.setString(9, p.getImagen());
			ps.setInt(10, p.getStock());
			ps.setInt(11, Integer.parseInt(p.getTipo()));
			ps.setInt(12, p.getIdProd());
			
			int filas = ps.executeUpdate();
			
			throw new Exception("filas "+filas + " mi id: "+p.getIdProd());

			

		} catch (SQLException b) {
			System.out.println("error es " + b.getMessage() );
			System.out.println(b.getErrorCode() + " codigo");
			System.out.println( b.getLocalizedMessage());

		} catch (Exception a) {
			System.out.println("error es " + a.getMessage() + " NO SE QEU SOY");

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


