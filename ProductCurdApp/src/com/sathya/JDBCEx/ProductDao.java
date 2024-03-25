package com.sathya.JDBCEx;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class ProductDao {
	public  int createproductTable()
	{
		Connection connection=null;
		PreparedStatement preparedStatement =null;
		int count=0;
		try {
			connection=Dbconnection.createConnection();
			preparedStatement=connection.prepareStatement("create table product(proId number,proName varchar2(10),proPrice number)" );
			preparedStatement.executeUpdate();
		
			}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return count;
		
	
	}
	public int saveProduct(Product product) throws SQLException
	{
		//Declare the Resoureces
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		int count=0;
		try {
			
			//get the connection
			connection=Dbconnection.createConnection();
			
			//create the ps object
			preparedStatement=connection.prepareStatement("insert into product values(?,?,?)");
			
			//Read the data from product object and set to parameters
			preparedStatement.setInt(1,product.getProId());
			preparedStatement.setString(2,product.getProName());
			preparedStatement.setDouble(3,product.getProPrice());
			count=preparedStatement.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally {
			if(connection!=null)
				connection.close();
			if(preparedStatement!=null)
				preparedStatement.close();
		}
		return count;
	}
	
	public Product getProductById(int proId)
	{
		Product product=null;
		//try-with resources:once the try block is completed the resources automatically closed
		try(Connection connection=Dbconnection.createConnection();
				PreparedStatement preparedStatement=connection.prepareStatement("select*from product where proId=?"))
		{
			//set the data to parameter
			preparedStatement.setInt(1,proId);
		
			//execute the query
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next())
			{
				product =new Product();
				product.setProId(resultSet.getInt(1));
				product.setProName(resultSet.getString(2));
				product.setProPrice(resultSet.getDouble(3));
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return product;
	}
	public List<Product> getAllProducts() throws SQLException
	{
		List<Product> product=new ArrayList<Product>();
		try (Connection connection=Dbconnection.createConnection();
				Statement statement=connection.createStatement())
		{	
			ResultSet resultSet=statement.executeQuery("select * from product");
			while(resultSet.next())
			{
				Product product1=new Product();
				product1.setProId(resultSet.getInt(1));
				product1.setProName(resultSet.getString(2));
				product1.setProPrice(resultSet.getDouble(3));
				product.add(product1);
				
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return product;
	//Delete By Id
			/*public int deleteById(int proId)
			{
				int count=0;
				try(Connection connection=DbConnection.createConnection();PreparedStatement preparedStatement=connection.prepareStatement("delete from product where proId=?"))
				{
					preparedStatement.setInt(1,proId);
					count=preparedStatement.executeUpdate();
					
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
				return count;
			}*/
	}
}
