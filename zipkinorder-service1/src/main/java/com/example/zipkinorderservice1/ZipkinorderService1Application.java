package com.example.zipkinorderservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ZipkinorderService1Application {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinorderService1Application.class, args);
	}
	
	@Bean
	public RestTemplate resttemplate() {
		return new RestTemplate();
	}

}
