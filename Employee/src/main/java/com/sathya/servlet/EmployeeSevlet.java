package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/EmployeeServlet")
public class EmployeeSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public EmployeeSevlet() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//step-1:Read the requested data
				int EmpId=Integer.parseInt(request.getParameter("EmpId"));
				String EmpName=request.getParameter("EmpName");
				double EmpSalary=Double.parseDouble(request.getParameter("EmpSalary"));
				//step-2: Process the data
				double HRA=0,DA=0,PF=0,GS=0;
				if(EmpSalary>=50000)
				{
					HRA=EmpSalary*0.3;
					DA=EmpSalary*0.1;
					PF=EmpSalary*0.06;
					GS=EmpSalary+HRA+DA-PF;
				}
					else if(EmpSalary<=50000&&EmpSalary>25000)
					{
						HRA=EmpSalary*0.2;
						DA=EmpSalary*0.05;
						PF=EmpSalary*0.03;
						GS=EmpSalary+HRA+DA-PF;
					}
					else if(EmpSalary<25000)
					{
						HRA=EmpSalary*0.1;
						DA=EmpSalary*0.03;
						PF=EmpSalary*0.02;
						GS=EmpSalary+HRA+DA-PF;
					}
				//step-3: render the data
				response.setContentType("text/html");
				PrintWriter writer=response.getWriter();
				writer.println("<html>");
				writer.println("<body bgcolor='pink'>");
				writer.println("<h1> Employee SalaryInfo...</h1>");
				writer.println("Employee Id:"+EmpId+"<br><br>");
				writer.println("Employee Name:"+EmpName+"<br><br>");
				writer.println("Employee Salary"+EmpSalary+"<br><br>");
				writer.println("HRA Amount:"+HRA+"<br><br>");
				writer.println("DA Amount:"+DA+"<br><br>");
				writer.println(" PF Amount:"+PF+"<br><br>");
				writer.println("Gross Salary:"+GS+"<br><br>");
				writer.println("</body>");
				writer.println("</html>");
				
	}

}
