package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.Cliente;
import servicios.ServiciosCliente;
import datos.GestorCliente;

@WebServlet("/loginCliente")
public class ServletLoginCliente extends HttpServlet {
	
	private static final long serialVersionUID = 1L;


protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServiciosCliente obj= new ServiciosCliente();
		String usuario=request.getParameter("usuario");
		String password=request.getParameter("password");
		boolean result=obj.loginCliente(usuario, password);
		Cliente cl= new Cliente();
		cl=obj.encontrarCliente(usuario);
		
		//CREAR SESION
		 HttpSession sesion = request.getSession();
		
		if(result==true){
            sesion.setAttribute("usuario",usuario);
            sesion.setAttribute("cliente",cl);
            sesion.setAttribute("logeadoCliente", true);
			request.getRequestDispatcher("listarEstrenos").forward(request, response);
		}
		else{
			sesion.setAttribute("logeadoCliente", false);
			request.getRequestDispatcher("loginCliente.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
