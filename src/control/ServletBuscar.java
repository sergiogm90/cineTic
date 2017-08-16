package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datos.GestorPelicula;

@WebServlet("/ServletBuscar")
public class ServletBuscar extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		GestorPelicula obj = new GestorPelicula();
		String bus= request.getParameter("busqueda");
		request.setAttribute("listaPeliculas", obj.busquedaPelicula(bus));
		request.getRequestDispatcher("peliculas.jsp").forward(request, response);
	}

}
