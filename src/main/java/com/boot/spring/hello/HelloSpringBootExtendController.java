package com.boot.spring.hello;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class HelloSpringBootExtendController {

	@Autowired
	UserRepository repository;

	@RequestMapping()
	public String users() {
		List<User> users = repository.findAll();
		String str = "Hello World Users!!" + "<br />\n"
				+ users.stream().map(user -> user.getName()).collect(Collectors.joining("<br />\n"));
		return str;
	}

	@RequestMapping("{id}")
	public String user(@PathVariable("id") Long id) {
		User user = repository.findById(id).get();
		return "Hello World " + user.getName() + "!!";
	}
}
