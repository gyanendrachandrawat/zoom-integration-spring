package com.geekskul.zoom_integration_spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZoomIntegrationSpringApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ZoomIntegrationSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World....");
		System.out.println("Hello Hello....");
	}
}
