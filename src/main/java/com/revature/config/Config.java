package com.revature.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.revature.beans.Account;
import com.revature.beans.User;

@Configuration
@ComponentScan("com.revature")
public class Config {
	
	/*
	 * Configure the User Bean.
	 */
	@Bean(name = "user")
	public User getUser() {
		return new User();
	}
	
	/*
	 * Configure the Account Bean.
	 */
	@Bean(name = "account")
	public Account getAccount() {
		return new Account();
	}
}