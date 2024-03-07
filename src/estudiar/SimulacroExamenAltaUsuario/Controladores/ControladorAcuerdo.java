package estudiar.SimulacroExamenAltaUsuario.Controladores;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import estudiar.SimulacroExamenAltaUsuario.Entidades.Acuerdo;


public class ControladorAcuerdo {
	public static List<Acuerdo> findAll() {
		List<Acuerdo> lista = new ArrayList<Acuerdo>();
		
		try {
			Connection conn = ConnectionManager.getConexion();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from centroeducativo");
			
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
}
