package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@PostMapping(value="/test",consumes= {"application/json"},produces= {"application/json"})
	public String greeting(@RequestBody String requestMessage) {
		return requestMessage;
	}
	
}
