package com.business;

import javax.servlet.http.HttpServletRequest;

public class MyFirstServletBusiness {
	
	public void getRequest(HttpServletRequest request){
		
		System.out.println("My Name is :: "+request.getAttribute("Myname"));
		
	}

}
