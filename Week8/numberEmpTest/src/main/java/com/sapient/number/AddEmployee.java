package com.sapient.number;

import java.util.ArrayList;
import java.util.List;

public class AddEmployee {

	public List<Employee> list = new ArrayList<Employee>();

	AddEmployee(Employee emp) {
		
		list.add(emp);	
	}
	
	Employee getEmployee(int id) {
		
		return list.get(id);
		
	}
}
