package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MySecondServlet
 */
public class MySecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MySecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
//		ServletContext scx = getServletContext();
//		String type = scx.getInitParameter("Context Name");
//		
//		response.setContentType("text/html");
// 		PrintWriter wrt = response.getWriter();
// 		
// 		wrt.println("<html><body>");
// 		wrt.println("<h1>Hi!!! "+type+"</h1>");
// 		wrt.println("</body></html>");
		
		Cookie[] ck = request.getCookies();
		response.setContentType("text/html");
		PrintWriter wrt = response.getWriter();
 		
 		if(null!=ck){
 			for (Cookie cookie : ck) {
 				wrt.println("Het buddy! "+cookie.getName()+" "+cookie.getValue());
			}
 		}else{
 			wrt.println("No Cookies");
 		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
