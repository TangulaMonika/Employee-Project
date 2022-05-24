package org.employee.project.service;

public class UserServiceImpl implements UserService {

	
	public boolean isValid(String username, String password) {
		// Todo implement valid logic
		if (username.equals("monika@gmail.com") && password.equals("monika")) {
			return true;
		}
		return false;
	}

}
