package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.revature.config.Config;
import com.revature.service.UserService;

public class MyMain {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
		UserService us = ac.getBean(UserService.class);
		System.out.println("My Main");
		System.out.println(us.findAll());
		
		((AnnotationConfigApplicationContext) ac).close();
	}

}
