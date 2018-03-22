package modelo;

public class UsuarioAdmin extends Usuario {
	
	private int idAdmin;
	
	public UsuarioAdmin(String nombre, String pass) {
		this.setUsuario(nombre);
		this.setPassword(pass);
	}

	public int getIdAdmin() {
		return idAdmin;
	}

	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
	}
	
	

}
