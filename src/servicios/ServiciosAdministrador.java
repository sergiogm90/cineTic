package servicios;

import datos.GestorAdministrador;
import datos.IGestorAdministrador;
import modelo.Administrador;

public class ServiciosAdministrador implements IServiciosAdministrador {

	private IGestorAdministrador ga = new GestorAdministrador();

	public void addAdministrador(Administrador administrador){
		ga.addAdministrador(administrador);
	}

	public void eliminarAdministrador(int idadministrador){
		ga.eliminarAdministrador(idadministrador);
	}

	public boolean comprobarAdministrador(String usuario,String password){
		return ga.comprobarAdministrador(usuario, password);
	}

}
