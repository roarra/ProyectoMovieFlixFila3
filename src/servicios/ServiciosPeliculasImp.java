package servicios;

import datos.PeliculasImp;
import modelo.Pelicula;

public class ServiciosPeliculasImp implements IServiciosPelicula{

	public boolean check(String nombre){
		return false;
		
		}
		
		public Pelicula crearPelicula(String nombre, String fechaEstreno, String categoria ){
			
			return new Pelicula().crearPelicula(nombre, fechaEstreno, categoria);
			
	}
	
	public void update(String nombre){
	
		
	}
	
	public void add(Pelicula pelicula){
		
		new PeliculasImp().add(pelicula);

	}
	
	public void delete(String nombre)
	{
	
	}
	
	public String read(String nombre){
		
		new PeliculasImp().read(nombre);
		
		return nombre;
	}
	
	public static void cargarPeliculas(){
		String url = "fichero.txt";
		cargarPeliculas(url);
	}

	public static void cargarPeliculas(String url){
		PeliculasImp.cargarPelis(url);;
		
	}
	@Override
	public Pelicula crearPelicula(String nombre, int fechaEstreno, String categoria) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
 