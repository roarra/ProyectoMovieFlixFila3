package control;

import servicios.ServiciosPeliculasImp;

public class MovieFlix {
	
	public static void arrancar(){
		ServiciosPeliculasImp.cargarPeliculas();
	}

}
