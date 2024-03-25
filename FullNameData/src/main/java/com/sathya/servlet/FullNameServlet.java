package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FullNameServlet")
public class FullNameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

        public FullNameServlet() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String FirstName = request.getParameter("First Name");
			String MiddleName = request.getParameter("Middle Name");
			String LastName = request.getParameter("Last Name");
			String status;
			if((FirstName.equals("Poojitha")&&MiddleName.equals("Goud"))||(LastName.equals("Dupati")))
			{
				status="Poojitha Goud Dupati";
			}
			else
			{
				status="Login fail";
			}
			PrintWriter writer=response.getWriter();
			response.setContentType("text/html");
			writer.println("<html>");
			writer.println("<h1>Full Name....</h1>"+status);
			writer.println("</html>");
			
	}

}
