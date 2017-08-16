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

@WebServlet("/ServletCompraRealizada")
public class ServletCompraRealizada extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		HttpSession sesion = request.getSession();
		GestorDetalle objDetalle = new GestorDetalle();
		GestorPelicula objPelicula = new GestorPelicula();

		Object cliente = sesion.getAttribute("cliente");
		int idcliente = ((Cliente) cliente).getIdcliente();
		
		objDetalle.vaciarCarrito(idcliente);
		
		// System.out.println(listaCarrito);
		// request.setAttribute("listaPeliculas", obj.addDetalle(d));
		request.getRequestDispatcher("compraRealizada.jsp").forward(request, response);
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
