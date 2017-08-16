package servicios;

import modelo.Administrador;


public interface IServiciosAdministrador {

	public void addAdministrador(Administrador administrador);

	public void eliminarAdministrador(int idadministrador);

	public boolean comprobarAdministrador(String usuario,String password);
		
	}


