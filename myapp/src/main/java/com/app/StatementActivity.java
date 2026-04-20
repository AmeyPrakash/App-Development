package com.app;

import java.sql.Connection;
import java.util.Scanner;

public class StatementActivity {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("ENter name::");
		String name=scan.nextLine();
		System.out.println("Enter salary::");
		double salary=scan.nextDouble();
		
		try {
			Connection cn=MyConnection.getConnected();
			
			if(!cn.isClosed()) {
				System.out.println("Connection...Exist!");
			    java.sql.Statement statement=cn.createStatement();
			    
			    int a =(statement).executeUpdate("insert into employee(name,salary)" +"values('"+name+"',"+salary+")");
			    if (a>0) {
			    	System.out.println("Record Inserted!");
					
				}
			}
			
		} catch (Exception e) {
			
		}
	}

}
