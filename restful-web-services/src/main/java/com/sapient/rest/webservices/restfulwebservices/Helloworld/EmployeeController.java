package com.sapient.rest.webservices.restfulwebservices.Helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@GetMapping(path="/hello-world")
	public String helloWorld() {
		
		return "Hello World";
	}
}
