package com.sathya.JDBCEx;

import java.sql.*;


public class FunctionEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","pinky","welcome");
		
		//call the procedure
		CallableStatement callableStatement=connection.prepareCall("{?=call getAvg(?,?)}");
		
		//set the Data
		callableStatement.setInt(2,1003);
		callableStatement.setInt(3,1002);
		
		//Register one variable to store the output
		callableStatement.registerOutParameter(1,Types.DOUBLE);
		
		//execute the procedure the output will be stored in registered parameters
		callableStatement.executeUpdate();	
		//print the out
		System.out.println(callableStatement.getDouble(1));
		connection.close();

	}

}
