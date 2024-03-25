package com.sathya.JDBCEx;

import java.sql.*;

public class TransactionEx1 {

	public static void main(String[] args) throws SQLException {
		Connection connection=null;
		Statement statement=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","pinky","welcome");
			statement=connection.createStatement();
			connection.setAutoCommit(false);
			statement.executeUpdate("insert into emp values(1003,'mahesh',50000)");
			statement.executeUpdate("insert into emp values(1004,'shirisha',20000)");
			statement.executeUpdate("insert into emp values(1005,'srikanth',30000)");
			statement.executeUpdate("insert into emp values(1006,'rajesh',20000)");
			statement.executeUpdate("delete from emp where empId=1006");
			connection.commit();
			System.out.println("Transaction is successfull...");
			
		}
		catch(ClassNotFoundException| SQLException e)
		{
			System.out.println("Transaction is Fail...");
			connection.rollback();
			e.printStackTrace();
		}
		finally
		{
			if(statement!=null) statement.close();
			if(connection!=null) connection.close();
		}
		
	}

}
