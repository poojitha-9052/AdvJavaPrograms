package com.sathya.JDBCEx;
import java.sql.*;
public class ProcedureExecutionEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","pinky","welcome");
		
		//call the procedure
		CallableStatement callableStatement=connection.prepareCall("{call getSal(?,?)}");
		
		//set the Data
		callableStatement.setInt(1,1002);
		
		//Register one variable to store the output
		callableStatement.registerOutParameter(2,Types.FLOAT);
		
		//execute the procedure the output will be stored in registered parameters
		callableStatement.executeUpdate();	
		//print the out
		System.out.println(callableStatement.getFloat(2));
		connection.close();
	}

}
