package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Cliente;
import servicios.ServiciosCliente;


@WebServlet("/insertarCliente")
public class ServletInsertaCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
	
		ServiciosCliente obj = new ServiciosCliente();

		String dni = request.getParameter("dni");
		String nombre = request.getParameter("nombre");
		String apellidos = request.getParameter("apellidos");
		String direccion = request.getParameter("direccion");
		String telefono = request.getParameter("telefono");
		String email = request.getParameter("email");
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");
		String cp = request.getParameter("codigoPostal");

		Cliente cliente = new Cliente(usuario, password, dni, nombre, apellidos, direccion, cp, telefono, email);
		obj.addCliente(cliente);
		
		request.getRequestDispatcher("loginCliente.jsp").forward(request, response);
	}

}
