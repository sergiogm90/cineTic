package servicios;

import modelo.Compra;

public interface IServiciosCompra {
	
	public void addCompra(Compra c);

	public void eliminarCompra(int idCompra);
	
	public Compra encontrarCompra(int idCompra);

	public void listarCompra();
}
