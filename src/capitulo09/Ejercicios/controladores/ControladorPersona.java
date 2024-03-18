package capitulo09.Ejercicios.controladores;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import capitulo08_BBDD.tutorialJavaCoches.ConnectionManager;
import capitulo09.Ejercicios.entidades.Materia;
import capitulo09.Ejercicios.entidades.Persona;

public class ControladorPersona extends SuperControlador {

	public static Persona getPrimero(String nombreTabla) {
		try {
			return getEntidad (ConnectionManager.getConexion(),
					"select * from " + nombreTabla
					+ " order by id asc limit 1");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	
	public static Persona getUltimo(String nombreTabla) {
		try {
			return getEntidad(ConnectionManager.getConexion(), 
					"select * from " + nombreTabla
					+ " order by id desc limit 1");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	public static Persona getAnterior(int idActual, String nombreTabla) {
		if(idActual != 1) {
			try {
				String sql = "select * from " + nombreTabla + " where id < " + idActual
						+ " order by id desc limit 1";
				return getEntidad (ConnectionManager.getConexion(), sql);
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		return null;
	}

	
	public static Persona getSiguiente(int idActual, String nombreTabla) {
		try {
			return getEntidad (ConnectionManager.getConexion(),
					"select * from " + nombreTabla + " where id > " + idActual
					+ " order by id asc limit 1");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	public static void update(Persona nueva, String nombreTabla) {
		try {
			String sql = "update " + nombreTabla + " set nombre = ?, apellido1 = ?, apellido2 = ?, direccion = ?, email = ?, telefono = ?, dni = ?, idTipologiaSexo = ?, imagen = ?"
					+ ", colorPreferido = ? where id = ?";
			PreparedStatement ps = ConnectionManager.getConexion().prepareStatement(sql);
			ps.setString(1, nueva.getNombre());
			ps.setString(2, nueva.getApellido1());
			ps.setString(3, nueva.getApellido2());
			ps.setString(4, nueva.getDireccion());
			ps.setString(5, nueva.getEmail());
			ps.setString(6, nueva.getTelefono());
			ps.setString(7, nueva.getDni());
			ps.setInt(8, nueva.getidSexo()+1);
			ps.setBytes(9, nueva.getImagen());
			ps.setString(10, "#"+Integer.toHexString(nueva.getColor().getRGB()).substring(2));
			ps.setInt(11, nueva.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void insert(Persona nueva, String nombreTabla) {
		try {
			String sql = "insert into " + nombreTabla + " (nombre,apellido1,apellido2,direccion,email,telefono,dni,idTipologiaSexo, colorPreferido, imagen,id) "
					+ "values (?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = ConnectionManager.getConexion().prepareStatement(sql);
			ps.setString(1, nueva.getNombre());
			ps.setString(2, nueva.getApellido1());
			ps.setString(3, nueva.getApellido2());
			ps.setString(4, nueva.getDireccion());
			ps.setString(5, nueva.getEmail());
			ps.setString(6, nueva.getTelefono());
			ps.setString(7, nueva.getDni());
			ps.setInt(8, nueva.getidSexo()+1);
			ps.setString(9, "#"+Integer.toHexString(nueva.getColor().getRGB()).substring(2));
			ps.setBytes(10, nueva.getImagen());
			ps.setInt(11, getSiguienteIdValido(ConnectionManager.getConexion(), nombreTabla));
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void delete(int id, String nombreTabla) {
		try {
			String sql = "delete from " + nombreTabla + " where id = " + id;
			PreparedStatement ps = ConnectionManager.getConexion().prepareStatement(sql);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static Persona getEntidad(Connection conn, String sql) throws SQLException {
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery(sql);
		
		Persona o = null;
		if (rs.next()) {
			o = new Persona();
			o.setId(rs.getInt("id"));
			o.setNombre(rs.getString("nombre"));
			o.setApellido1(rs.getString("apellido1"));
			o.setApellido2(rs.getString("apellido2"));
			o.setDni(rs.getString("dni"));
			o.setDireccion(rs.getString("direccion"));
			o.setEmail(rs.getString("email"));
			o.setTelefono(rs.getString("telefono"));
			o.setSexo(rs.getInt("idTipologiaSexo"));
			o.setColor(Color.decode(rs.getString("colorPreferido")));
			o.setImagen(rs.getBytes("imagen"));
		}
		return o;
	}
	
	private static int getSiguienteIdValido(Connection conn, String nombreTabla) throws SQLException {
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery("select max(id) as maximoId " + "from " + nombreTabla);

		if (rs.next()) {
			return rs.getInt(1) + 1;
		}

		return 1;
	}
}

