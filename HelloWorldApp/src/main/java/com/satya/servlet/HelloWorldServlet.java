package com.satya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/poojitha")
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public HelloWorldServlet() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		PrintWriter writer = response.getWriter();
		response.setContentType("text/plain");
		writer.println("<html>");
		writer.println("<h1>welcome to advjava</h1>");
		writer.println("<h2>this is the first program on advjava</h2>");
		writer.println("<h3>this is poojitha</h3>");
	}

}
