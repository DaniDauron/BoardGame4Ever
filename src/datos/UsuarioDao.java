
package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Usuario;

public class UsuarioDao implements I_Usuario {

	private Connection con = null;
	private Statement st = null;
	private ResultSet rs = null;

	@Override
	public void Login(UsuarioDao u) {

	}

	@Override
	public void LogOut(String cod) {

	}

	@Override
	public void Alta(UsuarioDao u) {

	}

	@Override
	public void Modificacion(UsuarioDao u) {

	}

	public boolean logearAdmin(Usuario usuario) {
		boolean exito = false;

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

			String query = "SELECT usuario from admin where password='" + usuario.getPassword() + "' and usuario='"+ usuario.getUsuario() + "';";
			rs = st.executeQuery(query);			
			
			if(rs.next()){
				usuario.setLogeado(true);
				exito = true;
			}
		

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

		return exito;

	}

	public boolean login(Usuario user) {
		return false;
	}

}
