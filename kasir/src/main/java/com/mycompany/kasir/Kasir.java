/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kasir;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Kasir {
	private static final String URL = "jdbc:mysql://localhost:3306/kasir";
	private static final String USER = "root";
	private static final String PASSWORD = "";
	private static Connection connection;

	public static Connection connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Connected to the database!");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Failed to connect to the database!");
			e.printStackTrace();
		}
		return connection;
	}

	public static void disconnect() {
		try {
			if (connection != null && !connection.isClosed()) {
				connection.close();
				System.out.println("Disconnected from the database!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws SQLException {
            // KONEKSI KE DATABASE
		Connection conn = connect();
                Statement stat = conn.createStatement();
}