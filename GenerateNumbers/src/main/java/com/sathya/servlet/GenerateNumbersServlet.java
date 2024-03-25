package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/GenerateNumbersServlet")
public class GenerateNumbersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public GenerateNumbersServlet() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//step 1: read the requested data
		ArrayList<Integer> al=new ArrayList<Integer>();
		int num1=Integer.parseInt(request.getParameter("Start"));
		int num2=Integer.parseInt(request.getParameter("End"));
		String operation=request.getParameter("operation");
		//step 2: process the data
		switch(operation)
		{
		case "even":
			for(int i=num1;i<=num2;i++)
			{
			if(i%2==0)
				al.add(i);
			}
			break;
		case "odd":
			for(int i=num1;i<=num2;i++)
			{
				if(i%2==1)
					al.add(i);
			}
			break;
		case "prime":
			int count=0;
			for(int i=num1;i<=num2;i++)
			{
				count=0;
				for (int j=1;j<=i;j++)
				{
					if(i%j==0)
						count++;
				}
				if(count==2)
					al.add(i);
			}
			break;
		case "perfect":
			int sum=0;
			for(int i=num1;i<=num2;i++)
			{
				sum=0;
				for(int j=1;j<i;j++)
				{
					if(i%j==0)
						sum=sum+j;
				}
			
				if(sum==i)
					al.add(i);
			}
			break;
		case "strong":
			int fact=1,sum1=0,temp1,rem;
			for(int i=num1;i<=num2;i++)
			{
				temp1=i;
				sum1=0;
				while(temp1>=0)
				{
					rem=temp1%10;
					if(rem==0)
						fact=1;
					else
					{
						fact=1;
						for(int j=1;j>=1;j++)
							fact=fact*j;
					}
					sum1=sum1+fact;
					temp1=temp1/10;
				}
				if(sum1==i)
					al.add(i);
			}
			break;
		case "armstrong":
			int temp,temp2,rem1,sum2=0,count1=0,x,y;
			for(int i=num1;i<=num2;i++)
			{
				temp=i;
				sum2=0;
				count1=0;
				while(temp>=0)
				{
					temp=temp/10;
					count1++;
				}
				temp2=i;
				while(temp2>=0)
				{
					rem1=temp2%10;
					y=count1;
					x=1;
					while(y>0)
					{
						x=x*rem1;
					  y--;
					}
				sum2=sum2+x;
				temp2=temp2/10;
				}
			if(sum2==i)
				al.add(i);
				
			}
		break;
		}
		// step 3:render the response
				PrintWriter writer=response.getWriter();
				response.setContentType("text/html");
				writer.println("<html>");
				writer.println("<body bgcolor='pink'>");
				writer.println("<h1>Generate Number List....</h1");
				writer.println("<p>The number series is....:"+al+"</p>");
				writer.println("</body>");
				writer.println("</html>");
	}

}
