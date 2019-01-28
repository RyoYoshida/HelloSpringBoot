package com.boot.spring.hello;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.boot.spring.hello.models.User;
import com.boot.spring.hello.services.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloSpringBootUserServiceTests {

	@Autowired
	UserService userService;

	@Test
	public void findTest() {
		List<User> users = userService.findAll();
		users.forEach(user -> {
			System.out.println(user.getId() + ": " + user.getName());
		});

		User user = userService.findById(1);
		System.out.println(user.getId() + ": " + user.getName());
	}

	@Test
	public void saveTest() {
		User user = new User();
		user.setName("OK");
		userService.save(user);
		System.out.println(user.getId() + ": " + user.getName());

		user.setName("OKOK");
		user = userService.saveAndFlush(user);
		System.out.println(user.getId() + ": " + user.getName());
	}
}
