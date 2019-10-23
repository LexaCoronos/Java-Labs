package org.ntu.mantrov.labs.lab3.model;

public class Student {
	
	private String fio;
	private int age;
	
	public Student(String fio, int age) {
		this.fio = fio;
		this.age = age;
	}
	
	public String getFio() {
		return this.fio;
	}
	
	public int getAge() {
		return this.age;
	}
	
	@Override
	public String toString() {
		return "Student {fio=" + fio + ", age=" + age + "}\n";
	}
}
