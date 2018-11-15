package datos;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import datos.Conexion;
import modelo.Usuario;
import servicios.ServiciosUsuarioImp;

public abstract class UsuariosImp implements IDatosUsuario {
	
	Conexion conexion = new Conexion();

	public void add(Usuario usuario){
		

		
		Statement st = null;

		try {

			st = conexion.getConnection().createStatement();

			st.executeUpdate(
					"INSERT INTO PRODUCTOS(NOMBRE, CATEGORIA, STOCK)" + "VALUES ('" + usuario.getNombreCompleto()
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
