package com.kav.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class PocJavaApplication extends SpringBootServletInitializer {
	
	public static void main(String[] args) {
		SpringApplication.run(PocJavaApplication.class, args);
	}
}
