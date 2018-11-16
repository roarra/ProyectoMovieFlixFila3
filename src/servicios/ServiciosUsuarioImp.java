package servicios;

import datos.UsuariosImp;
import modelo.Usuario;

public abstract class ServiciosUsuarioImp implements IServiciosUsuario {
	
	Usuario u = new Usuario();
	
	public boolean ckeck(String nombre){
		
		return true;
	}

	public Usuario add(){
		
		u.crearUsuario();
		
		return u;
	}
	
	public Usuario add(Usuario usuario){
		
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
