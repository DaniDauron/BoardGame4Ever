package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ListadoDao {

	public static List recuperarElementoListado (String numero) {

		// TODO Auto-generated method stub

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
	
		
		List slider= new ArrayList(6);
		ElementoListado x;

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
			
			x = new ElementoListado();
			
		
			for (int i=0; i<6 && rs.next(); i++){
				x.setId(rs.getInt("id"));
				x.setNombreProducto(rs.getString("nombre"));
				x.setPrecio(rs.getFloat("precio"));
				slider.add(x);
			}
			
			
			/*
			 * while (rs.next() && continuar) {
				System.out.println("nombre es :" + rs.getString("nombre"));
				x.setId(rs.getInt("id"));
				x.setNombreProducto(rs.getString("nombre"));
				x.setPrecio(rs.getFloat("precio"));
				
			}
			*/
			
		} catch (Exception a) {
			System.out.println("error es " + a.getMessage());
			x= new ElementoListado();
		}

		return slider;

	}
	
	
}
