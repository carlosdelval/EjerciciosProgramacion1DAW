package capitulo09.Ejercicios.controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import capitulo08_BBDD.tutorialJavaCoches.ConnectionManager;
import capitulo09.Ejercicios.entidades.Curso;
import capitulo09.Ejercicios.entidades.Materia;


public class ControladorCurso {
	
	private static String nombreTabla = "centroeducativo.curso";

	public static Curso getPrimero() {
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

	
	public static Curso getUltimo() {
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

	
	public static Curso getAnterior(int idActual) {
		try {
			String sql = "select * from " + nombreTabla + " where id < " + idActual
					+ " order by id desc limit 1";
			return getEntidad (ConnectionManager.getConexion(), sql);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	
	public static Curso getSiguiente(int idActual) {
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

	
	private static Curso getEntidad(Connection conn, String sql) throws SQLException {
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery(sql);
		
		Curso o = null;
		if (rs.next()) {
			o = new Curso();
			o.setId(rs.getInt("id"));
			o.setDescripcion(rs.getString("descripcion"));
		}
		return o;
	}
	
	public static void updateCurso(Curso nueva) {
		try {
			String sql = "update " + nombreTabla + " set descripcion = ? where id = ?";
			PreparedStatement ps = ConnectionManager.getConexion().prepareStatement(sql);
			ps.setString(1, nueva.getDescripcion());
			ps.setInt(2, nueva.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void insertCurso(Curso nueva) {
		try {
			String sql = "insert into " + nombreTabla + " (descripcion, id) values (?,?)";
			PreparedStatement ps = ConnectionManager.getConexion().prepareStatement(sql);
			ps.setString(1, nueva.getDescripcion());
			ps.setInt(2, getSiguienteIdValido(ConnectionManager.getConexion()));
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void deleteCurso(int id) {
		try {
			String sql = "delete from " + nombreTabla + " where id = " + id;
			PreparedStatement ps = ConnectionManager.getConexion().prepareStatement(sql);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static List<Curso> getTodos() {
		List<Curso> l = new ArrayList<Curso>();
		
		try {
			ResultSet rs = ConnectionManager.getConexion().createStatement().executeQuery("Select * from " + nombreTabla);
			while (rs.next()) {
				Curso o = getEntidadFromResultSet(rs);
				l.add(o);
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return l;		
	}
	
	
	private static Curso getEntidadFromResultSet (ResultSet rs) throws SQLException {
		Curso o = new Curso();
		o.setDescripcion(rs.getString("descripcion"));
		return o;
	}
	
	private static int getSiguienteIdValido(Connection conn) throws SQLException {
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery("select max(id) as maximoId " + "from centroeducativo.curso");

		if (rs.next()) {
			return rs.getInt(1) + 1;
		}

		return 1;
	}
}
