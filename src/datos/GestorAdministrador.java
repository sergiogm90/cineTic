package datos;

import modelo.Administrador;

public class GestorAdministrador implements IGestorAdministrador{

	
	public void addAdministrador(Administrador administrador) {
		// TODO Auto-generated method stub
		
	}


	public void eliminarAdministrador(int idadministrador) {
		// TODO Auto-generated method stub
		
	}

	
	public boolean comprobarAdministrador(String usuario, String password) {
		boolean respuesta = true;
		if(!(usuario.equalsIgnoreCase("admin")&& password.equalsIgnoreCase("1111"))){
			respuesta=false;
		}
		return respuesta;
	}

}
