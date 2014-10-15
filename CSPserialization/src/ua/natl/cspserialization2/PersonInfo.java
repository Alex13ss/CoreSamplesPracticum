package ua.natl.cspserialization2;

import java.io.Serializable;

public class PersonInfo implements Serializable {
	String name;
	int age;
	
	public PersonInfo() {
		System.out.println("PersonInfo DEFAULT constructor!");
	}
	
	public PersonInfo(String name, int age) {
		this.name = name;
		this.age = age;
		//System.out.println("Extended PersonInfo constructor");
	}
	
	public void showInfo() {
		System.out.printf("Name: %s, / Age: %d\n", this.name, this.age);
	}

}