package org.ntu.mantrov.labs.lab3.model;

import java.util.Arrays;

public class Group {
	
	String name;
	int id;
	Student[] students;
	
	public Group(String name, int id, Student[] students) {
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
	
	public Student[] getStudent() {
		return this.students;
	}
	
	@Override
	public String toString() {
		return "Group {name=" + name + ", id=" + id + ", Students=" + Arrays.toString(students) + "}\n";
	}
}
