package servicios;

import java.util.List;

import modelo.Cliente;

public interface IServiciosCliente {

	public void addCliente(Cliente c);

	/*public void eliminarCliente(int c);*/

	//public void modificarCliente(Cliente c);

	public Cliente encontrarCliente(String usuario);

	//public boolean existeCliente(Cliente c);
	public boolean loginCliente(String usuario,String password);
	
	public List<Cliente>  listarCliente() ;
}
