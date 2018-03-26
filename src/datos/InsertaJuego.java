package datos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.PreparedStatement;

import modelo.Producto;

public class InsertaJuego {

	@SuppressWarnings({ "deprecation", "unused" })
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

			PreparedStatement ps = null;
			
            String query = "Insert into producto (jug_min, jug_max,duracion, precio, publicacion, edad, descripcion, nombre, img, stock, tipo) values (?,?,?,?,?,?,?,?,?,?,?) ;";
			
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
		
			
			int filas = ps.executeUpdate();
			

			

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
	
	
	
@SuppressWarnings("deprecation")
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
			
		
			System.out.println(" mi id: "+p.getIdProd() + "nombre "+p.getNombreProducto() + " filas "+filas + " img "+ p.getImagen() + " ay");
			

		} catch (SQLException b) {
			System.out.println("error es " + b.getMessage() );
			System.out.println(b.getErrorCode() + " codigo");
			System.out.println( b.getLocalizedMessage());
			System.out.println(" mi id: "+p.getIdProd() + "nombre "+p.getNombreProducto());

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


