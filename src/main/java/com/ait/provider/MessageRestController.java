package com.ait.provider;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageRestController {

	@GetMapping("/welcome")
	public ResponseEntity<String> getMessage() {

		String msg = "Hii, Welcome to our Institute";

		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
	@GetMapping("/greet")
	public String getMessage1() {
		
		return "Good Evening";
	}
	
	@PostMapping("/save")
	public ResponseEntity<String> saveMessage() {
		
		String responseBody = "Hii, welcome to our house";
		
		return new ResponseEntity<String>(responseBody,HttpStatus.CREATED);
	}

}
