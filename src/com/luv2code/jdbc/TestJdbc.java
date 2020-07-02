package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			String jdbcUrl = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false&serverTimezone=UTC";
			String user = "springstudent";
			String password = "springstudent";
			
			System.out.println("Connecting to Database :" + jdbcUrl);
			Connection conn = DriverManager.getConnection(jdbcUrl, user, password);
			System.out.println("Connection Successfull!!");
			
			
		} catch(Exception exe ) {
			exe.printStackTrace();
		}
		
	}

}
