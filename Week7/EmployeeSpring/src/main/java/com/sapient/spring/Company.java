package com.sapient.spring;

public class Company {

	public Employee emp[];
	
	public Employee[] getEmployeeArray()
	{
		return emp;
	}

	public void setEmployees(Employee[] employeeArray)
	{
		this.emp = employeeArray;
	}
	
}
