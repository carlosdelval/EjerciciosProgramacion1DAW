package capitulo09.Ejercicios.controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import capitulo08_BBDD.tutorialJavaCoches.ConnectionManager;
import capitulo09.Ejercicios.entidades.ValoracionMateria;

public class ControladorValoracion extends SuperControlador{
	
	private static String nombreTabla = "centroeducativo.valoracionmateria";
	
	public static ValoracionMateria getPrimero() {
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

	
	public static ValoracionMateria getUltimo() {
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
	
	public static ValoracionMateria getAnterior(int idActual) {
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

	
	public static ValoracionMateria getSiguiente(int idActual) {
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
	
	public static void update(ValoracionMateria nueva) {
		try {
			String sql = "update " + nombreTabla + " set idMateria = ?, idEstudiante = ?, idProfesor = ?, valoracion = ? where id = ?";
			PreparedStatement ps = ConnectionManager.getConexion().prepareStatement(sql);
			ps.setInt(1, nueva.getIdMateria());
			ps.setInt(2, nueva.getIntEstudiante());
			ps.setInt(3, nueva.getIdProfesor());
			ps.setInt(4, nueva.getValoracion());
			ps.setInt(5, nueva.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void insert(ValoracionMateria nueva) {
		try {
			String sql = "insert into " + nombreTabla + " (idMateria,idEstudiante,idProfesor,valoracion,id) values (?,?,?,?,?)";
			PreparedStatement ps = ConnectionManager.getConexion().prepareStatement(sql);
			ps.setInt(1, nueva.getIdMateria());
			ps.setInt(2, nueva.getIntEstudiante());
			ps.setInt(3, nueva.getIdProfesor());
			ps.setInt(4, nueva.getValoracion());
			ps.setInt(5, getSiguienteIdValido(ConnectionManager.getConexion()));
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void delete(int id) {
		try {
			String sql = "delete from " + nombreTabla + " where id = " + id;
			PreparedStatement ps = ConnectionManager.getConexion().prepareStatement(sql);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static ValoracionMateria getEntidad(Connection conn, String sql) throws SQLException {
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery(sql);
		
		ValoracionMateria o = null;
		if (rs.next()) {
			o = new ValoracionMateria();
			o.setId(rs.getInt("id"));
			o.setIdMateria(rs.getInt("idMateria"));
			o.setIdProfesor(rs.getInt("idProfesor"));
			o.setIntEstudiante(rs.getInt("idEstudiante"));
			o.setValoracion(rs.getInt("valoracion"));
		}
		return o;
	}
	
	private static int getSiguienteIdValido(Connection conn) throws SQLException {
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery("select max(id) as maximoId " + "from centroeducativo.valoracionmateria");

		if (rs.next()) {
			return rs.getInt(1) + 1;
		}

		return 1;
	}
}
