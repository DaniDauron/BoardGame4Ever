package datos;

public class Producto {

	/*
	 * Atributos
	 */
	
	private String nombreProducto;
	private String descripcion;
	private int edad;
	private int minJugadores;
	private int maxJugadores;
	private String categoria;
	private int tiempoEstimado;
	private int precio;
	
	/*
	 * Constructor y métodos.
	 */
	
	public Producto(){
		
	}
	
	public Producto (String NP, String Des, short Edad, short MinJ, short MaxJ, String cat, int Tiempo, int precio){
		
		this. nombreProducto = NP;
		this. descripcion = Des;
		this. edad= Edad;
		this. minJugadores= MinJ;
		this. maxJugadores= MaxJ;
		this. categoria= cat;
		this. tiempoEstimado= Tiempo;
		this. precio= precio;
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

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [nombreProducto=" + nombreProducto + ", descripcion=" + descripcion + ", edad=" + edad
				+ ", minJugadores=" + minJugadores + ", maxJugadores=" + maxJugadores + ", categoria=" + categoria
				+ ", tiempoEstimado=" + tiempoEstimado + ", precio=" + precio + "]";
	}
	
}
