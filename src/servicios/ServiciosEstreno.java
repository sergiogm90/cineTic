package servicios;

import java.util.List;

import datos.GestorEstreno;
import datos.IGestorEstreno;
import modelo.Estreno;


public class ServiciosEstreno implements IServiciosEstreno {

	private IGestorEstreno gestorEstreno = new GestorEstreno();

	
	public  List<Estreno>  listarEstrenos() {
		return gestorEstreno.listarEstrenos();
	}

}
