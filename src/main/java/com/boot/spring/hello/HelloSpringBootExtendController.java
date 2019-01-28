package com.boot.spring.hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class HelloSpringBootExtendController {

	@RequestMapping()
	public String users() {
		return "Hello World Users!!";
	}

	@RequestMapping("{id}")
	public String user(@PathVariable("id") Long id) {
		return "Hello World User:" + id + "!!";
	}
}
