package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns={"/modificarProductos"})
public class ModificarProductos extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
			protected void processRequest(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			
			@SuppressWarnings("unused")
			HttpSession sesion = request.getSession();
			
			RequestDispatcher view = request.getRequestDispatcher("modificarProductos.jsp");
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

