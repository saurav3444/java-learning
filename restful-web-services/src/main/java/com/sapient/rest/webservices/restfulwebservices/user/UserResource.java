package com.sapient.rest.webservices.restfulwebservices.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

	
	@Autowired
	private EmployeeDaoService service;
	
	@GetMapping("/Employees")
	public  List<Employee> retrieveAllEmployee() {
		
		return  service.findAll();
	}
	
	@GetMapping("/Employees/{id}")
	public Employee retrieveEmployee(@PathVariable int id) {
		
		return service.findOne(id);
	}
	
	@PostMapping("/Employees")
	public void createEmployee(@RequestBody Employee e) {
		
		service.saveEmployee(e);
	}
	
	@DeleteMapping("/Employees/{id}")
	public void deleteEmployee(@PathVariable int id) {
		
		service.delete(id);
	}
	
	@PutMapping("/Employees/{id}")
	public void modifyEmployee(@PathVariable int id, @RequestBody Employee e ) {
	
		service.modify(id, e);
	}

}