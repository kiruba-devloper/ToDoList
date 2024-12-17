package ControllerModule;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String name = req.getParameter("full_name");
		String email = req.getParameter("uemail");
		//String gender = req.getParameter("email");
		String password = req.getParameter("upassword");
		
		PrintWriter out= res.getWriter();
		
		
		
		if(password.equals("12345") && name.equals("kiruba")) {

		res.sendRedirect("Home.jsp");
		}
		else {
			
			req.setAttribute("msg",("<h2 style=\"background-color:Tomato;\">Hey your password or name is incorrect do change it and try again...</h2>") );
			req.getRequestDispatcher("Login.jsp").forward(req, res);
			
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
