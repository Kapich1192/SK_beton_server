package com.skbeton.skbeton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SkBetonApplication {

	public static void main(String[] args) {
		System.setProperty("server.port", "80");
		SpringApplication.run(SkBetonApplication.class, args);

	}



}
