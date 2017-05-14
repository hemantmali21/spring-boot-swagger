package com.hemant.springbootstarter.services;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;
import com.hemant.springbootstarter.models.User;

@Service
public class UserService {

	private List<User> users = Arrays.asList(new User("1", "Hemant", "Mumbai"),
			new User("2", "Atul", "Pune"), new User("3", "Sachin", "Mumbai"));

	public List<User> getUsers() {
		return users;
	}

	public User getUser(String id) {
		for (User user : users) {
			if (user.getId().equals(id)) {
				return user;
			}
		}
		return null;
	}
}
