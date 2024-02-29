package capitulo09.Ejercicios.controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import capitulo08_BBDD.tutorialJavaCoches.ConnectionManager;
import capitulo09.Ejercicios.entidades.Materia;

public class ControladorMateria extends SuperControlador {
	private static String nombreTabla = "centroeducativo.materia";

	public static Materia getPrimero() {
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

	
	public static Materia getUltimo() {
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
	
	public static Materia getAnterior(int idActual) {
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

	
	public static Materia getSiguiente(int idActual) {
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
	
	public static void updateMateria(Materia nueva) {
		try {
			String sql = "update " + nombreTabla + " set acronimo = ?, nombre = ?, curso_id = ? where id = ?";
			PreparedStatement ps = ConnectionManager.getConexion().prepareStatement(sql);
			ps.setString(1, nueva.getAcronimo());
			ps.setString(2, nueva.getNombre());
			ps.setInt(3, nueva.getCursoId());
			ps.setInt(4, nueva.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void insertMateria(Materia nueva) {
		try {
			String sql = "insert into " + nombreTabla + " (acronimo, nombre, curso_id, id) values (?,?,?,?";
			PreparedStatement ps = ConnectionManager.getConexion().prepareStatement(sql);
			ps.setString(1, nueva.getAcronimo());
			ps.setString(2, nueva.getNombre());
			ps.setInt(3, nueva.getCursoId());
			ps.setInt(4, nueva.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void deleteMateria(int id) {
		try {
			String sql = "delete from + " + nombreTabla + " where id = " + id;
			PreparedStatement ps = ConnectionManager.getConexion().prepareStatement(sql);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static Materia getEntidad(Connection conn, String sql) throws SQLException {
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery(sql);
		
		Materia o = null;
		if (rs.next()) {
			o = new Materia();
			o.setId(rs.getInt("id"));
			o.setCursoId(rs.getInt("curso_id"));
			o.setAcronimo(rs.getString("acronimo"));
			o.setNombre(rs.getString("nombre"));
		}
		return o;
	}
}
