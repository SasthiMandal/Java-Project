package com.sasthi.employeeregistration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeRegistration1Application {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeRegistration1Application.class);

	public static void main(String[] args) {

		SpringApplication.run(EmployeeRegistration1Application.class, args);
		logger.info("Welcome to Spring boot project");
	}

}
