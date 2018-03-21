package com.iternetSite.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.iternetSite.mapper.UserMapper;
import com.iternetSite.pojo.User;

public class UserService {
	@Autowired
	private UserMapper userMapper;
	
	public void insertUser(User user){
		 userMapper.insert(user);
	}
}
