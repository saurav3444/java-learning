package com.sapient.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class JavaContainer {

	
	@Bean
	public Company f2() {
		
		Company company = new Company();
		
		Employee[] emp = new Employee[3];
		
		emp[0] = new Employee();
		emp[1] = new Employee();
		emp[2] = new Employee();
		emp[0].setId(1); emp[0].setName("saurav"); emp[0].setCity("pune");
		emp[1].setId(2); emp[1].setName("kalpaj"); emp[1].setCity("kolkata");
		emp[2].setId(3); emp[2].setName("vinit"); emp[2].setCity("pune");

		company.setEmployees(emp);
		return company;
		
		
	}
	
	
}
