package com.sathya.JDBCEx;

import java.sql.*;


public class ClientData {

	public static void main(String[] args) throws SQLException {
		ProductDao productDao=new ProductDao();
		/*int count=productDao.createproductTable();
		System.out.println("table created successfully..."+count);*/
		int res1=productDao.saveProduct(new Product(5,"Tv",45000.0));
		System.out.println("Data Inserted successfully.."+res1);
		int res2=productDao.saveProduct(new Product(6,"Machine",30000.0));
		System.out.println("Data Inserted successfully.."+res2);
	
		//Reading the data from database
		Product product=productDao.getProductById(5);
		System.out.println(product);
		Product product1=productDao.getProductById(6);
		System.out.println(product1);
		
		//delete by Id
		/*int count= productDao.deleteById(5);
		if(count==1)
			System.out.println("Data delete successfully... ");
		else
			System.out.println("Data Delete Fail...");
	}*/
	}
}
