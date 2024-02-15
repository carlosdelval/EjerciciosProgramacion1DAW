package capitulo08_BBDD.tutorialJavaCoches;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class GestionFabricante extends SupertipoGestion {

	public static Fabricante getPrimero(Connection conn) throws SQLException {
		return (getFabricante(conn, "select * from tutorialjavacoches.fabricante order by id asc limit 1"));
	}
	
	public static Fabricante getUltimo(Connection conn) throws SQLException {
		return getFabricante(conn, "select * from tutorialjavacoches.fabricante order by id desc limit 1");
	}
	
	public static Fabricante getAnterior(Connection conn, int id) throws SQLException {
		if(id != 1) {
			return getFabricante(conn, "select * from tutorialjavacoches.fabricante where id = " + (id - 1));
		}
		return null;
	}
	
	public static Fabricante getSiguiente(Connection conn, int id) throws SQLException {
		return getFabricante(conn, "select * from tutorialjavacoches.fabricante where id = " + (id + 1));
	}
	
	public static void deleteFabricante(Connection conn, int id) {
		try {
			PreparedStatement ps=conn.prepareStatement("delete from tutorialjavacoches.fabricante where id = " + id);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void insertFabricante(Connection conn, Fabricante f) {
		try {
			PreparedStatement ps=conn.prepareStatement("insert into tutorialjavacoches.fabricante " + "(id, cif, nombre) values (" + getSiguienteIdValido(conn) +
				 ", '" + f.getCif() + "', '" + f.getNombre() + "')");
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void updateFabricante(Connection conn, Fabricante f) {
		try {
			PreparedStatement ps=conn.prepareStatement("update tutorialjavacoches.fabricante set cif = '" + f.getCif() + "', nombre = '"
					+ f.getNombre() + "' where id=" + f.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static Fabricante getFabricante(Connection conn, String sql) throws SQLException {
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		Fabricante f = null;
		if(rs.next()) {
			f = new Fabricante();
			f.setId(rs.getInt("id"));
			f.setCif(rs.getString("cif"));
			f.setNombre(rs.getString("nombre"));
		}
		
		return f;
	}
	
	private static int getSiguienteIdValido(Connection conn) throws SQLException {
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery("select max(id) as maximoId " + "from tutorialjavacoches.fabricante");

		if (rs.next()) {
			return rs.getInt(1) + 1;
		}

		return 1;
	}
	
	

}
