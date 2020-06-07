package com.sapient.number;

import static org.junit.Assert.*;
import org.junit.Test;

public class AddEmployeeTest {

	public Employee setup() {
		
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("saurav");
		emp.setCity("pune");
		
		return emp;
	}
	
	@Test
	public void test() {

		AddEmployee add = new AddEmployee(setup());
		Employee actual = add.getEmployee(0);
		assertEquals("saurav", actual.getName());
	
	}

}
