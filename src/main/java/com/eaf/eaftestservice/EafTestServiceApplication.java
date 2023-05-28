package com.eaf.eaftestservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EafTestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EafTestServiceApplication.class, args);
	}

	@GetMapping("/")
	public String helloWorld(){
		return  "Hello World!!";
	}
}
