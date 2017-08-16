package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/recibir")
public class ServletContacto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombre = request.getParameter("nombre");
		String telefono = request.getParameter("telefono");
		String email = request.getParameter("email");
		String asunto = request.getParameter("asunto");
		request.setAttribute("nombre", nombre);
		request.setAttribute("email", email);
		request.setAttribute("telefono", telefono);
		request.setAttribute("asunto", asunto);
		request.getRequestDispatcher("recibido.jsp").forward(request, response);
	}

}
