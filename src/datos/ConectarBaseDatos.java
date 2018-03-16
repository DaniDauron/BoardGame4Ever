package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*---------------------------------------------------------------*/
/**
 * En este servlet implementamos el formulario Matriculas, el cual muestra una
 * página HTML con las distintas Matrículas que tiene cada alumno y los pagos
 * realizados por cada alumno que hay en nuestra base de datos de la Facultad de
 * Estudios Avanzados.
 *
 * Created: 10/05/2006
 *
 * @author Fco. Javier García Castellano fjgc@decsai.ugr.es
 * @version 1.0
 */
public class ConectarBaseDatos {

	public static Producto recuperarjuego(String numero) {

		// TODO Auto-generated method stub

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
		/*	String driverClassName = "com.mysql.jdbc.Driver";
			String driverUrl = "jdbc:mysql://localhost/gameboard";
			String user = "root";
			String password = "1111";
			Class.forName(driverClassName);
			con = DriverManager.getConnection(driverUrl, user, password);
			System.out.println("aaaaaa");
			st = con.createStatement();	
			
			
			
			String query = "SELECT nombre, categoria, edad, duracion, jug_min, jug_max, precio, descripcion) from producto where id ="
					+ numero + ";";
			rs = st.executeQuery(query);
			System.out.println("bbbbb");*/
			
			String driverClassName = "com.mysql.jdbc.Driver";
			String driverUrl = "jdbc:mysql://localhost/gameboard";
			String user = "root";
			String password = "1111";
			Class.forName(driverClassName);
			con = DriverManager.getConnection(driverUrl,user,password);
			st = con.createStatement();
			String query = "SELECT * FROM producto";
			rs = st.executeQuery(query);
			
			
			while (rs.next()) {
				System.out.println("nombre es :" + rs.getString("nombre"));
			}
		} catch (Exception a) {
			System.out.println("error es " + a.getMessage());
		}

		return new Producto();

	}

}// Fin clase Matriculas
