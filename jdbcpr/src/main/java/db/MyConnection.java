package db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	static Connection connection = null;
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root", "Mayur");
			System.out.println("Connection is Done Succusfully ");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e ) {
			e.printStackTrace();
		}
		
		return connection;
	}
	public static void closeConnection() {
	}
	
}
