package org.ntu.mantrov.labs.lab3.controller;

import java.util.Scanner;

import org.ntu.mantrov.labs.lab3.Var;
import org.ntu.mantrov.labs.lab3.model.Department;
import org.ntu.mantrov.labs.lab3.model.Faculty;

public class FacultyCreator {
	private Scanner scanner;

	public FacultyCreator(Scanner scanner) {
		this.setScanner(scanner);
	}

	public Faculty createFaculty() {
		Faculty faculty = new Faculty(getFacultyName(), getFacultyIndex(), getFacultyDepartments());
		return faculty;
	}

	private int getFacultyIndex() {
//		System.out.println("Input Faculty index: ");
//		return scanner.nextInt();
		return Var.getRandInt(20);
	}

	private String getFacultyName() {
//		System.out.println("Input Faculty name: ");
//		return scanner.next();
		return Var.getRandString(5);
	}
	
	private Department[] getFacultyDepartments() {
		System.out.println("Input Faculty Departments count: ");
		int count = scanner.nextInt();
		Department[] departments = new Department[count];
		DepartmentCreator departmentCreator = new DepartmentCreator(scanner);
		for (int i = 0; i < count; i++) {
			departments[i] = departmentCreator.createDepartment();
		}
		return departments;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	public Scanner getScanner() {
		return scanner;
	}

}
