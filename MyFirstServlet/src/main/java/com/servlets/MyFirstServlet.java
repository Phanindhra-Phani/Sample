package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyFirstServlet extends HttpServlet {
	
	 protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		        throws ServletException, IOException
		    {
		 Cookie[] ck = req.getCookies();
	 		
		 if(null!=ck){
	 			for (Cookie cookie : ck) {
					System.out.println("<br>"+cookie.getName()+" "+cookie.getValue());
				}
	 		}else{
	 			PrintWriter wrt = resp.getWriter();
	 			wrt.println("No Cookies");
	 		}
		 		
		 
//		 		ServletConfig cfg = getServletConfig();
//		 		
//		 		System.out.println("Second Servlet Param:  "+cfg.getInitParameter("Config Name"));
//		 		
//		 		req.setAttribute("Myname", "Sravan");
		 		
//		 		Cookie cookie = new Cookie("name", "Sravan");
		 
//		 		ServletContext scx = getServletContext();
//		 		scx.setAttribute("SessionName", "Servlets");
//		 		
//		 		MyFirstServletBusiness my = new MyFirstServletBusiness();
//		 		my.getRequest(req);
//		 		
//		 		resp.setContentType("text/html");
//		 		PrintWriter wrt = resp.getWriter();
//		 		
//		 		wrt.println("<html><body>");
//		 		wrt.println("<h1>This is my first Servlet Web Application test</h1>");
//		 		wrt.println("</body></html>");
		 		
//		 		Cookie[] ck = req.getCookies();
//		 		
//		 		if(null!=ck){
//		 			for (Cookie cookie : ck) {
//						System.out.println("<br>"+cookie.getName()+" "+cookie.getValue());
//					}
//		 		}else{
//		 			PrintWriter wrt = resp.getWriter();
//		 			wrt.println("No Cookies");
//		 		}
//		 		
		 		
		 	
		 
		    }
	 
	 protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		        throws ServletException, IOException
		    {
		 		
//		 		ServletContext scx = getServletContext();
//		 		String sessionName = (String) scx.getAttribute("SessionName");
//		 		System.out.println("Session Name : "+sessionName);
//		 
//		 		System.out.println("Login Name:   "+ req.getParameter("uname"));
		 
		 		HttpSession session = req.getSession();
		 		session.setAttribute("myName", "Sravan"); 
		 		session.getAttribute("myName");
		 		session.getId();
		 		session.getCreationTime();
		 		session.getLastAccessedTime();
		 		session.invalidate();//Kill the session
		 
		 		Cookie ck = new Cookie("uname", session.getId());
				resp.addCookie(ck);
	
		 		resp.setContentType("text/html");
		 		PrintWriter wrt = resp.getWriter();
//		 		
		 		wrt.println("<html><body>");
		 		wrt.println("<h1>Successfully Logged in</h1>");
		 		wrt.println("</body></html>");
		 	
		 		
		 		
//		 		resp.setContentType("text/html");
//				PrintWriter out = resp.getWriter();
//				
//				String name = req.getParameter("uname");
//				out.println("Hi "+ name+"!!!");
//				
//				Cookie ck = new Cookie("uname", name);
//				resp.addCookie(ck);
//				
//				 //creating submit button  
//			    out.print("<form action='/MyFirstServlet/mysecondservlet'>");  
//			    out.print("<input type='submit' value='go'>");  
//			    out.print("</form>");  
//			          
//			    out.close();  
		 
		    }
	 

}
