package estudiar.SimulacroExamenAltaUsuario.Controladores;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import estudiar.SimulacroExamenAltaUsuario.Entidades.Acuerdo;
import estudiar.SimulacroExamenAltaUsuario.Entidades.Idioma;


public class ControladorAcuerdo {
	public static List<Acuerdo> findAll() {
		List<Acuerdo> lista = new ArrayList<Acuerdo>();
		
		try {
			Connection conn = ConnectionManager.getConexion();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from acuerdo");
			
			while (rs.next()) {
				Acuerdo a = new Acuerdo();
				a.setId(rs.getInt("id"));
				a.setDescripcion(rs.getString("descripcion"));
				a.setIdIdioma(rs.getInt("idPais"));
				lista.add(a);
			}
			
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return lista;
	}
	
	public static Acuerdo obtenerAcuerdo(Idioma i) {
		Acuerdo a = new Acuerdo();
		Connection conn;
		try {
			conn = ConnectionManager.getConexion();
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery("select * from acuerdo where idIdioma = " + i.getId());
			if(rs.next()) {
				a.setDescripcion(rs.getString("descripcion"));
				a.setId(rs.getInt("id"));
				a.setIdIdioma(rs.getInt("idIdioma"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}
}
