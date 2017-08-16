package servicios;

import java.util.List;

import modelo.Detalle;
import modelo.Prueba;

public interface IServiciosDetalle {
	
	public void addDetalle(int idpelicula, int idcliente);
	
	public void reducirDetalle(int idpelicula, int idcliente);
	
	public void vaciarCarrito(int idcliente);
	
	public void eliminarDetalle(int idDetalle);
	
	public Detalle encontrarDetalleCliente(int idcliente, int idpelicula);
	
	public Detalle encontrarDetalle(int idDetalle);
	
	public List<Detalle> listarDetalle(int idCliente);
	
	public List<Prueba> listarCarrito(int idCliente);
	
	public void listarDetalle();
	

}
