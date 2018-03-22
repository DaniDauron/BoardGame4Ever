package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.Usuario;
import modelo.UsuarioAdmin;
import servicio.ServicioUsuarios;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;       
  
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Usuario usuario= new UsuarioAdmin(request.getParameter("usuario"), request.getParameter("pass"));		
		boolean logeado = ServicioUsuarios.LogearUsuario(usuario);
		
		HttpSession sesion = request.getSession();		
		sesion.setAttribute("admin", usuario);
		
		
		if(logeado){
			RequestDispatcher view = request.getRequestDispatcher("gestion.jsp");
			view.forward(request, response);
		}else{
			RequestDispatcher view = request.getRequestDispatcher("zona_admin.jsp");
			view.forward(request, response);
		}		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		doGet(request, response);
	}

}
