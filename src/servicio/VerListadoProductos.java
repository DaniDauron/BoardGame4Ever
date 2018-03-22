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
			 request.setAttribute("tituloPagina", "Todos nuestros productos");
		}else if(pagina.equals("novedades")){
			juegos = ListadoDao.recuperarListaNovedades();		
			request.setAttribute("tituloPagina", "Mira que novedades");
		}else if(pagina.equals("tablero")){
			juegos = ListadoDao.recuperarListaPorTipoTablero();
			request.setAttribute("tituloPagina", "Los juegos de tablero que te enamorarán");
		}else if(pagina.equals("dados")){
			juegos = ListadoDao.recuperarListaPorTipoDados();
			request.setAttribute("tituloPagina", "Lanzo dado y me llevo el botín");
		}else if(pagina.equals("cartas")){
			juegos = ListadoDao.recuperarListaPorTipoCartas();
			request.setAttribute("tituloPagina", "Confia en el corazón de las cartas");
		}else if(pagina.equals("parejas")){
			juegos = ListadoDao.recuperarListaPorNumeroJugadores("parejas");
			request.setAttribute("tituloPagina", "Lo mejor para las parejas");
		}else if(pagina.equals("trios")){
			juegos = ListadoDao.recuperarListaPorNumeroJugadores("trios");
			request.setAttribute("tituloPagina", "El triángulo de la discordia");
		}else if(pagina.equals("multitud")){
			juegos = ListadoDao.recuperarListaPorNumeroJugadores("multitud");
			request.setAttribute("tituloPagina", "Solo 10 minutos para tu proximo turno");
		}else if(pagina.equals("ninios")){
			juegos = ListadoDao.recuperarListaPorEdades("ninios");
			request.setAttribute("tituloPagina", "Enseña a los mas pequeños el placer de los Meeples");
		}else if(pagina.equals("adolescentes")){
			juegos = ListadoDao.recuperarListaPorEdades("adolescentes");
			request.setAttribute("tituloPagina", "Juegos para picar la curiosidad de los jovenes");
		}else if(pagina.equals("adultos")){
			juegos = ListadoDao.recuperarListaPorEdades("adultos");
			request.setAttribute("tituloPagina", "Desata toda tu ira sobre tus compañeros, son mayorcitos, lo entenderán");
		}else if(pagina.equals("ligera")){
			juegos = ListadoDao.recuperarListaPorDuracion("ligera");
			request.setAttribute("tituloPagina", "Para jugar entre birras");
		}else if(pagina.equals("media")){
			juegos = ListadoDao.recuperarListaPorDuracion("media");
			request.setAttribute("tituloPagina", "Pasando un buen rato entre piezas");
		}else if(pagina.equals("larga")){
			juegos = ListadoDao.recuperarListaPorDuracion("larga");
			request.setAttribute("tituloPagina", "Prepara el saco de dormir, y que nadie toque el tablero por la noche");
		}else if(pagina.equals("buscar")){	
			request.setAttribute("tituloPagina", "Resultados de tu busqueda:");
			juegos = ListadoDao.recuperarListaPorBusqueda(request.getParameter("busqueda"));
		}
		
		
		sesion.setAttribute("listadoJuegos", juegos);
		
		
		
		RequestDispatcher view = request.getRequestDispatcher("listado.jsp");
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
