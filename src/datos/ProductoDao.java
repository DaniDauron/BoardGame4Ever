package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import modelo.Producto;

public class ProductoDao {

	public static Producto recuperarJuego(String numero) {



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

			String query = "SELECT p.id, p.nombre, p.categoria, p.edad, p.duracion, p.jug_min, p.jug_max, p.precio, p.descripcion, p.img, p.stock, t.tipo from producto p, tipos t where t.id = p.tipo and p.id="	+ numero + ";";
			rs = st.executeQuery(query);
			x = new Producto();
			
			while (rs.next()) {
				x.setIdProd(rs.getInt("id"));
				x.setNombreProducto(rs.getString("nombre"));
				x.setEdad(rs.getInt("edad"));
				x.setMinJugadores(rs.getInt("jug_min"));
				x.setMaxJugadores(rs.getInt("jug_max"));
				x.setDescripcion(rs.getString("descripcion"));
				x.setPrecio(rs.getFloat("precio"));
				x.setTiempoEstimado(rs.getInt("duracion"));
				x.setCategoria(rs.getString("categoria"));
				x.setImagen(rs.getString("img"));
				x.setTipo(rs.getString("tipo"));
				x.setStock(rs.getInt("stock"));
				
			}
		} catch (Exception a) {
			System.out.println("error es " + a.getMessage());
			x= new Producto();
		}

		return x;

	}

}// Fin clase Matriculas
