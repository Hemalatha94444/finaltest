package com.example.finalproject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class FinalprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinalprojectApplication.class, args);
	}
	@GetMapping("/welcome")
	public String welcome() {
		return "WELCOME TO MY FINAL PROJECT...";
	}
	@GetMapping("/about")
	public String about() {
		return "HELLO, THIS PAGE IS ABOUT MY FINAL PROJECT...";
	}
	@GetMapping("/display")
	public String display() {
	
		return "HELLO THIS IS MY DISPLAY PAGE....";
	}
	@GetMapping("/greeting")
	public String greeting() {
	
		return "GOOD DAY THIS IS MY FINAL PROJECT....";
	}
}
