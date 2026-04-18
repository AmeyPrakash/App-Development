package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import io.github.cdimascio.dotenv.Dotenv;

public class FirstActivity {

    public static void main(String[] args) {

        // Load .env
        Dotenv dotenv = Dotenv.load();

        // Read values
        String url = dotenv.get("DB_URL");
        String user = dotenv.get("DB_USER");
        String password = dotenv.get("DB_PASSWORD");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = scan.nextLine();

        System.out.println("Enter salary:");
        double salary = scan.nextDouble();

        try {
            Connection cn = DriverManager.getConnection(url, user, password);

            System.out.println("Connected!");

            String query = "INSERT INTO employee(name, salary) VALUES (?, ?)";

            PreparedStatement ps = cn.prepareStatement(query);

            ps.setString(1, name);
            ps.setDouble(2, salary);

            int rows = ps.executeUpdate();

            System.out.println(rows + " record inserted!");

            ps.close();
            cn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        scan.close();
    }
}