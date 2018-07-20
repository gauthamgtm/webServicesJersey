package com.mgl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootRest4Application extends SpringBootServletInitializer{

	public static void main(String[] args) {
		//SpringApplication.run(SpringBootRest4Application.class, args);
		new SpringBootRest4Application().configure(new SpringApplicationBuilder(SpringBootRest4Application.class)).run(args);
	}
}
