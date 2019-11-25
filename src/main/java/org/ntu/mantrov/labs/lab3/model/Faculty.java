package org.ntu.mantrov.labs.lab3.model;

import java.util.List;

public class Faculty {
	
	private String name;
	private int id;
	private List<Department> departments;
	
	public Faculty(String name, int id, List<Department> departments) {
		this.name = name;
		this.id = id;
		this.departments = departments;
	}

	public String getName() {
		return this.name;
	}
	
	public int getId() {
		return this.id;
	}
	
	public List<Department> getDepartment() {
		return this.departments;
	}
	
	@Override
	public String toString() {
		return "Faculty {name=" + name + ", id=" + id + ", Departments=" + departments.toString() + "}\n";
	}
	
}
