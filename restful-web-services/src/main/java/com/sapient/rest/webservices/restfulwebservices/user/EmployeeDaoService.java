package com.sapient.rest.webservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDaoService {
	
	private static int count = 3;
	private static List<Employee> emp = new ArrayList<>();
	
	static {
	
		emp.add(new Employee(1, "saurav", "ASDE1"));
		emp.add(new Employee(2, "akash", "ASDE2"));
		emp.add(new Employee(3, "vinit", "ASDE3"));

	}
	
	public List<Employee> findAll() {
		
		return emp;
	}
	
	public Employee findOne(int id) {
		
		for(Employee e: emp) {
			if(e.getId()==id)
				return e;
		}
		
		return null;
	}
	
	public Employee saveEmployee( Employee e) {
		
		if(e.getId()==null) {
			e.setId(++count);	
		}
		emp.add(e);
		return e;
	}
	
	public void delete( int id) {
		
		for(Employee e: emp) {
			if(e.getId()==id) {
				
				e = null;
				break;
			}
		}
	}
	
	public void modify(int id, Employee employee) {
		
		for(Employee e: emp) {
			if(e.getId()==id) {
				
				e.setName(employee.getName());
				e.setDesignation(employee.getDesignation());
				break;
			}
		}
	}
	
	
}
