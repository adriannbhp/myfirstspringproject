package com.example.myfirstspringproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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

	@GetMapping("/players")
	public List<Player> getPlayers(){
		final List<Player> players = new ArrayList<>();
		players.add(new Player("Lionel Messi", 35));
		players.add(new Player("Christiano Ronaldo", 37));
		return players;
	}



}
