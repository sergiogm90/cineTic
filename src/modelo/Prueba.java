package modelo;

public class Prueba {

	int idpelicula;
	String imagen;
	String titulo;
	int cantidad;
	double precio;
	
	public Prueba() {
		super();
	}
		
	public Prueba(int idpelicula, String imagen, String titulo, int cantidad, double precio) {
		super();
		this.idpelicula = idpelicula;
		this.imagen = imagen;
		this.titulo = titulo;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public int getIdpelicula() {
		return idpelicula;
	}

	public void setIdpelicula(int idpelicula) {
		this.idpelicula = idpelicula;
	}

	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Prueba [idpelicula=" + idpelicula + ", imagen=" + imagen + ", titulo=" + titulo + ", cantidad="
				+ cantidad + ", precio=" + precio + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cantidad;
		result = prime * result + idpelicula;
		result = prime * result + ((imagen == null) ? 0 : imagen.hashCode());
		long temp;
		temp = Double.doubleToLongBits(precio);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Prueba other = (Prueba) obj;
		if (cantidad != other.cantidad)
			return false;
		if (idpelicula != other.idpelicula)
			return false;
		if (imagen == null) {
			if (other.imagen != null)
				return false;
		} else if (!imagen.equals(other.imagen))
			return false;
		if (Double.doubleToLongBits(precio) != Double.doubleToLongBits(other.precio))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
	
	
	
}
