package datos;

import modelo.Administrador;

public interface IGestorAdministrador {
	
	public void addAdministrador(Administrador administrador);

	public void eliminarAdministrador(int idadministrador);

	public boolean comprobarAdministrador(String usuario,String password);
		
}
