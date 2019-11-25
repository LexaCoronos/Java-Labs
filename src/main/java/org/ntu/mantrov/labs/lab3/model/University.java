package org.ntu.mantrov.labs.lab3.model;

import java.util.List;

public class University {

	private String name;
	private int index;
	private List<Faculty> facultys;
	
	public University(String name, int index, List<Faculty> facultys) {
		this.name = name;
		this.index = index;
		this.facultys = facultys;
	}
	
	public int getCountFacultys() {
		return this.facultys.size();
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
	
	public List<Faculty> getFaculty() {
		return this.facultys;
	}
	
	@Override
	public String toString() {
		return "University {name=" + name + ", index=" + index + ", facultys=" + facultys.toString() + "}\n";
	}
	
}
