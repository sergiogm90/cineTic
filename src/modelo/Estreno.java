package modelo;

public class Estreno {
	private int idestreno;
	private String titulo;
	private String director;
	private String genero;
	private String descripcion;
	private String duracion;
	private String year;
	private String imagen;

	public Estreno() {
	}

	public Estreno(String titulo, String director, String genero,
			String descripcion, String duracion, String year, String imagen) {
		super();
		this.titulo = titulo;
		this.director = director;
		this.genero = genero;
		this.descripcion = descripcion;
		this.duracion = duracion;
		this.year = year;
		this.imagen = imagen;
	}

	public Estreno(int idestreno, String titulo, String director, String genero,
			String descripcion, String duracion, String year, String imagen) {
		super();
		this.idestreno = idestreno;
		this.titulo = titulo;
		this.director = director;
		this.genero = genero;
		this.descripcion = descripcion;
		this.duracion = duracion;
		this.year = year;
		this.imagen = imagen;
	}

	public int getIdestreno() {
		return idestreno;
	}

	public void setIdestreno(int idestreno) {
		this.idestreno = idestreno;
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

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	@Override
	public String toString() {
		return "Estreno [idestreno=" + idestreno + ", titulo=" + titulo
				+ ", director=" + director + ", genero=" + genero
				+ ", descripcion=" + descripcion + ", duracion=" + duracion
				+ ", year=" + year + ", imagen=" + imagen + "]";
	}

	
}