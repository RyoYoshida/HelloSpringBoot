package com.boot.spring.hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloSpringBootConfigTests {

	@Autowired
	HelloSpringBootConfigration config;

	@Test
	public void configTest() {
		System.out.println("name: " + config.getName() + ", pass: " + config.getPass());
		config.setName("Yamada");
		config.setPass("Taro");
		System.out.println("name: " + config.getName() + ", pass: " + config.getPass());
	}
}
