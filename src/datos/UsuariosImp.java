package datos;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import datos.Conexion;
import modelo.Usuario;


public class UsuariosImp implements IDatosUsuario {
	
	static Conexion conexion = new Conexion();

	public void add(Usuario usuario){

		
		Statement st = null;

		try {

			st = conexion.getConnection().createStatement();

			st.executeUpdate(
					"INSERT INTO usuario(nombre, fechaNacimiento, ciudad, fechaAbono) VALUES ('" + usuario.getNombreCompleto()
							+ "', '" + usuario.getfechaNacimiento() + "'," + usuario.getCiudadResidencia() + usuario.getFechaRegistro()+ ");");

			conexion.close();
		}

		catch (SQLException ex) {

			ex.printStackTrace();

		}
		
	}
	
	public void delete(String nombre){
		
	}
	
	public String read(String nombre){
		
		Statement st = null;
		ResultSet rs = null;

		Usuario usuario = new Usuario();
		List<Usuario> lista = new ArrayList<>();

		try {

			st = conexion.getConnection().createStatement();
			rs = st.executeQuery("SELECT * FROM usuarios WHERE nombre = '" + nombre + "';");

			while (rs.next()) {
				
				usuario.setNombreCompleto(rs.getString("nombre"));
				usuario.setfechaNacimiento(rs.getString("fechaNacimiento"));
				usuario.setCiudadResidencia(rs.getString("ciudad"));
				usuario.setFechaRegistro(rs.getDate("fechaAbono"));
				

				lista.add(usuario);

				usuario = lista.get(0);

			}

		} catch (SQLException ex) {

			ex.printStackTrace();

		}

		return usuario.toString();

		
	
	}
	
	public void update(String nombre){
		
	}
}
