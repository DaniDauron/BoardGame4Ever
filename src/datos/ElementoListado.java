package datos;

public class ElementoListado {

	private int id;
	private String nombreProducto;
	private float precio;
	
	public ElementoListado(){
		
	}
	
	public ElementoListado(int id, String nombreProducto, float precio) {
		super();
		this.id = id;
		this.nombreProducto = nombreProducto;
		this.precio = precio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "ElementoListado [id=" + id + ", nombreProducto=" + nombreProducto + ", precio=" + precio + "]";
	}
	
	
	
}
