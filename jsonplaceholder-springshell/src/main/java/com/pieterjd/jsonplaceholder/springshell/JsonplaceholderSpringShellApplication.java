package com.pieterjd.jsonplaceholder.springshell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.pieterjd")
public class JsonplaceholderSpringShellApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsonplaceholderSpringShellApplication.class, args);
	}

}
