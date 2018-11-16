package datos;

import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
	
	public static void cargarPelis(String url){
		File fichero = new File(url);
		Scanner s = null;
		String[] valores = null;
		
		try {
			// Leemos el contenido del fichero
			System.out.println("... Leemos el contenido del fichero ...");
			s = new Scanner(fichero);

			// Leemos linea a linea el fichero
			while (s.hasNextLine()) {
				String linea = s.nextLine(); 	// Guardamos la linea en un String
				valores = linea.split(",");
				cargarEnBBDD(valores);
				for(String v:valores){
					System.out.println(v);
				}
			}
		} catch (Exception ex) {
			System.out.println("Mensaje: " + ex.getMessage());
		} finally {
			// Cerramos el fichero tanto si la lectura ha sido correcta o no
			try {
				if (s != null)
					s.close();
			} catch (Exception ex2) {
				System.out.println("Mensaje 2: " + ex2.getMessage());
			}
		}
		
	}
	
	public static void cargarEnBBDD(String[] valores){
		Conexion conn = null;
		Statement st = null;
		int res;

		try {

			st = Conexion.getConnection().createStatement();
			String query = "INSERT INTO peliculas(nombre,añoEstreno,IDCategoria) VALUES('" + valores[0] + "','" + valores[1] + "'," + String.valueOf(valores[2]) + ")";
			System.out.println(query);
			res = st.executeUpdate(query);


		} catch (SQLException ex) {

			ex.printStackTrace();

		}
		
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

