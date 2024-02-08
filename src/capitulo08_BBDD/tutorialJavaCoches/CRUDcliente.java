package capitulo08_BBDD.tutorialJavaCoches;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import tutorialJava.Utils;

public class CRUDcliente {

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

	private static Boolean comprobarID(Connection conn, int id) throws SQLException {
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery("select * from cliente where id= " + id);
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
		ResultSet rs = s.executeQuery("select max(id) as maximoId " + "from tutorialjavacoches.concesionario");

		if (rs.next()) {
			return rs.getInt(1) + 1;
		}

		return 1;
	}

	private static void realizaInsert(Connection conn, String nombre, String apellidos, String localidad,
			String dniNie, String fechaNac, int activo) throws SQLException {

		Statement s = (Statement) conn.createStatement();

		int filasAfectadas = s.executeUpdate("insert into tutorialjavacoches.cliente "
				+ "(id, cif, nombre, apellidos, localidad, dniNie, fechaNac, activo) values ("
				+ getSiguienteIdValido(conn) + ", '" + nombre + "', '" + apellidos + "', '" + localidad
				+ "','" + dniNie + "', '" + fechaNac + "', '" + activo + "')");

		System.out.println("Filas afectadas: " + filasAfectadas);

		s.close();
	}

	private static void realizaUpdate(Connection conn, String nombreMod, String apellidosMod, int idMod,
			String localidadMod, String dniMod, String fechaNacMod, int activoMod) throws SQLException {

		Statement s = (Statement) conn.createStatement();

		int filasAfectadas = s.executeUpdate("update tutorialjavacoches.cliente " + "set nombre = '" + nombreMod + "', "
				+ "apellidos= '" + apellidosMod + "', " + "localidad = '" + localidadMod + "', " + "dniNie= '" + dniMod
				+ "', " + "fechaNac= '" + fechaNacMod + "', " + "activo= '" + activoMod
				+ "'\r\n" + "where id = " + idMod);

		if (filasAfectadas > 0) System.out.println("Filas afectadas: " + filasAfectadas);

		s.close();
	}

	private static void realizaDelete(Connection conn, int idMod) throws SQLException {

		Statement s = (Statement) conn.createStatement();

		int filasAfectadas = s.executeUpdate("Delete from " + "tutorialjavacoches.cliente " + "where id = " + idMod);

		if (filasAfectadas > 0) System.out.println("Filas afectadas: " + filasAfectadas);

		s.close();
	}

	private static void listaTabla() {
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
			ResultSet rs = s.executeQuery("select * from cliente");

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

	public static void cliente() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection conn = getConexion();
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date fechaNac = null;
		int opcion = 5;

		do {
			System.out.println();
			opcion = Utils.obtenerEnteroConDescripcion("Ingrese la acción a realizar: " + "\n0. Volver atrás."
					+ "\n1. Listar todos los registros de la tabla." + "\n2. Crear un nuevo Cliente."
					+ "\n3. Modificar un Cliente." + "\n4. Eliminar un Cliente.");

			if (opcion == 1) {
				listaTabla();
			}
			if (opcion == 2) {
				String nombre = Utils.obtenerCadenaConDescripcion("Introduzca el nombre: ");
				String apellidos = Utils.obtenerCadenaConDescripcion("Introduzca los apellidos: ");
				String dni = Utils.obtenerCadenaConDescripcion("Introduzca el dni: ");
				String fechacliente = Utils.obtenerCadenaConDescripcion("Introduzca la fecha de nacimiento (dd/MM/yyyy HH:mm:ss): ");
				try {
					fechaNac = sdf.parse(fechacliente);
				} catch (ParseException e) {
					e.printStackTrace();
				}
				String fechanac = sdf.format(fechaNac);
				String localidad = Utils.obtenerCadenaConDescripcion("Introduzca una localidad: ");
				int activo = Utils.obtenerEnteroConDescripcion("¿Activo? 1 sí, 0 no :");
				while(activo < 0 || activo > 1) {
					activo = Utils.obtenerEnteroConDescripcion(
							"Opción incorrecta, introduzca de nuevo. ¿Activo? 1 sí, 0 no :");
				}
				realizaInsert(conn, nombre, apellidos, localidad, dni, fechanac, activo);
			}
			if (opcion == 3) {
				int newId = Utils.obtenerEnteroConDescripcion("Introduzca el id a modificar: ");
				comprobarID(conn, newId);
				if (comprobarID(conn, newId)) {
					String nombre = Utils.obtenerCadenaConDescripcion("Introduzca el nuevo nombre: ");
					String apellidos = Utils.obtenerCadenaConDescripcion("Introduzca los nuevos apellidos: ");
					String dni = Utils.obtenerCadenaConDescripcion("Introduzca el nuevo dni: ");
					String fechanac = Utils.obtenerCadenaConDescripcion("Introduzca la nueva fecha de nacimiento: ");
					String localidad = Utils.obtenerCadenaConDescripcion("Introduzca una localidad: ");
					int activo = Utils.obtenerEnteroConDescripcion("¿Activo? 1 sí, 0 no:");
					while(activo < 0 || activo > 1) {
						activo = Utils.obtenerEnteroConDescripcion(
								"Opción incorrecta, introduzca de nuevo. ¿Activo? 1 sí, 0 no :");
					}
					realizaUpdate(conn, nombre, apellidos, newId, localidad, dni, fechanac, activo);
				}
			}
			if (opcion == 4) {
				int newId = Utils.obtenerEnteroConDescripcion("Introduzca el id del elemento a borrar: ");
				comprobarID(conn, newId);
				if(comprobarID(conn, newId)) realizaDelete(conn, newId);
			}
		} while (opcion != 0);
	}
}
