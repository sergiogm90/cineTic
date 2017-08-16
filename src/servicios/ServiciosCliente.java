package servicios;

import java.util.List;

import datos.GestorCliente;
import datos.IGestorCliente;
import modelo.Cliente;

public class ServiciosCliente implements IServiciosCliente {
	
	private IGestorCliente gcl = new GestorCliente();

	public void addCliente(Cliente c) {
		gcl.addCliente(c);
	}

	public Cliente encontrarCliente(String usuario) {
		return gcl.encontrarCliente(usuario);
	}

	
	public boolean loginCliente(String usuario, String password) {
		return gcl.loginCliente(usuario, password);
	}

	public List<Cliente>  listarCliente() {
		return gcl.listarCliente();
	}
	
/*	public void eliminarCliente(int idCliente) {
		gcl.eliminarCliente(idCliente);
	}*/

	//public boolean existeCliente(Cliente c) {
		//return datos.existeCliente(c);
	//}

	//public void modificarCliente(Cliente c) {
		//datos.modificarCliente(c);
	//}

	/*public void listarCliente() {
		gcl.listarCliente();
	}*/
}
