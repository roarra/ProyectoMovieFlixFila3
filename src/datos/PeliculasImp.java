package datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.Pelicula;

public class PeliculasImp implements IDatosPelicula{

	public void add(String nombre) {

	}

	public void delete(String nombre) {

	}

	public String read(String nombre) {

		return nombre;
	}

	public void update(String nombre) {

	}
	
	public List<Pelicula> listFilms(){
		

	


		List<Producto> lista = new ArrayList<>();
		Statement st = null;
		ResultSet rs = null;

		try {

			st = conexion.createStatement();
			rs = st.executeQuery("SELECT * FROM productos;");

			while (rs.next()) {

				Producto producto = new Producto();

				producto.setCodigo(rs.getInt("CODIGO"));
				producto.setNombreProducto(rs.getString("NOMBRE"));
				producto.setCategoria(Categoria.valueOf(rs.getString("CATEGORIA")));
				producto.setStock(rs.getInt("STOCK"));

				lista.add(producto);

			}

			conexion.close();
		} catch (SQLException ex) {

			ex.printStackTrace();

		}
		return lista;
		
		
	}
}

