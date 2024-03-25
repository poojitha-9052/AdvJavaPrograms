package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ThirdServlet")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get the requested form data
		Cookie[] cookies=request.getCookies();		
		
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<pre style='color:red'>");
		writer.println("User Name:.."+cookies[0].getValue());
		writer.println("User Age:.."+cookies[1].getValue());
		writer.println("Qalification:.."+cookies[2].getValue());
		writer.println("Designation:.."+cookies[3].getValue());
		writer.println("Email:.."+request.getParameter("email"));
		writer.println("Mobile:.."+request.getParameter("mobile"));
		writer.println("</pre>");
		writer.println("</body>");
		writer.println("</html>");
		
	}

}
