package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class ConsumerService {

	@GetMapping("/service2")
	public String consumerService() {
		return "Simple consumer controller response";
	}
}
