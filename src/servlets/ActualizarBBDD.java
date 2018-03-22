package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.Producto;

@WebServlet(urlPatterns={"/InsertaRegistro"})
public class ActualizarBBDD extends HttpServlet {

	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession sesion = request.getSession();
		
		Producto prod = new Producto();
		
		prod.setNombreProducto(request.getParameter("nombreProd"));
		//prod.setEdad(request.getParameter("edad"));
		prod.setTipo(request.getParameter("tipo"));
		//prod.setMaxJugadores(request.getParameter("maxJug"));
		//prod.setMinJugadores(request.getParameter("minJug"));
		//prod.setPrecio(request.getParameter("precio"));
		//prod.setTiempoEstimado(request.getParameter("duracion"));
		prod.setImagen(request.getParameter("urlImg"));
		prod.setDescripcion(request.getParameter("descripcion"));
			
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
