package com.sathya.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//read the client data
				String username=request.getParameter("username");	
				String userage=request.getParameter("userage");
				
				//create cookies object
				Cookie cookie1=new Cookie("username",username);
				Cookie cookie2=new Cookie("userage",userage);
				
				//add the cookies into response object
				response.addCookie(cookie1);
				response.addCookie(cookie2);
				
				//give the next form to the client
				RequestDispatcher dispatcher=request.getRequestDispatcher("Form2.html");
				dispatcher.forward(request, response);
	}

}
