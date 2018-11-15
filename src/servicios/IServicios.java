package servicios;

public interface IServicios {
	
	public boolean check(String nombre);
	
	public void update(String nombre);
	
	public void add(String nombre);
	
	public void delete(String nombre);
	
	public String read(String nombre);
	

}
