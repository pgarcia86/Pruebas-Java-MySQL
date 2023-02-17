package pruebamysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.MysqlConnection;

public class PruebaConexionMySQL {
	
	public String driver = "com.mysql.cj.jdbc.Driver";
	
	public String hostName = "localhost";
	
	public String puerto = "3306";
	
	public String nombreDB = "universidad";
	
	public String username = "root";
	
	public String password = "PGB44pgb@@";
	
	public String url = "jdbc:mysql://" + hostName + ":" + puerto + "/" + nombreDB + "?useSSL=false";
	
	public Connection conectarMySQL() {
		
		Connection conexion = null;
		
		try {
			Class.forName(driver);
			conexion = DriverManager.getConnection(url, username, password);
			System.out.println("Esta conectado");
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conexion;
	}
	

}
