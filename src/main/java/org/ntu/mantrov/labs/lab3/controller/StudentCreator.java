package org.ntu.mantrov.labs.lab3.controller;

import java.util.Scanner;

import org.ntu.mantrov.labs.lab3.GenerateVariables;
import org.ntu.mantrov.labs.lab3.model.Student;

public class StudentCreator {
	private Scanner scanner;

	public StudentCreator(Scanner scanner) {
		this.setScanner(scanner);
	}

	public Student createStudent() {
		Student student = new Student(getStudentFio(), getStudentAge());
		return student;
	}

	private int getStudentAge() {
//		System.out.println("Input Student Age: ");
//		return scanner.nextInt();
		return GenerateVariables.getRandInt(20);
	}

	private String getStudentFio() {
//		System.out.println("Input Student Fio: ");
//		return scanner.next();
		return GenerateVariables.getRandString(5);
	}
	
	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	public Scanner getScanner() {
		return scanner;
	}

}
