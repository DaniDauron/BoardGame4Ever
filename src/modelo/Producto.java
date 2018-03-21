package modelo;

public class Producto {

	/*
	 * Atributos
	 */

	private int idProd;
	private String nombreProducto;
	private String descripcion;
	private int edad;
	private int minJugadores;
	private int maxJugadores;
	private String categoria;
	private int tiempoEstimado;
	private float precio;
	private String imagen;
	private String tipo;
	
	/*
	 * Constructor y métodos.
	 */
	{
		this.imagen="./src/iamerror.png";
	}
	public Producto(){
		
	}
	
	public Producto(int idProd, String nombreProducto, String descripcion, int edad, int minJugadores, int maxJugadores,
			String categoria, int tiempoEstimado, int precio) {
		super();
		this.idProd = idProd;
		this.nombreProducto = nombreProducto;
		this.descripcion = descripcion;
		this.edad = edad;
		this.minJugadores = minJugadores;
		this.maxJugadores = maxJugadores;
		this.categoria = categoria;
		this.tiempoEstimado = tiempoEstimado;
		this.precio = precio;
	}

	public int getIdProd() {
		return idProd;
	}

	public void setIdProd(int idProd) {
		this.idProd = idProd;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getMinJugadores() {
		return minJugadores;
	}

	public void setMinJugadores(int minJugadores) {
		this.minJugadores = minJugadores;
	}

	public int getMaxJugadores() {
		return maxJugadores;
	}

	public void setMaxJugadores(int maxJugadores) {
		this.maxJugadores = maxJugadores;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getTiempoEstimado() {
		return tiempoEstimado;
	}

	public void setTiempoEstimado(int tiempoEstimado) {
		this.tiempoEstimado = tiempoEstimado;
	}

	public float getPrecio() {		
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;		
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	
	
}
