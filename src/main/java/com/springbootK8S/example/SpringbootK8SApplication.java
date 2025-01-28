package com.springbootK8S.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootK8SApplication {
	
	
	@GetMapping("/hello")
	public String helloWorld() {
		return "Welcome to Kubernetes!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootK8SApplication.class, args);
	}

}
