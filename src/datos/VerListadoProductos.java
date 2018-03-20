package datos;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = { "/VerListado" })
public class VerListadoProductos extends HttpServlet {

	
	@SuppressWarnings("unchecked")
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession sesion = request.getSession();
		
		List<Producto> juegos;
		String pagina="";
		
		if( request.getParameter("pagina")!= null){
			pagina = request.getParameter("pagina");
		}

	
		
		if(pagina.equals("")){
			 juegos = ListadoDao.recuperarElementoListado();			
		}else{
			juegos = ListadoDao.recuperarElementoListado(6);			
		}
		
		
		sesion.setAttribute("listadoJuegos", juegos);
		
		request.setAttribute("tituloPagina", "Todos nuestros productos");
		
		RequestDispatcher view = request.getRequestDispatcher("listado.jsp");
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
