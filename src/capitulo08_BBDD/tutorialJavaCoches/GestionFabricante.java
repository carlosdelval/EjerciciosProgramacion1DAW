package capitulo08_BBDD.tutorialJavaCoches;

import java.sql.Connection;
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
	
	
	
	
	

}
