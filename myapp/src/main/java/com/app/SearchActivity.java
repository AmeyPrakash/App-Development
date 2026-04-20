package com.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SearchActivity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter code:");
        int code = scan.nextInt();

        try {
            Connection cn = MyConnection.getConnected();

            if (!cn.isClosed()) {
                System.out.println("Database connected");

                PreparedStatement ps = cn.prepareStatement(
                    "SELECT code, name, salary FROM employee WHERE code = ?"
                );
                ps.setInt(1, code);

                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    System.out.println(
                        rs.getInt("code") + " " +
                        rs.getString("name") + " " +
                        rs.getDouble("salary")
                    );
                } else {
                    System.out.println("Record not found");
                }

                rs.close();
                ps.close();
            }

            cn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        scan.close();
    }
}
