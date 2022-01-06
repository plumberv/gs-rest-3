package com.example.restservice.controller;

import java.util.concurrent.atomic.AtomicLong;
import java.io.*;
import com.example.restservice.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class AddItem {

	private static final String template = "%s";
	private final AtomicLong counter = new AtomicLong();
	private static Logger LOGGER = LoggerFactory.getLogger(AddItem.class);	
	
	@GetMapping("/AddItem")
	public DRIP AddItem(@RequestParam(value = "value", defaultValue = "Unknown") String value) {
		
		LOGGER.info(">> gs-rest AddItem controller");
		
		return new DRIP(counter.incrementAndGet(), String.format(template, value));
			
	}
}
