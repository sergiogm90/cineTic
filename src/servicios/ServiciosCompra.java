package servicios;

import datos.GestorCompra;
import datos.IGestorCompra;
import modelo.Compra;

public class ServiciosCompra implements IServiciosCompra {
	
	private IGestorCompra gc = new GestorCompra();

	public void addCompra(Compra c) {
		gc.addCompra(c);
	}

	public void eliminarCompra(int c) {
		gc.eliminarCompra(c);
	}
	
	public Compra encontrarCompra(int idCompra) {
		return gc.encontrarCompra(idCompra);
	}
	
	public void listarCompra() {
		gc.listarCompra();
	}

}
