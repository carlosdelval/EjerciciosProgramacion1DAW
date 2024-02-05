package capitulo08_BBDD.tutorialJavaCoches;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import tutorialJava.Utils;

public class CRUD {
	
	/**
	 * 
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	private static Connection getConexion() throws ClassNotFoundException, SQLException {
		String driver = JDBCPropiedades.getProperty("JDBC_DRIVER_CLASS");
		String user = JDBCPropiedades.getProperty("JDBC_USER");
		String password = JDBCPropiedades.getProperty("JDBC_PASSWORD");
		String host = JDBCPropiedades.getProperty("JDBC_HOST");
		String schema = JDBCPropiedades.getProperty("JDBC_SCHEMA_NAME");
		String properties = JDBCPropiedades.getProperty("JDBC_PROPERTIES");

		Class.forName(driver);

		return (Connection) DriverManager.getConnection ("jdbc:mysql://" + host + "/" + schema + properties, user, password);
	}
	
	
	
	/**
	 * 
	 * @return
	 * @throws SQLException 
	 */
	private static int getSiguienteIdValidoFabricante(Connection conn) throws SQLException {
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery("select max(id) as maximoId "
				+ "from tutorialjavacoches.fabricante");
	
		if (rs.next()) {
			return rs.getInt(1) + 1;
		}
		
		return 1;
	}
	
	
	
	/**
	 * @throws SQLException 
	 * 
	 */
	private static void realizaInsert (Connection conn, String cif, String nombre) throws SQLException {
				
		Statement s = (Statement) conn.createStatement(); 

		int filasAfectadas = s.executeUpdate("insert into tutorialjavacoches.concesionario "
				+ "(id, cif, nombre, localidad) values ("
				+ getSiguienteIdValidoFabricante(conn) 
				+ ", '" + cif + "', '" + nombre + "')");
	   
		System.out.println("Filas afectadas: " + filasAfectadas);
		
		s.close();
	}
	

	/**
	 * @throws SQLException 
	 * 
	 */
	private static void realizaUpdate (Connection conn, String nombreMod,
			String cifMod, int idMod) throws SQLException {
				
		Statement s = (Statement) conn.createStatement(); 

		int filasAfectadas = s.executeUpdate("update tutorialjavacoches.fabricante "
				+ "set nombre = '" + nombreMod + "', "
				+ "cif = '" + cifMod + "'\r\n"
				+ "where id = " + idMod);
	   
		System.out.println("Filas afectadas: " + filasAfectadas);
		
		s.close();
	}
	
	

	/**
	 * @throws SQLException 
	 * 
	 */
	private static void realizaDelete (Connection conn, int idMod) throws SQLException {
				
		Statement s = (Statement) conn.createStatement(); 
		
		int filasAfectadas = s.executeUpdate("Delete from "
				+ "tutorialjavacoches.fabricante "
				+ "where id = " + idMod);
	   
		System.out.println("Filas afectadas: " + filasAfectadas);
		
		s.close();
	}
	
	private static void listaTabla () {
		try {
			// A través de la siguiente línea comprobamos si tenemos acceso al driver MySQL, si no fuera así
			// no podemos trabajar con esa BBDD.
			Class.forName("com.mysql.cj.jdbc.Driver");
		   
			// Necesitamos obtener un acceso a la BBDD, eso se materializa en un objeto de tipo Connection, al cual
			// le tenemos que pasar los parámetros de conexión.
			Connection conexion = (Connection) DriverManager.getConnection (
					"jdbc:mysql://localhost:3310/tutorialjavacoches?serverTimezone=UTC",
					"root", "1234");
		   
			
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) conexion.createStatement(); 
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery ("select * from coche");
		   
			// Navegación del objeto ResultSet
			while (rs.next()) { 
				System.out.println (rs.getInt("id") + " " + rs.getString (2)+ 
						" " + rs.getString(3) + " " + rs.getString(4) + 
						" " + rs.getString(5)); 
			}
			// Cierre de los elementos
			rs.close();
			s.close();
			conexion.close();
		}
		catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	

	/**
	 * 
	 * @param args
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		Connection conn = getConexion();
		Scanner sc = new Scanner(System.in);
		int opcion = 5;

		while (opcion != 0) {
			System.out.println("Pulse una tecla para empezar..");
			sc.nextLine();
			opcion = Utils.obtenerEnteroConDescripcion("Ingrese la acción a realizar: " + "\n0. Abandonar el programa."
					+ "\n1. Listar todos los registros de la tabla." + "\n2. Crear un nuevo Fabricante."
					+ "\n3. Modificar un Fabricante."
					+ "\n4. Eliminar un Fabricante.");

			if (opcion == 1) {
				listaTabla();
			}
			if (opcion == 2) {
				realizaInsert(conn, Utils.obtenerCadenaConDescripcion("Introduzca el cif: "), Utils.obtenerCadenaConDescripcion("Introduzca el nombre: "));
			}
			if (opcion == 3) {
				realizaUpdate(conn, Utils.obtenerCadenaConDescripcion("Introduzca el nuevo nombre: "), Utils.obtenerCadenaConDescripcion("Introduzca el nuevo cif: "), Utils.obtenerEnteroConDescripcion("Introduzca el id a modificar: "));
			}
			if (opcion == 4) {
				realizaDelete(conn, Utils.obtenerEnteroConDescripcion("Introduzca el id del elemento a borrar: "));
			}
		}
	}
}
