package com.example.zipkinpaymentservice1.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {
	
	@PostMapping
	public String processPayment() {
		try {
			Thread.sleep(120);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		return "Payment Successful!";
	}

}
