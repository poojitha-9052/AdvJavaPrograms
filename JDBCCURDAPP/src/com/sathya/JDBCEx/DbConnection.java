package com.sathya.JDBCEx;

import java.sql.*;

public class DbConnection {

	
		public static Connection createConnection()
		{
			Connection connection=null;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","pinky","welcome");
			}
			catch(ClassNotFoundException | SQLException e)
			{
				e.printStackTrace();
			}
			return connection;
	}

}
