package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.User;
import com.revature.repository.UserDao;

@Service
public class UserService {

	UserDao userDao;
	
	@Autowired
	UserService(UserDao userDao){
		this.userDao = userDao;
	}
	
	public List<User> findAll(){
		return userDao.getAllUsers();
	}
}
