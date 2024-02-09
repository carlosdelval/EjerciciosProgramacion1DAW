package capitulo08_BBDD.tutorialJavaCoches;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import tutorialJava.Utils;

public class CRUDfabricante {

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

		return (Connection) DriverManager.getConnection("jdbc:mysql://" + host + "/" + schema + properties, user,
				password);
	}

	/**
	 * Compruebo si el id introducido existe.
	 * 
	 * @param conn
	 * @param id
	 * @throws SQLException
	 */

	public static Boolean comprobarID(Connection conn, int id) throws SQLException {
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery("select * from fabricante where id= " + id);
		if (!rs.next()) {
			System.out.println("No se ha encontrado dupla o fila con ese ID.");
			return false;
		}
		return true;
	}

	/**
	 * 
	 * @return
	 * @throws SQLException
	 */
	private static int getSiguienteIdValido(Connection conn) throws SQLException {
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery("select max(id) as maximoId " + "from tutorialjavacoches.fabricante");

		if (rs.next()) {
			return rs.getInt(1) + 1;
		}

		return 1;
	}

	/**
	 * @throws SQLException
	 * 
	 */
	private static void realizaInsert(Connection conn, String cif, String nombre) throws SQLException {

		Statement s = (Statement) conn.createStatement();

		int filasAfectadas = s.executeUpdate("insert into tutorialjavacoches.fabricante " + "(id, cif, nombre) values ("
				+ getSiguienteIdValido(conn) + ", '" + cif + "', '" + nombre + "')");

		System.out.println("Filas afectadas: " + filasAfectadas);

		s.close();
	}

	/**
	 * @throws SQLException
	 * 
	 */
	private static void realizaUpdate(Connection conn, String nombreMod, String cifMod, int idMod) throws SQLException {

		Statement s = (Statement) conn.createStatement();

		int filasAfectadas = s.executeUpdate("update tutorialjavacoches.fabricante " + "set nombre = '" + nombreMod
				+ "', " + "cif = '" + cifMod + "'\r\n" + "where id = " + idMod);

		if (filasAfectadas > 0)
			System.out.println("Filas afectadas: " + filasAfectadas);

		s.close();
	}

	/**
	 * @throws SQLException
	 * 
	 */
	private static void realizaDelete(Connection conn, int idMod) throws SQLException {

		Statement s = (Statement) conn.createStatement();

		int filasAfectadas = s.executeUpdate("Delete from " + "tutorialjavacoches.fabricante " + "where id = " + idMod);

		if (filasAfectadas > 0) System.out.println("Filas afectadas: " + filasAfectadas);

		s.close();
	}

	public static void listaTabla() {
		try {
			// A través de la siguiente línea comprobamos si tenemos acceso al driver MySQL,
			// si no fuera así
			// no podemos trabajar con esa BBDD.
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Necesitamos obtener un acceso a la BBDD, eso se materializa en un objeto de
			// tipo Connection, al cual
			// le tenemos que pasar los parámetros de conexión.
			Connection conexion = (Connection) DriverManager
					.getConnection("jdbc:mysql://localhost:3310/tutorialjavacoches?serverTimezone=UTC", "root", "1234");

			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo
			// Statement
			Statement s = (Statement) conexion.createStatement();

			// La ejecución de la consulta se realiza a través del objeto Statement y se
			// recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros
			// obtenidos por la consulta
			ResultSet rs = s.executeQuery("select * from fabricante");

			// Navegación del objeto ResultSet
			while (rs.next()) {
				System.out.println(rs.getInt("id") + " " + rs.getString(2) + " " + rs.getString(3));
			}
			// Cierre de los elementos
			rs.close();
			s.close();
			conexion.close();
		} catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		} catch (SQLException ex) {
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

	public static void fabricante() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection conn = getConexion();
		Scanner sc = new Scanner(System.in);
		int opcion = 5;

		do {
			System.out.println();
			opcion = Utils.obtenerEnteroConDescripcion("Ingrese la acción a realizar: " + "\n0. Volver atrás."
					+ "\n1. Listar todos los registros de la tabla." + "\n2. Crear un nuevo Fabricante."
					+ "\n3. Modificar un Fabricante." + "\n4. Eliminar un Fabricante.");

			if (opcion == 1) {
				listaTabla();
				System.out.println();
			}
			if (opcion == 2) {
				String nombre = Utils.obtenerCadenaConDescripcion("Introduzca el nombre: ");
				String cif = Utils.obtenerCadenaConDescripcion("Introduzca el cif: ");
				realizaInsert(conn, cif, nombre);
			}
			if (opcion == 3) {
				int newId = Utils.obtenerEnteroConDescripcion("Introduzca el id a modificar: ");
				comprobarID(conn, newId);
				if (comprobarID(conn, newId)) {
					String nombre = Utils.obtenerCadenaConDescripcion("Introduzca el nuevo nombre: ");
					String cif = Utils.obtenerCadenaConDescripcion("Introduzca el nuevo cif: ");
					realizaUpdate(conn, nombre, cif, newId);
				}
			}
			if (opcion == 4) {
				int newId = Utils.obtenerEnteroConDescripcion("Introduzca el id del elemento a borrar: ");
				comprobarID(conn, newId);
				if(comprobarID(conn,newId)) realizaDelete(conn, newId);
			}
		} while (opcion != 0);
	}
}
