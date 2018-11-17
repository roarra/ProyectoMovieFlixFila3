package control;

import gui.Menu;
import modelo.Pelicula;
import modelo.Usuario;
import servicios.IServiciosPelicula;
import servicios.IServiciosUsuario;
import servicios.ServiciosPeliculasImp;
import servicios.ServiciosUsuarioImp;
import utilidades.LecturaDatos;


public class MovieFlix {

			IServiciosUsuario servicesUsuario = new ServiciosUsuarioImp();
			IServiciosPelicula servicesPelicula = new ServiciosPeliculasImp();
		
		
	public void arrancar() {
		
		boolean seguir = true;
		
		do{
			
			Menu.imprimeMenu();
			seguir= this.seleccionarOpciones();
			
		}
		
		while(seguir);
		System.out.println("Terminar Sesión");
			
			
		}
	
	

	public boolean seleccionarOpciones(){
		
		boolean continuar = true;
		
		try{
			
			switch(LecturaDatos.leerInt()){
			
			case 1: //AÑADIR PELICULAS A TRAVES DEL FICHERO
				
			//servicesPelicula.add(); AQUI VA EL DE AÑADIR PELICULAS CON EL FICHERO
			break;
			
			case 2: 
				//AÑADIR PELICULAS CON PARAMETROS
				Pelicula pelicula1 = new Pelicula();
				servicesPelicula.add(pelicula1);
				break;
				
			case 3:
				
				//LISTAR PELICULAS
				servicesPelicula.listFilms();//servicesPelicula.  AQUI VA EL DE LISTAR PELICULAS
				break;
				
			case 4:
				
				//ELIMINAR PELICULAS
				Pelicula pelicula2 = new Pelicula();
				servicesPelicula.delete(pelicula2.getNombre());
				break;
				
			case 5:
				
				//AQUI VA EL METODO DE PELICULAS MAS VISTAS
				
			case 6:
				
				//AQUI VA EL METODO DE PELICULAS MAS VALORADAS
				
			case 7:
				
				//AQUI VA EL METODO DE PELICULAS QUE VER DE ACUERDO AL TIPO DE ABONO
				
			case 8:
				
				//AQUI VA EL LISTADO DE PELICULAS POR CATEGORIA
				
			case 9:
				
				//BUSCAR PELICULA
				Pelicula pelicula3 = new Pelicula("Saw", "2002", "Belica");
				servicesPelicula.read(pelicula3.getNombre());
				break;
				
			case 10:
				
				//AÑADIR USUARIO
				Usuario usuario1 = new Usuario();
				servicesUsuario.add(usuario1);
				break;
				
			case 11:
				
				//METODO ACTUALIZAR USUARIO
				break;
				
			case 12:
				
				//LISTAR USUARIO
				break;
				
			case 13:
				
				//ELIMINAR USUARIO
				Usuario usuario2 = new Usuario();
				servicesUsuario.delete(usuario2.getNombreCompleto());
				break;
				
			case 14:
				
				//AÑADIR CATEGORIA
				break;
				
			case 15:
				
				//ACTUALIZAR CATEGORIA
				break;
				
			case 16:
				
				//VER CATEGORIAS
				break;
				
			case 17:
				
				//ELIMINAR CATEGORIA
				break;
				
			case 0:
				
				continuar = salir();
				break;
				
			}
				
		}
		
		catch (Exception e){
			
			System.out.println("Error: "+e.toString());
		}
		
		return continuar;
		
	}
		private boolean salir() throws Exception {
			
			String pregunta = LecturaDatos.leerString("¿Está seguro: S/N: ");
			return (pregunta.toUpperCase().charAt(0) != 'S'); 
			
			
		}
}
	
	
	
	
	


