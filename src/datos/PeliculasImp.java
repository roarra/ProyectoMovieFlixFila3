package datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.Pelicula;
import datos.Conexion;

public class PeliculasImp implements IDatosPelicula{

	public void add(Pelicula pelicula) {
		

	}

	public void delete(String nombre) {

	}

	public String read(String nombre) {

		return nombre;
	}

	public void update(String nombre) {

	}
	
	public List<Pelicula> listFilms(){
		
		List<Pelicula> lista = new ArrayList<>();
		Statement st = null;
		ResultSet rs = null;

		try {

			st = Conexion.getConnection().createStatement();
			rs = st.executeQuery("SELECT * FROM peliculas;");

			while (rs.next()) {

				Pelicula pelicula = new Pelicula();

				pelicula.setNombre(rs.getString("nombre"));
				pelicula.setfechaEstreno(rs.getString("añoEstreno"));
				pelicula.setCategoria(rs.getString("CATEGORIA"));
			
				lista.add(pelicula);

			}

		} catch (SQLException ex) {

			ex.printStackTrace();

		}
		return lista;
		
		
	}
}

