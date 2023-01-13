package com.nsjsoft.person.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
	
	public List<User> findAll() {
		
		List<User> users = new ArrayList<>();
		users.add(new User(1, "nsjsoft", "nsjsoft", "01023056643"));
		users.add(new User(1, "nsj", "nsj", "01087402253"));
		return users;
	}
}
