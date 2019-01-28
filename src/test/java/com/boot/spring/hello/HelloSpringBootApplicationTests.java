package com.boot.spring.hello;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloSpringBootApplicationTests {

	@Test()
	public void contextLoads() {
		try {
			isOk();
		} catch (IOException e) {
			assertThat(e.getMessage(), equalTo("OK"));
		}
	}

	public boolean isOk() throws IOException {
		throw new IOException("OK");
	}
}
