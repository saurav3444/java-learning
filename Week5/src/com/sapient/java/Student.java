package com.sapient.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Student {
	
	
	private String name;
	private int id;
	private String city;
	
	public Student(String name, int id, String city) {
		super();
		this.name = name;
		this.id = id;
		this.city = city;
	}
	
	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getCity() {
		return city;
	}

	public void display()
	{
		System.out.println(id +" "+ name+ " " + city );
	}

	
	
	public static void main(String[] args) {
				
		int n;
		
		System.out.println("Enter no. of student");
		n = Read.read().nextInt();
		
		Student[] s = new Student[n];
		
		for (int i = 0; i < n; i++) {
			
			System.out.println("Enter Name, id, City");
			String name = Read.read().next();
			int id = Read.read().nextInt();
			String city = Read.read().next();
			
			s[i] = new Student(name, id, city); 
		}
		
		for (int i = 0; i < s.length; i++) {
			
			s[i].display();
		}
		
		java.util.List<Student> list = new ArrayList<>();
		
		for (int i = 0; i < s.length; i++) {
			list.add(s[i]);
		}
		
		
		System.out.println("Sort by Name");
		Collections.sort(list, new compareByNames());
		
		for(Student st:list)
			System.out.println(st.id+" "+st.name+" "+st.city );
		

		System.out.println("Sort by City");
		Collections.sort(list, new compareByCity());
		
		for(Student st:list)
			System.out.println(st.id+" "+st.name+" "+st.city );
		
	}
}

class compareByCity implements Comparator<Student>
{
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getCity().compareTo(o2.getCity());
	}	
}


 class compareByNames implements Comparator<Student>
{
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}	
}
