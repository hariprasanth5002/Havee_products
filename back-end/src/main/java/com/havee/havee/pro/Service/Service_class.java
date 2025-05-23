package com.havee.havee.pro.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.stereotype.Service;
@Service
public class Service_class {
	public static void main(String[] args) {
		

		
		 
		String url="jdbc:mysql://localhost:3306/havee_products";
		String username="root";
		String password="root";
		try(Connection con = DriverManager.getConnection(url, username, password)){
			if(con!=null) {
				System.out.println("Connection established successfully");
			}
			else {
				System.out.println("Connection not established");
			}
		}catch(SQLException exp) {
			System.out.println("Failed to connect db"+exp.getMessage());
		}
		
	}



}

