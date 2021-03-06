package com.boot.spring.hello;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "myconfig.properties")
public class HelloSpringBootConfigration {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String value) {
		name = value;
	}

	private String pass;

	public String getPass() {
		return pass;
	}

	public void setPass(String value) {
		pass = value;
	}
}
