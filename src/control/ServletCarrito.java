package control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import datos.GestorDetalle;
import datos.GestorPelicula;
import modelo.Cliente;
import modelo.Detalle;
import modelo.Pelicula;
import modelo.Prueba;

@WebServlet("/ServletCarrito")
public class ServletCarrito extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		HttpSession sesion = request.getSession();
		GestorDetalle objDetalle = new GestorDetalle();
		GestorPelicula objPelicula = new GestorPelicula();
		Object cliente =  sesion.getAttribute("cliente");
		int idcliente = ((Cliente) cliente).getIdcliente();
		double resultado=0;
		//int idpelicula = Integer.parseInt(request.getParameter("idpelicula"));

		// objDetalle.addDetalle(idpelicula, idcliente);
		// Pelicula pelicula = objPelicula.buscarPelicula(idpelicula);
		// List<Detalle> listaDetalles = objDetalle.listarDetalle(idcliente);

		//List<Prueba> listaCarrito = objDetalle.listarCarrito(idcliente);
		
		//System.out.println("no se si esto se muestra o no :"+listaCarrito);
		request.setAttribute("listaCarrito", objDetalle.listarCarrito(idcliente));
		for (Prueba fila : objDetalle.listarCarrito(idcliente)) {
			resultado=resultado+(fila.getCantidad())*(fila.getPrecio());
		}
		request.setAttribute("resultado", resultado);
		// request.setAttribute("listaPeliculas", obj.addDetalle(d));
		request.getRequestDispatcher("carroCompra.jsp").forward(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		processRequest(request, response);
	}

}
