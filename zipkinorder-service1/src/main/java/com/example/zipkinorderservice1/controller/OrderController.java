package com.example.zipkinorderservice1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping
	public String createOrder() {
		try {
            Thread.sleep(150);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		String paymentResponse=restTemplate.postForObject("http://localhost:8082/payments", null, String.class);
		
		return "order placed! "+paymentResponse;
	}

}
