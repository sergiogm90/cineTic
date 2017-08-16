package datos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import control.Conexion;
import modelo.Estreno;

public class GestorEstreno implements IGestorEstreno {


	public List<Estreno> listarEstrenos() {
		List<Estreno> listaEstrenos= new ArrayList<>();
		Connection con = new Conexion().getConnection();
		try (Statement stmt = con.createStatement()) {
			String query = "SELECT * FROM estreno";
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				int idestreno = rs.getInt("idestreno");
				String titulo = rs.getString("titulo");
				String director = rs.getString("director");
				String duracion = rs.getString("duracion");
				String descripcion = rs.getString("descripcion");
				String genero = rs.getString("genero");
				String year = rs.getString("year");
				String imagen = rs.getString("imagen");
				Estreno estreno = new Estreno(idestreno,titulo, director, genero, descripcion, duracion, year, imagen);
				listaEstrenos.add(estreno);
			}
		} catch (SQLException se) {
			se.printStackTrace();
		}
		return listaEstrenos;
	}
}
