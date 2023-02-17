package pruebamysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PruebaConexionMySQL prueba = new PruebaConexionMySQL();
		
		Connection conexion = prueba.conectarMySQL();
		
		String sSQL	= "";
		
		sSQL = "SELECT d.nombre, prof.id_profesor, p.nombre, p.apellido1, p.apellido2 FROM profesor AS prof "
				+ "INNER JOIN departamento AS d ON d.id = prof.id_departamento INNER JOIN persona AS p ON "
				+ "p.id = prof.id_profesor LEFT JOIN asignatura AS a ON a.id_profesor = prof.id_profesor WHERE a.id_profesor IS NULL";
		//sSQL = "SELECT p.nombre, p.apellido1, p.apellido2 FROM persona AS p WHERE "
		//		+ "p.tipo = \"alumno\" ORDER BY p.apellido1, p.apellido2, p.nombre";
		
		try {
			
			Statement sentencia = conexion.createStatement();
			ResultSet resultado = sentencia.executeQuery(sSQL);
			while(resultado.next()) {
				System.out.println(resultado.getString(1) + " " + resultado.getString(2) + " " + resultado.getString(3) 
					+ " " + resultado.getString(4) + " " + resultado.getString(5));
			}
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
