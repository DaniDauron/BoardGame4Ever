package servicio;

import datos.UsuarioDao;
import modelo.Usuario;
import modelo.UsuarioAdmin;
import modelo.UsuarioCliente;

public class ServicioUsuarios {

	public static boolean LogearUsuario(Usuario user) {

		if (user instanceof UsuarioAdmin) {
			return new UsuarioDao().logearAdmin(user);
		} else if (user instanceof UsuarioCliente) {
			return new UsuarioDao().login(user);
		}else{
			return false;
		}

	}

}
