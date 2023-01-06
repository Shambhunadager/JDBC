package com.xworkz.bus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BusRunner {
	public static void main(String arg[]) {

		String username="root";
		String password="Xwork@123";
		String host="jdbc:mysql://localhost:3306/Collegeinfo";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection(host, username, password);
			
			String query="INSERT INTO freedom_fighters VALUES (?,?,?,?)";
			
			PreparedStatement statement= connection.prepareStatement(query);
			
			statement.setString(1, "Nehru");
			statement.setInt(2, 6);
			statement.setString(3, "NewDelhi");
			statement.setString(4,"north" );
			statement.setInt(5, 1889-11-14);
			
			statement.executeUpdate();
			
			statement.close();
			connection.close();
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}