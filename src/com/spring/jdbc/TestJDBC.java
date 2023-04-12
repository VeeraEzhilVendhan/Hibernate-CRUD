package com.spring.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {
	
	public static void main(String[] args) 
	{
		//Testing JDBC Connection
		
		String JDBC_URL="jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=UTC";
		String username="hbstudent";
		String password="hbstudent";
		try
		{
			System.out.println("Connecting to DataBase "+JDBC_URL);
			Connection connection=DriverManager.getConnection(JDBC_URL,username,password);
			System.out.println("Connection successful");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}


