package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CalculatorServlet")
public class CalculatorSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public CalculatorSevlet() {
       
    }

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1=Integer.parseInt(request.getParameter("First"));
		int num2=Integer.parseInt(request.getParameter("Second"));
		String operation=request.getParameter("operation");
		//step 2:process the data
		int result=0;
		switch(operation)
		{
		case "+":result=num1+num2;
					break;
		case "-":result=num1-num2;
					break;
		case "*":result=num1*num2;
					break;
		case "/":result=num1/num2;
					break;
		case "%":result=num1%num2;
					break;
		}
		// step 3:render the response
		PrintWriter writer=response.getWriter();
		response.setContentType("text/html");
		writer.println("<html>");
		writer.println("<body bgcolor='pink'>");
		writer.println("<h1>Calculation Application....</h1");
		writer.println("<p>Your first number:"+num1+"</p>");
		writer.println("<p>Your second number:"+num2+"</p>");
		writer.println("<p>Your Symbol:"+operation+"</p>");
		writer.println("<p>Your Result:"+result+"</p>");
		writer.println("</body>");
		writer.println("</html>");
		
		}

}
