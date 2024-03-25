package com.sathya.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public LoginServlet() {
            }

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//step-1: Read the form data
			String username=request.getParameter("username");
			String password=request.getParameter("password");
		//step-2 : process the data
			String status;
			if(username.equals("sathya")&&password.equals("Sathya@123"))
			{
				status="Login is Successfull...";
			}
			else
			{
				status="Login is Fail...";
			}
		//step-3 : render the response to client
			PrintWriter writer = response.getWriter();
			response.setContentType("text/html");
			writer.println("<html>");
			writer.println("<h1>Login Status....</h1>"+status);
			writer.println("</html>");
			
			
	}

}
