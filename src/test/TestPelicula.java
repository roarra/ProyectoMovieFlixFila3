package test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import datos.PeliculasImp;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import modelo.Pelicula;


public class TestPelicula {
	
	private static byte cont = 1;
	private static Logger logger;

	// Inicializo
	static {
		try {
			logger = LogManager.getLogger(TestPelicula.class);
		} catch (Throwable e) {
			System.out.println("Don't work");
		}
	}

	@BeforeClass
	public static void onceExecutedBeforeAll() {
		logger.info(">>> Iniciando las pruebas");
	}

	@Before
	public void executedBeforeEach() {
		System.out.println("");
		logger.info("=== PRUEBA "+(cont++)+" ======");
	}

	@AfterClass
	public static void onceExecutedAfterAll() {
		logger.info(">>> Terminado las pruebas");
	}
	
	
	
	//------------
	//   TEST
	//------------
	
	@Test
	public void AddFilm(){
		logger.info("Añadiendo película ...");
		Pelicula peli1 = new Pelicula("Humor","2012","Aventuras");
		Pelicula peli2 = new Pelicula("F&F", "2006", "Thriller");
		assertEquals("Humor","F&F");
	}
	
	public boolean checkRepeatFilm(Pelicula pelicula)
	{
		return true;
		
	}
	
	public boolean checkNullFilmm(Pelicula pelicula)
	{
		return true;
	}
	
	

}
