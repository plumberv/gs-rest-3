package com.example.restservice.controller;

import java.util.concurrent.atomic.AtomicLong;
import com.example.restservice.model.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetItem {

	private static final String template = "%s";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/GetItem")
	public DRIP GetIem(@RequestParam(value = "value", defaultValue = "Unknown") String value) {
		return new DRIP(counter.incrementAndGet(), String.format(template, value));
	}
}
