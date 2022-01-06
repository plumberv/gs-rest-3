package com.example.restservice.controller;

import java.util.concurrent.atomic.AtomicLong;
import com.example.restservice.model.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
public class GetItem {

	@Autowired
	private CustomerRepository customerRepository;
	
	private static final String template = "%s";
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping("/GetItem")
	public DRIP GetIem(@RequestParam(value = "id", defaultValue = "1") String id) {
		return new DRIP(counter.incrementAndGet(), "dummyvalue");
	}
	
	@GetMapping("/GetCustomer")
	public Customer GetCustomer(@RequestParam(value = "id", defaultValue = "1") long id) {
		return customerRepository.findById(id);
	}

	@GetMapping("/AddCustomer/{name}")
	public Customer AddCustomer(String name) {
		Customer c = new Customer("firstname",name);
		return customerRepository.save(c);
	}
	
	
}
