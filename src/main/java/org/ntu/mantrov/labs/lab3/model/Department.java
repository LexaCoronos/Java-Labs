package org.ntu.mantrov.labs.lab3.model;

import java.util.List;

public class Department {
	
	private String name;
	private int id;
	private List<Group> groups;
	
	public Department(String name, int id, List<Group> groups) {
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
	
	public List<Group> getGroup() {
		return this.groups;
	}
	
	@Override
	public String toString() {
		return "Department {name=" + name + ", id=" + id + ", Groups=" + groups.toString() + "}\n";
	}
}
