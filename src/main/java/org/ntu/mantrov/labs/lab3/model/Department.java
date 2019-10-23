package org.ntu.mantrov.labs.lab3.model;

import java.util.Arrays;

public class Department {
	
	private String name;
	private int id;
	private Group[] groups;
	
	public Department(String name, int id, Group[] groups) {
		this.name = name;
		this.id = id;
		this.groups = groups;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getId() {
		return this.id;
	}
	
	public Group[] getGroup() {
		return this.groups;
	}
	
	@Override
	public String toString() {
		return "Department {name=" + name + ", id=" + id + ", Groups=" + Arrays.toString(groups) + "}\n";
	}
}
