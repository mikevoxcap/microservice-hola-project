package com.michaelhoffmaninc.microservice.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.michaelhoffmaninc.microservice.example.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = HolaSpringbootApplication.class)
@WebAppConfiguration
public class HolaSpringbootApplicationTests {

	@Test
	public void contextLoads() {
	}

}
