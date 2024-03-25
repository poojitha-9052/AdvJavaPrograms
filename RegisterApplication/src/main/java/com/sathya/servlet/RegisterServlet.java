package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public RegisterServlet() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// step 1:read the requested data
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		Long mobile=Long.parseLong(request.getParameter("mobile"));
		String email=request.getParameter("email");
		String gender=request.getParameter("gender");
		String dob=request.getParameter("dob");
		String[] quals=request.getParameterValues("qualification");
		String country=request.getParameter("country");
		String[] languages=request.getParameterValues("languages");
		String comments=request.getParameter("comments");
		
		// step 2:process the data
		String q=String.join(",",quals);
		String l=String.join("-",languages);
		
		// render the response to client
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		writer.println("<html>");
		writer.println("<body bgcolor='pink'>");
		writer.println("your name.."+username+"<br><br>");
		writer.println("your password.."+password+"<br><br>");
		writer.println("your mobile.."+mobile+"<br><br>");
		writer.println("your Email.."+email+"<br><br>");
		writer.println("your Gender.."+gender+"<br><br>");
		writer.println("your DOB.."+dob+"<br><br>");
		writer.println("your Qualification.."+q+"<br><br>");
		writer.println("your Country.."+country+"<br><br>");
		writer.println("your Languages.."+l+"<br><br>");
		writer.println("your Comments.."+comments+"<br><br>");
		writer.println("</body>");
		writer.println("</html>");
	}

}
