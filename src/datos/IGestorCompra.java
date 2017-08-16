package datos;

import modelo.Compra;

public interface IGestorCompra {
	
	public void addCompra(Compra c);
	
	public void eliminarCompra(int idCompra);
	
	//public void modificarCompra(Compra c);
	
	public Compra encontrarCompra(int idCompra);
	
	public void listarCompra();
}
