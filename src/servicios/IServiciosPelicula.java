package servicios;

import modelo.Pelicula;

public interface IServiciosPelicula {

public boolean check(String nombre);
	
	//public void update(String nombreCompleto, String fechaNacimiento, String ciudadResidencia, String paqueteAbono, Date fechaRegistro);
	
	public void add(Pelicula pelicula);
	
	public Pelicula crearPelicula(String nombre, int fechaEstreno, String categoria);
	
	public void delete(String nombre);
	
	public String read(String nombre);
}
