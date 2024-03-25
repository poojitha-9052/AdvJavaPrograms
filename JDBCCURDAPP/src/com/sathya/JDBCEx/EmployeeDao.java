package com.sathya.JDBCEx;

import java.sql.*;


public class EmployeeDao {
	public int save(Employee emp) throws SQLException
	{
		//Declare the Resources
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		int count=0;
		try {
			
			//get the connection
			connection=DbConnection.createConnection();
			
			//create the ps object
			preparedStatement=connection.prepareStatement("insert into emp values(?,?,?)");
			
			//Read the data from emp object and set to parameters
			preparedStatement.setInt(1,emp.getEmpId());
			preparedStatement.setString(2,emp.getEmpName());
			preparedStatement.setDouble(3,emp.getEmpSalary());
			count=preparedStatement.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally {
			//before release connection check the connection present or not
			
			try{
				if(connection!=null)
					connection.close();
				if(preparedStatement!=null)
					preparedStatement.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		return count;
	}
		
	public Employee findById(int empId)
	{
		Employee employee=null;
		//try-with resources:once the try block is completed the resources automatically closed
		try(Connection connection=DbConnection.createConnection();PreparedStatement preparedStatement=connection.prepareStatement("select*from emp where empId=?"))
		{
			//set the data to parameter
			preparedStatement.setInt(1,empId);
		
			//execute the query
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next())
			{
				employee =new Employee();
				employee.setEmpId(resultSet.getInt(1));
				employee.setEmpName(resultSet.getString(2));
				employee.setEmpSalary(resultSet.getDouble(3));
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return employee;
	}
	//Delete By Id
		public int deleteById(int empId)
		{
			int count=0;
			try(Connection connection=DbConnection.createConnection();PreparedStatement preparedStatement=connection.prepareStatement("delete from emp where empId=?"))
			{
				preparedStatement.setInt(1,empId);
				count=preparedStatement.executeUpdate();
				
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			return count;
		}
		
		//Delete By Salary
				public int deleteBySalary(double empSalary)
				{
					int count=0;
					try(Connection connection=DbConnection.createConnection();PreparedStatement preparedStatement=connection.prepareStatement("delete from emp where empSalary>?"))
					{
						preparedStatement.setDouble(1,empSalary);
						count=preparedStatement.executeUpdate();
						
					}
					catch(SQLException e)
					{
						e.printStackTrace();
					}
					return count;
		
				}
		

}
