package com.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateActivity {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter EMployee code");
		
		int _code=scan.nextInt();
		System.out.println("Updated Salary::");
		double _salary=scan.nextDouble();
		try {
			Connection cn=MyConnection.getConnected();
			
			if(!cn.isClosed()) {
				System.out.println("Database Server Connected!");
				PreparedStatement ps=cn.prepareStatement("update employee set salary=? where code=?");
				ps.setDouble(1,  _salary);
				ps.setInt(2,  _code);
				
				int a = ps.executeUpdate();
				if(a>0) {
					System.out.println("Record updated!");
				}

				ps.close();
				
			}

			cn.close();
				
		} catch(Exception e) {
			e.printStackTrace();
		}

		scan.close();
	}

}
