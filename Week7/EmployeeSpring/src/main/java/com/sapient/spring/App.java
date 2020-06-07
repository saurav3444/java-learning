package com.sapient.spring;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	
		Company company = context.getBean(Company.class); Employee[] emp =
		company.getEmployeeArray();
		
		System.out.println(" XML container\n\nEnter Employee id(1-3):");
		int id = sc.nextInt();
		System.out.println(emp[id-1].getId()+" "+emp[id-1].getName()+" "+emp[id-1].getCity());
		  
		 
		context = new AnnotationConfigApplicationContext(JavaContainer.class);
		company = context.getBean(Company.class);

		emp = company.getEmployeeArray();
		System.out.println("JAVA container\n\nEnter Employee id(1-3):");
		id = sc.nextInt();
		System.out.println(emp[id - 1].getId() + " " + emp[id - 1].getName() + " " + emp[id - 1].getCity());

	}
}
