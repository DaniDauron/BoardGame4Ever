package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConectarBaseDatos {

	public static Producto recuperarJuego(String numero) {

		// TODO Auto-generated method stub

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			String driverClassName = "com.mysql.jdbc.Driver";
			String driverUrl = "jdbc:mysql://127.0.0.1/gameboard";
			String user = "root";
			String password = "1111";
			try {
				Class.forName(driverClassName);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			con = DriverManager.getConnection(driverUrl, user, password);
			System.out.println("aaaaaa");
			st = con.createStatement();

			String query = "SELECT nombre, categoria, edad, duracion, jug_min, jug_max, precio, descripcion) from producto where id ="
					+ numero + ";";
			rs = st.executeQuery(query);
			System.out.println("bbbbb");

			while (rs.next()) {
				System.out.println("nombre es :" + rs.getString("nombre"));
			}
		} catch (Exception a) {
			System.out.println("error es " + a.getMessage());
		}

		return new Producto();

	}

}// Fin clase Matriculas
