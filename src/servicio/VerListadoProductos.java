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

import datos.ListadoDao;
import modelo.Producto;

@WebServlet(urlPatterns = { "/VerListado" })
public class VerListadoProductos extends HttpServlet {

	
	@SuppressWarnings("unchecked")
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession sesion = request.getSession();
		
		List<Producto> juegos = null;
		String pagina="";
		
		if( request.getParameter("tipo")!= null){
			pagina = request.getParameter("tipo");
			
		}

	
		
		if(pagina.equals("todo")){
			 juegos = ListadoDao.recuperarElementoListado();
		}else if(pagina.equals("novedades")){
			juegos = ListadoDao.recuperarListaNovedades();			
		}else if(pagina.equals("tablero")){
			juegos = ListadoDao.recuperarListaPorTipoTablero();
		}else if(pagina.equals("dados")){
			juegos = ListadoDao.recuperarListaPorTipoDados();
		}else if(pagina.equals("cartas")){
			juegos = ListadoDao.recuperarListaPorTipoCartas();
		}else if(pagina.equals("parejas")){
			juegos = ListadoDao.recuperarListaPorNumeroJugadores("parejas");
		}else if(pagina.equals("trios")){
			juegos = ListadoDao.recuperarListaPorNumeroJugadores("trios");
		}else if(pagina.equals("multitud")){
			juegos = ListadoDao.recuperarListaPorNumeroJugadores("multitud");
		}else if(pagina.equals("ninios")){
			juegos = ListadoDao.recuperarListaPorEdades("ninios");
		}else if(pagina.equals("adolescentes")){
			juegos = ListadoDao.recuperarListaPorEdades("adolescentes");
		}else if(pagina.equals("adultos")){
			juegos = ListadoDao.recuperarListaPorEdades("adultos");
		}else if(pagina.equals("ligera")){
			juegos = ListadoDao.recuperarListaPorDuracion("ligera");
		}else if(pagina.equals("media")){
			juegos = ListadoDao.recuperarListaPorDuracion("media");
		}else if(pagina.equals("larga")){
			juegos = ListadoDao.recuperarListaPorDuracion("larga");
		}else if(pagina.equals("buscar")){
			
			juegos = ListadoDao.recuperarListaPorBusqueda(request.getParameter("busqueda"));
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
