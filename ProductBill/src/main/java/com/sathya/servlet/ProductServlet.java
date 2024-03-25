package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public ProductServlet() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//step-1:Read the requested data
		int proId=Integer.parseInt(request.getParameter("proId"));
		String proName=request.getParameter("proName");
		double proPrice=Double.parseDouble(request.getParameter("proPrice"));
		int proQuantity=Integer.parseInt(request.getParameter("proQuantity"));
		//step-2: Process the data
		double totalbill=proPrice*proQuantity;
		double discount=0,netAmount=0;
	
	
		if(totalbill<1000)
		{
			totalbill=totalbill;
		}
			else if(totalbill>=1000&&totalbill<5000)
			{
				discount=totalbill*0.5;
				netAmount=totalbill-discount;
			}
			else if(totalbill>=5000&&totalbill<10000)
			{
				discount=totalbill*0.1;
				netAmount=totalbill-discount;
			}
			else
			{
				discount=totalbill*0.15;
				netAmount=totalbill-discount;
			}
		//step-3: render the data
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		writer.println("<html>");
		writer.println("<body bgcolor='pink'>");
		writer.println("<h1> Product bill Invoice</h1>");
		writer.println("Product id:"+proId+"<br><br>");
		writer.println("Product Name:"+proName+"<br><br>");
		writer.println("Product price:$"+proPrice+"<br><br>");
		writer.println("Product quantity:"+proQuantity+"<br><br>");
		writer.println("Product Total Bill:"+totalbill+"<br><br>");
		writer.println(" Discount amount:"+discount+"<br><br>");
		writer.println("Net amount to pay:"+netAmount+"<br><br>");
		writer.println("</body>");
		writer.println("</html>");
		
	}

}
