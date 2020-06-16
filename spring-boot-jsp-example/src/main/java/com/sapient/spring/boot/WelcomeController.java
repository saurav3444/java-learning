package com.sapient.spring.boot;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@RequestMapping("/hello")
	public String welcome() {
		
		return "welcome";
	}
}
