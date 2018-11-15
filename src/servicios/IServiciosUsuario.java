package servicios;

import java.util.Date;

import modelo.Usuario;

public interface IServiciosUsuario {
	
	public boolean check(String nombre);
	
	public void update(String nombreCompleto, String fechaNacimiento, String ciudadResidencia, String paqueteAbono, Date fechaRegistro);
	
	public Usuario add(Usuario usuario);
	
	public void delete(String nombre);
	
	public String read(String nombre);
	

}
