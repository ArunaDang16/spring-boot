package com.example.demosleuth1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@SpringBootApplication
public class Demosleuth1Application {

	@Autowired
	private RestTemplate restTemplate;

	private static Logger log = LoggerFactory.getLogger(Demosleuth1Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Demosleuth1Application.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate(){ return new RestTemplate(); }

	@RequestMapping("/microservice1")
	public String microservice1(){
		log.info("At microservice1");
		log.info("HERE");
		return restTemplate.getForObject("http://localhost:1001/testSleuth",String.class);
	}

}
