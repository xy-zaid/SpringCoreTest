package com.zaid.testing;

import org.springframework.stereotype.Component;

@Component
public class Teacher implements Institute{

	public Teacher() {
		// TODO Auto-generated constructor stub
	}
	
	public void what() {
		System.out.println("Teaching");
	}

}
