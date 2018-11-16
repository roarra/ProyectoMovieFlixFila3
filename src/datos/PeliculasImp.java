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
		

		Statement st = null;

		try {

			st = Conexion.getConnection().createStatement();

			st.executeUpdate(
					"INSERT INTO PRODUCTOS(nombre, añoEstreno, categoria)" + "VALUES ('" + pelicula.getNombre()
							+ "', '" + pelicula.getfechaEstreno() + "'," + pelicula.getCategoria() + ");");

		}

		catch (SQLException ex) {

			ex.printStackTrace();
		}

	}

	public void delete(String nombre) {

	}

	public String read(String nombre) {
		
		Statement st = null;
		ResultSet rs = null;
		ResultSet rs1 = null;

		Pelicula pelicula = new Pelicula();
		List<Pelicula> lista = new ArrayList<>();

		try {

			st = Conexion.getConnection().createStatement();
			rs = st.executeQuery("SELECT * FROM peliculas WHERE nombre = ''" + nombre + "'';");

			while (rs.next()) {
				
				pelicula.setNombre(rs.getNString("nombre"));
				pelicula.setfechaEstreno(rs.getString("añoEstreno"));
				int idcat = rs.getInt("IDCategoria");
				rs1 = st.executeQuery("SELECT nombre FROM categoria WHERE IDCategoria =" + idcat );
				pelicula.setCategoria(rs1.getString("nombre"));
				

				lista.add(pelicula);

				pelicula = lista.get(0);

			}

		} catch (SQLException ex) {

			ex.printStackTrace();

		}

		return pelicula.toString();

   
	}

	public void update(String nombre) {

	}
	
	public List<Pelicula> listFilms(){
		
		List<Pelicula> lista = new ArrayList<>();
		Statement st = null;
		ResultSet rs = null;
		ResultSet rs1 = null;

		try {

			st = Conexion.getConnection().createStatement();
			rs = st.executeQuery("SELECT * FROM peliculas;");
			rs1 = null;

			while (rs.next()) {

				Pelicula pelicula = new Pelicula();

				pelicula.setNombre(rs.getString("nombre"));
				pelicula.setfechaEstreno(rs.getString("añoEstreno"));
				int idcat = rs.getInt("IDCategoria");
				rs1 = st.executeQuery("SELECT nombre FROM categoria WHERE IDCategoria =" + idcat );
				pelicula.setCategoria(rs1.getString("nombre"));
				lista.add(pelicula);

			}

		} catch (SQLException ex) {

			ex.printStackTrace();

		}
		return lista;
		
		
	}
}

