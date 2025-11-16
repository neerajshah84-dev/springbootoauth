package com.ouath.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class ApplicationController {
	
	@GetMapping
	public ResponseEntity<String> sayHello() {
		return ResponseEntity.ok("Welcome to OAuth2.0 test");
	}
	
	@GetMapping("/contact-us")	
	public ResponseEntity<String> getInTouch() {
		return ResponseEntity.ok("Get in touch with team!!!");
	}
}
