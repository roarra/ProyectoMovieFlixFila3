package servicios;

import java.util.Date;

import datos.IDatosUsuario;
import datos.UsuariosImp;
import modelo.Usuario;

public class ServiciosUsuarioImp implements IServiciosUsuario {
	
	//Usuario u = new Usuario();
	
	IDatosUsuario datosU = new UsuariosImp();
	
	public boolean check(String nombre){
		
		return true;
	}

	public Usuario crearUsuario(String nombreCompleto, String fechaNacimiento, String ciudadResidencia, String paqueteAbono, Date fechaRegistro){
		
		return new Usuario().crearUsuario(nombreCompleto, fechaNacimiento, ciudadResidencia, paqueteAbono, fechaRegistro);
		
		
		/*return u;*/
	}
	
	public void add(Usuario usuario){
		

		return ServiciosUsuarioImp.add(usuario);

	
	}
	
	public void delete(String nombre){
		
	}
	
	public String read(String nombre){
		
		return nombre;
	}
	
	public void update(String nombre){
		
	} 
} 
