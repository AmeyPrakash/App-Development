package com.app;

import java.sql.Connection;
import java.sql.DriverManager;

import io.github.cdimascio.dotenv.Dotenv;

public class MyConnection {
    public static Connection getConnected() throws Exception
    {
    	
    	 Dotenv dotenv = Dotenv.load();
    	 
         String url = dotenv.get("DB_URL");
         String user = dotenv.get("DB_USER");
         String password = dotenv.get("DB_PASSWORD");

            Connection con = DriverManager.getConnection(url, user, password);
            
            return con;
     
    }
}