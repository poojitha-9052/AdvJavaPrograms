package com.sathya.JDBCEx;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class ProcedureExecutionEx1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","pinky","welcome");
		
		//call the procedure
		CallableStatement callableStatement=connection.prepareCall("{call getDetails(?,?,?,?)}");
		
		//set the Data
		callableStatement.setInt(1,1002);
		
		//Register one variable to store the output
		callableStatement.registerOutParameter(2,Types.INTEGER);
		callableStatement.registerOutParameter(3,Types.VARCHAR);
		callableStatement.registerOutParameter(4,Types.FLOAT);
		//execute the procedure the output will be stored in registered parameters
		callableStatement.executeUpdate();	
		//print the out
		System.out.println(callableStatement.getInt(2));
		System.out.println(callableStatement.getString(3));
		System.out.println(callableStatement.getFloat(4));
		connection.close();

	}

}
