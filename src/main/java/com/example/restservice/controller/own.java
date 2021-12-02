package com.example.restservice.controller;

import java.util.concurrent.atomic.AtomicLong;
import java.io.*;
import com.example.restservice.model.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class own {

	private static final String template = "Heyhey, %s!";
	private final AtomicLong counter = new AtomicLong();

	
	private static Logger LOGGER = LoggerFactory.getLogger(own.class);
	
	
	@GetMapping("/own")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		
		LOGGER.info("v1 gs-rest-service owncontroller");
		System.out.println("v2 gs-rest-service");
		
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
			
	}
}
