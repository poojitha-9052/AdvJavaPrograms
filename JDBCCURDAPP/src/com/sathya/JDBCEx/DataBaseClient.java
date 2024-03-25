package com.sathya.JDBCEx;

import java.sql.*;

public class DataBaseClient {

	public static void main(String[] args) throws SQLException {
		EmployeeDao employeeDao=new EmployeeDao();
		int res1=employeeDao.save(new Employee(1001,"poojitha",40000));
		System.out.println("Data Inserted successfully.."+res1);
		int res2=employeeDao.save(new Employee(1002,"kavya",20000));
		System.out.println("Data Inserted successfully.."+res2);
		//Reading the data from database
		Employee emp=employeeDao.findById(1001);
		System.out.println(emp);
		Employee emp1=employeeDao.findById(1002);
		System.out.println(emp1);
		
		// Delete by Id
		int count1=employeeDao.deleteById(1001);
		if(count1==1)
			System.out.println("Data delete successfully... ");
		else
			System.out.println("Data Delete Fail...");
		
		// Delete by Salary
		int count2=employeeDao.deleteBySalary(40000);
		System.out.println(count2+"Records  deleted successfully... ");
				
		
	}

}
