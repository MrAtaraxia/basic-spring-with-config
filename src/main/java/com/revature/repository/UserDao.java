package com.revature.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.revature.beans.Account;
import com.revature.beans.User;

@Repository
public class UserDao {
	
	private List<User> userList = new ArrayList<>();
	
	UserDao(){
		super();
		userList.add(new User(1, "Bob", new Account(1, 20.0)));
		userList.add(new User(2, "Chris", new Account(2, 50.0)));
	}
	
	public List<User> getAllUsers(){
		return userList;
	}

	
}
