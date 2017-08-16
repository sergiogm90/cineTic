package servicios;

import java.util.List;

import datos.GestorDetalle;
import datos.IGestorDetalle;
import modelo.Detalle;
import modelo.Prueba;;

public class ServiciosDetalle implements IServiciosDetalle{

	private IGestorDetalle gd = new GestorDetalle();

	public void addDetalle(int idpelicula, int idcliente) {
		gd.addDetalle(idpelicula,idcliente);
	}
	
	public void reducirDetalle(int idpelicula, int idcliente){
		gd.reducirDetalle(idpelicula, idcliente);
	}
	
	public Detalle encontrarDetalleCliente(int idcliente, int idpelicula){
		return gd.encontrarDetalleCliente(idcliente, idpelicula);
	}
	
	public Detalle encontrarDetalle(int d) {
		return gd.encontrarDetalle(d);
	}

	public void vaciarCarrito(int idcliente){
		gd.vaciarCarrito(idcliente);
	}
	public void eliminarDetalle(int idDetalle) {
		gd.eliminarDetalle(idDetalle);
	}

	public List<Detalle> listarDetalle(int idCliente){
		return gd.listarDetalle(idCliente);
	}
	public List<Prueba> listarCarrito(int idCliente){
		return gd.listarCarrito(idCliente);
	}
	public void listarDetalle() {
		gd.listarDetalle();
	}
}


