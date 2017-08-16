package servicios;

import java.util.List;

import datos.GestorPelicula;
import datos.IGestorPelicula;

import modelo.Pelicula;

public class ServiciosPelicula implements IServiciosPelicula {

	private IGestorPelicula gestorPelicula = new GestorPelicula();

	public void addPelicula(Pelicula pelicula) {
		gestorPelicula.addPelicula(pelicula);
	}

	public void eliminarPelicula(int idpelicula) {
		gestorPelicula.eliminarPelicula(idpelicula);
	}
	public Pelicula buscarPelicula(int id) {
		return gestorPelicula.buscarPelicula(id);
	}
	public List<Pelicula> busquedaPelicula(String busqueda) {
		return gestorPelicula.busquedaPelicula(busqueda);
	}
	
	public  List<Pelicula>  listarPeliculas() {
		return gestorPelicula.listarPeliculas();
	}

	public List<Pelicula> listarPeliculasAccion() {
		return gestorPelicula.listarPeliculasAccion();
	}

	public List<Pelicula> listarPeliculasAnimacion() {
		return gestorPelicula.listarPeliculasAnimacion();
	}

	public List<Pelicula> listarPeliculasCienciaFiccion() {
		return gestorPelicula.listarPeliculasCienciaFiccion();
	}

	public List<Pelicula> listarPeliculasComedia() {
		return gestorPelicula.listarPeliculasComedia();
	}

	public List<Pelicula> listarPeliculasTerror() {
		return gestorPelicula.listarPeliculasTerror();
	}
}
