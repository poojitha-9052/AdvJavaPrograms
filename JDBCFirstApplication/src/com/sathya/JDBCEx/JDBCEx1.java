package com.sathya.JDBCEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEx1 {

	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		
		//step 1:Load the Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver loaded successfully...");

		//step 2: create the connection
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","pinky","welcome");
		System.out.println("connection created successfully");
		
		//step 3:static query execution
		Statement statement=connection.createStatement();
		String q1="create table emp(id number,name varchar2(30),salary number)";
		int res1=statement.executeUpdate(q1);
		System.out.println("Table is created successfully..."+res1);
		
		/*String q2="drop table emp";
		int res2=statement.executeUpdate(q2);
		System.out.println("Table is dropped successfully..."+res2);
		//step 4:Realease the connection
		connection.close();
		System.out.println("connection closed successfully...");*/
		 


	}

}
