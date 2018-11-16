package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	

    public static Connection getConnection() {
    	Connection connection = null;
		//String DB = "proyecto-fila3";
		String driverClassName = "com.mysql.jdbc.Driver";
		String driverUrl = "jdbc:mysql://10.90.36.10/proyecto-fila3";
		String user= "root";
		String password ="Luca1111";
	
    
        try {
        	Class.forName(driverClassName);
        	connection = DriverManager.getConnection(driverUrl,user,password);
        } catch (SQLException e) {
            System.out.println("Excepcion SQL: " + e.getMessage());
            System.out.println("Estado SQL: " + e.getSQLState());
            System.out.println("Codigo del Error: " + e.getErrorCode());
            System.out.println("ERROR. No se puede conectar con la Bases de Datos: " + e);
            System.exit(-1);
        } catch (ClassNotFoundException e1) {
        	System.out.println("no se que falla");
          e1.printStackTrace();
        }
		return connection;
        
    }

    public static void close(Connection connection) {
        try {
            connection.close();
        } catch (SQLException se) {
            System.out.println("Exception closing Connection: " + se);
        }
    }

}
