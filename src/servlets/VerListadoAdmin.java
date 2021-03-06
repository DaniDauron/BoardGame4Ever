package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import datos.ListadoAdminDao;
import modelo.Producto;

/**
 * Implementación de la clase Servlet para el listado de los juegos en la zona de administrador
 * 
 * @author Cristian y Olga
 *
 */

@WebServlet(urlPatterns = {"/ListadoAdmin"})
public class VerListadoAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession sesion = request.getSession();
		
		List<Producto> juegos = null;
		
		juegos = ListadoAdminDao.recuperaElmentoListadoAdmin();
		
		sesion.setAttribute("listadoAdmin", juegos);
		
		RequestDispatcher view = request.getRequestDispatcher("gestion.jsp");
		view.forward(request, response);
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		processRequest(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		processRequest(req, resp);
	}

	@Override
	public String getServletInfo() {

		return super.getServletInfo();
	}
	
}
