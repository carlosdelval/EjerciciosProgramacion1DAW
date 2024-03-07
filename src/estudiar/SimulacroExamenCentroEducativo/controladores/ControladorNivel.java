package estudiar.SimulacroExamenCentroEducativo.controladores;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import estudiar.SimulacroExamenCentroEducativo.ConnectionManager;
import estudiar.SimulacroExamenCentroEducativo.entidades.Nivel;

public class ControladorNivel {
	public static List<Nivel> findAllByIdCentro(int idCentro) {
		List<Nivel> lista = new ArrayList<Nivel>();
		
		try {
			Connection conn = ConnectionManager.getConexion();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from nivel where idCentro = " + idCentro);
			
			while (rs.next()) {
				Nivel c = new Nivel();
				c.setId(rs.getInt("id"));
				c.setDescripcion(rs.getString("descripcion"));
				c.setIdCentro(rs.getInt("idCentro"));
				lista.add(c);
			}
			
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return lista;
	}
}
