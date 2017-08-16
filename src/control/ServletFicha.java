package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import datos.GestorPelicula;

/**
 * Servlet implementation class ServletFicha
 */
@WebServlet("/ServletFicha")
public class ServletFicha extends HttpServlet {

	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        response.setContentType("text/html;charset=UTF-8");
        
        GestorPelicula obj = new GestorPelicula();
		int id = Integer.parseInt(request.getParameter("id"));

		request.setAttribute("pelicula", obj.buscarPelicula(id));
		request.getRequestDispatcher("ficha.jsp").forward(request, response);
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
