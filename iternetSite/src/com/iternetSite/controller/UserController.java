package com.iternetSite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iternetSite.pojo.User;
import com.iternetSite.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/getName")
	@ResponseBody
	public String getName(User user){
		userService.insertUser(user);
		return user.getName();
	}
}
