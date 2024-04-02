package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import db.MyConnection;
import model.User;

public class UserDAO {
	public static List<User> getAllUsers() throws SQLException{
		List<User> users = new ArrayList<>();
		Connection conn = MyConnection.getConnection();
		PreparedStatement ps =conn.prepareStatement("select * from user");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String email = rs.getString(3);
			User u = new User(id, name, email);
			users.add(u);
		}
		return users;
	}
	
	public static User getUserById(int id ) throws SQLException{
		User user = null;
		Connection conn = MyConnection.getConnection();
		PreparedStatement ps =conn.prepareStatement("select * from user where id = ?");
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			id = rs.getInt(1);
			String name = rs.getString(2);
			String email = rs.getString(3);
			user = new User(id, name, email);
		}
		return user;
	}
}
