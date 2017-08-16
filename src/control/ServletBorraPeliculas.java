package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servicios.ServiciosPelicula;

@WebServlet("/borrar")
public class ServletBorraPeliculas extends HttpServlet {

	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServiciosPelicula obj = new ServiciosPelicula();
		int id = Integer.parseInt(request.getParameter("id"));
		obj.eliminarPelicula(id);
		request.getRequestDispatcher("listarPeliculas").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
