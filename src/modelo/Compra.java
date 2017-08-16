package modelo;

import java.util.Date;

public class Compra {

	private int idCompra;
	private Date fecha;
	private int idCliente;

	public Compra() {}

	public Compra(int idCompra, Date fecha, int idCliente) {
		this.idCompra = idCompra;
		this.fecha = fecha;
	}

	public int getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}


	@Override
	public String toString() {
		return "Compra [idCompra=" + idCompra + ", fecha=" + fecha + ", idCliente=" + idCliente + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + idCliente;
		result = prime * result + idCompra;
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
		Compra other = (Compra) obj;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (idCliente != other.idCliente)
			return false;
		if (idCompra != other.idCompra)
			return false;
		return true;
	}


}




