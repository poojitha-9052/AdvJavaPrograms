package com.sathya.JDBCEx;


import java.sql.*;

public class BatchProcessingEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","pinky","welcome");
		Statement statement=connection.createStatement();
		statement.addBatch("create table stu2(id number,name varchar2(20))");
		statement.addBatch("insert into stu2 values(111,'poojitha')");
		statement.addBatch("insert into stu2 values(222,'kavya')");
		statement.addBatch("delete from stu2 where id in(111,222)");
		statement.addBatch("drop table stu2");
		int[] results=statement.executeBatch();
		for(int result:results)
		{
			System.out.println(result);
		}
		connection.close();
	}

}
