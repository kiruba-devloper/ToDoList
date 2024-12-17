package ControllerModule;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;


@WebServlet("/Home")
public class Home extends HttpServlet {
	ArrayList<String> list = new ArrayList<>();

	private static final long serialVersionUID = 1L;
  
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if((request.getParameter("task"))!="") {
			list.add(request.getParameter("task"));
		}
		
		String btn= request.getParameter("btn");
		StringBuffer sb= new StringBuffer();
		
		for(int i=0; i<list.size();i++){
			String s= list.get(i);
			sb.append("<li><h3>"+s+"</h3></li><input type=\"submit\" name=\""+i+"\" id=\"btn\" value=\"Delete\" >");
		}
		
		
		
			for(int i=0; i<list.size();i++) {
				String s=""+i;
				String del = request.getParameter(s);
				if(del != null) {
			if((del).equals("Delete") ) {
				//String temp=list.get(i);
				list.remove(i);
				sb.delete(0, (sb.length()));
				for(int j=0; j<list.size();j++){
					String str= list.get(j);
					sb.append("<li><h3>"+str+"</h3></li><input type=\"submit\" name=\""+j+"\" id=\"btn\" value=\"Delete\" >");
				}
			//sb.delete(temp);
			request.setAttribute("hi",s );
			request.setAttribute("list",(sb) );
			request.getRequestDispatcher("Home.jsp").forward(request, response);
			}
			}
			}
		if(btn != null) {
		if(btn.equals("Delete All") ) {
		list.removeAll(list);
		
		sb.delete(0, (sb.length()));
		//request.setAttribute("hi","working" );
		request.getRequestDispatcher("Home.jsp").forward(request, response);
		}
		}
		// for setting attribute to display o/p in html
		request.setAttribute("list",(sb) );
		
		request.getRequestDispatcher("Home.jsp").forward(request, response);
	}


}
