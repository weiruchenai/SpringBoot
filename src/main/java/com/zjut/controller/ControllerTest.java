package com.zjut.controller;

import com.zjut.pojo.User;
import com.zjut.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class ControllerTest {
	@Autowired
	@Qualifier(value = "userService")
	UserService userService;
	
	@Autowired
	//@Qualifier(value = "dataSource2")
	private DataSource dataSource;
	
	@RequestMapping("/hello")
	public String controllerTest(){
		System.out.println(dataSource);
		System.out.println("访问控制器...");
		User user = userService.queryById((long) 3);
		System.out.println(user);
		return "Hello, Spring Boot.";
	}
	
	@RequestMapping("user/{id}")
	public User controllerMybatis(@PathVariable Long id){
		return userService.queryById(id);
	}
}
