package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import modelo.Producto;

public class ListadoAdminDao {

	static Connection con = null;
	static Statement st = null;
	static ResultSet rs = null;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List recuperaElmentoListadoAdmin(){
		
		List listado = new ArrayList<>();
		Producto x;
		
		try{
			String driverClassName = "com.mysql.jdbc.Driver";
			String driverUrl = "jdbc:mysql://192.168.200.17/gameboard";
			String user = "boarduser";
			String password = "1111";
			
			try{
				Class.forName(driverClassName);
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
			
			con = DriverManager.getConnection(driverUrl, user, password);
			st = con.createStatement();
			
			String query = "SELECT id, nombre, stock FROM producto";
			rs = st.executeQuery(query);
			
			while(rs.next()){
				x = new Producto();
				x.setIdProd(rs.getInt("id"));
				x.setNombreProducto(rs.getString("nombre"));
				x.setStock(rs.getInt("stock"));
				listado.add(x);
			}
			
		}catch(Exception a){
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

}
