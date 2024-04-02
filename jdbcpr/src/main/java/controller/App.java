package controller;

import java.sql.SQLException;
import java.util.List;

import dao.UserDAO;
import model.User;

public class App {

	public static void main(String[] args) {
		try {
//			List<User> users = UserDAO.getAllUsers();
//			for(User u: users) {
//				System.out.println(u.getId() + "\t" + u.getName() + "\t" + u.getEmail());
//			}
			User u = UserDAO.getUserById(20);
			System.out.println(u == null ? " Not Found " : u);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
