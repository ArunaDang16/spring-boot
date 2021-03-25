package com.example.demosleuth2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Demosleuth2Application {

	private static Logger log = LoggerFactory.getLogger(Demosleuth2Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Demosleuth2Application.class, args);
	}

	@GetMapping("/testSleuth")
	public String testSleuth(){
		log.info("Inside microservice 2");
		log.info("HERE");
		return "Testing completed";
	}
}
