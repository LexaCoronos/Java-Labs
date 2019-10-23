package org.ntu.mantrov.labs.lab3.model;

import java.util.Arrays;

public class University {

	private String name;
	private int index;
	private Faculty[] facultys;
	
	public University(String name, int index, Faculty[] facultys) {
		this.name = name;
		this.index = index;
		this.facultys = facultys;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setIndex(int index) {
		this.index = index;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getIndex() {
		return this.index;
	}
	
	public Faculty[] getFaculty() {
		return this.facultys;
	}
	
	@Override
	public String toString() {
		return "University {name=" + name + ", index=" + index + ", facultys=" + Arrays.toString(facultys) + "}\n";
	}
	
}
