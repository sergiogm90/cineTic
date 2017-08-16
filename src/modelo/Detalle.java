package modelo;

public class Detalle {
	
	private int idDetalle;
	private int idCompra;
	private int idPelicula;
	private int cantidad;
	private int idCliente;
	
	public Detalle(){}

	public Detalle(int idCompra, int idPelicula, int cantidad, int idCliente) {
		this.idCompra = idCompra;
		this.idPelicula = idPelicula;
		this.cantidad = cantidad;
		this.idCliente = idCliente;
	}


	public Detalle(int idDetalle, int idCompra, int idPelicula,int cantidad, int idCliente){
		this.idDetalle = idDetalle;
		this.idCompra = idCompra;
		this.idPelicula = idPelicula;
		this.cantidad = cantidad;
		this.idCliente = idCliente;
	}

	public int getIdDetalle() {
		return idDetalle;
	}

	public void setIdDetalle(int idDetalle) {
		this.idDetalle = idDetalle;
	}

	public int getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}

	public int getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	
	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	@Override
	public String toString() {
		return "Detalle [idDetalle=" + idDetalle + ", idCompra=" + idCompra + ", idPelicula=" + idPelicula
				+ ", cantidad=" + cantidad + ", idCliente=" + idCliente + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cantidad;
		result = prime * result + idCliente;
		result = prime * result + idCompra;
		result = prime * result + idDetalle;
		result = prime * result + idPelicula;
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
		Detalle other = (Detalle) obj;
		if (cantidad != other.cantidad)
			return false;
		if (idCliente != other.idCliente)
			return false;
		if (idCompra != other.idCompra)
			return false;
		if (idDetalle != other.idDetalle)
			return false;
		if (idPelicula != other.idPelicula)
			return false;
		return true;
	}

}
