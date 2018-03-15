package datos;

public class Producto {

	/*
	 * Atributos
	 */
	
	private String nombreProducto;
	private String descripcion;
	private short edad;
	private short minJugadores;
	private short maxJugadores;
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

	public short getEdad() {
		return edad;
	}

	public void setEdad(short edad) {
		this.edad = edad;
	}

	public short getMinJugadores() {
		return minJugadores;
	}

	public void setMinJugadores(short minJugadores) {
		this.minJugadores = minJugadores;
	}

	public short getMaxJugadores() {
		return maxJugadores;
	}

	public void setMaxJugadores(short maxJugadores) {
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
