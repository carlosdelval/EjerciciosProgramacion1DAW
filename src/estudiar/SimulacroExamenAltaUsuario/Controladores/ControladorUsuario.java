package estudiar.SimulacroExamenAltaUsuario.Controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import estudiar.SimulacroExamenAltaUsuario.Entidades.Acuerdo;
import estudiar.SimulacroExamenAltaUsuario.Entidades.Usuario;

public class ControladorUsuario {
	public static int update(Usuario u) {
		try {
			Connection conn = ConnectionManager.getConexion();
			PreparedStatement ps = conn.prepareStatement("insert into usuario values (?,?,?,?,?)");

			ps.setInt(1, getSiguienteIdValido());
			ps.setString(2, u.getEmail());
			ps.setString(3, u.getUsuario());
			ps.setString(4, u.getPassword());
			ps.setInt(5, u.getIdIdioma());

			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public static List<Usuario> getUsuarios() {
		List<Usuario> lista = new ArrayList<Usuario>();

		try {
			Connection conn = ConnectionManager.getConexion();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from usuario");

			while (rs.next()) {
				Usuario a = new Usuario();
				a.setId(rs.getInt("id"));
				a.setEmail(rs.getString("email"));
				a.setPassword(rs.getString("password"));
				a.setUsuario(rs.getString("usuario"));
				a.setIdIdioma(rs.getInt("idIdioma"));
				lista.add(a);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return lista;
	}

	private static int getSiguienteIdValido() throws SQLException {
		Connection conn = ConnectionManager.getConexion();
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery("select max(id) as maximoId " + "from altausuario.usuario");

		if (rs.next()) {
			return rs.getInt(1) + 1;
		}

		return 1;
	}
}
