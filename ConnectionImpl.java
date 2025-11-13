package com.jdbc.students_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionImpl implements IConnection {
	private static final String URL="jdbc:mysql://localhost:3306/jdbc";
	private static final String UserName="root";
	private static final String Password="Root@123";
	
	@Override
    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, UserName, Password);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
