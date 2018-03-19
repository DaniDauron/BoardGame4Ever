package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ListadoDao {

	public static Producto recuperarJuego(String numero) {

		// TODO Auto-generated method stub

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		
		
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

			String query = "SELECT id,nombre,precio from producto ";
			rs = st.executeQuery(query);
			System.out.println("bbbbb");
			x = new Producto();
			
			while (rs.next()) {
				System.out.println("nombre es :" + rs.getString("nombre"));
				x.setIdProd(rs.getInt("id"));
				x.setNombreProducto(rs.getString("nombre"));
				x.setPrecio(rs.getFloat("precio"));
				
			}
		} catch (Exception a) {
			System.out.println("error es " + a.getMessage());
			x= new Producto();
		}

		return x;

	}
	
	
}
