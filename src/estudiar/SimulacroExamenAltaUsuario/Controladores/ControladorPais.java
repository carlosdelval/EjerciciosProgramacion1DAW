package estudiar.SimulacroExamenAltaUsuario.Controladores;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import estudiar.SimulacroExamenAltaUsuario.Entidades.Pais;


public class ControladorPais {
	public static List<Pais> findAll() {
		List<Pais> lista = new ArrayList<Pais>();
		
		try {
			Connection conn = ConnectionManager.getConexion();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from pais");
			
			while (rs.next()) {
				Pais p = new Pais();
				p.setId(rs.getInt("id"));
				p.setDescripcion(rs.getString("descripcion"));
				lista.add(p);
			}
			
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return lista;
	}
}
