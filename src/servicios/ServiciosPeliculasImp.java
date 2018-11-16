package servicios;

import datos.PeliculasImp;
import modelo.Pelicula;

public class ServiciosPeliculasImp implements IServiciosPelicula{

	public boolean check(String nombre){
		return false;
		
		}
		
		public Pelicula crearPelicula(String nombre, int fechaEstreno, String categoria ){
			
			return new Pelicula().crearPelicula(nombre, fechaEstreno, categoria);
			
	}
	
	public void update(String nombre){
	
		
	}
	
	public void add(Pelicula pelicula){
		
		return PeliculasImp.add(pelicula);

	}
	
	public void delete(String nombre)
	{
	
	}
	
	public String read(String nombre){
		
		return nombre;
	}
	
}
 