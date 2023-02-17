package pruebamysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PruebaConexionMySQL {
	
	//Declaro el driver
	public String driver = "com.mysql.cj.jdbc.Driver";
	
	//Nombre del host donde esta la base de datos
	public String hostName = "localhost";
	
	//Puerto
	public String puerto = "3306";
	
	//Nombre de la base de datos a la que quiero conectarme
	public String nombreDB = "universidad";
	
	//Nombre de usuario
	public String username = "root";
	
	//Contraseña
	public String password = "PGB44pgb@@";
	
	//Armo la URL de la base de datos
	public String url = "jdbc:mysql://" + hostName + ":" + puerto + "/" + nombreDB + "?useSSL=false";
	
	
	public Connection conectarMySQL() {
		
		Connection conexion = null;
		
		try {
			//Si es un sistema antiguo debo utilizar Class.forName(driver) para cargar el driver que se va a conectar con la DB
			//Class.forName(driver);
			//Creo la conexion
			conexion = DriverManager.getConnection(url, username, password);
			System.out.println("Esta conectado a la Base de datos " + nombreDB.toUpperCase() + "\n");
		}
		catch(SQLException  e){
			e.printStackTrace();
		} 
		
		return conexion;
	}
	

}
