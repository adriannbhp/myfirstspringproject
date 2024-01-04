package com.example.myfirstspringproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyfirstspringprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyfirstspringprojectApplication.class, args);
	}

	@GetMapping("/hello/{name}")
	public String helloWorld(@PathVariable("name") String name) {
		return "Hello "+name;
	}

	@GetMapping("/player")
	public Player getPlayer() {
		return	new Player("Lionel Messi", 35);
	}



}
