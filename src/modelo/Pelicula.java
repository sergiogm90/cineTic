package modelo;

public class Pelicula {
	private int idpelicula;
	private String titulo;
	private String director;
	private String genero;
	private String descripcion;
	private String duracion;
	private String year;
	private double precio;
	private String imagen;

	public Pelicula() {
	}

	public Pelicula(String titulo, String director, String genero, String descripcion, String duracion, String year, double precio) {
		this.titulo = titulo;
		this.director = director;
		this.genero = genero;
		this.descripcion = descripcion;
		this.duracion = duracion;
		this.year = year;
		this.precio = precio;
	}

	public Pelicula(int idpelicula, String titulo, String director, String genero, String descripcion, String duracion, String year, double precio, String imagen) {
		this.idpelicula = idpelicula;
		this.titulo = titulo;
		this.director = director;
		this.genero = genero;
		this.descripcion = descripcion;
		this.duracion = duracion;
		this.year = year;
		this.precio = precio;
		this.imagen = imagen;
	}
	
	public Pelicula(String titulo, String director, String genero, String descripcion, String duracion, String year,
			double precio, String imagen) {
		super();
		this.titulo = titulo;
		this.director = director;
		this.genero = genero;
		this.descripcion = descripcion;
		this.duracion = duracion;
		this.year = year;
		this.precio = precio;
		this.imagen = imagen;
	}

	public int getIdpelicula() {
		return idpelicula;
	}

	public void setIdpelicula(int idpelicula) {
		this.idpelicula = idpelicula;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pelicula other = (Pelicula) obj;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pelicula [idpelicula=" + idpelicula + ", titulo=" + titulo + ", director=" + director + ", genero="
				+ genero + ", descripcion=" + descripcion + ", duracion=" + duracion + ", year=" + year + ", precio="
				+ precio + ", imagen=" + imagen + "]";
	}

}
