package com.boot.spring.hello;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.spring.hello.models.User;
import com.boot.spring.hello.services.UserService;

@RestController
@RequestMapping("users")
public class HelloSpringBootExtendController {

	@Autowired
	UserService userService;

	@RequestMapping()
	public String users() {
		List<User> users = userService.findAll();
		return "Hello World Users!!" + "<br />\n"
				+ users.stream().map(user -> user.getName()).collect(Collectors.joining("<br />\n"));
	}

	@RequestMapping("{id}")
	public String user(@PathVariable("id") Long id) {
		User user = userService.findById(id);
		return "Hello World " + user.getName() + "!!";
	}
}
