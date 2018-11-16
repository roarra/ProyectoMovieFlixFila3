package datos;


import java.sql.SQLException;
import java.sql.Statement;
import datos.Conexion;
import modelo.Usuario;


public class UsuariosImp implements IDatosUsuario {
	
	Conexion conexion = new Conexion();

	public void add(Usuario usuario){
		

		
		Statement st = null;

		try {

			st = conexion.getConnection().createStatement();

			st.executeUpdate(
					"INSERT INTO PRODUCTOS(NOMBRE, CATEGORIA, STOCK) VALUES ('" + usuario.getNombreCompleto()
							+ "', '" + usuario.getfechaNacimiento() + "'," + usuario.getCiudadResidencia() + ");");

			conexion.close();
		}

		catch (SQLException ex) {

			ex.printStackTrace();

		}
		
	}
	
	public void delete(String nombre){
		
	}
	
	public String read(String nombre){
		
		return nombre;
	}
	
	public void update(String nombre){
		
	}
}
