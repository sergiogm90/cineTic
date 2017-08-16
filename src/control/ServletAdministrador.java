package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import servicios.ServiciosAdministrador;



@WebServlet("/comprobar")
public class ServletAdministrador extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServiciosAdministrador obj= new ServiciosAdministrador();
		String usuario=request.getParameter("usuario");
		String password=request.getParameter("password");
		boolean result=obj.comprobarAdministrador(usuario, password);
		//CREAR SESION
		 HttpSession sesion = request.getSession();
		 
		if(result==true){
			sesion.setAttribute("logeado", true);
			request.getRequestDispatcher("listarPeliculas").forward(request, response);
		}
		else{
			sesion.setAttribute("logeado", false);
			request.getRequestDispatcher("loginAdministrador.jsp").forward(request, response);
			System.out.println("Usuario y Contraseña no valida");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
