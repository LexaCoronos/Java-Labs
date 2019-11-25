package org.ntu.mantrov.labs.lab3.model;

import java.util.List;

public class Group {
	
	private String name;
	private int id;
	private List<Student> students;
	
	public Group(String name, int id, List<Student> students) {
		this.name = name;
		this.id = id;
		this.students = students;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getId() {
		return this.id;
	}
	
	public List<Student> getStudent() {
		return this.students;
	}
	
	@Override
	public String toString() {
		return "Group {name=" + name + ", id=" + id + ", Students=" + students.toString() + "}\n";
	}
}
