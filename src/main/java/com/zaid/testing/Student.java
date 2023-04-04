package com.zaid.testing;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component 
@Scope(scopeName ="prototype")
public class Student implements Institute{
	
	private String  name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void displayInfo(){  
	    System.out.println("Hello: "+name);  
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void what() {
		System.out.println("Studying");
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	
	

}
