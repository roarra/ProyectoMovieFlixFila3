package modelo;

public class Pelicula {
	
	private String nombre;
	private int fechaEstreno;
	private String categoria;
	
	
	public Pelicula() {
		super();
	}
	
	
	public Pelicula(String nombre, int fechaEstreno, String categoria) {
		super();
		this.nombre = nombre;
		this.fechaEstreno = fechaEstreno;
		this.categoria = categoria;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getfechaEstreno() {
		return fechaEstreno;
	}
	public void setfechaEstreno(int fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	@Override
	public String toString() {
		return "Pelicula [nombre=" + nombre + ", anioEstreno=" + fechaEstreno + ", categoria=" + categoria + "]";
	}
	
	
	public Pelicula crearPelicula(String nombre, int fechaEstreno, String categoria ){
		
		Pelicula p = new Pelicula();
		
		p.setNombre(nombre);
		p.setfechaEstreno(fechaEstreno);
		p.setCategoria(categoria);
		
		return p;
		
	}
	
	
	

}
