package com.ansh.jenkinstut;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsTutApplication {
	public static Logger logger = LoggerFactory.getLogger(JenkinsTutApplication.class);

	@PostConstruct
	public void init() {
		logger.info("Application started..");
	}

	public static void main(String[] args) {
		logger.info("Application executed");
		SpringApplication.run(JenkinsTutApplication.class, args);
	}


}
