package datos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import control.Conexion;
import modelo.Pelicula;

public class GestorPelicula implements IGestorPelicula {

	public void addPelicula(Pelicula pelicula) {

		try {
			Connection conexion = new Conexion().getConnection();
			Statement st = conexion.createStatement();
			String query = "INSERT INTO pelicula(titulo, director, genero, descripcion, duracion, year, precio,imagen) "
					+ "VALUES ('"+pelicula.getTitulo()+"','"+ pelicula.getDirector()+"','"+ pelicula.getGenero()+"','"+ pelicula.getDescripcion()+"','"+ pelicula.getDuracion()+"','"+ pelicula.getYear()+"','"+ pelicula.getPrecio()+"','"+pelicula.getImagen()+"')";
			st.executeUpdate(query);
			
			System.out.println("Datos insertados correctamente");

		} catch (SQLException se) {
			se.printStackTrace();
		}
	}

	public void eliminarPelicula(int idpelicula) {
		Connection con = new Conexion().getConnection();
		try (Statement stmt = con.createStatement()) {
			String query = "DELETE FROM pelicula WHERE idpelicula=" + idpelicula;
			if (stmt.executeUpdate(query) != 1) {
				// throw new DAOException("Error deleting employee");
			}
		} catch (SQLException se) {
			System.out.println("Error no se ha podido eliminar la pelicula");
		}
	}
	public List<Pelicula> busquedaPelicula(String busqueda) {
		List<Pelicula> listaPelicula= new ArrayList<>();
		Connection con = new Conexion().getConnection();
		try (Statement stmt = con.createStatement()) {
			String query = "SELECT * FROM pelicula WHERE titulo LIKE "+"'"+"%"+ busqueda+"%"+"'";
			
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				int idpelicula = rs.getInt("idpelicula");
				String titulo = rs.getString("titulo");
				String director = rs.getString("director");
				String duracion = rs.getString("duracion");
				String descripcion = rs.getString("descripcion");
				Double precio = rs.getDouble("precio");
				String genero = rs.getString("genero");
				String year = rs.getString("year");
				String imagen = rs.getString("imagen");
				Pelicula pelicula = new Pelicula(idpelicula, titulo, director, genero, descripcion, duracion, year, precio, imagen);
				listaPelicula.add(pelicula);
			}	
		} catch (SQLException se) {
			System.out.println("Error");
		}
		return listaPelicula;
	}

	public List<Pelicula> listarPeliculas() {
		List<Pelicula> listaPelicula= new ArrayList<>();
		Connection con = new Conexion().getConnection();
		try (Statement stmt = con.createStatement()) {
			String query = "SELECT * FROM pelicula";
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				int idpelicula = rs.getInt("idpelicula");
				String titulo = rs.getString("titulo");
				String director = rs.getString("director");
				String duracion = rs.getString("duracion");
				String descripcion = rs.getString("descripcion");
				Double precio = rs.getDouble("precio");
				String genero = rs.getString("genero");
				String year = rs.getString("year");
				String imagen = rs.getString("imagen");
				Pelicula pelicula = new Pelicula(idpelicula, titulo, director, genero, descripcion, duracion, year, precio, imagen);
				listaPelicula.add(pelicula);
			}
		} catch (SQLException se) {
			se.printStackTrace();
		}
		return listaPelicula;
	}
	
	public List<Pelicula> listarPeliculasAccion() {
		List<Pelicula> listaPelicula= new ArrayList<>();
		Connection con = new Conexion().getConnection();
		try (Statement stmt = con.createStatement()) {
			String query = "SELECT * FROM pelicula WHERE genero = 'Accion'";
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				int idpelicula = rs.getInt("idpelicula");
				String titulo = rs.getString("titulo");
				String director = rs.getString("director");
				String duracion = rs.getString("duracion");
				String descripcion = rs.getString("descripcion");
				Double precio = rs.getDouble("precio");
				String genero = rs.getString("genero");
				String year = rs.getString("year");
				String imagen = rs.getString("imagen");
				Pelicula pelicula = new Pelicula(idpelicula, titulo, director, genero, descripcion, duracion, year, precio, imagen);
				listaPelicula.add(pelicula);
			}
		} catch (SQLException se) {
			se.printStackTrace();
		}
		return listaPelicula;
	}
	
	public List<Pelicula> listarPeliculasAnimacion() {
		List<Pelicula> listaPelicula= new ArrayList<>();
		Connection con = new Conexion().getConnection();
		try (Statement stmt = con.createStatement()) {
			String query = "SELECT * FROM pelicula WHERE genero = 'Animacion'";
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				int idpelicula = rs.getInt("idpelicula");
				String titulo = rs.getString("titulo");
				String director = rs.getString("director");
				String duracion = rs.getString("duracion");
				String descripcion = rs.getString("descripcion");
				Double precio = rs.getDouble("precio");
				String genero = rs.getString("genero");
				String year = rs.getString("year");
				String imagen = rs.getString("imagen");
				Pelicula pelicula = new Pelicula(idpelicula, titulo, director, genero, descripcion, duracion, year, precio, imagen);
				listaPelicula.add(pelicula);
			}
		} catch (SQLException se) {
			se.printStackTrace();
		}
		return listaPelicula;
	}
	public List<Pelicula> listarPeliculasCienciaFiccion() {
		List<Pelicula> listaPelicula= new ArrayList<>();
		Connection con = new Conexion().getConnection();
		try (Statement stmt = con.createStatement()) {
			String query = "SELECT * FROM pelicula WHERE genero = 'Ciencia Ficcion'";
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				int idpelicula = rs.getInt("idpelicula");
				String titulo = rs.getString("titulo");
				String director = rs.getString("director");
				String duracion = rs.getString("duracion");
				String descripcion = rs.getString("descripcion");
				Double precio = rs.getDouble("precio");
				String genero = rs.getString("genero");
				String year = rs.getString("year");
				String imagen = rs.getString("imagen");
				Pelicula pelicula = new Pelicula(idpelicula, titulo, director, genero, descripcion, duracion, year, precio, imagen);
				listaPelicula.add(pelicula);
			}
		} catch (SQLException se) {
			se.printStackTrace();
		}
		return listaPelicula;
	}
	public List<Pelicula> listarPeliculasComedia() {
		List<Pelicula> listaPelicula= new ArrayList<>();
		Connection con = new Conexion().getConnection();
		try (Statement stmt = con.createStatement()) {
			String query = "SELECT * FROM pelicula WHERE genero = 'Comedia'";
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				int idpelicula = rs.getInt("idpelicula");
				String titulo = rs.getString("titulo");
				String director = rs.getString("director");
				String duracion = rs.getString("duracion");
				String descripcion = rs.getString("descripcion");
				Double precio = rs.getDouble("precio");
				String genero = rs.getString("genero");
				String year = rs.getString("year");
				String imagen = rs.getString("imagen");
				Pelicula pelicula = new Pelicula(idpelicula, titulo, director, genero, descripcion, duracion, year, precio, imagen);
				listaPelicula.add(pelicula);
			}
		} catch (SQLException se) {
			se.printStackTrace();
		}
		return listaPelicula;
	}
	public List<Pelicula> listarPeliculasTerror() {
		List<Pelicula> listaPelicula= new ArrayList<>();
		Connection con = new Conexion().getConnection();
		try (Statement stmt = con.createStatement()) {
			String query = "SELECT * FROM pelicula WHERE genero = 'Terror'";
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				int idpelicula = rs.getInt("idpelicula");
				String titulo = rs.getString("titulo");
				String director = rs.getString("director");
				String duracion = rs.getString("duracion");
				String descripcion = rs.getString("descripcion");
				Double precio = rs.getDouble("precio");
				String genero = rs.getString("genero");
				String year = rs.getString("year");
				String imagen = rs.getString("imagen");
				Pelicula pelicula = new Pelicula(idpelicula, titulo, director, genero, descripcion, duracion, year, precio, imagen);
				listaPelicula.add(pelicula);
			}
		} catch (SQLException se) {
			se.printStackTrace();
		}
		return listaPelicula;
	}

	public Pelicula buscarPelicula(int id) {
		Connection con = new Conexion().getConnection();
		Pelicula pelicula = null;
		try (Statement stmt = con.createStatement()) {
			String query = "SELECT * FROM pelicula WHERE idpelicula='" + id + "'";
			ResultSet rs = stmt.executeQuery(query);
			if (!rs.next()) {
				System.out.println("El id introducido no está asociado a ninguna pelicula.");
			}
			pelicula = new Pelicula(rs.getInt("idpelicula"), rs.getString("titulo"), rs.getString("director"), rs.getString("genero"), rs.getString("descripcion"), rs.getString("duracion"), rs.getString("year"), rs.getDouble("precio"), rs.getString("imagen"));
		} catch (SQLException se) {
			System.out.println("Error");
		}
		return pelicula;
	}
}
