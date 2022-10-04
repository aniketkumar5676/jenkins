package com.jenkins.jenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class JenkinsApplicationTests {
	Logger logger = LoggerFactory.getLogger(JenkinsApplicationTests.class);

	@Test
	void contextLoads() {
		System.out.println("Test Case is running");
		logger.info("Test Case in Logger ");

	}

}
