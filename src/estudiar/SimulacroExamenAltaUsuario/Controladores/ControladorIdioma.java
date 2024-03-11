package estudiar.SimulacroExamenAltaUsuario.Controladores;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import estudiar.SimulacroExamenAltaUsuario.Entidades.Idioma;
import estudiar.SimulacroExamenAltaUsuario.Entidades.Pais;

public class ControladorIdioma {
	public static List<Idioma> findAll(Pais p) {
		List<Idioma> lista = new ArrayList<Idioma>();
		
		try {
			Connection conn = ConnectionManager.getConexion();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from  idioma where idPais = " + p.getId());
			
			while (rs.next()) {
				Idioma i = new Idioma();
				i.setId(rs.getInt("id"));
				i.setDescripcion(rs.getString("descripcion"));
				i.setIdPais(rs.getInt("idPais"));
				lista.add(i);
			}
			
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return lista;
	}
}
