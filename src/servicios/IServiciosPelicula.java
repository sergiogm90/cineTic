package servicios;


import java.util.List;

import modelo.Pelicula;

public interface IServiciosPelicula {

	public void addPelicula(Pelicula pelicula);

	public void eliminarPelicula(int idpelicula);
	public Pelicula buscarPelicula(int id);
	
	public List<Pelicula> busquedaPelicula(String busqueda);

	public  List<Pelicula>  listarPeliculas();
	
	public List<Pelicula> listarPeliculasAccion();
	public List<Pelicula> listarPeliculasAnimacion();
	public List<Pelicula> listarPeliculasCienciaFiccion();
	public List<Pelicula> listarPeliculasComedia();
	public List<Pelicula> listarPeliculasTerror();

}
