package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

import datos.InsertaJuego;
import modelo.Producto;
import servicio.ServicioAltaProducto;

@WebServlet(urlPatterns = { "/InsertaRegistro" })
public class ActualizarBBDD extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String pagina="";
		
		//HttpSession sesion = request.getSession();
		if(request.getParameter("accion")!=null){
			pagina=request.getParameter("accion");
		}
		
		if (pagina.equals("alta")){
			Producto p = new Producto();
		
			p= ServicioAltaProducto.rellenarProducto(request);
			InsertaJuego.insertarBBDD(p);
		}else if(pagina.equals("modificar")){
			Producto p = new Producto();
			
			p= ServicioAltaProducto.rellenarProducto(request);
			InsertaJuego.actualizarBBDD(p);
			
		}
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
		// TODO Auto-generated method stub
		return super.getServletInfo();
	}

}
