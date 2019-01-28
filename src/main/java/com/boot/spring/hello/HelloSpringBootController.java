package com.boot.spring.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringBootController {

	@Autowired
	HelloSpringBootConfigration config;

	@RequestMapping()
	public String hello() {
		return "Hello " + config.getName() + "!!";
	}
}
