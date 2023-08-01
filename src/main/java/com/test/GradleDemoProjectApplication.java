package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/msg")
public class GradleDemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradleDemoProjectApplication.class, args);
	}
	@GetMapping
	public String displayMessage(){
		return "Gradle started with JFK 17 and Spring boot 3.1.2";
	}

}
