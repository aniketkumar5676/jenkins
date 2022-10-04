package com.jenkins.jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsApplication {
	static Logger logger = LoggerFactory.getLogger(JenkinsApplication.class);

	@PostConstruct
	public void appStarts(){
		logger.info("App Started");
		System.out.println("In the Post Construct");
	}


	public static void main(String[] args) {
		SpringApplication.run(JenkinsApplication.class, args);
	}


}
