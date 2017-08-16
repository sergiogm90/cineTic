package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Pelicula;
import servicios.ServiciosPelicula;

/**
 * Servlet implementation class InsertaPeliculas
 */
@WebServlet("/insertar")
public class ServletInsertaPeliculas extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServiciosPelicula obj= new ServiciosPelicula();
		String titulo=request.getParameter("titulo");
		String director=request.getParameter("director");
		String genero=request.getParameter("genero");
		String descripcion=request.getParameter("descripcion");
		String duracion=request.getParameter("duracion");
		String year=request.getParameter("year");
		double precio=Double.parseDouble(request.getParameter("precio"));
		String imagen=request.getParameter("imagen");
		Pelicula pelicula= new Pelicula(titulo, director, genero, descripcion, duracion, year, precio, imagen);
		obj.addPelicula(pelicula);
		request.getRequestDispatcher("listar").forward(request, response);

	}

}
