package capitulo08_BBDD.tutorialJavaCoches;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDcliente {
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
	
	private static void realizaInsert(Connection conn, String cif, String nombre, String apellidos, String localidad, String dniNie, String fechaNac, int activo) throws SQLException {

		Statement s = (Statement) conn.createStatement();

		int filasAfectadas = s.executeUpdate("insert into tutorialjavacoches.cliente " + "(id, cif, nombre, apellidos, localidad, dniNie, fechaNac, activo) values ("
				+ getSiguienteIdValido(conn) + ", '" + cif + "', '" + nombre + "', '" + apellidos + "', '" + localidad + "','" + dniNie + "', '" + fechaNac + "', '" + activo + "')");

		System.out.println("Filas afectadas: " + filasAfectadas);

		s.close();
	}
	
	private static void realizaUpdate(Connection conn, String nombreMod, String apellidosMod, String cifMod, int idMod, String localidadMod, String dniMod, String fechaNacMod, int activoMod) throws SQLException {

		Statement s = (Statement) conn.createStatement();

		int filasAfectadas = s.executeUpdate("update tutorialjavacoches.cliente " + "set nombre = '" + nombreMod
				+ "', " + "apellidos= '" + apellidosMod + "', " + "localidad = '" + localidadMod + "', " + "dni= '" + dniMod + "', " + "fechaNac= '" + fechaNacMod + "',  " + "cif = '" + cifMod + "', " + "activo= '" + activoMod + "'\r\n" + "where id = " + idMod);

		if (filasAfectadas > 0)
			System.out.println("Filas afectadas: " + filasAfectadas);
		else
			System.out.println("No se ha encontrado dupla o fila con ese ID.");

		s.close();
	}
}
