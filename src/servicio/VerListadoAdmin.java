package servicio;

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

@WebServlet(urlPatterns = {"/ListadoAdmin"})
public class VerListadoAdmin extends HttpServlet {

	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession sesion = request.getSession();
		
		List<Producto> juegos = null;
		String pagina="";
		
		
		if(request.getParameter("listadoadmin") != null){
			pagina = request.getParameter("listadoadmin");
		}
		
		
		if(pagina.equals("principal")){
			juegos = ListadoAdminDao.recuperaElmentoListadoAdmin();
			request.setAttribute("tituloPagina", "Productos disponibles en la tienda");
		}
		
		
		sesion.setAttribute("listadoAdmin", juegos);
		
		RequestDispatcher view = request.getRequestDispatcher("gestion.jsp");
		view.forward(request, response);
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(req, resp);
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return super.getServletInfo();
	}
	
}
