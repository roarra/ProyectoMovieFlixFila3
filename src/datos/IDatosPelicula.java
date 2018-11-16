package datos;

import modelo.Pelicula;

public interface IDatosPelicula {
	
	public void add(Pelicula pelicula);

	
	public void delete(String nombre);


	public String read(String nombre);
	
	
	public void update(String nombre);

	

}
