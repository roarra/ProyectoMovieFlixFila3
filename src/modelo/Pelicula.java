package modelo;

public class Pelicula {
	
	private String nombre;
	private int anioEstreno;
	private String categoria;
	
	
	public Pelicula() {
		super();
	}
	
	
	public Pelicula(String nombre, int anioEstreno, String categoria) {
		super();
		this.nombre = nombre;
		this.anioEstreno = anioEstreno;
		this.categoria = categoria;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAnioEstreno() {
		return anioEstreno;
	}
	public void setAnioEstreno(int anioEstreno) {
		this.anioEstreno = anioEstreno;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	@Override
	public String toString() {
		return "Pelicula [nombre=" + nombre + ", anioEstreno=" + anioEstreno + ", categoria=" + categoria + "]";
	}
	
	
	

}
