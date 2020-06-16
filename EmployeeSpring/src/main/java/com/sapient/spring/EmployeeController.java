package com.sapient.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@RequestMapping("/getResult/{id}")
	public String getdata(@PathVariable int id) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Company company = context.getBean(Company.class); 
		Student[] stud = company.getStudentArray();
		
		return stud[id-1].getMarks();
	}
	
	
}
