package com.baeldung.java.shallowcopy;

public class Employee implements Cloneable {
	
	public int id;
	public String name;
	public Role role;
	
	Employee(int id, String name, Role role) {
		
		this.id = id;
		this.name = name;
		this.role = role;
	}
	
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
}
