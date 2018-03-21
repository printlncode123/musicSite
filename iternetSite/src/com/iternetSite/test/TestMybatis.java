package com.iternetSite.test;


import org.springframework.beans.factory.annotation.Autowired;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.iternetSite.pojo.User;
import com.iternetSite.service.UserService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/spring/applicationContext-*.xml" })
public class TestMybatis {
	@Autowired
	private UserService userService;
	@Test
	public void test() {
		User user=new User(1, "程晨", 22 , "男", "振华中学");
		userService.insertUser(user);
	}

}
